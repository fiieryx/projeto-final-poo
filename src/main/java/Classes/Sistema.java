package Classes;

import java.util.ArrayList;
import java.util.Scanner;


public class Sistema{
    ArrayList<Sessao> listaSessao = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoDomingo = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoSegunda = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoTerca = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoQuarta = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoQuinta = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoSexta = new ArrayList<Sessao>();
    ArrayList<Sessao> listaSessaoSabado = new ArrayList<Sessao>();

    ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    Scanner scan = new Scanner(System.in);

    //filmes
    //inserindo filmes
    public void inserirFilmes(){
        System.out.println("Digite o nome do filme: ");
        String addNomeFilme = scan.next();
        int flagClass = 0;
        int intAddClassFilme;

        do{
        System.out.println("Digite a classificação de idade do filme: ");
        String addClassFilme = scan.next();
        intAddClassFilme = Integer.parseInt(addClassFilme);
        if(intAddClassFilme >18 || intAddClassFilme < 0){
            System.out.println("Digite uma classificação de idade válida!");
        } else {
            flagClass = 1;
        }
        }while(flagClass == 0);

        Filme f = new Filme(addNomeFilme, intAddClassFilme);
        listaFilmes.add(f);
        f.setNumeroCadastroFilme(listaFilmes.indexOf(f));

        System.out.println("Filme inserido no sistema com sucesso!");
        System.out.println(f.statusFilme());
        

    }
    //pesquisando filmes
    public void pesquisarFilme(){
        System.out.println("Pesquisar por:\n[1] - Nome\n[2] - Classificação de idade\n[3] - Número de cadastro do filme");
        String optionSearch = scan.next();
        switch(optionSearch){
            case "1":
            pesquisarFilmePorNome();
            break;
            case "2":
            pesquisarFilmePorClassificacao();
            break;
            case "3":
            pesquisarFilmePorNumeroCadastro();
            break;

            default:
            System.out.println("Opção inválida!");

            
        }
    }

    //pesquisando filmes pelo numero de cadastro do filme
    private void pesquisarFilmePorNumeroCadastro(){
        System.out.println("Digite o número do cadastro do filme: ");
        String searchNumeroCadastroFilme = scan.next();
        int intSearchNumeroCadastroFilme = Integer.parseInt(searchNumeroCadastroFilme);
        
        for(int i = 0 ; i < listaFilmes.size(); i++){
            if(listaFilmes.get(i).getNumeroCadastroFilme() == intSearchNumeroCadastroFilme){
                System.out.println(listaFilmes.get(i).statusFilme());
                
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }

    //pesquisando filmes por classificação de idade
    private void pesquisarFilmePorClassificacao(){
        System.out.println("Digite a classificação de idade do filme: ");
        String searchClassificacaoFilme = scan.next();
        int intSearchClassificacaoFilme = Integer.parseInt(searchClassificacaoFilme);
        for(int i = 0; i <listaFilmes.size(); i++){
            if(listaFilmes.get(i).getClassificacao() == intSearchClassificacaoFilme){
                System.out.println(listaFilmes.get(i).statusFilme());
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }



    //pesquisando filmes por nome
    private void pesquisarFilmePorNome(){
        System.out.println("Digite o nome do filme: ");
        String searchNomeFilme = scan.next();
        for(int i = 0; i < listaFilmes.size(); i++){
            if(searchNomeFilme.equals(listaFilmes.get(i).getNomeFilme())){
                System.out.println(listaFilmes.get(i).statusFilme());
                
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }

    //listar filmes
    public void listarFilmes(){
        for(int i = 0; i < listaFilmes.size(); i++){
            System.out.println(listaFilmes.get(i).statusFilme());
        }
    }

    //remover filme
    public void removerFilme(){
        System.out.println("Digite o cadastro do filme que você deseja remover: ");
        String removeNumeroCadastro = scan.next();
        int intRemoveNumeroCadastro = Integer.parseInt(removeNumeroCadastro);

        for(int i = 0; i < listaFilmes.size(); i++){
            if(listaFilmes.get(i).getNumeroCadastroFilme() == intRemoveNumeroCadastro){
                listaFilmes.remove(listaFilmes.get(i));
                System.out.println("Filme removido com sucesso!");
            } else {
                System.out.println("Não foi encontrado resultados para remoção de filme");
            }
        }
    }
    


    //alterar filme
    public void alterarFilme(){
        System.out.println("Digite o número de cadastro do filme que você deseja fazer alterações: ");
        String changeFilme = scan.next();
        int intChangeFilme = Integer.parseInt(changeFilme);
        String optionChangeFilme;

        do{
        System.out.println("Fazer alterações: ");
        System.out.println("[1] - Nome do filme");
        System.out.println("[2] - Classificação do filme");
        System.out.println("--------------------------------");
        System.out.println("[3] - Concluir alterações");
        optionChangeFilme = scan.next();
        switch(optionChangeFilme){
            case "1":
            System.out.println("Digite o novo nome do filme: ");
            String newNameMovie = scan.next();
            listaFilmes.get(intChangeFilme).setNomeFilme(newNameMovie);
            System.out.println("Alteração realizada com sucesso!");
            System.out.println(listaFilmes.get(intChangeFilme).statusFilme());
    
            break;

            case "2":
            int flagClass = 0;
            int intNewClassificacaoMovie;

            do{
            System.out.println("Digite a nova classificação do filme: ");
            String newClassificacaoMovie = scan.next();
            intNewClassificacaoMovie = Integer.parseInt(newClassificacaoMovie);
            if(intNewClassificacaoMovie > 18 || intNewClassificacaoMovie < 0){
                System.out.println("Digite uma classificação de idade válida!");
            } else {
                listaFilmes.get(intChangeFilme).setClassificacao(intNewClassificacaoMovie);
                System.out.println("Alteração realizada com sucesso!");
                flagClass = 1;
        
            }
            


            }while(flagClass == 0);

        }
        }while(optionChangeFilme != "3");

        

    }
    



    //Cliente
    //inserindo cliente
    public void inserirCliente(){
        boolean booleanAddTipoEstudante = false;
        System.out.println("Digite o nome do cliente: ");
        String addNomeCliente = scan.next();
        System.out.println("Digite a idade do cliente: ");
        String addIdadeCliente = scan.next();
        int intAddIdadeCliente = Integer.parseInt(addIdadeCliente);

        int flagEstudanteCliente = 0;
        do{
        System.out.println("O cliente é estudante?\n[1] - Sim\n[2] - Não");
        String addTipoEstudante = scan.next();
        
        if(addTipoEstudante!= "1" || addTipoEstudante != "2"){
            System.out.println("Digite uma opção válida!");
        } else {
            flagEstudanteCliente += 1;
            switch(addTipoEstudante){
                case "1":
                booleanAddTipoEstudante = true;
                break;

                case "2":
                booleanAddTipoEstudante = false;
                break;
            }
        }
        }while(flagEstudanteCliente == 0);

        Cliente c = new Cliente(addNomeCliente, intAddIdadeCliente, booleanAddTipoEstudante);

        listaClientes.add(c);
        c.setNumeroCadastroCliente(listaClientes.indexOf(c));
        System.out.println("Cliente inserido com sucesso!");
        System.out.println(c.statusCliente());
        

        
    }
 
    

    //listando todos os clientes
    public void listarCliente(){
        if(listaClientes.isEmpty()){
            System.out.println("Não há nenhum cliente registrado!");
        } else {
            for(int i = 0; i < listaClientes.size(); i++){
                System.out.println(listaClientes.get(i).statusCliente());
                
            }
        }
    }


    //removendo cliente
    public void removerCliente(){
        if(listaClientes.isEmpty()){
            System.out.println("Não há nenhum cliente registrado!");
        } else {
                System.out.println("Digite o número de cadastro do cliente");
                String removeCliente = scan.next();
                int intRemoveCliente = Integer.parseInt(removeCliente);
                
                if(intRemoveCliente > listaFilmes.size()){
                    System.out.println("Cadastro não encontrado!");
                } else {
                    for(int i = 0; i < listaClientes.size(); i ++){
                        if(listaClientes.get(i).getNumeroCadastroCliente() == intRemoveCliente){
                            listaClientes.remove(listaClientes.get(i));
                        } else {
                            System.out.println("Cadastro não encontrado!");
                        }
                }
                }
                System.out.println("Cliente removido com sucesso!");
            }
        }



    //alterando dados do cliente
    public void alterarDadosCliente(){
        System.out.println("Digite o numero do cadastro do cliente que você deseja fazer alterações: ");
        String searchNumeroCadastroCliente = scan.next();
        int intSearchNumeroCadastroCliente = Integer.parseInt(searchNumeroCadastroCliente);
        String optionChangeDataClient;

        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i).getNumeroCadastroCliente() == intSearchNumeroCadastroCliente){
                do{
                    System.out.println("Fazer alterações: ");
                    System.out.println("[1] - Nome do cliente");
                    System.out.println("[2] - Idade do cliente");
                    System.out.println("[3] - Status de estudante");
                    System.out.println("--------------------------------");
                    System.out.println("[4] - Concluir alterações");
                    optionChangeDataClient = scan.next();
        
                    switch(optionChangeDataClient){
                        case "1":
                        System.out.println("Digite o novo nome atrelado ao cliente: ");
                        String newNameCliente = scan.next();
                        for(i = 0; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getNumeroCadastroCliente() == intSearchNumeroCadastroCliente){
                                listaClientes.get(i).setNomeCliente(newNameCliente);
                                System.out.println("Alteração realizada com sucesso");
                                System.out.println(listaClientes.get(i).statusCliente());
                                
                            }
                            
                        }
                        
                        break;
                        case "2":
                        System.out.println("Digite a nova idade atrelada ao cliente: ");
                        int newIdadeCliente = scan.nextInt();
                        for(i = 0; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getNumeroCadastroCliente() == intSearchNumeroCadastroCliente){
                                listaClientes.get(i).setIdade(newIdadeCliente);
                                System.out.println("Alteração feita com sucesso");
                                System.out.println(listaClientes.get(i).statusCliente());
                            }
                        }
                        break; // fim do case 2
        
        
                        case "3":
                        for(i  = 0 ; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getNumeroCadastroCliente() == intSearchNumeroCadastroCliente){
                                if(listaClientes.get(i).getEstudante() == true){
                                    listaClientes.get(i).setEstudante(false);
                                    System.out.println("Alteração feita com sucesso");
                                    System.out.println("Cliente: Não estudante");
                                } else {
                                    listaClientes.get(i).setEstudante(true);
                                    System.out.println("Alteração feita com sucesso");
                                    System.out.println("Cliente: Estudante");
                                    System.out.println(listaClientes.get(i).statusCliente());
                                }
                            }
                        }
                        break; // fim do case 3
        
                        default:
                        System.out.println("Opção inválida!");
                        break;
        
                        
        
                    }
        
                }while(optionChangeDataClient != "4");

            } else {
                System.out.println("Não houve resultados para esse número de cadastro de cliente");
            }
        }
        
    }

    //pesquisar por cliente
    public void pesquisarCliente(){
        if(listaClientes.isEmpty()){
            System.out.println("Não há clientes registrados!");
        } else {
        System.out.println("Pesquisar por\n[1] - Nome\n[2] - Idade\n[3] - Número de cadastro\n[4] - Estudantes");
        String optionClientSearch = scan.next();
        switch(optionClientSearch){
            case "1":
            pesquisarClientePorNome();
            break;
            case "2":
            pesquisarClientePorIdade();

            break;

            case "3":
            pesquisarClientePorNumeroCadastro();

            break;

            case "4":
            pesquisarClienteEstudantes();
            
            break;
            default:
            System.out.println("Opção inválida!");
            break;
        }
    }

    }

    //pesquisar cliente pelo nome
    private void pesquisarClientePorNome(){
        System.out.println("Digite o nome do cliente: ");
        String searchNomeCliente = scan.next();
        for(int i = 0 ; i < listaClientes.size(); i++){
            if(searchNomeCliente.equals(listaClientes.get(i).getNomeCliente())){
                System.out.println(listaClientes.get(i).statusCliente());
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }

    //pesquisar cliente pelo numero de cadastro
    private void pesquisarClientePorNumeroCadastro(){
        System.out.println("Digite o número de cadastro do cliente: ");
        String searchNumeroCadastroCliente = scan.next();
        int intSearchNumeroCadastroCliente = Integer.parseInt(searchNumeroCadastroCliente);

        for(int i = 0; i < listaFilmes.size(); i++){
            if(listaClientes.get(i).getNumeroCadastroCliente() == intSearchNumeroCadastroCliente){
                System.out.println(listaClientes.get(i).statusCliente());
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }

    //pesquisar cliente pela idade
    private void pesquisarClientePorIdade(){
        System.out.println("Digite a idade: ");
        String searchIdade = scan.next();
        int intSearchIdade = Integer.parseInt(searchIdade);

        for(int i = 0; i < listaFilmes.size(); i ++){
            if(listaClientes.get(i).getIdade() == intSearchIdade){
                System.out.println(listaClientes.get(i).statusCliente());
            } else {
                System.out.println("Não houve resultados para esta pesquisa");
            }
        }
    }

    //pesquisar clientes estudantes
    private void pesquisarClienteEstudantes(){
        for(int i = 0 ; i< listaClientes.size(); i++){
            if(listaClientes.get(i).getEstudante()){
                System.out.println(listaClientes.get(i).statusCliente());
            } else {
                System.out.println("Não há clientes do tipo estudantes");
            }
        }
    }



    //sessoes
    //inserir sessoes
    public void inserirSessao(){
        System.out.println("Digite a hora que ocorrerá a sessão: ");
        String addHoraSessao = scan.next();
        System.out.println("Digite os minutos:");
        String addMinutoSessao = scan.next();
        System.out.println("Digite a quantidade máxima de pessoas: ");
        int addQntdMaxPessoas = scan.nextInt();

        String addDiaSessao;
        String addDiaSessaoReal;
        int flagSessao = 0;
        do{
        System.out.println("Escolha o dia: ");
        System.out.println("[1] - Domingo\n[2] - Segunda-Feira\n[3] - Terça-Feira\n[4] - Quarta-Feira\n[5] - Quinta-Feira\n[6] - Sexta-Feira\n[7] - Sábado\n");
        addDiaSessao = scan.next();
        switch(addDiaSessao){
            case "1":
            addDiaSessaoReal = "Domingo";
            Sessao s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoDomingo.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;

            case "2":
            addDiaSessaoReal = "Segunda-Feira";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoSegunda.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            case "3":
            addDiaSessaoReal = "Terça-Feira";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoTerca.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            case "4":
            addDiaSessaoReal = "Quarta-Feira";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoQuarta.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            case "5":
            addDiaSessaoReal = "Quinta-Feira";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoQuinta.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            case "6":
            addDiaSessaoReal = "Sexta-Feira";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoSexta.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            case "7":
            addDiaSessaoReal = "Sábado";
            s = new Sessao(addDiaSessaoReal, addHoraSessao, addMinutoSessao, addQntdMaxPessoas);
            listaSessao.add(s);
            listaSessaoSabado.add(s);
            System.out.println(s.statusSessao());
            System.out.println("Sessão inserida com sucesso!");
            flagSessao +=1;
            break;
            default:
            System.out.println("Opção inválida!");
            break;
        }
    }while(flagSessao == 0);

       
        
    }

    //funcao auxiliar, ordenando sessoes
    private void ordenarSessoes(){
        Sessao aux;
        //Domingo
        for(int cont = 0; cont < listaSessaoDomingo.size(); cont++){
            for(int i = 0; i < listaSessaoDomingo.size()-1; i++){
                if(listaSessaoDomingo.get(i).getHoraInteiro() > listaSessaoDomingo.get(i+1).getHoraInteiro()){
                    aux = listaSessaoDomingo.get(i);
                    listaSessao.set(i, listaSessaoDomingo.get(i+1));
                    listaSessaoDomingo.set(i+1, aux);
                }
            }
        }

        //Segunda
         
         for(int cont = 0; cont < listaSessaoSegunda.size(); cont++){
            for(int i = 0; i < listaSessaoSegunda.size()-1; i++){
                if(listaSessaoSegunda.get(i).getHoraInteiro() > listaSessaoSegunda.get(i+1).getHoraInteiro()){
                    aux = listaSessaoSegunda.get(i);
                    listaSessao.set(i, listaSessaoSegunda.get(i+1));
                    listaSessaoSegunda.set(i+1, aux);
                }
            }
        }


        //Terça
        
         
        for(int cont = 0; cont < listaSessaoTerca.size(); cont++){
            for(int i = 0; i < listaSessaoTerca.size()-1; i++){
                if(listaSessaoTerca.get(i).getHoraInteiro() > listaSessaoTerca.get(i+1).getHoraInteiro()){
                    aux = listaSessaoTerca.get(i);
                    listaSessao.set(i, listaSessaoTerca.get(i+1));
                    listaSessaoTerca.set(i+1, aux);
                }
            }
        }

        //Quarta
        
        for(int cont = 0; cont < listaSessaoQuarta.size(); cont++){
            for(int i = 0; i < listaSessaoQuarta.size()-1; i++){
                if(listaSessaoQuarta.get(i).getHoraInteiro() > listaSessaoQuarta.get(i+1).getHoraInteiro()){
                    aux = listaSessaoQuarta.get(i);
                    listaSessao.set(i, listaSessaoQuarta.get(i+1));
                    listaSessaoQuarta.set(i+1, aux);
                }
            }
        }


        //Quinta
        for(int cont = 0; cont < listaSessaoQuinta.size(); cont++){
            for(int i = 0; i < listaSessaoQuinta.size()-1; i++){
                if(listaSessaoQuinta.get(i).getHoraInteiro() > listaSessaoQuinta.get(i+1).getHoraInteiro()){
                    aux = listaSessaoQuinta.get(i);
                    listaSessao.set(i, listaSessaoQuinta.get(i+1));
                    listaSessaoQuinta.set(i+1, aux);
                }
            }
        }

        //Sexta
        for(int cont = 0; cont < listaSessaoSexta.size(); cont++){
            for(int i = 0; i < listaSessaoSexta.size()-1; i++){
                if(listaSessaoSexta.get(i).getHoraInteiro() > listaSessaoSexta.get(i+1).getHoraInteiro()){
                    aux = listaSessaoSexta.get(i);
                    listaSessao.set(i, listaSessaoSexta.get(i+1));
                    listaSessaoSexta.set(i+1, aux);
                }
            }
        }

        //Sabado
        for(int cont = 0; cont < listaSessaoSabado.size(); cont++){
            for(int i = 0; i < listaSessaoSabado.size()-1; i++){
                if(listaSessaoSabado.get(i).getHoraInteiro() > listaSessaoSabado.get(i+1).getHoraInteiro()){
                    aux = listaSessaoSabado.get(i);
                    listaSessao.set(i, listaSessaoSabado.get(i+1));
                    listaSessaoSabado.set(i+1, aux);
                }
            }
        }
        

    }




    //removendo sessoes 
    public void removerSessao(){
        String addDiaSessao;
        //String addDiaSessaoReal;
        int flagSessao = 0;
        do{
        System.out.println("Escolha o dia: ");
        System.out.println("[1] - Domingo\n[2] - Segunda-Feira\n[3] - Terça-Feira\n[4] - Quarta-Feira\n[5] - Quinta-Feira\n[6] - Sexta-Feira\n[7] - Sábado\n");
        addDiaSessao = scan.next();
        ordenarSessoes();
        
        switch(addDiaSessao){
            case "1":
            for(int i = 0; i < listaSessaoDomingo.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoDomingo.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            String removeOption = scan.next();
            int intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoDomingo.contains(listaSessaoDomingo.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoDomingo.remove(listaSessaoDomingo.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;

            case "2":
            
            for(int i = 0; i < listaSessaoSegunda.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSegunda.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoSegunda.contains(listaSessaoSegunda.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoSegunda.remove(listaSessaoSegunda.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;

            case "3":
            
            for(int i = 0; i < listaSessaoTerca.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoTerca.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoTerca.contains(listaSessaoTerca.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoTerca.remove(listaSessaoTerca.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;

            case "4":
            
            for(int i = 0; i < listaSessaoQuarta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoQuarta.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoQuarta.contains(listaSessaoQuarta.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoQuarta.remove(listaSessaoQuarta.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;

            case "5":
            
            for(int i = 0; i < listaSessaoQuinta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoQuinta.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoQuinta.contains(listaSessaoQuinta.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoQuinta.remove(listaSessaoQuinta.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;


            case "6":
            
            for(int i = 0; i < listaSessaoSexta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSexta.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoSexta.contains(listaSessaoSexta.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoSexta.remove(listaSessaoSexta.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;

            case "7":
            
            for(int i = 0; i < listaSessaoSabado.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSabado.get(i).statusSessao());
                
            }
            System.out.println("Escolha uma sessão pelo número para remover: ");
            removeOption = scan.next();
            intRemoveOption = Integer.parseInt(removeOption);
            if(listaSessaoSabado.contains(listaSessaoSabado.get(intRemoveOption-1))){
                flagSessao +=1;
                listaSessaoSabado.remove(listaSessaoSabado.get(intRemoveOption - 1));
                System.out.println("Sessão removida com sucesso");
                
            } else {
                System.out.println("Opção inválida!");

            }
            break;
        }
        
    } while(flagSessao==0);
    

}

    //alterar sessao
    public void alterarSessao(){

    }
    //listar sessoes
    public void listarSessoes(){
        String addDiaSessao;
        //String addDiaSessaoReal;
        int flagSessao = 0;
        do{
        System.out.println("Escolha o dia: ");
        System.out.println("[1] - Domingo\n[2] - Segunda-Feira\n[3] - Terça-Feira\n[4] - Quarta-Feira\n[5] - Quinta-Feira\n[6] - Sexta-Feira\n[7] - Sábado\n");
        addDiaSessao = scan.next();
        ordenarSessoes();
        switch(addDiaSessao){
            case "1":
            for(int i = 0; i < listaSessaoDomingo.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoDomingo.get(i).statusSessao());
            }
            flagSessao+=1;
            break;
            case "2":
            for(int i = 0; i < listaSessaoSegunda.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSegunda.get(i).statusSessao());
            }
            flagSessao+=1;
            break;

            case "3":
            for(int i = 0; i < listaSessaoTerca.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoTerca.get(i).statusSessao());
            }
            flagSessao+=1;
            break;

            case "4":
            for(int i = 0; i < listaSessaoQuarta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoQuarta.get(i).statusSessao());
            }
            flagSessao+=1;
            break;

            case "5":
            for(int i = 0; i < listaSessaoQuinta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoQuinta.get(i).statusSessao());
            }
            flagSessao+=1;
            break;

            case "6":
            for(int i = 0; i < listaSessaoSexta.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSexta.get(i).statusSessao());
            }
            flagSessao+=1;
            break;

            case "7":
            for(int i = 0; i < listaSessaoSabado.size(); i++){
                System.out.printf("[%d]\n", i+1);
                System.out.println(listaSessaoSabado.get(i).statusSessao());
            }
            flagSessao+=1;
            break;
            default:
            System.out.println("Opção inválida");
            break;

            



            

            
        }
    } while(flagSessao == 0);

}




}

