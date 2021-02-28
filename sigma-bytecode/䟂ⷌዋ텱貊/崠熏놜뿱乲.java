public final class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u5d20\u718f\ub19c\ubff1\u4e72 {
    public void \u5d20\u718f\ub19c\ubff1\u4e72() {
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
            invokespecial:Object(Object::<init>, this:\u5d20\u718f\ub19c\ubff1\u4e72)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.util.Optional<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(1188547465), ldc:int(1918823231))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, p1:Optional))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1459600139))
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, and:int(ldc:int(10348), ldc:int(-31342)))
            }
            else {
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokestatic:int(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u3bc9\u183a\ucb79\ubded\u3504\u839e, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::get, p1:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_64 : int
        stack_87_0 : Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> [generated]
        
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
            var_2_5F = and:int(ldc:int(-1532858721), ldc:int(-1934462002))
            var_4_64 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
            
            if (cmpne:boolean(var_4_64:int, ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-319668562))
                stack_87_0 = invokestatic:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(Optional<T>::of, invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u6d69\u67d0\u7e3f\u56bd\u8bb0\ucb79, var_4_64:int))
            }
            else {
                stack_87_0 = invokestatic:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(Optional<T>::empty)
            }
            
            return:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(stack_87_0:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.util.Optional<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
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
            return:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(p0:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.lang.Object p0) {
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
            return:Object(invokevirtual:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>[expected:Object](\u5d20\u718f\ub19c\ubff1\u4e72::\u99f7\ub18d\uc2bd\ub113\u7043\u3d64, this:\u5d20\u718f\ub19c\ubff1\u4e72, checkcast:Optional(java.util.Optional.class, p0:Object[expected:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            return:Object(invokevirtual:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>[expected:Object](\u5d20\u718f\ub19c\ubff1\u4e72::\ub32d\u071d\ucef1\u6cfe\u718f\u9a18, this:\u5d20\u718f\ub19c\ubff1\u4e72, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.lang.Object p1) {
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
            invokevirtual:void(\u5d20\u718f\ub19c\ubff1\u4e72::\u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9, this:\u5d20\u718f\ub19c\ubff1\u4e72, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:Optional(java.util.Optional.class, p1:Object[expected:Optional<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>]))
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
    
    public void \ua61f\u3bc9\ud523\u527a\u72f1\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DB : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5E6 : int
        
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
        var_3_5DB = and:int(ldc:int(785194424), ldc:int(1796046709))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\u718f\ub19c\ubff1\u4e72[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-224949221))
        }
        else {
            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1954636431))
            var_5_85 = and:int(ldc:int(5227), ldc:int(-5484))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10025), ldc:int(10016)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5DB:int, ldc:int(2136227381))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32730), ldc:int(-32729)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(26707), ldc:int(769)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5DB = and:int(var_3_DA:int, ldc:int(1271373434))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1553), ldc:int(14723)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(778989079))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(53923259))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(2116815175))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1539161402))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1290990241))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(44921980))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-938371679))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-202489266))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(2138635873))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(553421842))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(1837007220))
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(169704690))
                        var_11_EB = and:int(ldc:int(16396), ldc:int(-16397))
                        goto(Label_1375)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1002345288))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-726671235))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1326722173))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(611333423))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-570170809))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-881423156))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(327901912))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1418260810))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-29811115))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(1557081820))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1218535773))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1952682315))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(6253), ldc:int(16641))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1765396442))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1519036620))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(548868994))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1794785803))
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1142042887))
                        var_11_EB = and:int(ldc:int(-152), ldc:int(151))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(363508462))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-509019857))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(160150175))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-838575056))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(184293111))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-922474687))
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1486723988))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5DB = and:int(var_3_5DB:int, ldc:int(-633577478))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(669862998))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(269146032))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1627945441))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1978374246))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1163362710))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DB = and:int(var_3_5DB:int, ldc:int(796868214))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E6 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(417911615))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(19277922))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-301149657))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(1994098721))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(-1411540766))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DB = and:int(var_3_5DB:int, ldc:int(2144177588))
                        var_17_5E6 = add:int(var_16_119:int, and:int(ldc:int(8807), ldc:int(393)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DB = and:int(var_3_5DB:int, ldc:int(1603173565))
                
                if (cmple:boolean(var_5_85 = var_17_5E6:int, sub:int(var_6_8C:int, and:int(ldc:int(1), ldc:int(677))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DB:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5DB = and:int(var_3_5DB:int, ldc:int(1858928387))
            goto(Label_0106)
        }
    }
}
