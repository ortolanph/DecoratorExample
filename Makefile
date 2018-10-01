.phony: clean

mvn_clean: 
	@echo "--[LIMPANDO PROJETO]--------------------------------------------------"
	@mvn clean -q
	@echo "----------------------------------------------------------------------"

clean: pdf_clean mvn_clean
	
	
dependencies:
	@echo "--[RESOLVENDO DEPENDÊNCIAS]-------------------------------------------"
	@mvn dependency:resolve
	@echo "----------------------------------------------------------------------"
	
compile: mvn_clean
	@echo "--[COMPILANDO]--------------------------------------------------------"
	@mvn install -q
	@echo "----------------------------------------------------------------------"
	
