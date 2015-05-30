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
> Para instalação do servidor de aplicação é necessário ter instalado o JBoss Application Server na versão 6.3.0.GA ou superior.
> Link: [JBoss Application Server 6.3.0.GA Download](http://www.redhat.com/j/elqNow/elqRedir.htm?ref=https://www.jboss.org/download-manager/content/origin/files/sha256/7f/7f4e6d63196edc3cf15240b693391b9c0be474cda2194ba7575be31881f1a3d5/jboss-eap-6.3.0.zip)
>
> Copiar o arquivo [standalone-integrador-printer.xml](https://github.com/alvoradamaringa/integrador-printer/integrador-printer/specification/jboss/standalone-integrador-printer.xml) para o diretório JBOSS_HOME\standalone\configuration, onde JBOSS_HOME é o caminho da instalação do JBoss Application Server.
