public class \u51fa\u12cb\u7330\u74b1\u6c52.\uc4d2\ud171\ub171\u8d98\u67d0\u965f {
    public void \uc4d2\ud171\ub171\u8d98\u67d0\u965f() {
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
            invokespecial:Object(Object::<init>, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f)
            putfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f, initobject:ArrayList<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>[expected:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>](ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\ub7dc\ud51e\u6bb9\u62da\u8753(int p0) {
        var_2_5F : int
        var_4_67 : int
        
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
            var_2_5F = and:int(ldc:int(1690909727), ldc:int(-257956727))
            var_4_67 = and:int(ldc:int(-17795), ldc:int(17794))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(681881227))
                
                if (cmpge:boolean(var_4_67:int, invokeinterface:int(List<E>::size, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u92ff\u4bc8\ud4fe\u071d\u839e\u600f, checkcast:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uc31c\u8753\ucfaf\u6d99\ufe34\u624e.class, invokeinterface:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>::get, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_67:int)), p0:int)
                inc:int(var_4_67, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\u5d20\u6b5f\u527a\u0c95\u2dcc() {
        var_1_5F : int
        var_3_67 : int
        
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
            var_1_5F = and:int(ldc:int(1384612634), ldc:int(-872956033))
            var_3_67 = and:int(ldc:int(8307), ldc:int(-8308))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1827658451))
                
                if (cmpge:boolean(var_3_67:int, invokeinterface:int(List<E>::size, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u494c\u6d69\u3c25\u98a4\ub1b9\u7330, checkcast:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uc31c\u8753\ucfaf\u6d99\ufe34\u624e.class, invokeinterface:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>::get, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_3_67:int)))
                inc:int(var_3_67, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uf94d\u5d20\u8d90\ub8be\u8350\ud51e \u67e9\u839e\u6bb9\ua068\ucef1\ua3b4(java.lang.String p0) {
        var_4_68 : \uf94d\u5d20\u8d90\ub8be\u8350\ud51e
        
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
            var_4_68 = initobject:\uf94d\u5d20\u8d90\ub8be\u8350\ud51e(\uf94d\u5d20\u8d90\ub8be\u8350\ud51e::<init>, p0:String)
            invokeinterface:boolean(List<\uf94d\u5d20\u8d90\ub8be\u8350\ud51e>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\uf94d\u5d20\u8d90\ub8be\u8350\ud51e)
            return:\uf94d\u5d20\u8d90\ub8be\u8350\ud51e(var_4_68:\uf94d\u5d20\u8d90\ub8be\u8350\ud51e)
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2 \u3c25\u16f6\u8d90\u8bb0\u960f\ud523(java.lang.String p0) {
        var_4_68 : \u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2
        
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
            var_4_68 = initobject:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2(\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::<init>, p0:String)
            invokeinterface:boolean(List<\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)
            return:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2(var_4_68:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uf94d\u3504\u7043\u8389\u6198\u9255 \ufe34\u927d\u7043\u8350\u446c\u61a4(java.lang.String p0) {
        var_4_68 : \uf94d\u3504\u7043\u8389\u6198\u9255
        
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
            var_4_68 = initobject:\uf94d\u3504\u7043\u8389\u6198\u9255(\uf94d\u3504\u7043\u8389\u6198\u9255::<init>, p0:String)
            invokeinterface:boolean(List<\uf94d\u3504\u7043\u8389\u6198\u9255>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\uf94d\u3504\u7043\u8389\u6198\u9255)
            return:\uf94d\u3504\u7043\u8389\u6198\u9255(var_4_68:\uf94d\u3504\u7043\u8389\u6198\u9255)
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b \u3e75\u760c\u983f\ube23\u839e\u946b(java.lang.String p0) {
        var_4_68 : \u5db4\u93a2\uceb8\u4f4a\u7af6\u385b
        
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
            var_4_68 = initobject:\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b(\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b::<init>, p0:String)
            invokeinterface:boolean(List<\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b)
            return:\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b(var_4_68:\u5db4\u93a2\uceb8\u4f4a\u7af6\u385b)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523 \uc87f\uc2e8\u3504\u760c\ub1b9\ua6bd(java.lang.String p0) {
        var_4_68 : \u7ce1\u9a18\u74b1\u4e72\u64ab\ud523
        
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
            var_4_68 = initobject:\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523(\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523::<init>, p0:String)
            invokeinterface:boolean(List<\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523)
            return:\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523(var_4_68:\u7ce1\u9a18\u74b1\u4e72\u64ab\ud523)
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4 \ubb2b\u69d9\ub8be\u72f1\ubf56\uc3e3(java.lang.String p0) {
        var_4_68 : \u8d90\uc2bd\u6fb0\ub171\u34df\u8df4
        
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
            var_4_68 = initobject:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4(\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4::<init>, p0:String)
            invokeinterface:boolean(List<\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)
            return:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4(var_4_68:\u8d90\uc2bd\u6fb0\ub171\u34df\u8df4)
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c \u071d\u67e9\u8aa5\ud4fe\uc4d2\u4c2b(java.lang.String p0) {
        var_4_68 : \u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c
        
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
            var_4_68 = initobject:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::<init>, p0:String)
            invokeinterface:boolean(List<\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c>::add, getfield:List<\uc31c\u8753\ucfaf\u6d99\ufe34\u624e>(\uc4d2\ud171\ub171\u8d98\u67d0\u965f::\u7006\u16f6\u7330\uc87f\u5654\u34df, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f), var_4_68:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c)
            return:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c(var_4_68:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c)
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
    
    public void \u5d20\u4d85\u5654\uc229\u5bc4\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DF : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5EA : int
        
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
        var_3_5DF = and:int(ldc:int(-1351521618), ldc:int(-56152402))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\ud171\ub171\u8d98\u67d0\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(32)), ldc:int(0))) {
            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-328910169))
            var_5_7D = and:int(ldc:int(5381), ldc:int(-5382))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4565), ldc:int(4564)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DF:int, ldc:int(-1083327945))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2314), ldc:int(2315)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16449), ldc:int(4241)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DF = and:int(var_3_D2:int, ldc:int(-337139098))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21057), ldc:int(1293)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-23477523))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1818338696))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1027141058))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1392398810))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-902382696))
                    }
                    else {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-551077081))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-83410988))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(536147959))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-117621846))
                            var_11_E3 = and:int(ldc:int(8306), ldc:int(-9075))
                            goto(Label_1388)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1219573515))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(484356580))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-110648451))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1657197982))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-413343196))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(99106833))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-42983977))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(402759552))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1943044510))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1330026987))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1150681540))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(2113735766))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-2060720199))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1141004204))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1903645120))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-378409042))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(2316), ldc:int(2317))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(2145667882))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-2025372183))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1388215055))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1620908593))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1376571786))
                        var_11_E3 = and:int(ldc:int(4273), ldc:int(-4274))
                    }
                    
                    Label_1027:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1384458254))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-36257222))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1575666379))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1640763398))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1269)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-819476976))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1628557337))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-819185259))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(247448017))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(1274457262))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DF = and:int(var_3_5DF:int, ldc:int(-2102766658))
                            loopcontinue()
                        }
                        
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1449018705))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1388)
                    }
                    
                    Label_1269:
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1909837030))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(384228447))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-126453502))
                        loopcontinue()
                    }
                    
                    var_3_5DF = and:int(var_3_5DF:int, ldc:int(-927367322))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1388:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5EA = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1399:
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1422030633))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-730799705))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-684858950))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(1486793240))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DF = and:int(var_3_5DF:int, ldc:int(-1154125842))
                        var_17_5EA = add:int(var_16_111:int, and:int(ldc:int(24597), ldc:int(417)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DF = and:int(var_3_5DF:int, ldc:int(-324817997))
                
                if (cmple:boolean(var_5_7D = var_17_5EA:int, sub:int(var_6_84:int, and:int(ldc:int(26441), ldc:int(6305))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5DF:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5DF = and:int(var_3_5DF:int, ldc:int(734864525))
            goto(Label_0106)
        }
    }
}
