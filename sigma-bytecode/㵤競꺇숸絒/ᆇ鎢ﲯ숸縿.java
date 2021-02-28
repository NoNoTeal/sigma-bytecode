public final class \u3d64\u7af6\uae87\uc238\u7d52.\u1187\u93a2\ufcaf\uc238\u7e3f {
    public void \u1187\u93a2\ufcaf\uc238\u7e3f() {
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
            invokespecial:Object(Object::<init>, this:\u1187\u93a2\ufcaf\uc238\u7e3f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p1) {
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
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:boolean(Optional::isPresent, p1:Optional))
            
            if (invokevirtual:boolean(Optional<T>::isPresent, p1:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uae5d\u7330\ua3b4\u3bc9\u3a62\ud51e, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, p1:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        stack_82_0 : Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> [generated]
        
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
            var_2_5F = and:int(ldc:int(1058631986), ldc:int(-1111825890))
            
            if (invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-48694246))
                stack_82_0 = invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::of, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6ec6\u7af6\ua6bd\uc29a\u56bd\ufcaf, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            }
            else {
                stack_82_0 = invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty)
            }
            
            return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(stack_82_0:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p0) {
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
            return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(p0:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)
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
            return:Object(invokevirtual:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Object](\u1187\u93a2\ufcaf\uc238\u7e3f::\u99f7\ub18d\uc2bd\ub113\u7043\u3d64, this:\u1187\u93a2\ufcaf\uc238\u7e3f, checkcast:Optional(java.util.Optional.class, p0:Object[expected:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>])))
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
            return:Object(invokevirtual:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Object](\u1187\u93a2\ufcaf\uc238\u7e3f::\ub32d\u071d\ucef1\u6cfe\u718f\u9a18, this:\u1187\u93a2\ufcaf\uc238\u7e3f, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u1187\u93a2\ufcaf\uc238\u7e3f::\u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9, this:\u1187\u93a2\ufcaf\uc238\u7e3f, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:Optional(java.util.Optional.class, p1:Object[expected:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>]))
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
    
    public void \ube23\u51fa\ucef1\u183a\u6d99\ubefe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(-2123301287), ldc:int(-1837566945))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\u93a2\ufcaf\uc238\u7e3f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(1848344777))
        }
        else {
            var_3_636 = and:int(var_3_636:int, ldc:int(-181338213))
            var_5_85 = and:int(ldc:int(23069), ldc:int(-23070))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8942), ldc:int(8397)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_636:int, ldc:int(-564527267))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-16252), ldc:int(-16251)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(10250), ldc:int(10251)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_D2:int, ldc:int(-2139426405))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-15344), ldc:int(-15343)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1595992233))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1422847571))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1317223227))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(329934691))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1363430599))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1341835321))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-105327026))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(206625848))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1133612994))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-818580839))
                            var_11_E3 = and:int(ldc:int(30753), ldc:int(-30754))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1399194920))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1968293997))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(201066777))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2098418970))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-728028222))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-916847436))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-233676490))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-973883781))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1052294448))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(2004871446))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(2064708973))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(871533199))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-710315217))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-42123907))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1363398756))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1971925567))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1959390750))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1306568914))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-655080880))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-463783617))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(10249), ldc:int(10248))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(195178799))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-2088880931))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1049750489))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-747874287))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1957463685))
                        var_11_E3 = and:int(ldc:int(-11249), ldc:int(2784))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1372368333))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(533845592))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1151187384))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1743456485))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(374189775))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-478076927))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-962758875))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(707202012))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-563702914))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-359368995))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1439)
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-863244568))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-777293130))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1621733858))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1145539118))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1023056467))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1847990483))
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-256673441))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1436178533))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(9183675))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(707514575))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1008730284))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-281467452))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-291725066))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1143482355))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-43171843))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1642692901))
                        var_17_641 = add:int(var_16_111:int, and:int(ldc:int(20653), ldc:int(2065)))
                        looporswitchbreak()
                    }
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(-371983235))
                
                if (cmple:boolean(var_5_85 = var_17_641:int, sub:int(var_6_8C:int, xor:int(ldc:int(17442), ldc:int(17443))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
