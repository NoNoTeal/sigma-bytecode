public class \u494c\u4975\ua068\u0c95\uc84e.\u6d69\u47c2\u8aa5\u92ee\u527a {
    public void \u6d69\u47c2\u8aa5\u92ee\u527a() {
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
    
    public static java.util.ArrayList<\u71f1\uc910\u3bc9\u516c\u93a2.\uc3e3\ubefe\u9033\uc84e\u6cfe> \u6fb0\u8258\uc9f6\u5fe1\ube23\ube23() {
        var_0_5F : int
        var_2_67 : ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>
        var_3_7B : Iterator<\ud158\u839e\u7006\uc3e3\u446c>
        var_3_AA : Iterator<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>
        
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
            var_0_5F = and:int(ldc:int(-363291885), ldc:int(-1149610281))
            var_2_67 = initobject:ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>(ArrayList<E>::<init>)
            var_3_7B = invokeinterface:Iterator<\ud158\u839e\u7006\uc3e3\u446c>(Collection<\ud158\u839e\u7006\uc3e3\u446c>::iterator, invokeinterface:Collection<\ud158\u839e\u7006\uc3e3\u446c>(Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>::values, invokevirtual:Map<Class<? extends \ud158\u839e\u7006\uc3e3\u446c>, \ud158\u839e\u7006\uc3e3\u446c>(\u3776\u647c\u51fa\u7e3f\ub32d::\uc246\ud171\u8709\u6435\u416d, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-384156678))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_7B:Iterator<\ud158\u839e\u7006\uc3e3\u446c>)) {
                        invokevirtual:boolean(ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>::add, var_2_67:ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>, initobject:\uc3e3\ubefe\u9033\uc84e\u6cfe(\uc3e3\ubefe\u9033\uc84e\u6cfe::<init>, checkcast:\ud158\u839e\u7006\uc3e3\u446c(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, invokeinterface:\ud158\u839e\u7006\uc3e3\u446c(Iterator<\ud158\u839e\u7006\uc3e3\u446c>::next, var_3_7B:Iterator<\ud158\u839e\u7006\uc3e3\u446c>))))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_AA = invokeinterface:Iterator<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>(Set<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>::iterator, invokeinterface:Set<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>(Map<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>::entrySet, getstatic:Map<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>(\ucfaf\ud217\u8df4\u52d3\u446c::\ud171\u7049\uf94d\u74b1\u0a06)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_AA:Iterator<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>)) {
                invokevirtual:boolean(ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>::add, var_2_67:ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>, initobject:\uc3e3\ubefe\u9033\uc84e\u6cfe(\uc3e3\ubefe\u9033\uc84e\u6cfe::<init>, checkcast:Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>(java.lang.Class<? extends \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006>.class, invokeinterface:Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>(Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>::getKey, checkcast:Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>(java.util.Map.Entry<java.lang.Class<? extends \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, java.lang.String>.class, invokeinterface:Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>(Iterator<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>::next, var_3_AA:Iterator<Entry<Class<? extends \ua3b4\u965f\u6d99\u4492\ud4fe\u7006>, String>>))))))
            }
            
            return:ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>(var_2_67:ArrayList<\uc3e3\ubefe\u9033\uc84e\u6cfe>)
        }
        
        goto(Label_0006)
    }
    
    private void \u873d\uc229\u839e\uf94d\uae87\u6d69(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u6b0d\u6d69\ub102\ua6bd\ub32d p0) {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\ub102\u8350\u9255\u4d85\ubefe[expected:Runnable](\ub102\u8350\u9255\u4d85\ubefe::<init>, this:\u6d69\u47c2\u8aa5\u92ee\u527a, p0:\u6b0d\u6d69\ub102\ua6bd\ub32d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\u4daf\u7bad\ub83f\ubb2b\ubded() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u836c\ub102\u8bb0\uc229\u76bc[expected:Runnable](\u836c\ub102\u8bb0\uc229\u76bc::<init>, this:\u6d69\u47c2\u8aa5\u92ee\u527a, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3e75\ub171\u8350\u516c\u99f7\uc84e() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u8350\u0c95\ub7dc\u8bb0\u9af2[expected:Runnable](\u8350\u0c95\ub7dc\u8bb0\u9af2::<init>, this:\u6d69\u47c2\u8aa5\u92ee\u527a, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u960f\u7d52\ub19c\u3776\u97b7[expected:Runnable](\u960f\u7d52\ub19c\u3776\u97b7::<init>, this:\u6d69\u47c2\u8aa5\u92ee\u527a, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8bb0\ua6bd\u56bd\u4f52\u4daf\u92ee() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\ud171\ub102\u12cb\u8389\u6ec6[expected:Runnable](\ud171\ub102\u12cb\u8389\u6ec6::<init>, this:\u6d69\u47c2\u8aa5\u92ee\u527a, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
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
            
            if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\u8aa5\u8d90\u5bc4\u3504\u16f6, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90])) {
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8258\u12cb\u97e6\u1187\u62da, getfield:\u6b0d\u6d69\ub102\ua6bd\ub32d[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u6d69\u47c2\u8aa5\u92ee\u527a::\ubf56\u1833\u64f2\u4e72\u0a06, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u4ab3\u446c\u7ce1\u600f, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
                putfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u9255\u0c95\u4cd9\ube23\u760c, this:\u6d69\u47c2\u8aa5\u92ee\u527a, and:int(ldc:int(3845), ldc:int(-4054)))
                putfield:\u3504\ud158\u760c\u6d99\u9a18(\u6d69\u47c2\u8aa5\u92ee\u527a::\u494c\u4e72\u8258\u7e3f\u8d98, this:\u6d69\u47c2\u8aa5\u92ee\u527a, aconstnull:\u3504\ud158\u760c\u6d99\u9a18())
            }
            
            if (cmpne:boolean(getfield:\u3504\ud158\u760c\u6d99\u9a18(\u6d69\u47c2\u8aa5\u92ee\u527a::\u494c\u4e72\u8258\u7e3f\u8d98, this:\u6d69\u47c2\u8aa5\u92ee\u527a), aconstnull:\u3504\ud158\u760c\u6d99\u9a18())) {
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8258\u12cb\u97e6\u1187\u62da, getfield:\u6b0d\u6d69\ub102\ua6bd\ub32d[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u6d69\u47c2\u8aa5\u92ee\u527a::\ubf56\u1833\u64f2\u4e72\u0a06, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u4ab3\u446c\u7ce1\u600f, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], getfield:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u6d69\u47c2\u8aa5\u92ee\u527a::\u494c\u4e72\u8258\u7e3f\u8d98, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
                putfield:\u3504\ud158\u760c\u6d99\u9a18(\u6d69\u47c2\u8aa5\u92ee\u527a::\u494c\u4e72\u8258\u7e3f\u8d98, this:\u6d69\u47c2\u8aa5\u92ee\u527a, aconstnull:\u3504\ud158\u760c\u6d99\u9a18())
            }
            
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:int, p1:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u93a2\u93a2\u3504\uc84e\ud158, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], and:int[expected:boolean](ldc:int(10563), ldc:int(-10564)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8389\u5245\ucfaf\u61a4\ub6ab() {
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
            return:int(ldc:int(60))
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u5140\u9a18\u8d98\ufe34\uc2e8(int p0) {
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
            invokespecial:void(\ua068\u7af6\u3e75\u3bc9\ua562::\ua068\u5140\u9a18\u8d98\ufe34\uc2e8, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\ua068\u7af6\u3e75\u3bc9\ua562], p0:int)
            
            if (cmpeq:boolean(p0:int, and:int(ldc:int(2496), ldc:int(1301)))) {
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\u3711\ubb2b\ua3b4\ud171\u3bc9)
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u47c2\u8aa5\u92ee\u527a::\u51b2\u8640\u446c\ufcaf\u2dcc), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_87 : float
        
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
            p0 = div:float(l2f:float(invokestatic:long(Math::min, ldc:long(200L), sub:long(invokevirtual:long(Date::getTime, initobject:Date(Date::<init>)), invokevirtual:long(Date::getTime, getfield:Date(\u6d69\u47c2\u8aa5\u92ee\u527a::\u392e\u8308\u0a06\u8389\u9255, this:\u6d69\u47c2\u8aa5\u92ee\u527a))))), ldc:float(200.0f))
            var_4_87 = invokestatic:float(\u183a\ud7e8\u156b\u62da\ub7dc::\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e, p0:float, ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u97b7\u62da\u527a\ubefe\u98a4, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], add:float(ldc:float(0.8f), mul:float(var_4_87:float, ldc:float(0.2f))), add:float(ldc:float(0.8f), mul:float(var_4_87:float, ldc:float(0.2f))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u6d69\u47c2\u8aa5\u92ee\u527a)), i2f:float(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u6d69\u47c2\u8aa5\u92ee\u527a)), i2f:float(add:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u6d69\u47c2\u8aa5\u92ee\u527a), getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u8350\u1187\u6c56\ub32d\u927d, this:\u6d69\u47c2\u8aa5\u92ee\u527a))), i2f:float(add:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u6d69\u47c2\u8aa5\u92ee\u527a), getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\ub8be\u7873\u36d3\ub102\u8258, this:\u6d69\u47c2\u8aa5\u92ee\u527a))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.25f), p0:float)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u516c\ubefe\u7d52\u960f\u71ae, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158), i2f:float(div:int(sub:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u8350\u1187\u6c56\ub32d\u927d, this:\u6d69\u47c2\u8aa5\u92ee\u527a), and:int(ldc:int(1124), ldc:int(1341))), xor:int(ldc:int(7424), ldc:int(7426)))), i2f:float(sub:int(div:int(sub:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\ub8be\u7873\u36d3\ub102\u8258, this:\u6d69\u47c2\u8aa5\u92ee\u527a), and:int(ldc:int(2917), ldc:int(1383))), and:int(ldc:int(70), ldc:int(20498))), ldc:int(90))), loadelement:String(getstatic:String[](\u6d69\u47c2\u8aa5\u92ee\u527a::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(8962), ldc:int(6214))), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4bc8\u12b2\uc238\u839e\u4c2b\ud12e$2(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u47c2\u8aa5\u92ee\u527a p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3bd6\u156b\u8258\u0b8e\u4492 p1) {
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
    
    private void lambda$\u3c25\u836c\u494c\u3e75\u56bd\u5db4$1(\u51fa\u12cb\u7330\u74b1\u6c52.\u3504\ud158\u760c\u6d99\u9a18 p0) {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u74b1\u392e\u99f7\ud171\u4d85, p0:\u3504\ud158\u760c\u6d99\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90], and:int[expected:boolean](ldc:int(-24847), ldc:int(24846)))
            invokespecial:void(\u6d69\u47c2\u8aa5\u92ee\u527a::\u3e75\ub171\u8350\u516c\u99f7\uc84e, this:\u6d69\u47c2\u8aa5\u92ee\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3bd6\u156b\u8258\u0b8e\u4492 p0) {
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
            invokespecial:void(\u6d69\u47c2\u8aa5\u92ee\u527a::\u873d\uc229\u839e\uf94d\uae87\u6d69, this:\u6d69\u47c2\u8aa5\u92ee\u527a, getfield:\u6b0d\u6d69\ub102\ua6bd\ub32d(\u6d69\u47c2\u8aa5\u92ee\u527a::\ubf56\u1833\u64f2\u4e72\u0a06, this:\u6d69\u47c2\u8aa5\u92ee\u527a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u5140\ud51e\ubf56\u93a2\u7bad\u873d(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u47c2\u8aa5\u92ee\u527a p0) {
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
            return:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\u8350\u1187\u6c56\ub32d\u927d, p0:\u6d69\u47c2\u8aa5\u92ee\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static int \u647c\u8753\u4f4a\u983f\uc84e\ucef1(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u47c2\u8aa5\u92ee\u527a p0) {
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
            return:int(getfield:int(\u6d69\u47c2\u8aa5\u92ee\u527a::\ub8be\u7873\u36d3\ub102\u8258, p0:\u6d69\u47c2\u8aa5\u92ee\u527a))
        }
        
        goto(Label_0006)
    }
    
    public static void \ube23\u51b2\u92ee\u6435\u8308\u1833(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u47c2\u8aa5\u92ee\u527a p0) {
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
            invokespecial:void(\u6d69\u47c2\u8aa5\u92ee\u527a::\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p0:\u6d69\u47c2\u8aa5\u92ee\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_1A1_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_256_0 : byte[] [generated]
        var_4_182 : int
        var_3_187 : byte[]
        var_5_188 : int
        expr_1A1 : byte [generated]
        var_0_24C : int
        expr_256 : byte [generated]
        stack_286_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1E6 : byte[]
        var_5_1E7 : int
        expr_C0 : int [generated]
        var_3_F1 : String
        stack_175_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(-1145273361), ldc:int(-1681150993))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_1A1_0 = stack_1F8_0 = stack_256_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YH29G8uyO8nI4ltYezt7YNLa81trK8jrW1h765rbE1OLK4szIytUTFSfJL8b")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_182 = expr_6E:int
        var_3_187 = newarray:byte[](byte.class, expr_6E:int)
        var_5_188 = expr_6E:int
        Label_0394:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-592671761))
            var_5_188 = add:int(var_5_188:int, ldc:int(-1))
            expr_1A1 = loadelement:byte(stack_1A1_0:byte[], var_5_188:int)
            storeelement:byte(var_3_187:byte[], var_5_188:int, add:int(xor:int(or:int(and:int(shl:int(expr_1A1:byte, and:int(ldc:int(25092), ldc:int(6188))), ldc:int(-16)), and:int(shr:int(expr_1A1:byte[expected:int], xor:int(ldc:int(18696), ldc:int(18700))), ldc:int(15))), ldc:int(91)), ldc:int(22)))
            
            if (cmpne:boolean(var_5_188:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_1A1_0 = stack_1F8_0 = stack_256_0 = var_3_187:byte[]
            goto(Label_0115)
        }
        
        Label_0575:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
            var_0_24C = and:int(var_0_61:int, ldc:int(-1737899025))
            var_5_188 = add:int(var_5_188:int, ldc:int(-1))
            expr_256 = loadelement:byte(stack_256_0:byte[], var_5_188:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_188:int, ldc:int(6)), neg:int(var_4_182:int)), ldc:int(0))) {
                var_0_24C = and:int(var_0_24C:int, ldc:int(-4460545))
                stack_286_2 = add:byte(expr_256:byte, ldc:byte(6))
            }
            else {
                stack_286_2 = add:byte(expr_256:byte, loadelement:byte(var_3_187:byte[], add:int(var_5_188:int, ldc:int(6))))
            }
            
            var_0_61 = and:int(var_0_24C:int, ldc:int(-20062225))
            storeelement:byte(var_3_187:byte[], var_5_188:int, stack_286_2:byte)
            
            if (cmpne:boolean(var_5_188:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_1A1_0 = stack_1F8_0 = stack_256_0 = var_3_187:byte[]
            goto(Label_0197)
        }
        
        goto(Label_0394)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1891588164))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(-96682033))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1E6 = newarray:byte[](byte.class, expr_98:int)
                var_5_1E7 = expr_98:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-65171457))
                    var_5_1E7 = add:int(var_5_1E7:int, ldc:int(-1))
                    storeelement:byte(var_3_1E6:byte[], var_5_1E7:int, add:int(shl:int(loadelement:byte(stack_1F8_0:byte[], var_5_1E7:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1E7:int, and:int(ldc:int(355), ldc:int(9237)))), ldc:int(7)), xor:int(ldc:int(8592), ldc:int(8593)))))
                    
                    if (cmpne:boolean(var_5_1E7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_1A1_0 = stack_1F8_0 = stack_256_0 = var_3_1E6:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1463761770))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-545553457))
            expr_C0 = arraylength:int(stack_C0_0:byte[])
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_4_182 = expr_C0:int
                var_3_187 = newarray:byte[](byte.class, expr_C0:int)
                var_5_188 = expr_C0:int
                goto(Label_0575)
            }
        }
        
        Label_0197:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1545302746))
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_175_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-15869), ldc:int(-15865)))
            expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8980), ldc:int(16550)))
            storeelement:String(expr_103:String[], and:int(ldc:int(210), ldc:int(3074)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(-13298), ldc:int(9073)), and:int(ldc:int(79), ldc:int(24591))))
            storeelement:String(expr_103:String[], and:int(ldc:int(-31625), ldc:int(29576)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(8336), ldc:int(8351)), and:int(ldc:int(6431), ldc:int(8221))))
            storeelement:String(expr_103:String[], and:int(ldc:int(513), ldc:int(28785)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(31), ldc:int(16797)), xor:int(ldc:int(20756), ldc:int(20785))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(17034), ldc:int(17033)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(3693), ldc:int(39)), xor:int(ldc:int(4144), ldc:int(4124))))
            putstatic:String[](\u6d69\u47c2\u8aa5\u92ee\u527a::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_103:String[])
            putstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u47c2\u8aa5\u92ee\u527a::\u51b2\u8640\u446c\ufcaf\u2dcc, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_657 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(447997366), ldc:int(1300678640))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u47c2\u8aa5\u92ee\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(611590327))
        }
        else {
            var_3_657 = and:int(var_3_657:int, ldc:int(-1690122785))
            var_5_8A = and:int(ldc:int(-1853), ldc:int(1848))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8887), ldc:int(-29368)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_657:int, ldc:int(995595741))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(387), ldc:int(18465)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2176), ldc:int(2177)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_DA:int, ldc:int(1331424664))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-27647), ldc:int(-27648)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(583517813))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1757151095))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0384:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(42880151))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1342534145))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-472272244))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(515397135))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(735758335))
                        var_11_EB = and:int(ldc:int(-13204), ldc:int(8595))
                        goto(Label_1490)
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1545145478))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1811537280))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(220063889))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1298469773))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1588855968))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(228313044))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1072475244))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1652765828))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1402125883))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-296812379))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-34423762))
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(1579085658))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(726013553))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-690831757))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(1265092465))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(18963), ldc:int(8205))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1751646515))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2114361985))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1511757892))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(21388602))
                            goto(Label_0384)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-876878061))
                        var_11_EB = and:int(ldc:int(-8747), ldc:int(8746))
                    }
                    
                    Label_1092:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-99351033))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(675509563))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(693387805))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1740117672))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1074096875))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1249031454))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1092)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1313768212))
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1743238882))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1134747181))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1376596526))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1353:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1445321787))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(907094287))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2139219536))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1900540923))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-830488588))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1213874190))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(742791288))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1426097634))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1779682660))
                        goto(Label_0384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1027577267))
                        var_17_662 = add:int(var_16_119:int, xor:int(ldc:int(-14320), ldc:int(-14319)))
                        looporswitchbreak()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-323201060))
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(-342374952))
                
                if (cmple:boolean(var_5_8A = var_17_662:int, sub:int(var_6_91:int, xor:int(ldc:int(-28669), ldc:int(-28670))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
