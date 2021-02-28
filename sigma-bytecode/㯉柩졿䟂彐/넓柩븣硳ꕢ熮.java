public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\ub113\u67e9\ube23\u7873\ua562\u71ae {
    public void \ub113\u67e9\ube23\u7873\ua562\u71ae(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3a62\u516c\u836c\u74b1\u4f52\u4d85 p0, int p1) {
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
            putfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\uf94d\u6c56\u71ae\u40a9\u6198\u4cd9, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, p0:\u3a62\u516c\u836c\u74b1\u4f52\u4d85)
            invokespecial:\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56(\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56::<init>, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, p0:\u3a62\u516c\u836c\u74b1\u4f52\u4d85)
            putfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean hasPrevious() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(605647971), ldc:int(1964765357))
            
            if (cmple:boolean(getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1836805099))
                stack_86_0 = and:int(ldc:int(-23921), ldc:int(20848))
            }
            else {
                stack_86_0 = xor:int(ldc:int(8448), ldc:int(8449))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int nextIndex() {
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
            return:int(getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae))
        }
        
        goto(Label_0006)
    }
    
    public int previousIndex() {
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
            return:int(sub:int(getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), xor:int(ldc:int(-30432), ldc:int(-30431))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object previous() {
        var_3_6C : int
        stack_85_0 : \u3a62\u516c\u836c\u74b1\u4f52\u4d85 [generated]
        expr_80 : int [generated]
        
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
        var_3_6C = sub:int(getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), and:int(ldc:int(185), ldc:int(2631)))
        
        if (cmpge:boolean(var_3_6C:int, ldc:int(0))) {
            putfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, var_3_6C:int)
            stack_85_0 = getfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u40a9\u416d\u4daf\u965f\ubb2b\ubded, this:\ub113\u67e9\ube23\u7873\ua562\u71ae)
            expr_80 = var_3_6C:int
            putfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u3d4b\u59ec\u8709\u5db4\u8413\ubff1, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, expr_80:int)
            return:Object(invokevirtual:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>::get, stack_85_0:\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>, expr_80:int))
        }
        
        athrow(initobject:NoSuchElementException(NoSuchElementException::<init>))
    }
    
    public void set(java.lang.Object p0) {
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
        
        if (cmpge:boolean(getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u3d4b\u59ec\u8709\u5db4\u8413\ubff1, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), ldc:int(0))) {
            invokevirtual:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>::set, getfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u40a9\u416d\u4daf\u965f\ubb2b\ubded, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u3d4b\u59ec\u8709\u5db4\u8413\ubff1, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), p0:Object)
            invokevirtual:Object(\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>::set, getfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\uf94d\u6c56\u71ae\u40a9\u6198\u4cd9, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u3d4b\u59ec\u8709\u5db4\u8413\ubff1, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), p0:Object)
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    public void add(java.lang.Object p0) {
        var_4_64 : int
        
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
            var_4_64 = getfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae)
            invokevirtual:void(\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>::add, getfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u40a9\u416d\u4daf\u965f\ubb2b\ubded, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), var_4_64:int, p0:Object)
            invokevirtual:void(\u3a62\u516c\u836c\u74b1\u4f52\u4d85<Object>::add, getfield:\u3a62\u516c\u836c\u74b1\u4f52\u4d85(\ub113\u67e9\ube23\u7873\ua562\u71ae::\uf94d\u6c56\u71ae\u40a9\u6198\u4cd9, this:\ub113\u67e9\ube23\u7873\ua562\u71ae), var_4_64:int, p0:Object)
            putfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u71ae\u67d0\ub18d\uc910\u34df\u6c56, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, add:int(var_4_64:int, xor:int(ldc:int(8193), ldc:int(8192))))
            putfield:int(\ub113\u67e9\ube23\u7873\ua562\u71ae::\u3d4b\u59ec\u8709\u5db4\u8413\ubff1, this:\ub113\u67e9\ube23\u7873\ua562\u71ae, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void remove() {
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
            invokespecial:void(\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56::remove, this:\ub113\u67e9\ube23\u7873\ua562\u71ae[expected:\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object next() {
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
            return:Object(invokespecial:Object(\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56::next, this:\ub113\u67e9\ube23\u7873\ua562\u71ae[expected:\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56]))
        }
        
        goto(Label_0006)
    }
    
    public boolean hasNext() {
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
            return:boolean(invokespecial:boolean(\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56::hasNext, this:\ub113\u67e9\ube23\u7873\ua562\u71ae[expected:\u4e72\u3711\u4cd9\ucb79\u93a2\ubf56]))
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
    
    public void \u5fe1\u416d\u36d3\uc9f6\ub1b9\uc9f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_625 : int
        
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
        var_3_61A = and:int(ldc:int(1247566518), ldc:int(467216503))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u67e9\ube23\u7873\ua562\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(530197143))
            var_5_7D = and:int(ldc:int(14378), ldc:int(-14891))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25885), ldc:int(25876)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61A:int, ldc:int(802949767))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2352), ldc:int(2353)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-24062), ldc:int(-24061)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61A = and:int(var_3_D2:int, ldc:int(521683982))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4128), ldc:int(4129)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1308514511))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(899618891))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1743220448))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1484099783))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1238817784))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2135472743))
                    }
                    else {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1359329449))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(746712994))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1712767018))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2120250635))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-969447689))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1744405972))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1245530911))
                        var_11_E3 = and:int(ldc:int(-16933), ldc:int(16932))
                        goto(Label_1429)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1111033964))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1991852254))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1203508371))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1415660673))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1497768059))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2141697570))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1838739422))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(824212882))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1651232366))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2140842359))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(92411858))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(540368033))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(773448495))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(12), ldc:int(13))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1147631283))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1237869825))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(101682348))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1150429428))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(573372128))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-430514189))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1061125142))
                        var_11_E3 = and:int(ldc:int(25105), ldc:int(-26130))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1256784495))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(346230351))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1089459307))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1443864211))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(286968539))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2065485887))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1682400448))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1255288213))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-668024726))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-836241882))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1978045721))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1429)
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1697505253))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(377873095))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1840063365))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1438501232))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(64495371))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(-553665953))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1429:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_625 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1440:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(36222125))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(235559104))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2001768325))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1956438349))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-614282461))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-292021425))
                        var_17_625 = add:int(var_16_111:int, xor:int(ldc:int(20480), ldc:int(20481)))
                        looporswitchbreak()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(1844597830))
                }
                
                var_3_61A = and:int(var_3_61A:int, ldc:int(2140906495))
                
                if (cmple:boolean(var_5_7D = var_17_625:int, sub:int(var_6_84:int, xor:int(ldc:int(4100), ldc:int(4101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-795298331))
            goto(Label_0106)
        }
    }
}
