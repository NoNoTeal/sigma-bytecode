public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u873d\u97b7\ud7e8\u8753\ua6bd {
    public void \u873d\u97b7\ud7e8\u8753\ua6bd(\u59ec\u8413\u97e6\uc229\u3776.\ubefe\u8258\u1833\u7ce1\ua3b4 p0, \u59ec\u8413\u97e6\uc229\u3776.\ubefe\u8258\u1833\u7ce1\ua3b4 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u873d\u97b7\ud7e8\u8753\ua6bd)
            putfield:ArrayList<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>(\u873d\u97b7\ud7e8\u8753\ua6bd::\u0c95\u4975\u72f1\u7ce1\u8350, this:\u873d\u97b7\ud7e8\u8753\ua6bd, initobject:ArrayList<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>(ArrayList<E>::<init>))
            invokestatic:void(ARBShaderObjects::glAttachObjectARB, putfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd, invokestatic:int(ARBShaderObjects::glCreateProgramObjectARB)), getfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, p0:\ubefe\u8258\u1833\u7ce1\ua3b4))
            invokestatic:void(ARBShaderObjects::glAttachObjectARB, getfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd), getfield:int(\ubefe\u8258\u1833\u7ce1\ua3b4::\uafe7\uc229\ubefe\u64ab\ub102, p1:\ubefe\u8258\u1833\u7ce1\ua3b4))
            invokestatic:void(ARBShaderObjects::glLinkProgramARB, getfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd))
            invokestatic:void(ARBShaderObjects::glValidateProgramARB, getfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\ufcaf\u3711\ub113\uc87f() {
        var_1_7D : int
        var_3_71 : Iterator<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>
        var_4_A9 : \u8640\u59ec\ud36e\u9af2\u6fb0<?>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_7D = and:int(ldc:int(1668190714), ldc:int(-415760457))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL20::glUseProgram, getfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd))
            var_3_71 = invokevirtual:Iterator<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>(ArrayList<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>::iterator, getfield:ArrayList<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>(\u873d\u97b7\ud7e8\u8753\ua6bd::\u0c95\u4975\u72f1\u7ce1\u8350, this:\u873d\u97b7\ud7e8\u8753\ua6bd))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_7D:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_7D = and:int(var_1_7D:int, ldc:int(-76622093))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_71:Iterator<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>)) {
                        var_4_A9 = checkcast:\u8640\u59ec\ud36e\u9af2\u6fb0<?>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8640\u59ec\ud36e\u9af2\u6fb0<?>.class, invokeinterface:\u8640\u59ec\ud36e\u9af2\u6fb0<?>(Iterator<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>::next, var_3_71:Iterator<\u8640\u59ec\ud36e\u9af2\u6fb0<?>>))
                        
                        if (getfield:boolean(\u8640\u59ec\ud36e\u9af2\u6fb0::\u946b\u5d20\u760c\u98a4\u836c, var_4_A9:\u8640\u59ec\ud36e\u9af2\u6fb0<?>)) {
                            putfield:boolean(\u8640\u59ec\ud36e\u9af2\u6fb0::\u946b\u5d20\u760c\u98a4\u836c, var_4_A9:\u8640\u59ec\ud36e\u9af2\u6fb0<?>, and:int[expected:boolean](ldc:int(12034), ldc:int(-28419)))
                            invokeinterface:void(BiConsumer<Integer, ?>::accept, getfield:BiConsumer<Integer, ?>(\u8640\u59ec\ud36e\u9af2\u6fb0::\ub6ab\ube23\uae87\uc84e\u1833, var_4_A9:\u8640\u59ec\ud36e\u9af2\u6fb0<?>), invokestatic:Integer(Integer::valueOf, getfield:int(\u873d\u97b7\ud7e8\u8753\ua6bd::\u120d\u7049\ub18d\u6b5f\uc31c, this:\u873d\u97b7\ud7e8\u8753\ua6bd)), getfield:?(\u8640\u59ec\ud36e\u9af2\u6fb0::\ub1b9\u2dcc\u47c2\u4492\u9033, var_4_A9:\u8640\u59ec\ud36e\u9af2\u6fb0<?>))
                        }
                        
                        var_1_7D = and:int(var_1_7D:int, ldc:int(1661465595))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_7D:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_7D = and:int(var_1_7D:int, ldc:int(1627939241))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2bd\u8413\ua068\u6bb9\u183a() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(GL20::glUseProgram, and:int(ldc:int(-25650), ldc:int(25649)))
            invokestatic:void(GL11::glPopMatrix)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8640\u59ec\ud36e\u9af2\u6fb0<java.lang.Float> \u1187\u93a2\ufcaf\uc238\u7e3f(java.lang.String p0, float p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8640\u59ec\ud36e\u9af2\u6fb0<java.lang.Integer> \u1187\u93a2\ufcaf\uc238\u7e3f(java.lang.String p0, int p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8640\u59ec\ud36e\u9af2\u6fb0<\u6435\ub8be\u718f\u6b0d\u67e9.\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2> \u1187\u93a2\ufcaf\uc238\u7e3f(java.lang.String p0, \u6435\ub8be\u718f\u6b0d\u67e9.\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2 p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8640\u59ec\ud36e\u9af2\u6fb0<java.lang.Boolean> \u1187\u93a2\ufcaf\uc238\u7e3f(java.lang.String p0, boolean p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static void lambda$\u99f7\u88c5\u3d64\u51fa\u983f$3(java.lang.Integer p0, java.lang.Boolean p1) {
        var_2_5F : int
        stack_8A_0 : int [generated]
        stack_8A_1 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(407193990), ldc:int(-652215544))
            stack_8A_0 = invokevirtual:int(Integer::intValue, p0:Integer)
            
            if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, p1:Boolean))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1183456941))
                stack_8A_1 = and:int(ldc:int(3526), ldc:int(-3527))
            }
            else {
                stack_8A_1 = and:int(ldc:int(3105), ldc:int(333))
            }
            
            invokestatic:void(GL20::glUniform1i, stack_8A_0:int, stack_8A_1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub7dc\u527a\uc3e3\uae87\u4daf$2(java.lang.Integer p0, \u6435\ub8be\u718f\u6b0d\u67e9.\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(GL20::glUniform2f, invokevirtual:int(Integer::intValue, p0:Integer), getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\u51fa\ub18d\u0c95\u3c25\ubded\u3bc9, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2), getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\uf995\u88c5\ub18d\ufcaf\ud12e\u2dcc, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3dd3\u4f4a\u64ab\ubb2b\ud12e$1(java.lang.Integer p0, java.lang.Integer p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(GL20::glUniform1i, invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:int(Integer::intValue, p1:Integer))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6b0d\u6bb9\uc9f6\u6c52\u385b$0(java.lang.Integer p0, java.lang.Float p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(GL20::glUniform1f, invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:float(Float::floatValue, p1:Float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u74b1\uc29a\u8709\u97e6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A1 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_696 = and:int(ldc:int(67960857), ldc:int(1465901213))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u873d\u97b7\ud7e8\u8753\ua6bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-881069851))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(1685052457))
            var_5_8A = and:int(ldc:int(10761), ldc:int(-10762))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14929), ldc:int(14912)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_696:int, ldc:int(-281058993))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-26560), ldc:int(-26559)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(16512), ldc:int(16513)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_E3:int, ldc:int(-690020983))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(6691), ldc:int(16457)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2005458888))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1553963457))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-609587053))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1653977847))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-58764119))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(205015822))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1824415738))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-630406831))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1779156641))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-40722246))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-940171975))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1009628559))
                        var_11_F4 = and:int(ldc:int(-31545), ldc:int(25400))
                        goto(Label_1553)
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1508448265))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1242653425))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1358398990))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1490183057))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1728073398))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(245869405))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-910383491))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(132111449))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(181323964))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-162841021))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-227621860))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1185298346))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(434184952))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-420535859))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(16385), ldc:int(6697))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1587633776))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2096477417))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-898991434))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1622502241))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-51529159))
                        var_11_F4 = and:int(ldc:int(16978), ldc:int(-17107))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1918921958))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(119023883))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-520081018))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(699492685))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-859067165))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-901654544))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1388476883))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1590298806))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(901725618))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1069970995))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(373134953))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(662696616))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1388122863))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-362203656))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-349474462))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1160923784))
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(651111263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1812177279))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-181092522))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1257906873))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(949280769))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(351082045))
                        var_17_6A1 = add:int(var_16_122:int, xor:int(ldc:int(320), ldc:int(321)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(703754011))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-825383985))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, xor:int(ldc:int(4482), ldc:int(4483))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(919653382))
            goto(Label_0108)
        }
    }
}
