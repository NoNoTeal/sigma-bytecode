public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 {
    private static java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \u8753\ub1b9\u8d90\uc7fe\u36d3\uafe7(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p2) {
        var_5_65 : boolean
        
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
            var_5_65 = invokestatic:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u3776\u0800\u8389\u8709\ub113\u1833, p0:\ucb79\u7ce1\ubded\u3d64\ub171, p2:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            
            if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, p2:\u8aa5\ubded\ub18d\u4f4a\u4f52), p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\u7d52\ub102\uc29a\u8d90\u0800, checkcast:\u647c\u72f1\u1833\u6bb9\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p2:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u647c\u72f1\u1833\u6bb9\u7049]), p0:\ucb79\u7ce1\ubded\u3d64\ub171)
            }
            
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(invokevirtual:CompletableFuture<Object>(CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>::thenApply, invokevirtual:CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>(\ufcaf\u4c2b\u927d\u4975\u3e2a::\uc31c\u3d4b\u7873\ud36e\u6cfe\u5140, p1:\ufcaf\u4c2b\u927d\u4975\u3e2a, p2:\u8aa5\ubded\ub18d\u4f4a\u4f52, var_5_65:boolean), invokedynamic:Function<Object, Either>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \uc31c\u76bc\u74b1\u7043\ucef1\u36d3(java.lang.String p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p1, int p2, java.util.EnumSet<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9> p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 p4, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u9af2\u647c\u760c\ucfaf\u6d69 p5) {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\uae5d\u392e\u72f1\u8d90\u446c\u759a, p0:String, p1:\ucb79\u7ce1\ubded\u3d64\ub171, p2:int, p3:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, p4:\u983f\u7e3f\u4e72\u6cfe\u6435, p5:\u9af2\u647c\u760c\ucfaf\u6d69[expected:\uc7fe\ud171\u99f7\uc246\u92ee]))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \uae5d\u392e\u72f1\u8d90\u446c\u759a(java.lang.String p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p1, int p2, java.util.EnumSet<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9> p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 p4, \u6b0d\u12cb\u156b\u4179\u8bb0.\uc7fe\ud171\u99f7\uc246\u92ee p5) {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\uae5d\u392e\u72f1\u8d90\u446c\u759a, p0:String, p1:\ucb79\u7ce1\ubded\u3d64\ub171, p2:int, p3:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, p4:\u983f\u7e3f\u4e72\u6cfe\u6435, p5:\uc7fe\ud171\u99f7\uc246\u92ee, getstatic:\ubb2b\u7043\u120d\ufe34\u4f52(\ucb79\u7ce1\ubded\u3d64\ub171::\ub171\u8d98\u12cb\u6b0d\u120d\u416d)))
        }
        
        goto(Label_0006)
    }
    
    private static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \uae5d\u392e\u72f1\u8d90\u446c\u759a(java.lang.String p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p1, int p2, java.util.EnumSet<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9> p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 p4, \u6b0d\u12cb\u156b\u4179\u8bb0.\uc7fe\ud171\u99f7\uc246\u92ee p5, \u5d20\u97b7\u8753\u873d\u16f6.\ubb2b\u7043\u120d\ufe34\u4f52 p6) {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ucb79\u7ce1\ubded\u3d64\ub171>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<? super \ucb79\u7ce1\ubded\u3d64\ub171>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u446c\u12cb\u4cd9\u3e75\ub113\u3c25), p0:String, initobject:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::<init>, p0:String, p1:\ucb79\u7ce1\ubded\u3d64\ub171, p2:int, p3:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, p4:\u983f\u7e3f\u4e72\u6cfe\u6435, p5:\uc7fe\ud171\u99f7\uc246\u92ee, p6:\ubb2b\u7043\u120d\ufe34\u4f52))))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171> \u8cae\u3a62\ud158\u416d\ub32d\u6d69() {
        var_0_5F : int
        var_2_63 : ArrayList
        var_3_67 : \ucb79\u7ce1\ubded\u3d64\ub171
        
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
            var_0_5F = and:int(ldc:int(-1777954617), ldc:int(-138219041))
            var_2_63 = invokestatic:ArrayList(Lists::newArrayList)
            var_3_67 = getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068)
            
            loop {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1303922445))
                
                if (cmpeq:boolean(invokevirtual:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\uae87\u983f\ucef1\u6b5f\u836c\u9a18, var_3_67:\ucb79\u7ce1\ubded\u3d64\ub171), var_3_67:\ucb79\u7ce1\ubded\u3d64\ub171)) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\ucb79\u7ce1\ubded\u3d64\ub171>::add, var_2_63:ArrayList<\ucb79\u7ce1\ubded\u3d64\ub171>[expected:List<\ucb79\u7ce1\ubded\u3d64\ub171>], var_3_67:\ucb79\u7ce1\ubded\u3d64\ub171)
                var_3_67 = invokevirtual:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\uae87\u983f\ucef1\u6b5f\u836c\u9a18, var_3_67:\ucb79\u7ce1\ubded\u3d64\ub171)
            }
            
            invokeinterface:boolean(List<\ucb79\u7ce1\ubded\u3d64\ub171>::add, var_2_63:ArrayList<\ucb79\u7ce1\ubded\u3d64\ub171>[expected:List<\ucb79\u7ce1\ubded\u3d64\ub171>], var_3_67:\ucb79\u7ce1\ubded\u3d64\ub171)
            invokestatic:void(Collections::reverse, var_2_63:ArrayList<\ucb79\u7ce1\ubded\u3d64\ub171>)
            return:List<\ucb79\u7ce1\ubded\u3d64\ub171>(var_2_63:ArrayList<\ucb79\u7ce1\ubded\u3d64\ub171>)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u3776\u0800\u8389\u8709\ub113\u1833(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1) {
        var_2_5F : int
        stack_9C_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1648240413), ldc:int(-614488269))
            
            if (logicaland:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, p1:\u8aa5\ubded\ub18d\u4f4a\u4f52), p0:\ucb79\u7ce1\ubded\u3d64\ub171), invokeinterface:boolean(\u8aa5\ubded\ub18d\u4f4a\u4f52::\ub83f\u51fa\uc2bd\u88c5\ua6bd\uafe7, p1:\u8aa5\ubded\ub18d\u4f4a\u4f52))) {
                stack_9C_0 = xor:int(ldc:int(-32096), ldc:int(-32095))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-572526655))
                stack_9C_0 = and:int(ldc:int(8641), ldc:int(-8642))
            }
            
            return:boolean(stack_9C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u67e9\uc238\ufe34\u4d85\u16f6\u965f(int p0) {
        var_1_87 : int
        stack_AE_0 : \ucb79\u7ce1\ubded\u3d64\ub171 [generated]
        
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
        var_1_87 = and:int(ldc:int(-1911341793), ldc:int(775919095))
        
        if (cmplt:boolean(p0:int, invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u1833\u7873\u759a\ua068\u7bad\u72f1)))) {
            do {
                if (cmpne:boolean(and:int(var_1_87:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_87 = and:int(var_1_87:int, ldc:int(-1902174348))
                    
                    if (cmpge:boolean(p0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_AE_0 = getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068)
                    return:\ucb79\u7ce1\ubded\u3d64\ub171(stack_AE_0:\ucb79\u7ce1\ubded\u3d64\ub171)
                }
            } while (cmpeq:boolean(and:int(var_1_87:int, ldc:int(67108864)), ldc:int(0)))
            
            var_1_87 = and:int(var_1_87:int, ldc:int(-537428363))
            stack_AE_0 = checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(List<\ucb79\u7ce1\ubded\u3d64\ub171>::get, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u1833\u7873\u759a\ua068\u7bad\u72f1), p0:int))
            return:\ucb79\u7ce1\ubded\u3d64\ub171(stack_AE_0:\ucb79\u7ce1\ubded\u3d64\ub171)
        }
        
        return:\ucb79\u7ce1\ubded\u3d64\ub171(getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u3e2a\u4d85\ub6ab\uc3e3\u416d\ub8be))
    }
    
    public static int \u74b1\u0800\u7330\uf94d\u76bc\u7d52() {
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
            return:int(invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u1833\u7873\u759a\ua068\u7bad\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public static int \uc3e3\u7c6b\u8389\u8cae\ub113\u88c5(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0) {
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
            return:int(invokeinterface:int(IntList::getInt, getstatic:IntList(\ucb79\u7ce1\ubded\u3d64\ub171::\uc2bd\ud217\ubded\u4f4a\u12b2\u647c), invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, p0:\ucb79\u7ce1\ubded\u3d64\ub171)))
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u7ce1\ubded\u3d64\ub171(java.lang.String p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p1, int p2, java.util.EnumSet<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9> p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 p4, \u6b0d\u12cb\u156b\u4179\u8bb0.\uc7fe\ud171\u99f7\uc246\u92ee p5, \u5d20\u97b7\u8753\u873d\u16f6.\ubb2b\u7043\u120d\ufe34\u4f52 p6) {
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
            invokespecial:Object(Object::<init>, this:\ucb79\u7ce1\ubded\u3d64\ub171)
            putfield:String(\ucb79\u7ce1\ubded\u3d64\ub171::\uc29a\ubb2b\u5245\u8df4\uc229\ud523, this:\ucb79\u7ce1\ubded\u3d64\ub171, p0:String)
            putfield:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u7e3f\ufe34\u8350\ucfaf\u6198\uc29a, this:\ucb79\u7ce1\ubded\u3d64\ub171, ternaryop:\ucb79\u7ce1\ubded\u3d64\ub171(cmpne:boolean(p1:\ucb79\u7ce1\ubded\u3d64\ub171, aconstnull:\ucb79\u7ce1\ubded\u3d64\ub171()), p1:\ucb79\u7ce1\ubded\u3d64\ub171, this:\ucb79\u7ce1\ubded\u3d64\ub171))
            putfield:\uc7fe\ud171\u99f7\uc246\u92ee(\ucb79\u7ce1\ubded\u3d64\ub171::\u88c5\u8258\u99f7\u6b5f\u4daf\uc87f, this:\ucb79\u7ce1\ubded\u3d64\ub171, p5:\uc7fe\ud171\u99f7\uc246\u92ee)
            putfield:\ubb2b\u7043\u120d\ufe34\u4f52(\ucb79\u7ce1\ubded\u3d64\ub171::\u5654\u56bd\u8709\uafe7\u8389\ud7e8, this:\ucb79\u7ce1\ubded\u3d64\ub171, p6:\ubb2b\u7043\u120d\ufe34\u4f52)
            putfield:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u51fa\uc2bd\u8350\u67e9\u47c2\u1187, this:\ucb79\u7ce1\ubded\u3d64\ub171, p2:int)
            putfield:\u983f\u7e3f\u4e72\u6cfe\u6435(\ucb79\u7ce1\ubded\u3d64\ub171::\u927d\u3d4b\u6198\u34df\u3e2a\u6b0d, this:\ucb79\u7ce1\ubded\u3d64\ub171, p4:\u983f\u7e3f\u4e72\u6cfe\u6435)
            putfield:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\ucb79\u7ce1\ubded\u3d64\ub171::\u873d\u6cfe\u97e6\u839e\u416d\uff55, this:\ucb79\u7ce1\ubded\u3d64\ub171, p3:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>)
            putfield:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u760c\ua61f\ua3b4\u8d90\u5245\u64ab, this:\ucb79\u7ce1\ubded\u3d64\ub171, ternaryop:int(cmpne:boolean(p1:\ucb79\u7ce1\ubded\u3d64\ub171, aconstnull:\ucb79\u7ce1\ubded\u3d64\ub171()), add:int(invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, p1:\ucb79\u7ce1\ubded\u3d64\ub171), and:int(ldc:int(8363), ldc:int(4353))), and:int(ldc:int(-3476), ldc:int(2323))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u99f7\u527a\ubded\u12b2\ud158\u8bb0() {
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
            return:int(getfield:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u760c\ua61f\ua3b4\u8d90\u5245\u64ab, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u5245\u61a4\u5245\u385b\u72f1\u7043() {
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
            return:String(getfield:String(\ucb79\u7ce1\ubded\u3d64\ub171::\uc29a\ubb2b\u5245\u8df4\uc229\ud523, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \uae87\u983f\ucef1\u6b5f\u836c\u9a18() {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(getfield:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u7e3f\ufe34\u8350\ucfaf\u6198\uc29a, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \uc910\u9af2\u97b7\ucfaf\u9a18\u9033(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p2, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p3, java.util.function.Function<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>>> p4, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52> p5) {
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
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(invokeinterface:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\uc7fe\ud171\u99f7\uc246\u92ee::\u5245\u3c25\u4d85\u8aa5\u600f\u71ae, getfield:\uc7fe\ud171\u99f7\uc246\u92ee(\ucb79\u7ce1\ubded\u3d64\ub171::\u88c5\u8258\u99f7\u6b5f\u4daf\uc87f, this:\ucb79\u7ce1\ubded\u3d64\ub171), this:\ucb79\u7ce1\ubded\u3d64\ub171, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, p3:\ufcaf\u4c2b\u927d\u4975\u3e2a, p4:Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>, p5:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>, checkcast:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52.class, invokeinterface:\u8aa5\ubded\ub18d\u4f4a\u4f52(List<\u8aa5\ubded\ub18d\u4f4a\u4f52>::get, p5:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>, div:int(invokeinterface:int(List<E>::size, p5:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>), and:int(ldc:int(2071), ldc:int(298)))))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \u4daf\u446c\u4bc8\uc229\uc246\u16f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p1, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p2, java.util.function.Function<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>>> p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p4) {
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
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(invokeinterface:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\ubb2b\u7043\u120d\ufe34\u4f52::\u8753\ud171\u527a\u873d\ufe34\u7af6, getfield:\ubb2b\u7043\u120d\ufe34\u4f52(\ucb79\u7ce1\ubded\u3d64\ub171::\u5654\u56bd\u8709\uafe7\u8389\ud7e8, this:\ucb79\u7ce1\ubded\u3d64\ub171), this:\ucb79\u7ce1\ubded\u3d64\ub171, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, p2:\ufcaf\u4c2b\u927d\u4975\u3e2a, p3:Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>, p4:\u8aa5\ubded\ub18d\u4f4a\u4f52))
        }
        
        goto(Label_0006)
    }
    
    public int \u12cb\u416d\u4975\u16f6\u51b2\u93a2() {
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
            return:int(getfield:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u51fa\uc2bd\u8350\u67e9\u47c2\u1187, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 \u839e\u927d\uc229\u34df\u93a2\u6c56() {
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
            return:\u983f\u7e3f\u4e72\u6cfe\u6435(getfield:\u983f\u7e3f\u4e72\u6cfe\u6435(\ucb79\u7ce1\ubded\u3d64\ub171::\u927d\u3d4b\u6198\u34df\u3e2a\u6b0d, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u624e\u6cfe\u72f1\u6c52\u51fa\u9af2(java.lang.String p0) {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokevirtual:\ucb79\u7ce1\ubded\u3d64\ub171(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ucb79\u7ce1\ubded\u3d64\ub171>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ucb79\u7ce1\ubded\u3d64\ub171>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u446c\u12cb\u4cd9\u3e75\ub113\u3c25), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u76bc\u0c95\u873d\u3e2a\u71ae\u8bb0, p0:String))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.EnumSet<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9> \u385b\u74b1\uc4d2\ubcb0\u8d98\u51fa() {
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
            return:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(getfield:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\ucb79\u7ce1\ubded\u3d64\ub171::\u873d\u6cfe\u97e6\u839e\u416d\uff55, this:\ucb79\u7ce1\ubded\u3d64\ub171))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\u873d\ub7dc\u6cfe\uf94d\u5245(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-182877837), ldc:int(-216645316))
            
            if (cmplt:boolean(invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, this:\ucb79\u7ce1\ubded\u3d64\ub171), invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-604780251))
                stack_8E_0 = and:int(ldc:int(-7338), ldc:int(3240))
            }
            else {
                stack_8E_0 = and:int(ldc:int(3), ldc:int(1057))
            }
            
            return:boolean(stack_8E_0:int)
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
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ucb79\u7ce1\ubded\u3d64\ub171>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ucb79\u7ce1\ubded\u3d64\ub171>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u446c\u12cb\u4cd9\u3e75\ub113\u3c25), this:\ucb79\u7ce1\ubded\u3d64\ub171)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uf995\ua068\u8d90\u392e\u392e\u74b1$16(it.unimi.dsi.fastutil.ints.IntArrayList p0) {
        var_1_61 : int
        var_3_69 : int
        var_4_7A : int
        var_1_89 : int
        
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
            var_1_61 = and:int(ldc:int(1610255712), ldc:int(-38605598))
            var_3_69 = and:int(ldc:int(-30802), ldc:int(30801))
            var_4_7A = sub:int(invokeinterface:int(List<E>::size, invokestatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u8cae\u3a62\ud158\u416d\ub32d\u6d69)), and:int(ldc:int(3089), ldc:int(25095)))
            
            loop {
                Label_0124:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    var_1_89 = and:int(var_1_61:int, ldc:int(-1861877816))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_89 = and:int(var_1_61:int, ldc:int(-24459985))
                        goto(Label_0169)
                    }
                    
                    var_1_89 = and:int(var_1_61:int, ldc:int(2141708138))
                    
                    if (cmplt:boolean(var_4_7A:int, ldc:int(0))) {
                        goto(Label_0169)
                    }
                }
                
                Label_0214:
                
                while (cmpne:boolean(and:int(var_1_89:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_89:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_89:int, ldc:int(530775991))
                        loopcontinue(Label_0124)
                    }
                    
                    var_1_89 = and:int(var_1_89:int, ldc:int(-537404173))
                    
                    if (logicalor:boolean(cmpge:boolean(add:int(var_3_69:int, xor:int(ldc:int(2059), ldc:int(2058))), invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u1833\u7873\u759a\ua068\u7bad\u72f1))), cmpgt:boolean(var_4_7A:int, invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(List<\ucb79\u7ce1\ubded\u3d64\ub171>::get, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u1833\u7873\u759a\ua068\u7bad\u72f1), add:int(var_3_69:int, xor:int(ldc:int(-24510), ldc:int(-24509))))))))) {
                        var_1_61 = and:int(var_1_89:int, ldc:int(-35224727))
                        invokevirtual:void(IntArrayList::add, p0:IntArrayList, and:int(ldc:int(-11968), ldc:int(10931)), var_3_69:int)
                        inc:int(var_4_7A, ldc:int(-1))
                        loopcontinue(Label_0124)
                    }
                    
                    inc:int(var_3_69, ldc:int(1))
                }
                
                Label_0169:
                
                if (cmpeq:boolean(and:int(var_1_89:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_89 = and:int(var_1_89:int, ldc:int(-1535845681))
                    goto(Label_0214)
                }
                
                if (cmpne:boolean(and:int(var_1_89:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_89:int, ldc:int(-1578100556))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ub1b9\u64ab\u3504\ucb79\u5245\u9033$15(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p2, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p3, java.util.function.Function p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p5) {
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
            return:CompletableFuture(checkcast:CompletableFuture(java.util.concurrent.CompletableFuture.class, invokeinterface:CompletableFuture(Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture>::apply, p4:Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture>, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\uc9f6\u8258\uc4d2\u12b2\ufcaf\u0b8e$14(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p3, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p4, java.util.function.Function p5, java.util.List p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p7) {
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
            return:CompletableFuture(checkcast:CompletableFuture(java.util.concurrent.CompletableFuture.class, invokeinterface:CompletableFuture(Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture>::apply, p5:Function<\u8aa5\ubded\ub18d\u4f4a\u4f52, CompletableFuture>, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7049\u3504\u7d52\ub6ab\u6c56\u8df4$13(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
    
    private static void lambda$\u7af6\ud7e8\u3711\ua3b4\ua3b4\uc246$12(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u2dcc\u7049\u4f4a\u836c\ud217\u8cae, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, initobject:\u52d3\u624e\u8bb0\u385b\u6198(\u52d3\u624e\u8bb0\u385b\u6198::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u3e75\u4ab3\u4f52\u8308\ubefe\uc2bd$11(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p2, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p3, java.util.function.Function p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p5) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\ucb79\u7ce1\ubded\u3d64\ub171::\u8753\ub1b9\u8d90\uc7fe\u36d3\uafe7, p0:\ucb79\u7ce1\ubded\u3d64\ub171, p3:\ufcaf\u4c2b\u927d\u4975\u3e2a, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ubff1\u156b\u0b8e\uc2bd\u600f\u71f1$10(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p3, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p4, java.util.function.Function p5, java.util.List p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p7) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\ucb79\u7ce1\ubded\u3d64\ub171::\u8753\ub1b9\u8d90\uc7fe\u36d3\uafe7, p0:\ucb79\u7ce1\ubded\u3d64\ub171, p4:\ufcaf\u4c2b\u927d\u4975\u3e2a, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u392e\u3bc9\ud4fe\u52d3\u4f52\u71ae$9(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p3, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p4, java.util.function.Function p5, java.util.List p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p7) {
        var_10_6A : \u647c\u72f1\u1833\u6bb9\u7049
        var_11_B4 : \u52d3\u624e\u8bb0\u385b\u6198
        
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
            var_10_6A = checkcast:\u647c\u72f1\u1833\u6bb9\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u647c\u72f1\u1833\u6bb9\u7049])
            invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u6d69\u3bd6\u946b\u156b\u92ff\u6b5f, var_10_6A:\u647c\u72f1\u1833\u6bb9\u7049, p4:\ufcaf\u4c2b\u927d\u4975\u3e2a[expected:\ube23\u51b2\u92ee\u6435\u8308\u1833])
            
            if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52), p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                invokestatic:void(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u0c95\u8258\u071d\u3bd6\u9af2\u47c2, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52, invokestatic:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>[expected:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>](EnumSet<E>::of, getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u5f50\u51fa\u8753\u8350\u4cd9\u0b8e), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u8640\uae5d\ud12e\u8bb0\u12b2\u62da), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u47c2\u8308\u7330\u93a2\u5bc4\u839e)))
                var_11_B4 = initobject:\u52d3\u624e\u8bb0\u385b\u6198(\u52d3\u624e\u8bb0\u385b\u6198::<init>, p1:\ube23\uc238\u5140\u4cd9\u8aa5, p6:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>)
                invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u3e2a\u120d\u93a2\u8df4\u62da\u36d3, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, var_11_B4:\u52d3\u624e\u8bb0\u385b\u6198, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\u8753\u4975\ubf56\u6b0d\u7e3f::\uc229\u4c04\u9255\u385b\u624e\u4975, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, p1:\ube23\uc238\u5140\u4cd9\u8aa5), var_11_B4:\u52d3\u624e\u8bb0\u385b\u6198))
                invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\u7d52\ub102\uc29a\u8d90\u0800, var_10_6A:\u647c\u72f1\u1833\u6bb9\u7049, p0:\ucb79\u7ce1\ubded\u3d64\ub171)
            }
            
            return:CompletableFuture(invokestatic:CompletableFuture<Either>(CompletableFuture<T>::completedFuture, invokestatic:Either(Either::left, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud171\u67d0\u4975\u99f7\u74b1\u6cfe$8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\ufcaf\ubefe\ud523\ucfaf\u9937\u3776, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, invokevirtual:long(\ube23\uc238\u5140\u4cd9\u8aa5::\ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e, p0:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:\u8c8a\u51b2\u516c\ub70c\u624e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52, getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u927d\u69d9\u3bd6\u6d69\u4cd9\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u983f\ucef1\ua3b4\uf9c5\u3c25\u5245$7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\ufcaf\ubefe\ud523\ucfaf\u9937\u3776, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, invokevirtual:long(\ube23\uc238\u5140\u4cd9\u8aa5::\ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e, p0:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:\u8c8a\u51b2\u516c\ub70c\u624e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52, getstatic:\uc910\u98a4\u120d\u3bc9\ubcb0(\uc910\u98a4\u120d\u3bc9\ubcb0::\u6435\u3a62\u64f2\u0800\u88c5\u92ee))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6cfe\u120d\u385b\u759a\u4179\u97b7$6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u8413\u97b7\uf995\u8640\ufcaf\u97e6, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, initobject:\u52d3\u624e\u8bb0\u385b\u6198(\u52d3\u624e\u8bb0\u385b\u6198::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u93a2\u839e\ufcaf\uc29a\u8753\u8cae$5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
        var_6_6E : \u52d3\u624e\u8bb0\u385b\u6198
        
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
            var_6_6E = initobject:\u52d3\u624e\u8bb0\u385b\u6198(\u52d3\u624e\u8bb0\u385b\u6198::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>)
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u62da\u4f52\u5db4\u71ae\ub8be\ub1b9, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, var_6_6E:\u52d3\u624e\u8bb0\u385b\u6198[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\u8753\u4975\ubf56\u6b0d\u7e3f::\uc229\u4c04\u9255\u385b\u624e\u4975, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, p0:\ube23\uc238\u5140\u4cd9\u8aa5), var_6_6E:\u52d3\u624e\u8bb0\u385b\u6198), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u71f1\u416d\u72f1\ub19c\u1833\u3bc9$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u3a62\ub171\uc246\u6fb0\u0b8e\u99f7, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\ube23\uc238\u5140\u4cd9\u8aa5::\u4bc8\ubff1\u76bc\u718f\uc238\u6d69, p0:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f)), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc31c\u67e9\u5f50\u759a\u7043\u67e9$3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
        var_6_6E : \u52d3\u624e\u8bb0\u385b\u6198
        
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
            var_6_6E = initobject:\u52d3\u624e\u8bb0\u385b\u6198(\u52d3\u624e\u8bb0\u385b\u6198::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>)
            invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u5140\ud51e\u5140\u36d3\u6d99\u8350, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, var_6_6E:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd], invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\u8753\u4975\ubf56\u6b0d\u7e3f::\uc229\u4c04\u9255\u385b\u624e\u4975, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, p0:\ube23\uc238\u5140\u4cd9\u8aa5), var_6_6E:\u52d3\u624e\u8bb0\u385b\u6198), p3:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u6b0d\u965f\uceb8\u9af2\u6b5f\u385b$2(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p3, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p4, java.util.function.Function p5, java.util.List p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p7) {
        var_8_63 : int
        
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
            var_8_63 = and:int(ldc:int(-1991988065), ldc:int(-94552211))
            
            if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52), p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                if (invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, p1:\ube23\uc238\u5140\u4cd9\u8aa5))))) {
                    invokevirtual:void(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u7e3f\ub113\u64f2\u7ce1\u4ab3\ud36e, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\ube23\uc238\u5140\u4cd9\u8aa5::\u4bc8\ubff1\u76bc\u718f\uc238\u6d69, p1:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, p1:\ube23\uc238\u5140\u4cd9\u8aa5), p7:\u8aa5\ubded\ub18d\u4f4a\u4f52, p3:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, invokevirtual:long(\ube23\uc238\u5140\u4cd9\u8aa5::\ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e, p1:\ube23\uc238\u5140\u4cd9\u8aa5))
                }
                
                var_8_63 = and:int(var_8_63:int, ldc:int(-909914595))
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52)) {
                    invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\u7d52\ub102\uc29a\u8d90\u0800, checkcast:\u647c\u72f1\u1833\u6bb9\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u647c\u72f1\u1833\u6bb9\u7049]), p0:\ucb79\u7ce1\ubded\u3d64\ub171)
                }
            }
            
            return:CompletableFuture(invokestatic:CompletableFuture<Either>(CompletableFuture<T>::completedFuture, invokestatic:Either(Either::left, p7:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubcb0\u718f\ucef1\ub1b9\u3bc9\u8d98$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p3) {
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
    
    private static java.util.concurrent.CompletableFuture lambda$\u5bc4\u8d98\u8aa5\u64f2\u4e72\ucef1$0(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p2, \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\u4c2b\u927d\u4975\u3e2a p3, java.util.function.Function p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p5) {
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
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52)) {
                if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52), p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                    invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\u7d52\ub102\uc29a\u8d90\u0800, checkcast:\u647c\u72f1\u1833\u6bb9\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u647c\u72f1\u1833\u6bb9\u7049]), p0:\ucb79\u7ce1\ubded\u3d64\ub171)
                }
            }
            
            return:CompletableFuture(invokestatic:CompletableFuture<Either>(CompletableFuture<T>::completedFuture, invokestatic:Either(Either::left, p5:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:Object])))
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
    
    public void \u4492\uff55\u12b2\u62da\u965f\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_669 : int
        
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
        var_3_65E = and:int(ldc:int(-1210796787), ldc:int(1207758797))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\u7ce1\ubded\u3d64\ub171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
            var_3_65E = and:int(var_3_65E:int, ldc:int(1190444905))
            var_5_81 = and:int(ldc:int(-3362), ldc:int(3361))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22914), ldc:int(-22915)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_65E:int, ldc:int(-1610678451))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-32383), ldc:int(-32384)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32250), ldc:int(-32249)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_65E = and:int(var_3_DA:int, ldc:int(1994260399))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(2600), ldc:int(2601)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(789939238))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(526804462))
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-748032598))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-19480759))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(457883781))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1118729724))
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(595098743))
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1459006731))
                            var_11_EB = and:int(ldc:int(-30317), ldc:int(30312))
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(2011520475))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-378927954))
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1361068115))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0664:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1258526777))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(106976444))
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-176575646))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1872793638))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1071578543))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0795:
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(2012090792))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(120316034))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1474415817))
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-269193973))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(2060231798))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(251637663))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(22145), ldc:int(381))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1110720130))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-11133443))
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1797938111))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1675980686))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1791628803))
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1504957631))
                            goto(Label_0664)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1481267379))
                        var_11_EB = and:int(ldc:int(-17732), ldc:int(16707))
                    }
                    
                    Label_1103:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1727771968))
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1554160774))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-907141853))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1941601441))
                            loopcontinue()
                        }
                        
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-419957253))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1352)
                            }
                        }
                    }
                    
                    Label_1227:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(641644998))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1242768461))
                            goto(Label_1103)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0926)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(1058449446))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65E = and:int(var_3_65E:int, ldc:int(-1095434967))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1352:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1235647985))
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1090706505))
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1120180862))
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-899407799))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1786742003))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(1396735849))
                        loopcontinue()
                    }
                    
                    var_3_65E = and:int(var_3_65E:int, ldc:int(519892383))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_669 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-294588254))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-1216481830))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(613178962))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65E = and:int(var_3_65E:int, ldc:int(-671089287))
                        var_17_669 = add:int(var_16_119:int, and:int(ldc:int(30757), ldc:int(153)))
                        looporswitchbreak()
                    }
                    
                    var_3_65E = and:int(var_3_65E:int, ldc:int(1365818679))
                }
                
                var_3_65E = and:int(var_3_65E:int, ldc:int(-4737777))
                
                if (cmple:boolean(var_5_81 = var_17_669:int, sub:int(var_6_88:int, and:int(ldc:int(9233), ldc:int(17165))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_65E:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_65E = and:int(var_3_65E:int, ldc:int(1266980139))
            goto(Label_0108)
        }
    }
}
