public final class \ud36e\u6bb9\u960f\u4c04\u64ab.\u92ff\u4179\u9033\u3bc9\u385b {
    public void \u92ff\u4179\u9033\u3bc9\u385b() {
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
            invokespecial:Object(Object::<init>, this:\u92ff\u4179\u9033\u3bc9\u385b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, java.util.Optional<java.util.UUID> p1) {
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
            
            if (invokevirtual:boolean(Optional<T>::isPresent, p1:Optional<UUID>)) {
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\ucfaf\uc31c\u9a18\u4ab3\u3d64\u72f1, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:UUID(java.util.UUID.class, invokevirtual:UUID(Optional<UUID>::get, p1:Optional<UUID>)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<java.util.UUID> \ub32d\u071d\ucef1\u6cfe\u718f\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        stack_82_0 : Optional<UUID> [generated]
        
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
            var_2_5F = and:int(ldc:int(2039855165), ldc:int(1474062651))
            
            if (invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1738538669))
                stack_82_0 = invokestatic:Optional<UUID>(Optional<T>::of, invokevirtual:UUID(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u3bc9\u62da\uc87f\ud171\u69d9\u120d, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            }
            else {
                stack_82_0 = invokestatic:Optional<UUID>(Optional<T>::empty)
            }
            
            return:Optional<UUID>(stack_82_0:Optional<UUID>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<java.util.UUID> \u99f7\ub18d\uc2bd\ub113\u7043\u3d64(java.util.Optional<java.util.UUID> p0) {
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
            return:Optional<UUID>(p0:Optional<UUID>)
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
            return:Object(invokevirtual:Optional<UUID>[expected:Object](\u92ff\u4179\u9033\u3bc9\u385b::\u99f7\ub18d\uc2bd\ub113\u7043\u3d64, this:\u92ff\u4179\u9033\u3bc9\u385b, checkcast:Optional(java.util.Optional.class, p0:Object[expected:Optional<UUID>])))
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
            return:Object(invokevirtual:Optional<UUID>[expected:Object](\u92ff\u4179\u9033\u3bc9\u385b::\ub32d\u071d\ucef1\u6cfe\u718f\u9a18, this:\u92ff\u4179\u9033\u3bc9\u385b, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
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
            invokevirtual:void(\u92ff\u4179\u9033\u3bc9\u385b::\u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9, this:\u92ff\u4179\u9033\u3bc9\u385b, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:Optional(java.util.Optional.class, p1:Object[expected:Optional<UUID>]))
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
    
    public void \ubcb0\uc246\u4ab3\uf9c5\u7049\ucef1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_636 : int
        
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
        var_3_62B = and:int(ldc:int(-594138474), ldc:int(-1923940855))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ff\u4179\u9033\u3bc9\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-341565185))
        }
        else {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-620773691))
            var_5_85 = and:int(ldc:int(-22830), ldc:int(22565))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13970), ldc:int(13841)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62B:int, ldc:int(-885037164))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4272), ldc:int(4273)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(513), ldc:int(512)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62B = and:int(var_3_D2:int, ldc:int(-1195967677))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2829), ldc:int(115)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1520095374))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-71388905))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-420679393))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1169881099))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1980607439))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1992411426))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(207894961))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1187761061))
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-644416628))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1649654862))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(849727444))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2131511639))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1703978953))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1785879943))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1829293769))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1635912353))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-885080379))
                        var_11_E3 = and:int(ldc:int(24968), ldc:int(-24971))
                        goto(Label_1464)
                    }
                    
                    Label_0597:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1316877152))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1162384134))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1927655266))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-29476482))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-583674975))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1407737246))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1485906381))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1544042288))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1726500275))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-496948824))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1988488419))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(19555754))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(854712077))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1194120677))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(96), ldc:int(97))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1877671841))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1859296938))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(441459597))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1979077874))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-403260420))
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1700796095))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-602461579))
                        var_11_E3 = and:int(ldc:int(12708), ldc:int(-12710))
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(514888243))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-464073300))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1347240352))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1868958354))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1882319602))
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-348500311))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1657570598))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(802265276))
                        goto(Label_1475)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-760369158))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(703036805))
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1526523637))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-105403693))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1464)
                    }
                    
                    Label_1340:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(967447634))
                        goto(Label_1475)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1866635887))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1452449048))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(117085052))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(-1916799186))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1464:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_636 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1475:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(801121808))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(565544321))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-342781207))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(912780181))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-895539514))
                        var_17_636 = add:int(var_16_111:int, xor:int(ldc:int(144), ldc:int(145)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62B = and:int(var_3_62B:int, ldc:int(-296078842))
                
                if (cmple:boolean(var_5_85 = var_17_636:int, sub:int(var_6_8C:int, and:int(ldc:int(17507), ldc:int(4609))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
