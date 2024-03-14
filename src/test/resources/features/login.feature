@login @regressivo
Feature: login
Como usuario
Quero informar dados 
Para realizar login

Background: acessar tela de login
Given que nao esteja logado

@positivo @smoke @rapido
Scenario: login valido

When preencho o campo nome 
And preencho a senha
And clicar no botao login
Then usuario logado

@negativo
Scenario: login senha invalida

When preencho o campo nome 
And preencho a senha errada
And clicar no botao login
Then sistema exibe mensagem de erro