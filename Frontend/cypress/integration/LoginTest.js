describe('SignIn Test', () => {
    it('.get()', () => {
     cy.visit('http://localhost:3000/login')
      cy.get('input[name="email"]')
      .type('admin')
      .should('have.value', 'admin')

      cy.get('input[name="password"]')
      .type('admin')
      .should('have.value', 'admin')


      cy.get('button[name="btn"]')
      .click()

      cy.url().should("include",'/')
    })
})