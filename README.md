#### Projeto Integrador - Software para Impressão de Certificados/Atas de Defesa de Trabalho de Conclusão de Curso (TCC).

#### 1º Semestre de 2015

#### Instalação

##### Banco de Dados

> **Pré requisito**
> Para realizar a criação do banco de dados é necessário ter instalado o MySQL Server na versão 5.6 ou superior.
> Link: [MySQL Server 5.6 Download](http://dev.mysql.com/downloads/mysql/)
>
>Executar o script [integrador-printer-1.0-SNAPSHOT.sql](https://github.com/alvoradamaringa/integrador-printer/integrador-printer/specification/bd/integrador-printer-1.0-SNAPSHOT.sql) na qual resultará na criação da base de dados do **projetoIntegrador**.

##### Servidor de Aplicação

> **Pré requisito**
> Para configuração do servidor de aplicação é necessário ter instalado o Wildfly Application Server na versão 8.2.0 ou superior.
> Link: [Wildfly Application Server 8.2.0 Download](http://download.jboss.org/wildfly/8.2.0.Final/wildfly-8.2.0.Final.zip)
>
> Copiar o arquivo [standalone-integrador-printer.xml](https://github.com/alvoradamaringa/integrador-printer/integrador-printer/specification/jboss/standalone-integrador-printer.xml) para o diretório *WILDFLY_HOME\standalone\configuration*.
>
> Copiar o dretório [mysql](https://github.com/alvoradamaringa/integrador-printer/integrador-printer/specification/jboss/mysql) para o diretório *WILDFLY_HOME\modules\system\layers\base\com*.
> 

#### Iniciando a Aplicação

> Executar na linha de comando no diretório *WILDFLY\bin*

##### Windows

`standalone.bat --server-config=standalone-integrador-printer.xml`

##### Linux

`standalone.sh --server-config=standalone-integrador-printer.xml`

#### Help

>**WILDFLY_HOME** é o caminho da instalação do Wildfly Application Server.
