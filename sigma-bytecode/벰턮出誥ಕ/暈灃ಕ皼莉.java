public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 {
    private void \uf9c5\u7043\u0c95\u76bc\u8389(java.util.Random p0, float p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2, java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1> p3, java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18> p4, java.util.Map<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u93a2\u64f2\ud217\u69d9\u4bc8<?>, java.lang.Object> p5, java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ud36e\u6bb9\u960f\u4c04\u64ab.\ub18d\u4d85\uc9f6\u7043\u527a> p6) {
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
            invokespecial:Object(Object::<init>, this:\uf9c5\u7043\u0c95\u76bc\u8389)
            putfield:Set<\u4179\ud217\u7043\u8bb0\ucef1>(\uf9c5\u7043\u0c95\u76bc\u8389::\u983f\u99f7\u7af6\u0a06\ua3b4\uc2bd, this:\uf9c5\u7043\u0c95\u76bc\u8389, invokestatic:LinkedHashSet[expected:Set<\u4179\ud217\u7043\u8bb0\ucef1>](Sets::newLinkedHashSet))
            putfield:Set<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uf9c5\u7043\u0c95\u76bc\u8389::\u12cb\uf9c5\u3bd6\u99f7\u9255\u4c2b, this:\uf9c5\u7043\u0c95\u76bc\u8389, invokestatic:LinkedHashSet[expected:Set<\u67d0\u36d3\uae5d\u99f7\u9a18>](Sets::newLinkedHashSet))
            putfield:Random(\uf9c5\u7043\u0c95\u76bc\u8389::\u5d20\ubded\uc29a\ucef1\ub19c\u61a4, this:\uf9c5\u7043\u0c95\u76bc\u8389, p0:Random)
            putfield:float(\uf9c5\u7043\u0c95\u76bc\u8389::\u4d85\ua068\u8640\u836c\ucb79\u9a18, this:\uf9c5\u7043\u0c95\u76bc\u8389, p1:float)
            putfield:\ube23\uc238\u5140\u4cd9\u8aa5(\uf9c5\u7043\u0c95\u76bc\u8389::\ub102\u839e\u8413\u7bad\uc84e\u446c, this:\uf9c5\u7043\u0c95\u76bc\u8389, p2:\ube23\uc238\u5140\u4cd9\u8aa5)
            putfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ud217\u7043\u8bb0\ucef1>(\uf9c5\u7043\u0c95\u76bc\u8389::\u6cfe\u416d\ub18d\ub1b9\u3d64\u7c6b, this:\uf9c5\u7043\u0c95\u76bc\u8389, p3:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ud217\u7043\u8bb0\ucef1>)
            putfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u67d0\u36d3\uae5d\u99f7\u9a18>(\uf9c5\u7043\u0c95\u76bc\u8389::\u0b8e\u8709\u74b1\ub8be\uc29a\ua61f, this:\uf9c5\u7043\u0c95\u76bc\u8389, p4:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u67d0\u36d3\uae5d\u99f7\u9a18>)
            putfield:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>(\uf9c5\u7043\u0c95\u76bc\u8389::\u7af6\uc238\u120d\u16f6\u7af6\u3e75, this:\uf9c5\u7043\u0c95\u76bc\u8389, invokestatic:ImmutableMap[expected:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>](ImmutableMap::copyOf, p5:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>))
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>(\uf9c5\u7043\u0c95\u76bc\u8389::\u5bc4\uc3e3\u0c95\u0800\uc2bd\ubded, this:\uf9c5\u7043\u0c95\u76bc\u8389, invokestatic:ImmutableMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>](ImmutableMap::copyOf, p6:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc910\u4e72\u5245\ucb79\uae5d\ub113(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u93a2\u64f2\ud217\u69d9\u4bc8<?> p0) {
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
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>(\uf9c5\u7043\u0c95\u76bc\u8389::\u7af6\uc238\u120d\u16f6\u7af6\u3e75, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u93a2\u64f2\ud217\u69d9\u4bc8<?>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\u6198\ud158\u836c\u88c5\u4bc8(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1) {
        var_5_6D : \ub18d\u4d85\uc9f6\u7043\u527a
        
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
            var_5_6D = checkcast:\ub18d\u4d85\uc9f6\u7043\u527a(\ud36e\u6bb9\u960f\u4c04\u64ab.\ub18d\u4d85\uc9f6\u7043\u527a.class, invokeinterface:\ub18d\u4d85\uc9f6\u7043\u527a(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>(\uf9c5\u7043\u0c95\u76bc\u8389::\u5bc4\uc3e3\u0c95\u0800\uc2bd\ubded, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
            
            if (cmpne:boolean(var_5_6D:\ub18d\u4d85\uc9f6\u7043\u527a, aconstnull:\ub18d\u4d85\uc9f6\u7043\u527a())) {
                invokeinterface:void(\ub18d\u4d85\uc9f6\u7043\u527a::\u8308\uae87\ub32d\u6cfe\u8350\u3c25, var_5_6D:\ub18d\u4d85\uc9f6\u7043\u527a, this:\uf9c5\u7043\u0c95\u76bc\u8389, p1:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T \uc910\u0a06\ud51e\u7330\u6435\u6cfe(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u93a2\u64f2\ud217\u69d9\u4bc8<T> p0) {
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
            return:T(invokeinterface:Object[expected:T](Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>::get, getfield:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>(\uf9c5\u7043\u0c95\u76bc\u8389::\u7af6\uc238\u120d\u16f6\u7af6\u3e75, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u93a2\u64f2\ud217\u69d9\u4bc8<T>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub102\u9255\u7ce1\u4ab3\uc2bd\u4f4a(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 p0) {
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
            return:boolean(invokeinterface:boolean(Set<\u4179\ud217\u7043\u8bb0\ucef1>::add, getfield:Set<\u4179\ud217\u7043\u8bb0\ucef1>(\uf9c5\u7043\u0c95\u76bc\u8389::\u983f\u99f7\u7af6\u0a06\ua3b4\uc2bd, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u4179\ud217\u7043\u8bb0\ucef1))
        }
        
        goto(Label_0006)
    }
    
    public void \u71ae\u3711\u8709\u760c\ub83f\u64ab(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 p0) {
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
            invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4179\ud217\u7043\u8bb0\ucef1>(\uf9c5\u7043\u0c95\u76bc\u8389::\u983f\u99f7\u7af6\u0a06\ua3b4\uc2bd, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u4179\ud217\u7043\u8bb0\ucef1[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5d20\ucb79\uf94d\u836c\u0800\u4ab3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18 p0) {
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
            return:boolean(invokeinterface:boolean(Set<\u67d0\u36d3\uae5d\u99f7\u9a18>::add, getfield:Set<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uf9c5\u7043\u0c95\u76bc\u8389::\u12cb\uf9c5\u3bd6\u99f7\u9255\u4c2b, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u67d0\u36d3\uae5d\u99f7\u9a18))
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\ud4fe\u16f6\u4492\uc29a\ud36e(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18 p0) {
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
            invokeinterface:boolean(Set<E>::remove, getfield:Set<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uf9c5\u7043\u0c95\u76bc\u8389::\u12cb\uf9c5\u3bd6\u99f7\u9255\u4c2b, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u67d0\u36d3\uae5d\u99f7\u9a18[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 \ub102\u8350\u156b\uc238\u8d98\u4975(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u4179\ud217\u7043\u8bb0\ucef1(checkcast:\u4179\ud217\u7043\u8bb0\ucef1(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1.class, invokeinterface:\u4179\ud217\u7043\u8bb0\ucef1(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ud217\u7043\u8bb0\ucef1>::apply, getfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ud217\u7043\u8bb0\ucef1>(\uf9c5\u7043\u0c95\u76bc\u8389::\u6cfe\u416d\ub18d\ub1b9\u3d64\u7c6b, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18 \u93a2\u4ab3\ub19c\uf94d\u183a\u6d69(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u67d0\u36d3\uae5d\u99f7\u9a18(checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18.class, invokeinterface:\u67d0\u36d3\uae5d\u99f7\u9a18(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u67d0\u36d3\uae5d\u99f7\u9a18>::apply, getfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u67d0\u36d3\uae5d\u99f7\u9a18>(\uf9c5\u7043\u0c95\u76bc\u8389::\u0b8e\u8709\u74b1\ub8be\uc29a\ua61f, this:\uf9c5\u7043\u0c95\u76bc\u8389), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Random \u647c\u647c\ucb79\ub171\u8bb0\u760c() {
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
            return:Random(getfield:Random(\uf9c5\u7043\u0c95\u76bc\u8389::\u5d20\ubded\uc29a\ucef1\ub19c\u61a4, this:\uf9c5\u7043\u0c95\u76bc\u8389))
        }
        
        goto(Label_0006)
    }
    
    public float \u3711\u0c95\u1833\u5245\uc29a\u3711() {
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
            return:float(getfield:float(\uf9c5\u7043\u0c95\u76bc\u8389::\u4d85\ua068\u8640\u836c\ucb79\u9a18, this:\uf9c5\u7043\u0c95\u76bc\u8389))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u6c52\u718f\ubefe\uc3e3\uff55\uae87() {
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
            return:\ube23\uc238\u5140\u4cd9\u8aa5(getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\uf9c5\u7043\u0c95\u76bc\u8389::\ub102\u839e\u8413\u7bad\uc84e\u446c, this:\uf9c5\u7043\u0c95\u76bc\u8389))
        }
        
        goto(Label_0006)
    }
    
    public void \uf9c5\u7043\u0c95\u76bc\u8389(java.util.Random p0, float p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p2, java.util.function.Function p3, java.util.function.Function p4, java.util.Map p5, java.util.Map p6, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u69d9\u5245\u1187\u718f\ud158 p7) {
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
            invokespecial:\uf9c5\u7043\u0c95\u76bc\u8389(\uf9c5\u7043\u0c95\u76bc\u8389::<init>, this:\uf9c5\u7043\u0c95\u76bc\u8389, p0:Random, p1:float, p2:\ube23\uc238\u5140\u4cd9\u8aa5, p3:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ud217\u7043\u8bb0\ucef1>, p4:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u67d0\u36d3\uae5d\u99f7\u9a18>, p5:Map<\u93a2\u64f2\ud217\u69d9\u4bc8<?>, Object>, p6:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ub18d\u4d85\uc9f6\u7043\u527a>)
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
    
    public void \ub18d\u1833\ua068\u156b\u6c52\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C0 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_6CB : int
        
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
        var_3_6C0 = and:int(ldc:int(1796360665), ldc:int(2077510100))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\u7043\u0c95\u76bc\u8389[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2)), ldc:int(0))) {
            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-337753412))
            var_5_7D = and:int(ldc:int(220), ldc:int(-8413))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28192), ldc:int(26143)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_6C0:int, ldc:int(1805152128))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-16384), ldc:int(-16383)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2049), ldc:int(2048)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_6C0 = and:int(var_3_D2:int, ldc:int(-338462013))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(7), ldc:int(169)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-999660923))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1227038573))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-962098935))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1009)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1876291384))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1960994414))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-249290910))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-101581864))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0578)
                            }
                            
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1211473279))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1461528807))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-995374862))
                        goto(Label_1009)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(603288175))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-856036634))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2074007960))
                        var_11_E3 = and:int(ldc:int(1473), ldc:int(-21962))
                        goto(Label_1596)
                    }
                    
                    Label_0578:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(2010634666))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1094106114))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1009)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1509509562))
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1807895534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-839607563))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-57841651))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1874783408))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(310600520))
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1320239608))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1812734147))
                        goto(Label_1009)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-768946796))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1391795565))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-271460256))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-252146734))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-101684033))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0876:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-2077339038))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-75567022))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1718999578))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(380383171))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1016730940))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-315069954))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(12560), ldc:int(12561))
                                goto(Label_1189)
                            }
                        }
                    }
                    
                    Label_1009:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1237471021))
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(817663859))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-285598576))
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1402009195))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1101841680))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1370262123))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1646410926))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-279348993))
                        var_11_E3 = and:int(ldc:int(4293), ldc:int(-4302))
                    }
                    
                    Label_1189:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1377277219))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1009)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1865752651))
                            goto(Label_0876)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-378342329))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(162257415))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-37824365))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1463)
                            }
                        }
                    }
                    
                    Label_1311:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1133842012))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(775026304))
                            goto(Label_1189)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1009)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1375924680))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-461882115))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-82069304))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(814348510))
                            loopcontinue()
                        }
                        
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(1834080421))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1596)
                    }
                    
                    Label_1463:
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(295455760))
                        goto(Label_1607)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1338985787))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1009)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-634192543))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-2063280212))
                        loopcontinue()
                    }
                    
                    var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-46171669))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1596:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CB = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1607:
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-619564856))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1202031192))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1009)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-1451886619))
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(366827960))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(764870259))
                        goto(Label_0578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-4199268))
                        var_17_6CB = add:int(var_16_111:int, xor:int(ldc:int(195), ldc:int(194)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C0 = and:int(var_3_6C0:int, ldc:int(-7219003))
                
                if (cmple:boolean(var_5_7D = var_17_6CB:int, sub:int(var_6_84:int, xor:int(ldc:int(1320), ldc:int(1321))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_6C0:int, ldc:int(2048)), ldc:int(0))) {
            var_3_6C0 = and:int(var_3_6C0:int, ldc:int(892454664))
            goto(Label_0106)
        }
    }
}
