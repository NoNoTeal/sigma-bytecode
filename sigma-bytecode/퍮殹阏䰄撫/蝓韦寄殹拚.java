public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u8753\u97e6\u5bc4\u6bb9\u62da<T> {
    public void \u8753\u97e6\u5bc4\u6bb9\u62da(java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, java.util.List<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<T>> p1, long p2) {
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
    
    private void \u8753\u97e6\u5bc4\u6bb9\u62da(java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>> p1) {
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
            invokespecial:Object(Object::<init>, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>)
            putfield:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>(\u8753\u97e6\u5bc4\u6bb9\u62da::\ub6ab\ud36e\u4c2b\ubf56\ufe34\ub70c, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>, p1:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>)
            putfield:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u8753\u97e6\u5bc4\u6bb9\u62da::\uc84e\ua61f\uf94d\u5140\u7e3f\u4cd9, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>, p0:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud4fe\ube23\u93a2\u6bb9\u965f\u3bc9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-16415), ldc:int(16414)))
        }
        
        goto(Label_0006)
    }
    
    public void \u71ae\u4bc8\u74b1\u97b7\u67e9\ud217(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1, int p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\ud158\uae87\ubefe\u5245\u7873 p3) {
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
            invokeinterface:boolean(List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>::add, getfield:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>(\u8753\u97e6\u5bc4\u6bb9\u62da::\ub6ab\ud36e\u4c2b\ubf56\ufe34\ub70c, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>), initobject:\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>(\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>::<init>, p1:T[expected:Object], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int, p3:\ud158\uae87\ubefe\u5245\u7873, aconstnull:\u3e75\u965f\u8258\ub8be\u8413()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u759a\u836c\ud4fe\uf995\u5db4\u8350(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, T p1) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-9601), ldc:int(9600)))
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e \ud217\ua3b4\uc29a\ubf56\u7af6\u5db4() {
        var_1_5F : int
        var_3_67 : \ud158\u8308\u76bc\u0a06\ud36e
        var_4_71 : Iterator<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>
        var_5_97 : \ub6ab\u1833\ub6ab\uc3e3\uc84e<T>
        var_6_A0 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
            var_1_5F = and:int(ldc:int(-1443822332), ldc:int(-383015255))
            var_3_67 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            var_4_71 = invokeinterface:Iterator<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>(List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>::iterator, getfield:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>(\u8753\u97e6\u5bc4\u6bb9\u62da::\ub6ab\ud36e\u4c2b\ubf56\ufe34\ub70c, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1384614456))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_71:Iterator<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>))) {
                    looporswitchbreak()
                }
                
                var_5_97 = checkcast:\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>.class, invokeinterface:\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>(Iterator<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>::next, var_4_71:Iterator<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>))
                var_6_A0 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(-32611), ldc:int(26208))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::apply, getfield:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u8753\u97e6\u5bc4\u6bb9\u62da::\uc84e\ua61f\uf94d\u5140\u7e3f\u4cd9, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>), invokestatic:Object[expected:T](\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>::\u71f1\uc4d2\u759a\ua3b4\u88c5\ubefe, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>)))))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(1), ldc:int(609))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub6ab\u1833\ub6ab\uc3e3\uc84e::\ub8be\u965f\u34df\u5f50\u3d64\u62da, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), xor:int(ldc:int(178), ldc:int(176))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub6ab\u1833\ub6ab\uc3e3\uc84e::\ub8be\u965f\u34df\u5f50\u3d64\u62da, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(2447), ldc:int(8259))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub6ab\u1833\ub6ab\uc3e3\uc84e::\ub8be\u965f\u34df\u5f50\u3d64\u62da, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>)))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(2708), ldc:int(16388))), getfield:int(\ub6ab\u1833\ub6ab\uc3e3\uc84e::\u51fa\u1187\u47c2\u6435\u0a06\u97b7, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(1591), ldc:int(16453))), invokevirtual:int(\ud158\uae87\ubefe\u5245\u7873::\u4179\uae5d\u9937\ufe34\u16f6\u97e6, getfield:\ud158\uae87\ubefe\u5245\u7873(\ub6ab\u1833\ub6ab\uc3e3\uc84e::\u873d\u446c\uf9c5\ucfaf\uc31c\ub7dc, var_5_97:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>)))
                invokevirtual:boolean(AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>::add, var_3_67:AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>, var_6_A0:\uc31c\uc87f\uc246\u3776\ub7dc)
            }
            
            return:\ud158\u8308\u76bc\u0a06\ud36e(var_3_67:\ud158\u8308\u76bc\u0a06\ud36e)
        }
        
        goto(Label_0006)
    }
    
    public static \ud36e\u6bb9\u960f\u4c04\u64ab.\u8753\u97e6\u5bc4\u6bb9\u62da<T> \ubefe\u3a62\ubb2b\u5140\ub8be\ucef1(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e p0, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p1, java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T> p2) {
        var_3_5F : int
        var_5_63 : ArrayList
        var_6_6C : int
        var_7_AC : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_CB : T
        
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
            var_3_5F = and:int(ldc:int(1479815774), ldc:int(2080366302))
            var_5_63 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_6C = and:int(ldc:int(-12636), ldc:int(12633))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1875853498))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-64858642))
                    
                    if (cmplt:boolean(var_6_6C:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, p0:\ud158\u8308\u76bc\u0a06\ud36e))) {
                        var_7_AC = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, p0:\ud158\u8308\u76bc\u0a06\ud36e, var_6_6C:int)
                        var_8_CB = invokeinterface:T(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>::apply, p2:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, T>, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(14672), ldc:int(-14673))))))
                        
                        if (cmpne:boolean(var_8_CB:T, aconstnull:T())) {
                            invokeinterface:boolean(List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>::add, var_5_63:ArrayList<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>[expected:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>>], initobject:\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>(\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>::<init>, var_8_CB:T[expected:Object], initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), xor:int(ldc:int(-28384), ldc:int(-28383)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), xor:int(ldc:int(17410), ldc:int(17408)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), and:int(ldc:int(59), ldc:int(4675))))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), xor:int(ldc:int(-24526), ldc:int(-24522)))), invokestatic:\ud158\uae87\ubefe\u5245\u7873(\ud158\uae87\ubefe\u5245\u7873::\u4179\uae5d\u9937\ufe34\u16f6\u97e6, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_7_AC:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102), xor:int(ldc:int(3074), ldc:int(3079))))), aconstnull:\u3e75\u965f\u8258\ub8be\u8413()))
                        }
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(2117523423))
                        inc:int(var_6_6C, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:\u8753\u97e6\u5bc4\u6bb9\u62da<T>(initobject:\u8753\u97e6\u5bc4\u6bb9\u62da<T>(\u8753\u97e6\u5bc4\u6bb9\u62da<Object>::<init>, p1:Function<Object, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, var_5_63:ArrayList<\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>>[expected:List<\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>>]))
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u3bd6\ud171\u6198\uae87\u0c95(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<T> p0) {
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
    
    private static void lambda$\uceb8\u385b\u71f1\uc2e8\u6c52\u8df4$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub6ab\u1833\ub6ab\uc3e3\uc84e p1) {
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
            invokeinterface:void(\u8258\uc238\u7e3f\u36d3\uc238<Object>::\u71ae\u4bc8\u74b1\u97b7\u67e9\ud217, p0:\u8258\uc238\u7e3f\u36d3\uc238<Object>, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub6ab\u1833\ub6ab\uc3e3\uc84e::\ub8be\u965f\u34df\u5f50\u3d64\u62da, p1:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>), invokestatic:Object(\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>::\u71f1\uc4d2\u759a\ua3b4\u88c5\ubefe, p1:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>), getfield:int(\ub6ab\u1833\ub6ab\uc3e3\uc84e::\u51fa\u1187\u47c2\u6435\u0a06\u97b7, p1:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>), getfield:\ud158\uae87\ubefe\u5245\u7873(\ub6ab\u1833\ub6ab\uc3e3\uc84e::\u873d\u446c\uf9c5\ucfaf\uc31c\ub7dc, p1:\ub6ab\u1833\ub6ab\uc3e3\uc84e<Object>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub6ab\u1833\ub6ab\uc3e3\uc84e lambda$\u97b7\u1187\u8cae\u51fa\u92ff\uff55$0(long p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad p1) {
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
            return:\ub6ab\u1833\ub6ab\uc3e3\uc84e(initobject:\ub6ab\u1833\ub6ab\uc3e3\uc84e(\ub6ab\u1833\ub6ab\uc3e3\uc84e<T>::<init>, invokevirtual:Object(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, p1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, p1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>), l2i:int(sub:long(getfield:long(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u74b1\u760c\u56bd\u0b8e\ub102\u92ee, p1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>), p0:long)), getfield:\ud158\uae87\ubefe\u5245\u7873(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u4f52\u62da\u62da\ub19c\u385b\u6198, p1:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<Object>), aconstnull:\u3e75\u965f\u8258\ub8be\u8413()))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23B : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_24E_0 : byte[] [generated]
        stack_28C_0 : byte[] [generated]
        stack_2F1_0 : byte[] [generated]
        stack_35E_0 : byte[] [generated]
        var_4_21E : int
        var_3_223 : byte[]
        var_5_224 : int
        expr_2F1 : byte [generated]
        var_0_354 : int
        expr_35E : byte [generated]
        stack_38E_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_27A : byte[]
        var_5_27B : int
        expr_E2 : int [generated]
        expr_11B : int [generated]
        var_3_15D : String
        stack_217_0 : String[] [generated]
        expr_16F : String[] [generated]
        
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
        var_0_23B = and:int(ldc:int(-1173977745), ldc:int(-1296171842))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_E0_0 = stack_E2_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_24E_0 = stack_28C_0 = stack_2F1_0 = stack_35E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NoZumpKKww==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_21E = expr_6E:int
        var_3_223 = newarray:byte[](byte.class, expr_6E:int)
        var_5_224 = expr_6E:int
        Label_0550:
        
        while (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(262144)), ldc:int(0))) {
                var_0_23B = and:int(var_0_23B:int, ldc:int(1472316027))
                goto(Label_0723)
            }
            
            var_0_23B = and:int(var_0_23B:int, ldc:int(2050988991))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            storeelement:byte(var_3_223:byte[], var_5_224:int, xor:byte(add:byte(loadelement:byte(stack_24E_0:byte[], var_5_224:int), ldc:byte(59)), ldc:byte(126)))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E0_0 = stack_E2_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_24E_0 = stack_28C_0 = stack_2F1_0 = stack_35E_0 = var_3_223:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0822)
        Label_0723:
        
        while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0550)
            }
            
            var_0_23B = and:int(var_0_23B:int, ldc:int(518499310))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_2F1 = loadelement:byte(stack_2F1_0:byte[], var_5_224:int)
            storeelement:byte(var_3_223:byte[], var_5_224:int, or:int(and:int(shl:int(expr_2F1:byte, xor:int(ldc:int(-30687), ldc:int(-30683))), ldc:int(-16)), and:int(shr:int(expr_2F1:byte[expected:int], and:int(ldc:int(1676), ldc:int(4356))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E0_0 = stack_E2_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_24E_0 = stack_28C_0 = stack_2F1_0 = stack_35E_0 = var_3_223:byte[]
            goto(Label_0231)
        }
        
        Label_0822:
        
        while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0550)
            }
            
            var_0_354 = and:int(var_0_23B:int, ldc:int(-548421698))
            var_5_224 = add:int(var_5_224:int, ldc:int(-1))
            expr_35E = loadelement:byte(stack_35E_0:byte[], var_5_224:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_224:int, ldc:int(3)), neg:int(var_4_21E:int)), ldc:int(0))) {
                var_0_354 = and:int(var_0_354:int, ldc:int(315918959))
                stack_38E_2 = add:byte(expr_35E:byte, ldc:byte(3))
            }
            else {
                stack_38E_2 = add:byte(expr_35E:byte, loadelement:byte(var_3_223:byte[], add:int(var_5_224:int, ldc:int(3))))
            }
            
            var_0_23B = and:int(var_0_354:int, ldc:int(2122811694))
            storeelement:byte(var_3_223:byte[], var_5_224:int, stack_38E_2:byte)
            
            if (cmpne:boolean(var_5_224:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E0_0 = stack_E2_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_24E_0 = stack_28C_0 = stack_2F1_0 = stack_35E_0 = var_3_223:byte[]
            goto(Label_0288)
        }
        
        var_0_23B = and:int(var_0_23B:int, ldc:int(-1832861680))
        goto(Label_0723)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(16384)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(-84436639))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(1524680426))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(906480126))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_27A = newarray:byte[](byte.class, expr_A9:int)
                var_5_27B = expr_A9:int
                
                loop {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-1086544593))
                    var_5_27B = add:int(var_5_27B:int, ldc:int(-1))
                    storeelement:byte(var_3_27A:byte[], var_5_27B:int, add:int(shl:int(loadelement:byte(stack_28C_0:byte[], var_5_27B:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_27B:int, and:int(ldc:int(13), ldc:int(5169)))), ldc:int(7)), xor:int(ldc:int(9296), ldc:int(9297)))))
                    
                    if (cmpne:boolean(var_5_27B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_E0_0 = stack_E2_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_24E_0 = stack_28C_0 = stack_2F1_0 = stack_35E_0 = var_3_27A:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(512)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(61578848))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(262144)), ldc:int(0))) {
                var_0_23B = and:int(var_0_23B:int, ldc:int(-1961657894))
                goto(Label_0115)
            }
            
            var_0_23B = and:int(var_0_23B:int, ldc:int(1051105343))
            expr_E2 = arraylength:int(stack_E2_0:byte[])
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_4_21E = expr_E2:int
                var_3_223 = newarray:byte[](byte.class, expr_E2:int)
                var_5_224 = expr_E2:int
                goto(Label_0723)
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(-224924185))
        }
        else {
            if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_23B = and:int(var_0_23B:int, ldc:int(1729761544))
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_23B = and:int(var_0_23B:int, ldc:int(1991544127))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_4_21E = expr_11B:int
                var_3_223 = newarray:byte[](byte.class, expr_11B:int)
                var_5_224 = expr_11B:int
                goto(Label_0822)
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(-801827168))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(-2023669863))
            goto(Label_0115)
        }
        
        var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_217_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16391), ldc:int(6)))
        expr_16F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2113), ldc:int(2119)))
        storeelement:String(expr_16F:String[], and:int(ldc:int(-25618), ldc:int(25617)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(2232), ldc:int(-27322)), xor:int(ldc:int(4112), ldc:int(4113))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(2564), ldc:int(2561)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(-12280), ldc:int(-12279)), and:int(ldc:int(12334), ldc:int(2563))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(-32639), ldc:int(-32635)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(5411), ldc:int(25110)), xor:int(ldc:int(2113), ldc:int(2114))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(8737), ldc:int(20483)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(24579), ldc:int(3211)), xor:int(ldc:int(1094), ldc:int(1090))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(2), ldc:int(2438)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(-32764), ldc:int(-32768)), and:int(ldc:int(16645), ldc:int(10399))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(22), ldc:int(21)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(-15357), ldc:int(-15354)), xor:int(ldc:int(8549), ldc:int(8547))))
        putstatic:String[](\u8753\u97e6\u5bc4\u6bb9\u62da::\u16f6\u4bc8\ub1b9\u6c52\u0b8e\ub102, expr_16F:String[])
    }
    
    public void \u74b1\ubf56\ud217\u120d\u965f\u12b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(1574644492), ldc:int(-107583636))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8753\u97e6\u5bc4\u6bb9\u62da<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1729306154))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1840018409))
            var_5_8A = and:int(ldc:int(-24742), ldc:int(24741))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12799), ldc:int(12670)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(-612302934))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(1185), ldc:int(265)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(4643), ldc:int(5)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(-577765419))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1031), ldc:int(1030)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1321986357))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1906154662))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(515255941))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1750178918))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(395567601))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1635494288))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1955937598))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1240146724))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0447:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1821281956))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(634178529))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1182807067))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-642405442))
                            var_11_F4 = and:int(ldc:int(28933), ldc:int(-28942))
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1200854058))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1201499026))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1785464111))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2007632195))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1693302857))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-906969161))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-887886036))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1931026293))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-186376495))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-325447854))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(638984837))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1373560920))
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-69753005))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1091475431))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1974249098))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1340586916))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(8209), ldc:int(3137))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1810191231))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1638755638))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1955241288))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1169688801))
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1535522739))
                        var_11_F4 = and:int(ldc:int(-31756), ldc:int(23563))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-698828098))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-898436871))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1548693536))
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-37965888))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1957443406))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-220214146))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-812176483))
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-7226456))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1603319683))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(911482473))
                        goto(Label_0447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1377779006))
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-343705741))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(585264713))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1305088323))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1299208378))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1556045363))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-73882755))
                        var_17_686 = add:int(var_16_122:int, xor:int(ldc:int(-20416), ldc:int(-20415)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(1181403652))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-40522967))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:int(28674), ldc:int(28675))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(6281263))
            goto(Label_0108)
        }
    }
}
