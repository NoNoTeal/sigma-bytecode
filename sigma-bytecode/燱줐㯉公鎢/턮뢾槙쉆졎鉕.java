public abstract class \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> {
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> \ub171\u8350\u446c\u7873\u946b\u5db4(java.lang.String p0) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>(invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u4bc8\uc238\u8350\u9033\ub171\ub18d, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String)))
        }
        
        goto(Label_0006)
    }
    
    public static void \uc2e8\u8d98\u64ab\ubb2b\ud523\u3d64(\u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T> p0) {
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
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> \ucfaf\u6d69\ud12e\ubded\u965f\ucef1(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, java.util.function.Supplier<T> p1) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(invokestatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u718f\u9af2\uf94d\u385b\u4975\u4d85, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, invokestatic:Lifecycle(Lifecycle::experimental), p1:Supplier<T>))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T> \u4ab3\u873d\u516c\u8753\u4c2b\u3a62(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, java.lang.String p1, java.util.function.Supplier<T> p2) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(invokestatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u4ab3\u873d\u516c\u8753\u4c2b\u3a62, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, p1:String, invokestatic:Lifecycle(Lifecycle::experimental), p2:Supplier<T>))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T> \u718f\u9af2\uf94d\u385b\u4975\u4d85(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1, java.util.function.Supplier<T> p2) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>(invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u385b\u93a2\u7043\u69d9\u946b\u927d, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, initobject:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::<init>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, p1:Lifecycle), p2:Supplier<T>, p1:Lifecycle))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T> \u4ab3\u873d\u516c\u8753\u4c2b\u3a62(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, java.lang.String p1, com.mojang.serialization.Lifecycle p2, java.util.function.Supplier<T> p3) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(checkcast:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>.class, invokestatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u385b\u93a2\u7043\u69d9\u946b\u927d, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, initobject:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>::<init>, p1:String, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>, p2:Lifecycle), p3:Supplier<T>, p2:Lifecycle)))
        }
        
        goto(Label_0006)
    }
    
    private static R extends \u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T> \u385b\u93a2\u7043\u69d9\u946b\u927d(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, R extends \u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T> p1, java.util.function.Supplier<T> p2, com.mojang.serialization.Lifecycle p3) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            invokeinterface:Supplier<?>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Supplier<?>>::put, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Supplier<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u51fa\u983f\uae5d\u5db4\ub6ab\u5d20), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6), p2:Supplier<T>)
            return:R extends \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T>(checkcast:R extends \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T>(R extends \u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T>.class, invokevirtual:R extends \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T>(\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<?>>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, getstatic:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uae5d\uf995\u6d69\u97e6\u51b2\uf94d), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<?>>, p1:R extends \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<T>, p3:Lifecycle)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud12e\ub8be\u69d9\uc246\uc84e\u9255(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> p0, com.mojang.serialization.Lifecycle p1) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            invokespecial:Object(Object::<init>, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>)
            putfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7d52\u0c95\ub1b9\u4975\u5fe1\uc9f6, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>)
            putfield:Lifecycle(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\ubefe\u4cd9\u647c\u8753\ub171\u76bc, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p1:Lifecycle)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>> \uff55\u416d\u4e72\ufe34\u1187\uc229() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>(getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7d52\u0c95\ub1b9\u4975\u5fe1\uc9f6, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Registry[")), getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>>[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7d52\u0c95\ub1b9\u4975\u5fe1\uc9f6, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>)), ldc:String(" (")), getfield:Lifecycle[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\ubefe\u4cd9\u647c\u8753\ub171\u76bc, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>)), ldc:String(")]"))))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.DataResult<com.mojang.datafixers.util.Pair<T, U>> decode(com.mojang.serialization.DynamicOps<U> p0, U p1) {
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
    
    public com.mojang.serialization.DataResult<U> encode(T p0, com.mojang.serialization.DynamicOps<U> p1, U p2) {
        var_4_9F : int
        var_6_6F : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        stack_103_0 : DataResult [generated]
        
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
                            
                            looporswitchbreak(Label_0093)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0093:
        var_4_9F = and:int(ldc:int(761691521), ldc:int(1864755157))
        var_6_6F = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:T)
        
        if (cmpne:boolean(var_6_6F:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
            do {
                if (cmpne:boolean(and:int(var_4_9F:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_9F = and:int(var_4_9F:int, ldc:int(1035790271))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(DynamicOps::compressMaps, p1:DynamicOps<U>))) {
                        loopcontinue()
                    }
                    
                    stack_103_0 = invokevirtual:DataResult(DataResult::setLifecycle, invokeinterface:DataResult(DynamicOps::mergeToPrimitive, p1:DynamicOps<U>, p2:U[expected:Object], invokeinterface:Object(DynamicOps::createInt, p1:DynamicOps<U>, invokevirtual:int(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:T))), getfield:Lifecycle(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\ubefe\u4cd9\u647c\u8753\ub171\u76bc, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>))
                    return:DataResult<U>(stack_103_0:DataResult<U>)
                }
            } while (cmpne:boolean(and:int(var_4_9F:int, ldc:int(1073741824)), ldc:int(0)))
            
            var_4_9F = and:int(var_4_9F:int, ldc:int(-1364723774))
            stack_103_0 = invokevirtual:DataResult(DataResult::setLifecycle, invokeinterface:DataResult(DynamicOps::mergeToPrimitive, p1:DynamicOps<U>, p2:U[expected:Object], invokeinterface:Object(DynamicOps::createString, p1:DynamicOps<U>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_6_6F:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))), getfield:Lifecycle(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\ubefe\u4cd9\u647c\u8753\ub171\u76bc, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>))
            return:DataResult<U>(stack_103_0:DataResult<U>)
        }
        
        return:DataResult<U>(invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unknown registry element ")), p0:T[expected:Object]))))
    }
    
    public java.util.stream.Stream<U> keys(com.mojang.serialization.DynamicOps<U> p0) {
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
    
    public abstract \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8df4\ua068\u9af2\u8350\uc29a\u392e(T p0);
    
    public abstract java.util.Optional<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>> \u836c\uc3e3\u9a18\ufcaf\uc3e3\ubff1(T p0);
    
    public abstract int \ud217\u5d20\u52d3\u92ee\u446c\ube23(T p0);
    
    public abstract T \ube23\ucb79\uc84e\u92ee\u965f\u3bc9(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p0);
    
    public abstract T \u3776\uc2bd\uc246\ufcaf\u4975\u0800(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0);
    
    public abstract com.mojang.serialization.Lifecycle \u8df4\u4492\u983f\uc246\u6ec6\u4cd9(T p0);
    
    public abstract com.mojang.serialization.Lifecycle \u98a4\u6fb0\u8350\u7873\u2dcc\ua068();
    
    public java.util.Optional<T> \u624e\uc238\u71f1\ub102\ua562\ub8be(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Optional<T>(invokestatic:Optional<T>(Optional<T>::ofNullable, invokevirtual:T(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<T> \u47c2\u6435\ubded\ub18d\ucef1\u6435(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p0) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Optional<T>(invokestatic:Optional<T>(Optional<T>::ofNullable, invokevirtual:T(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>)))
        }
        
        goto(Label_0006)
    }
    
    public T \u624e\u62da\u9937\uafe7\u8389\u98a4(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T> p0) {
        var_4_6C : Object
        
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
                            
                            looporswitchbreak(Label_0093)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0093:
        var_4_6C = invokevirtual:Object(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>)
        
        if (cmpne:boolean(var_4_6C:Object, aconstnull:Object())) {
            return:T(var_4_6C:Object)
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Missing: ")), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>[expected:Object]))))
    }
    
    public abstract java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u92ee\u4c04\u7c6b\u5db4\ud36e\u8389();
    
    public abstract java.util.Set<java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>, T>> \u516c\ud51e\u3e2a\u36d3\uc7fe\u836c();
    
    public java.util.stream.Stream<T> \ubefe\u527a\u385b\u47c2\u6bb9\u6435() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Stream<T>(invokestatic:Stream<T>(StreamSupport::stream, invokevirtual:Spliterator<T>(Iterable<T>::spliterator, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>[expected:Iterable<T>]), and:int[expected:boolean](ldc:int(-11636), ldc:int(3379))))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u1187\u97b7\u839e\ub8be\u40a9\u7330(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0);
    
    public static T \ud158\ub19c\u8258\ub113\u6cfe\uc29a(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<? super T> p0, java.lang.String p1, T p2) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:T(invokestatic:T(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p1:String), p2:T))
        }
        
        goto(Label_0006)
    }
    
    public static T extends V \ud158\ub19c\u8258\ub113\u6cfe\uc29a(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<V> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, T extends V p2) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:T extends V(invokevirtual:T extends V(\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, checkcast:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>(\u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<java.lang.Object>.class, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>), invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7d52\u0c95\ub1b9\u4975\u5fe1\uc9f6, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255]), p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), p2:T extends V, invokestatic:Lifecycle(Lifecycle::stable)))
        }
        
        goto(Label_0006)
    }
    
    public static T extends V \ud158\ub19c\u8258\ub113\u6cfe\uc29a(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<V> p0, int p1, java.lang.String p2, T extends V p3) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:T extends V(invokevirtual:T extends V(\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, checkcast:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>(\u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<java.lang.Object>.class, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>), p1:int, invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getfield:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7d52\u0c95\ub1b9\u4975\u5fe1\uc9f6, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255]), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p2:String)), p3:T extends V, invokestatic:Lifecycle(Lifecycle::stable)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc2e8\u8350\u385b\ud217\u4e72\ubff1$51(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.util.function.Supplier p1) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            
            if (cmpeq:boolean(invokeinterface:Object(Supplier::get, p1:Supplier), aconstnull:Object())) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc2bd\u7d52\ua562\u960f\u51b2\u6198), ldc:String("Unable to bootstrap registry '{}'"), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Object lambda$\u4c04\u76bc\u120d\ubff1\ucfaf\ud158$50(com.mojang.serialization.DynamicOps p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Object(invokeinterface:Object(DynamicOps::createString, p0:DynamicOps, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.DataResult lambda$\u8d90\u4bc8\u62da\uc9f6\ube23\u72f1$49(com.mojang.datafixers.util.Pair p0) {
        var_2_66 : int
        var_4_72 : T
        stack_B9_0 : DataResult [generated]
        
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            var_2_66 = and:int(ldc:int(1959237876), ldc:int(2118637558))
            var_4_72 = invokevirtual:T(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokevirtual:Object[expected:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753](Pair::getFirst, p0:Pair)))
            
            if (cmpne:boolean(var_4_72:T, aconstnull:T())) {
                var_2_66 = and:int(var_2_66:int, ldc:int(2080880372))
                stack_B9_0 = invokestatic:DataResult(DataResult::success, invokestatic:Pair[expected:Object](Pair::of, var_4_72:T[expected:Object], invokevirtual:Object(Pair::getSecond, p0:Pair)), invokevirtual:Lifecycle(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u8df4\u4492\u983f\uc246\u6ec6\u4cd9, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, var_4_72:T))
            }
            else {
                stack_B9_0 = invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unknown registry key: ")), invokevirtual:Object(Pair::getFirst, p0:Pair))))
            }
            
            return:DataResult(stack_B9_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\u946b\u4e72\uafe7\uc31c\u4f4a\ua6bd$48(com.mojang.serialization.DynamicOps p0, java.lang.Object p1) {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Pair(invokestatic:Pair(Pair::of, p1:Object, invokeinterface:Object(DynamicOps::empty, p0:DynamicOps)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.DataResult lambda$\ua3b4\uc2e8\u36d3\ub70c\u7873\u93a2$47(java.lang.Number p0) {
        var_2_66 : int
        var_4_6F : T
        stack_AC_0 : DataResult [generated]
        
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            var_2_66 = and:int(ldc:int(-1779401274), ldc:int(-155254873))
            var_4_6F = invokevirtual:T(\u5f50\u8d98\u8753\uc3e3\u12b2\u9937<T>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>[expected:\u5f50\u8d98\u8753\uc3e3\u12b2\u9937<T>], invokevirtual:int(Number::intValue, p0:Number))
            
            if (cmpne:boolean(var_4_6F:T, aconstnull:T())) {
                var_2_66 = and:int(var_2_66:int, ldc:int(-1663027793))
                stack_AC_0 = invokestatic:DataResult(DataResult::success, var_4_6F:T[expected:Object], invokevirtual:Lifecycle(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u8df4\u4492\u983f\uc246\u6ec6\u4cd9, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>, var_4_6F:T))
            }
            else {
                stack_AC_0 = invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unknown registry id: ")), p0:Number[expected:Object])))
            }
            
            return:DataResult(stack_AC_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6c56\u8c8a\uc2bd\ufe34\u3711\u16f6$46(\u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u97e6\u3a62\uc29a\u16f6\u647c\u5db4 p1) {
        var_4_DF : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            
            if (invokeinterface:boolean(Set<E>::isEmpty, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>]))) {
                invokeinterface:void(Logger::error, getstatic:Logger(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc2bd\u7d52\ua562\u960f\u51b2\u6198), ldc:String("Registry '{}' was empty after loading"), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>], p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>))
                
                if (getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006)) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Registry: '")), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, p0:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>>], p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>)), ldc:String("' is empty, not allowed, fix me!")))))
                }
            }
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa.class, p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>)) {
                var_4_DF = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<T>::\u6c52\ube23\u9033\u0b8e\u76bc\u99f7, checkcast:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<java.lang.Object>.class, p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>))
                invokestatic:Object(Validate::notNull, invokevirtual:Object(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, p1:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>], var_4_DF:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Missing default of DefaultedMappedRegistry: ")), var_4_DF:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-12672), ldc:int(12407))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab lambda$\uc246\u76bc\u836c\ufe34\u92ee\u8aa5$45() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab(getstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u4c2b\u600f\u97e6\u071d\u647c\ua068>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u647c\ud51e\ub113\ud36e\ua6bd\u93a2))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995 lambda$\uc246\uc3e3\u8258\u7043\u9033\ud12e$44() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995(getstatic:\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995<\uff55\u516c\u9033\ubcb0\ucef1\u9937>(\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995::\u9033\ub8be\u8df4\u36d3\u8709\ud12e))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Codec lambda$\u34df\uc238\u8df4\ub7dc\u4cd9\u8753$43() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Codec(getstatic:Codec<\ufcaf\u97e6\u34df\u5245\u927d\ubcb0>(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\uc238\u647c\u99f7\ubb2b\uf9c5\ud36e))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Codec lambda$\u6435\u760c\u8389\u1187\u3711\uc7fe$42() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:Codec(getstatic:Codec<\u56bd\uc4d2\u61a4\u4ab3\u1187>(\u56bd\uc4d2\u61a4\u4ab3\u1187::\u5bc4\u7873\ub113\u3bc9\ud158\ube23))
        }
        
        goto(Label_0006)
    }
    
    private static \u3504\ufe34\u600f\u6b0d\u69d9.\u1833\uf94d\u98a4\u3dd3\u8640\u8709 lambda$\uc246\u946b\u9033\uc4d2\ufcaf\u2dcc$41() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u1833\uf94d\u98a4\u3dd3\u8640\u8709(getstatic:\u1833\uf94d\u98a4\u3dd3\u8640\u8709<\ub7dc\uc246\uc3e3\u6c56\u3bc9\u92ff>(\u1833\uf94d\u98a4\u3dd3\u8640\u8709::\u2dcc\ub18d\u760c\ucef1\u6b5f\u8308))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\ubf56\uc31c\u8350\ucef1\u51b2\ud51e lambda$\u5654\u6bb9\ub171\u4f4a\u6b5f\u5fe1$40() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ubf56\uc31c\u8350\ucef1\u51b2\ud51e(getstatic:\ubf56\uc31c\u8350\ucef1\u51b2\ud51e<\u3dd3\ube23\u946b\u97b7\u52d3\ub83f>(\ubf56\uc31c\u8350\ucef1\u51b2\ud51e::\u8d90\u3c25\u8d98\uff55\uc84e\ubb2b))
        }
        
        goto(Label_0006)
    }
    
    private static \u6435\ub8be\u718f\u6b0d\u67e9.\u97e6\ub19c\uc2bd\u873d\u8640 lambda$\u5654\u2dcc\u4c2b\ua61f\u416d\u5f50$39() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u97e6\ub19c\uc2bd\u873d\u8640(getstatic:\u97e6\ub19c\uc2bd\u873d\u8640<\u5245\ube23\u416d\u927d\ub18d>(\u97e6\ub19c\uc2bd\u873d\u8640::\u92ff\u3504\ud51e\u4975\uceb8\u5fe1))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ubefe\uc3e3\ua61f\u3bc9\ubded lambda$\u9a18\u3d4b\u9033\u6bb9\uc29a\ubff1$38() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ubefe\uc3e3\ua61f\u3bc9\ubded(getstatic:\ubefe\uc3e3\ua61f\u3bc9\ubded<\u5fe1\uceb8\u4ab3\u6c56\u64f2>(\ubefe\uc3e3\ua61f\u3bc9\ubded::\u4c04\u836c\u8389\u59ec\u3d4b\u8cae))
        }
        
        goto(Label_0006)
    }
    
    private static \u494c\u4975\ua068\u0c95\uc84e.\u071d\ub70c\u960f\u7043\u9af2 lambda$\u2dcc\u4c2b\u3711\ud7e8\uc2e8\u9255$37() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u071d\ub70c\u960f\u7043\u9af2(getstatic:\u071d\ub70c\u960f\u7043\u9af2<\u62da\u071d\u4ab3\ua562\u7873>(\u071d\ub70c\u960f\u7043\u9af2::\ub19c\u3a62\uff55\u516c\u3711\u516c))
        }
        
        goto(Label_0006)
    }
    
    private static \u3504\ufe34\u600f\u6b0d\u69d9.\u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62 lambda$\u4cd9\u8c8a\ud12e\ufcaf\u4bc8\ube23$36() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62(getstatic:\u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62<\u1833\u6c52\u36d3\ub113\u3c25\uc229>(\u99f7\u4d85\uc9f6\u6ec6\u8413\u3a62::\ubcb0\u64f2\u4f52\ud523\u6ec6\u8389))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u624e\u527a\u8640\uc238\u9255 lambda$\u51b2\u4f4a\u071d\u7043\u92ee\u6d69$35() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u624e\u527a\u8640\uc238\u9255(getstatic:\u624e\u527a\u8640\uc238\u9255<\u7043\u6cfe\u4daf\u4c04\u3bd6>(\u624e\u527a\u8640\uc238\u9255::\u8cae\u6bb9\u071d\u71f1\uc2e8\u8d90))
        }
        
        goto(Label_0006)
    }
    
    private static \u3504\ufe34\u600f\u6b0d\u69d9.\uc87f\ud12e\u0b8e\u7049\u7e3f lambda$\u76bc\u4f52\ufe34\u8c8a\ub18d\ua562$34() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc87f\ud12e\u0b8e\u7049\u7e3f(getstatic:\uc87f\ud12e\u0b8e\u7049\u7e3f(\uc87f\ud12e\u0b8e\u7049\u7e3f::\u839e\u647c\u4179\ub7dc\u8308\u8413))
        }
        
        goto(Label_0006)
    }
    
    private static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 lambda$\u62da\u647c\u8350\u0800\u8aa5\u0b8e$33() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u5654\u9937\u72f1\ud4fe\u0c95(getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>(\u5654\u9937\u72f1\ud4fe\u0c95::\uc2e8\ube23\ub102\u5140\u51b2\ucb79))
        }
        
        goto(Label_0006)
    }
    
    private static \u36d3\u9033\u6b0d\u983f\u8d90.\u93a2\u1187\u5654\u8413\u3a62\ua61f lambda$\u7bad\ufcaf\u759a\u4daf\ub18d\u624e$32() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u93a2\u1187\u5654\u8413\u3a62\ua61f(getstatic:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u67e9\u8640\u88c5\u385b\u3dd3\u8bb0>(\u93a2\u1187\u5654\u8413\u3a62\ua61f::\ucef1\u40a9\u7d52\u600f\uf995\uc238))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u5140\u5bc4\u4e72\ud523\u7bad lambda$\u9a18\ud12e\u64f2\u3711\u6198\ud36e$31() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u5140\u5bc4\u4e72\ud523\u7bad(getstatic:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u5140\u5bc4\u4e72\ud523\u7bad::\u9255\u156b\u34df\u927d\u446c\u494c))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u76bc\ub8be\u6b0d\ucb79\u71ae lambda$\u927d\uc238\u8c8a\u4c04\ud51e\u718f$30() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u76bc\ub8be\u6b0d\ucb79\u71ae(getstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u92ff\u647c\u7c6b\u446c\u3711\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u5d20\u3504\u6cfe\u5654\u67e9 lambda$\u759a\ube23\uc7fe\u1833\u0c95\u6b0d$29() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u5d20\u3504\u6cfe\u5654\u67e9(getstatic:\u5d20\u3504\u6cfe\u5654\u67e9(\u9af2\uc246\uc229\u8bb0\ua61f::\u4f52\u9a18\u4179\u4daf\u88c5\u156b))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u3711\ub113\u52d3\ubb2b\ub18d lambda$\ubded\ud523\u9a18\u7049\u5245\u446c$28() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u3711\ub113\u52d3\ubb2b\ub18d(getstatic:\u3711\ub113\u52d3\ubb2b\ub18d(\u16f6\ub102\u6435\u0800\u3d4b::\u76bc\u7ce1\ud51e\uc9f6\u8413\u3bc9))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubded\u97e6\uc910\u527a\u718f lambda$\u99f7\u7006\uc7fe\u92ee\u71f1\ub19c$27() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ubded\u97e6\uc910\u527a\u718f(getstatic:\ubded\u97e6\uc910\u527a\u718f(\ucef1\u88c5\u6b0d\uc29a\u99f7::\uc2bd\u40a9\u965f\u8350\uc87f\u59ec))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3711\u3a62\u4cd9\ucfaf\u67e9 lambda$\u62da\u3bd6\ubcb0\u3bd6\u4f52\u0800$26() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u3711\u3a62\u4cd9\ucfaf\u67e9(getstatic:\u3711\u3a62\u4cd9\ucfaf\u67e9(\u3711\u3a62\u4cd9\ucfaf\u67e9::\u6cfe\u92ff\uc84e\u760c\u0c95\uc238))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uceb8\uae87\ud158\u1833\u3d4b lambda$\u8258\u8bb0\uc2bd\u3776\u385b\u4d85$25() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uceb8\uae87\ud158\u1833\u3d4b(getstatic:\uceb8\uae87\ud158\u1833\u3d4b(\uceb8\uae87\ud158\u1833\u3d4b::\ufcaf\uc9f6\ufe34\u416d\uc3e3\ufcaf))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8350\uf9c5\ubb2b\ub70c\u9255 lambda$\ub6ab\u5db4\u51b2\u3a62\u5654\u516c$24() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u8350\uf9c5\ubb2b\ub70c\u9255(getstatic:\u8350\uf9c5\ubb2b\ub70c\u9255<\u7af6\ub19c\u3711\u5d20\u6d69>(\u8350\uf9c5\ubb2b\ub70c\u9255::\u9af2\u4cd9\u4c04\u71f1\uc9f6\u3d64))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b lambda$\u927d\u34df\u5db4\u120d\u8640\u6d99$23() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ud36e\u4bc8\u6d69\u92ee\ubb2b(getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Void>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\uf9c5\u98a4\ud158\uae87\u7bad))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 lambda$\u5654\u6cfe\u183a\uf9c5\uc31c\u8709$22() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(getstatic:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u62da\ud523\u9937\uc84e\u16f6\uc229))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4975\ubff1\u965f\u416d\ua068 lambda$\uc7fe\u5bc4\u3bc9\u8d98\u5140\u416d$21() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u4975\ubff1\u965f\u416d\ua068(getstatic:\u4975\ubff1\u965f\u416d\ua068(\u4975\ubff1\u965f\u416d\ua068::\u5db4\u7e3f\u516c\u5140\uc229\u97b7))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\u72f1\u8389\uae87\u3bd6\ub171 lambda$\ub1b9\u718f\u16f6\u9255\u6435\uff55$20() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u72f1\u8389\uae87\u3bd6\ub171(getstatic:\u72f1\u8389\uae87\u3bd6\ub171(\u72f1\u8389\uae87\u3bd6\ub171::\u0c95\ub8be\u8bb0\u416d\u8258\u3776))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u7049\u8df4\uc9f6\uae87.\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd lambda$\uc29a\ub102\uc29a\u1833\u6d99\u1187$19() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd(getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u8258\u5245\ufe34\u61a4\u5140\u8413))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\u6ec6\u67e9\u3504\u5654\u92ee lambda$\u8753\uc3e3\u6d99\u3776\ua068\uc4d2$18() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u6ec6\u67e9\u3504\u5654\u92ee(getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\uf94d\u7bad\u9937\ub32d\u760c\u960f))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\uae5d\u1187\u5fe1\u527a\u6d99 lambda$\u6198\u7330\u4f4a\u0c95\u5140\u64ab$17() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc29a\uae5d\u1187\u5fe1\u527a\u6d99(getstatic:\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<\u36d3\u8709\u6b0d\u71f1\ub6ab\u8cae>(\uc29a\uae5d\u1187\u5fe1\u527a\u6d99::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1))
        }
        
        goto(Label_0006)
    }
    
    private static \u36d3\u9033\u6b0d\u983f\u8d90.\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c lambda$\u6c52\ucef1\u7d52\u600f\u4975\ud158$16() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c(getstatic:\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c<\uc238\u8d98\u4f4a\uc910\uc910\ubb2b>(\uc3e3\u8cae\u4e72\u4e72\u16f6\u760c::\uc2e8\u76bc\u12cb\ud158\u3711\u3bd6))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u6198\u8df4\u647c\u47c2\u98a4 lambda$\ubff1\u9937\u392e\ud158\u4d85\uc238$15() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u6198\u8df4\u647c\u47c2\u98a4(getstatic:\u6198\u8df4\u647c\u47c2\u98a4<\ub102\u99f7\u69d9\u8d90\u8d98>(\u6198\u8df4\u647c\u47c2\u98a4::\u7c6b\u56bd\u97b7\u74b1\ubcb0\u416d))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc910\uc84e\ubff1\u759a\u59ec\ua3b4 lambda$\u7e3f\u4e72\u4975\u92ee\u69d9\u67e9$14() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4(getstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u98a4\u4f4a\u3504\ub171\u52d3\u156b>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\u7c6b\u6cfe\ud4fe\u97e6\u56bd\u8cae))
        }
        
        goto(Label_0006)
    }
    
    private static \u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6 lambda$\u4f4a\uc87f\u7e3f\uc29a\u873d\u6198$13() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6(getstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud171\u4179\u4975\ub102\u8709\u8350>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u4492\u6b0d\u8350\u516c\u446c\u4bc8))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 lambda$\ucef1\ud4fe\uc2e8\ud217\uc31c\u392e$12() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ucb79\u7ce1\ubded\u3d64\ub171(getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u3e2a\u4d85\ub6ab\uc3e3\u416d\ub8be))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u8aa5\u93a2\u92ee\ud171\ube23\ubb2b$11() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u3e2a\ubff1\u7873\ud36e\u7bad\u8413))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ufe34\u183a\u183a\ud12e\u1187 lambda$\u7043\uc2bd\u8640\uc7fe\u6c52\u9af2$10() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ufe34\u183a\u183a\ud12e\u1187(getstatic:\ufe34\u183a\u183a\ud12e\u1187(\ufe34\u183a\u183a\ud12e\u1187::\u8d98\u62da\u3bd6\uae5d\uc229\u6c52))
        }
        
        goto(Label_0006)
    }
    
    private static \u59ec\u8413\u97e6\uc229\u3776.\uc229\u8413\ufcaf\u99f7\u494c lambda$\u7bad\u6bb9\ua562\u718f\ubded\ud158$9() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\uc229\u8413\ufcaf\u99f7\u494c(getstatic:\uc229\u8413\ufcaf\u99f7\u494c<\u76bc\ua61f\u760c\u965f\ufe34>(\uc229\u8413\ufcaf\u99f7\u494c::\u88c5\ub113\u385b\uc2bd\ud12e\u5fe1))
        }
        
        goto(Label_0006)
    }
    
    private static \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5 lambda$\u3504\uc84e\ud51e\uc84e\u76bc\uf995$8() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5(getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u4f52\u3a62\u69d9\u446c\u8709\u51fa))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4c2b\u6ec6\uc2e8\u7049\uc84e lambda$\u0b8e\ub1b9\u8258\ufe34\u4cd9\u67e9$7() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u4c2b\u6ec6\uc2e8\u7049\uc84e(getstatic:\u4c2b\u6ec6\uc2e8\u7049\uc84e(\ud36e\u12b2\u8d98\ud523\u67d0::\u416d\u8389\u93a2\u8389\u4f52\u4492))
        }
        
        goto(Label_0006)
    }
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 lambda$\u3bc9\u88c5\uc910\u5d20\u9a18\u92ee$6() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u3d64\u3776\uc2e8\uc2bd\u8bb0\u99f7))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c lambda$\u67d0\u5f50\u7bad\ub32d\u97e6\u67e9$5() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u9255\u0c95\u4cd9\ube23\u760c(getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u4bc8\u6cfe\u8cae\u392e\u3711>(\u9255\u0c95\u4cd9\ube23\u760c::\ub7dc\u9a18\u92ff\ua6bd\ub8be\u4c2b))
        }
        
        goto(Label_0006)
    }
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e lambda$\uc31c\u7043\u12b2\u965f\u4cd9\u99f7$4() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u965f\u7043\ufcaf\uae87\u839e(getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\u71ae\u4bc8\ufe34\uc4d2\u5bc4\u183a))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a lambda$\u3776\u3bc9\u88c5\ub83f\u5fe1\u600f$3() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ud523\u4f52\u59ec\u516c\u3e75 lambda$\ubcb0\ua3b4\ua068\u6cfe\uc87f\u69d9$2() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\ud523\u4f52\u59ec\u516c\u3e75(getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u8aa5\u92ee\u8709\u6d69\u6c52\u6b5f))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f lambda$\uae5d\u0c95\u8c8a\u8753\ub1b9\u56bd$1() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 lambda$\u69d9\u0a06\u6d99\uf995\u98a4\u965f$0() {
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
                                
                                looporswitchbreak(Label_0093)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0093:
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8389\u3bd6\u6b5f\u71f1\u4f52\u624e))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u40a9\u8753\u7d52\ucef1\u927d\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_670 : int
        var_5_86 : int
        var_6_8D : int
        var_7_9C : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_67B : int
        
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
                            
                            looporswitchbreak(Label_0093)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0093:
        var_3_670 = and:int(ldc:int(-1533896215), ldc:int(-442887689))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0177)
        }
        
        Label_0113:
        
        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
            var_3_670 = and:int(var_3_670:int, ldc:int(-1098386445))
            var_5_86 = and:int(ldc:int(6436), ldc:int(-6437))
            var_6_8D = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9C = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6929), ldc:int(-6930)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_670:int, ldc:int(-1075618309))
                    var_9_C6 = sub:double(var_7_9C:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_86:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_8D:int, and:int(ldc:int(9507), ldc:int(137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(2584), ldc:int(2585)))), var_7_9C:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_670 = and:int(var_3_D8:int, ldc:int(-276669449))
                    var_14_114 = var_7_9C:double
                    var_16_118 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_86:int), xor:int(ldc:int(8704), ldc:int(8705)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_86)
                    
                    if (cmplt:boolean(var_16_118 = var_11_E9:int, var_6_8D:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_118 = var_11_E9:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1787728609))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1998200037))
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(16)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1215824393))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_8D:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0569)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(745809914))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-249575861))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1357146499))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(199851878))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(625704328))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-186124289))
                            var_11_E9 = and:int(ldc:int(-19080), ldc:int(19079))
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0569:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(2119670737))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1323314831))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(672266308))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1913857440))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-420069895))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C6:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1427594774))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-959624791))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1570380489))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-560217579))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-153740295))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_114:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-251149109))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-1218989617))
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(859843221))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-152150539))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_86:int), var_7_9C:double)) {
                                var_11_E9 = xor:int(ldc:int(5186), ldc:int(5187))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(784089020))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(982067717))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1662861197))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-29081360))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-146104775))
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-419699455))
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(1331464996))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-293143047))
                        var_11_E9 = and:int(ldc:int(-14698), ldc:int(14377))
                    }
                    
                    Label_1132:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1365721007))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(655882122))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-281680351))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(465341454))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-460612631))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1257:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(301968105))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1132)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-1079250439))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-17375759))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_86:int, var_16_118:int)
                        goto(Label_1524)
                    }
                    
                    Label_1376:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1098966974))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1791335926))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1369170028))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(898673747))
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1669645764))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_670 = and:int(var_3_670:int, ldc:int(-293429763))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67B = var_5_86:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(256)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-588147102))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1485783160))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1330114933))
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-288457223))
                        var_17_67B = add:int(var_16_118:int, and:int(ldc:int(23563), ldc:int(8225)))
                        looporswitchbreak()
                    }
                    
                    var_3_670 = and:int(var_3_670:int, ldc:int(2034099841))
                }
                
                var_3_670 = and:int(var_3_670:int, ldc:int(-1376068105))
                
                if (cmple:boolean(var_5_86 = var_17_67B:int, sub:int(var_6_8D:int, xor:int(ldc:int(4448), ldc:int(4449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0177:
        
        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0113)
    }
}
