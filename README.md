<div>
  <h1> A3 • Sistema de Empréstimo de Ferramentas</h1>
 </div>

<div>
  <h3>Descrição do projeto</h3>
  O trabalho consiste em desenvolver um software com o problema que foi contextualizado na universidade, um familiar solicita por um software que organize o emprestimo de ferramentas ao seus conhecidos, o ToolBarão   resolve de forma simplificada.
</div>

<details>
  <summary><h3> Requisitos Funcionais; Requisitos Não Funcionais; e Regras de Negócios </h3></summary>
  
  - #### `RF01:` O sistema deve incluir uma base de dados editável de ferramentas com: nome, marca e preço de aquisição.
  - #### `RF02:` O sistema deve incluir uma base de dados editável de amigos com: nome e telefone.
  - #### `RF03:` O sistema deve associar ferramentas aos amigos em uma relação de empréstimo.
  - #### `RF04:` O sistema deve registrar todos os empréstimos e devoluções.
  - #### `RF05:` O sistema deve gerar relatórios, incluindo: quem fez mais empréstimos e quem nunca devolveu.
  - #### `RF06:` O sistema deve emitir mensagem caso alguém fazendo um empréstimo novo ainda tenha alguma ferramenta para devolver.
  - #### `RNF01:` Rodar localmente no computador dele.
  - #### `RN01:` Para o amigo, é necessário fornecer nome, cpf, email e número

  
</details>

### Pré-requisitos
-  `Maven`
-  `MySQL`
-  `JDK 21`

### Configurando DataBase
#### No cmd:
Vá para a pasta do projeto:
```
cd Users\[seu usuario]\Documents\NetBeansProjects\A3-EmprestimoDeFerramentas
```
Crie o arquivo "secrets.properties" (este arquivo contém a senha do MySQL):
```
echo sql.password=[SUASENHAAQUI] >> secrets.properties
```

Vá para a pasta do Workbench:
```
cd Program Files\MySQL\MySQL Workbench 8.0 CE
```
Na pasta do MySQLWorkbench, execute:
```
start MySQLWorkbench.exe
```

Entre em local instance:

`root`

`localhost:3306`

<div> Em files -> Open SQL Script..</div>
<img aling="left" height="100" src="https://github.com/JoaoHenriqueProg/A3-EmprestimoDeFerramentas/assets/102531267/424efb84-e4a6-4da8-afe8-3eb23a5b4a4b"/>

Abra o arquivo: [InitLocalDatabases.sql](https://github.com/JoaoHenriqueProg/A3-EmprestimoDeFerramentas/blob/master/InitLocalDatabases.sql); e execute [⚡] o script

## Links 
- [Figma](https://www.figma.com/design/b7jf8PMz4qv7Ermevyh7bP/Emprestimo-de-Ferramentas?node-id=0-1&t=zij1dm1fnF6MHrjO-0): Protótipo do sistema (layout das telas)
- [Trello]():
