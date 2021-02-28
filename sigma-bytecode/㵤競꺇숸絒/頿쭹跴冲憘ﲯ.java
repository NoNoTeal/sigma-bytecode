public class \u3d64\u7af6\uae87\uc238\u7d52.\u983f\ucb79\u8df4\u51b2\u6198\ufcaf {
    public void \u983f\ucb79\u8df4\u51b2\u6198\ufcaf() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, ldc:String("VarLong"), ldc:Class<Long>(java.lang.Long.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \u3bc9\ua3b4\u6cfe\u7043\u61a4\u9033(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_61 : long
        var_6_6A : int
        var_2_70 : int
        var_7_75 : byte
        
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
        var_2_5F = and:int(ldc:int(1867873081), ldc:int(-1048782065))
        var_4_61 = ldc:long(0L)
        var_6_6A = and:int(ldc:int(-998), ldc:int(965))
        
        loop {
            var_2_70 = and:int(var_2_5F:int, ldc:int(1516584891))
            var_7_75 = invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf)
            var_4_61 = or:long(var_4_61:long, shl:long(i2l:long(and:byte(var_7_75:byte, ldc:byte(127))), mul:int(postincrement:int(1, var_6_6A:int), ldc:int(7))))
            
            if (cmpgt:boolean(var_6_6A:int, ldc:int(10))) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, ldc:String("VarLong too big")))
            }
            
            var_2_5F = and:int(var_2_70:int, ldc:int(1703305201))
            
            if (cmpeq:boolean(and:int(var_7_75:byte[expected:int], and:int(ldc:int(396), ldc:int(8402))), xor:int(ldc:int(16579), ldc:int(16451)))) {
                loopcontinue()
            }
            
            return:long(var_4_61:long)
        }
    }
    
    public void \u7049\ubff1\ub7dc\u183a\u4c2b\u3e75(io.netty.buffer.ByteBuf p0, long p1) {
        var_4_61 : int
        var_4_68 : int
        var_6_70 : int
        
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
            var_4_61 = and:int(ldc:int(1435878153), ldc:int(1754600367))
            
            loop {
                var_4_68 = and:int(var_4_61:int, ldc:int(-1314413843))
                var_6_70 = l2i:int(and:long(p1:long, ldc:long(127L)))
                p1 = ushr:long(p1:long, ldc:int(7))
                
                if (cmpne:boolean(p1:long, ldc:long(0L))) {
                    var_6_70 = or:int(var_6_70:int, and:int(ldc:int(24768), ldc:int(4234)))
                }
                
                var_4_61 = and:int(var_4_68:int, ldc:int(-1227535809))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, var_6_70:int)
                
                if (cmpne:boolean(p1:long, ldc:long(0L))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Long \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Long(invokestatic:Long(Long::valueOf, invokevirtual:long(\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u3bc9\ua3b4\u6cfe\u7043\u61a4\u9033, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, p0:ByteBuf)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Long p1) {
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
            invokevirtual:void(\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u7049\ubff1\ub7dc\u183a\u4c2b\u3e75, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, p0:ByteBuf, invokevirtual:long(Long::longValue, p1:Long))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Long \u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4(java.lang.Object p0) {
        var_2_D3 : int
        stack_E2_0 : long [generated]
        
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
        var_2_D3 = and:int(ldc:int(-27327328), ldc:int(2128434321))
        
        if (logicalnot:boolean(instanceof:boolean(java.lang.Number.class, p0:Object))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-1604030320))
                    goto(Label_0193)
                }
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(16)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-142662065))
                    
                    if (instanceof:boolean(java.lang.Boolean.class, p0:Object)) {
                        if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, p0:Object[expected:Boolean])))) {
                            goto(Label_0193)
                        }
                        
                        stack_E2_0 = ldc:long(1L)
                        looporswitchbreak()
                    }
                }
                
                Label_0137:
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(262144)), ldc:int(0))) {
                        return:Long(checkcast:Long(java.lang.Long.class, p0:Object[expected:Long]))
                    }
                    
                    loopcontinue()
                }
                
                Label_0193:
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0137)
                }
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-218147485))
                    stack_E2_0 = ldc:long(0L)
                    looporswitchbreak()
                }
            }
            
            return:Long(invokestatic:Long(Long::valueOf, stack_E2_0:long))
        }
        
        return:Long(invokestatic:Long(Long::valueOf, invokevirtual:long(Number::longValue, checkcast:Number(java.lang.Number.class, p0:Object[expected:Number]))))
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:Long[expected:Object](\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, p0:ByteBuf, checkcast:Long(java.lang.Long.class, p1:Object[expected:Long]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4(java.lang.Object p0) {
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
            return:Object(invokevirtual:Long[expected:Object](\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf, p0:Object))
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_617 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_622 : int
        
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
        var_3_617 = and:int(ldc:int(-111872753), ldc:int(-312481924))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
            var_3_617 = and:int(var_3_617:int, ldc:int(-2005743229))
        }
        else {
            var_3_617 = and:int(var_3_617:int, ldc:int(-539038535))
            var_5_85 = and:int(ldc:int(-31392), ldc:int(30879))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21195), ldc:int(21194)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_617:int, ldc:int(-539646673))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(16389), ldc:int(13363)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-16367), ldc:int(-16368)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_617 = and:int(var_3_D2:int, ldc:int(-1050827653))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(680), ldc:int(681)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1139199532))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(144787360))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-780667442))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(2016190991))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-45764942))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(461158086))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1027083120))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-537462919))
                            var_11_E3 = and:int(ldc:int(27661), ldc:int(-28384))
                            goto(Label_1426)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(217875918))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(598267879))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1358275849))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(192521931))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-537543426))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1976308441))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(568519200))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-2061031924))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-999100443))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-511776838))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-297280067))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(228307825))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(590777546))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(1323205398))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1796732313))
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-69813154))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(8961), ldc:int(8960))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-406611461))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1167895694))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(1499063491))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(237753691))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1711428183))
                        var_11_E3 = and:int(ldc:int(9177), ldc:int(-13312))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-652370853))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1621782687))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(42023300))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-133569318))
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-503321345))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1266681279))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-649990685))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-743626372))
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-596296416))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(115356611))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-1207671913))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(-368255707))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_617 = and:int(var_3_617:int, ldc:int(66370920))
                            loopcontinue()
                        }
                        
                        var_3_617 = and:int(var_3_617:int, ldc:int(-413664071))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1426)
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1049822491))
                        goto(Label_1437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-1052139133))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-722353599))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(1792900768))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(699741662))
                        loopcontinue()
                    }
                    
                    var_3_617 = and:int(var_3_617:int, ldc:int(-1485378184))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1426:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_622 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1437:
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-85095776))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-440890055))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-503192686))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(2037467253))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_617:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-80751405))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_617:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_617 = and:int(var_3_617:int, ldc:int(-2046909013))
                        var_17_622 = add:int(var_16_111:int, xor:int(ldc:int(10240), ldc:int(10241)))
                        looporswitchbreak()
                    }
                    
                    var_3_617 = and:int(var_3_617:int, ldc:int(-1529231250))
                }
                
                var_3_617 = and:int(var_3_617:int, ldc:int(-1351172900))
                
                if (cmple:boolean(var_5_85 = var_17_622:int, sub:int(var_6_8C:int, xor:int(ldc:int(36), ldc:int(37))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_617:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
