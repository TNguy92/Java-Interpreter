##
## Auto Generated makefile by CodeLite IDE
## any manual changes will be erased      
##
## Debug
ProjectName            :=C_Parser
ConfigurationName      :=Debug
WorkspacePath          := "C:\Users\NguyenFamily2.NGUYEN\Documents\C++_Parser"
ProjectPath            := "C:\Users\NguyenFamily2.NGUYEN\Desktop\C++\Lexer\Lexer\C_Parser"
IntermediateDirectory  :=./Debug
OutDir                 := $(IntermediateDirectory)
CurrentFileName        :=
CurrentFilePath        :=
CurrentFileFullPath    :=
User                   :=NguyenFamily2
Date                   :=06/04/2017
CodeLitePath           :="C:\Program Files (x86)\CodeLite"
LinkerName             :=C:/TDM-GCC-64/bin/g++.exe
SharedObjectLinkerName :=C:/TDM-GCC-64/bin/g++.exe -shared -fPIC
ObjectSuffix           :=.o
DependSuffix           :=.o.d
PreprocessSuffix       :=.i
DebugSwitch            :=-g 
IncludeSwitch          :=-I
LibrarySwitch          :=-l
OutputSwitch           :=-o 
LibraryPathSwitch      :=-L
PreprocessorSwitch     :=-D
SourceSwitch           :=-c 
OutputFile             :=$(IntermediateDirectory)/$(ProjectName)
Preprocessors          :=
ObjectSwitch           :=-o 
ArchiveOutputSwitch    := 
PreprocessOnlySwitch   :=-E
ObjectsFileList        :="C_Parser.txt"
PCHCompileFlags        :=
MakeDirCommand         :=makedir
RcCmpOptions           := 
RcCompilerName         :=C:/TDM-GCC-64/bin/windres.exe
LinkOptions            :=  
IncludePath            :=  $(IncludeSwitch). $(IncludeSwitch). 
IncludePCH             := 
RcIncludePath          := 
Libs                   := 
ArLibs                 :=  
LibPath                := $(LibraryPathSwitch). 

##
## Common variables
## AR, CXX, CC, AS, CXXFLAGS and CFLAGS can be overriden using an environment variables
##
AR       := C:/TDM-GCC-64/bin/ar.exe rcu
CXX      := C:/TDM-GCC-64/bin/g++.exe
CC       := C:/TDM-GCC-64/bin/gcc.exe
CXXFLAGS :=  -g -O0 -Wall $(Preprocessors)
CFLAGS   :=  -g -O0 -Wall $(Preprocessors)
ASFLAGS  := 
AS       := C:/TDM-GCC-64/bin/as.exe


##
## User defined environment variables
##
CodeLiteDir:=C:\Program Files (x86)\CodeLite
Objects0=$(IntermediateDirectory)/Lexer_Lexer.cpp$(ObjectSuffix) $(IntermediateDirectory)/Lexer_Main.cpp$(ObjectSuffix) $(IntermediateDirectory)/Lexer_Node.cpp$(ObjectSuffix) $(IntermediateDirectory)/Lexer_Parser.cpp$(ObjectSuffix) $(IntermediateDirectory)/Lexer_stdafx.cpp$(ObjectSuffix) $(IntermediateDirectory)/Lexer_Token.cpp$(ObjectSuffix) 



Objects=$(Objects0) 

##
## Main Build Targets 
##
.PHONY: all clean PreBuild PrePreBuild PostBuild MakeIntermediateDirs
all: $(OutputFile)

$(OutputFile): $(IntermediateDirectory)/.d $(Objects) 
	@$(MakeDirCommand) $(@D)
	@echo "" > $(IntermediateDirectory)/.d
	@echo $(Objects0)  > $(ObjectsFileList)
	$(LinkerName) $(OutputSwitch)$(OutputFile) @$(ObjectsFileList) $(LibPath) $(Libs) $(LinkOptions)

MakeIntermediateDirs:
	@$(MakeDirCommand) "./Debug"


$(IntermediateDirectory)/.d:
	@$(MakeDirCommand) "./Debug"

PreBuild:


##
## Objects
##
$(IntermediateDirectory)/Lexer_Lexer.cpp$(ObjectSuffix): ../Lexer.cpp $(IntermediateDirectory)/Lexer_Lexer.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/Lexer.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_Lexer.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_Lexer.cpp$(DependSuffix): ../Lexer.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_Lexer.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_Lexer.cpp$(DependSuffix) -MM "../Lexer.cpp"

$(IntermediateDirectory)/Lexer_Lexer.cpp$(PreprocessSuffix): ../Lexer.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_Lexer.cpp$(PreprocessSuffix) "../Lexer.cpp"

$(IntermediateDirectory)/Lexer_Main.cpp$(ObjectSuffix): ../Main.cpp $(IntermediateDirectory)/Lexer_Main.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/Main.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_Main.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_Main.cpp$(DependSuffix): ../Main.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_Main.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_Main.cpp$(DependSuffix) -MM "../Main.cpp"

$(IntermediateDirectory)/Lexer_Main.cpp$(PreprocessSuffix): ../Main.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_Main.cpp$(PreprocessSuffix) "../Main.cpp"

$(IntermediateDirectory)/Lexer_Node.cpp$(ObjectSuffix): ../Node.cpp $(IntermediateDirectory)/Lexer_Node.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/Node.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_Node.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_Node.cpp$(DependSuffix): ../Node.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_Node.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_Node.cpp$(DependSuffix) -MM "../Node.cpp"

$(IntermediateDirectory)/Lexer_Node.cpp$(PreprocessSuffix): ../Node.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_Node.cpp$(PreprocessSuffix) "../Node.cpp"

$(IntermediateDirectory)/Lexer_Parser.cpp$(ObjectSuffix): ../Parser.cpp $(IntermediateDirectory)/Lexer_Parser.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/Parser.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_Parser.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_Parser.cpp$(DependSuffix): ../Parser.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_Parser.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_Parser.cpp$(DependSuffix) -MM "../Parser.cpp"

$(IntermediateDirectory)/Lexer_Parser.cpp$(PreprocessSuffix): ../Parser.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_Parser.cpp$(PreprocessSuffix) "../Parser.cpp"

$(IntermediateDirectory)/Lexer_stdafx.cpp$(ObjectSuffix): ../stdafx.cpp $(IntermediateDirectory)/Lexer_stdafx.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/stdafx.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_stdafx.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_stdafx.cpp$(DependSuffix): ../stdafx.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_stdafx.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_stdafx.cpp$(DependSuffix) -MM "../stdafx.cpp"

$(IntermediateDirectory)/Lexer_stdafx.cpp$(PreprocessSuffix): ../stdafx.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_stdafx.cpp$(PreprocessSuffix) "../stdafx.cpp"

$(IntermediateDirectory)/Lexer_Token.cpp$(ObjectSuffix): ../Token.cpp $(IntermediateDirectory)/Lexer_Token.cpp$(DependSuffix)
	$(CXX) $(IncludePCH) $(SourceSwitch) "C:/Users/NguyenFamily2.NGUYEN/Desktop/C++/Lexer/Lexer/Token.cpp" $(CXXFLAGS) $(ObjectSwitch)$(IntermediateDirectory)/Lexer_Token.cpp$(ObjectSuffix) $(IncludePath)
$(IntermediateDirectory)/Lexer_Token.cpp$(DependSuffix): ../Token.cpp
	@$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) -MG -MP -MT$(IntermediateDirectory)/Lexer_Token.cpp$(ObjectSuffix) -MF$(IntermediateDirectory)/Lexer_Token.cpp$(DependSuffix) -MM "../Token.cpp"

$(IntermediateDirectory)/Lexer_Token.cpp$(PreprocessSuffix): ../Token.cpp
	$(CXX) $(CXXFLAGS) $(IncludePCH) $(IncludePath) $(PreprocessOnlySwitch) $(OutputSwitch) $(IntermediateDirectory)/Lexer_Token.cpp$(PreprocessSuffix) "../Token.cpp"


-include $(IntermediateDirectory)/*$(DependSuffix)
##
## Clean
##
clean:
	$(RM) -r ./Debug/


