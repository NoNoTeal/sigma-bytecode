public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uceb8\u4c2b\ub8be\u7049\u8308\u3a62 {
    public void \uceb8\u4c2b\ub8be\u7049\u8308\u3a62() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, ldc:String("VarInt"), ldc:Class<Integer>(java.lang.Integer.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_67 : int
        var_5_70 : int
        var_2_76 : int
        var_6_7B : byte
        
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
        var_2_5F = and:int(ldc:int(-1828457695), ldc:int(301281598))
        var_4_67 = and:int(ldc:int(-11265), ldc:int(11264))
        var_5_70 = and:int(ldc:int(-31881), ldc:int(14472))
        
        loop {
            var_2_76 = and:int(var_2_5F:int, ldc:int(1945369147))
            var_6_7B = invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf)
            var_4_67 = or:int(var_4_67:int, shl:int(and:byte(var_6_7B:byte, ldc:byte(127)), mul:int(postincrement:int(1, var_5_70:int), ldc:int(7))))
            
            if (cmpgt:boolean(var_5_70:int, xor:int(ldc:int(17163), ldc:int(17166)))) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, ldc:String("VarInt too big")))
            }
            
            var_2_5F = and:int(var_2_76:int, ldc:int(-1225950721))
            
            if (cmpeq:boolean(and:int(var_6_7B:byte[expected:int], and:int(ldc:int(16528), ldc:int(2435))), xor:int(ldc:int(17489), ldc:int(17617)))) {
                loopcontinue()
            }
            
            return:int(var_4_67:int)
        }
    }
    
    public void \u0c95\u6435\u3504\u36d3\u2dcc\u16f6(io.netty.buffer.ByteBuf p0, int p1) {
        var_3_5F : int
        var_3_64 : int
        var_5_69 : int
        
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
            var_3_5F = and:int(ldc:int(-855414292), ldc:int(-306984026))
            
            loop {
                var_3_64 = and:int(var_3_5F:int, ldc:int(96689583))
                var_5_69 = and:int(p1:int, ldc:int(127))
                p1 = ushr:int(p1:int, ldc:int(7))
                
                if (cmpne:boolean(p1:int, ldc:int(0))) {
                    var_5_69 = or:int(var_5_69:int, and:int(ldc:int(21696), ldc:int(2176)))
                }
                
                var_3_5F = and:int(var_3_64:int, ldc:int(-1582863114))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, var_5_69:int)
                
                if (cmpne:boolean(p1:int, ldc:int(0))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Integer \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:ByteBuf)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Integer p1) {
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
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:ByteBuf, invokevirtual:int(Integer::intValue, p1:Integer))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Integer \u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4(java.lang.Object p0) {
        var_2_DB : int
        stack_F6_0 : int [generated]
        
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
        var_2_DB = and:int(ldc:int(2058685233), ldc:int(-621426049))
        
        if (logicalnot:boolean(instanceof:boolean(java.lang.Number.class, p0:Object))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_DB:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0193)
                }
                
                if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_DB = and:int(var_2_DB:int, ldc:int(2142595711))
                    
                    if (instanceof:boolean(java.lang.Boolean.class, p0:Object)) {
                        if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, p0:Object[expected:Boolean])))) {
                            goto(Label_0193)
                        }
                        
                        stack_F6_0 = xor:int(ldc:int(1320), ldc:int(1321))
                        looporswitchbreak()
                    }
                }
                
                Label_0129:
                
                if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_DB = and:int(var_2_DB:int, ldc:int(-1144853493))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(262144)), ldc:int(0))) {
                        return:Integer(checkcast:Integer(java.lang.Integer.class, p0:Object[expected:Integer]))
                    }
                    
                    loopcontinue()
                }
                
                Label_0193:
                
                if (cmpeq:boolean(and:int(var_2_DB:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0129)
                }
                
                if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_DB = and:int(var_2_DB:int, ldc:int(-4871199))
                    stack_F6_0 = and:int(ldc:int(-7512), ldc:int(3410))
                    looporswitchbreak()
                }
                
                var_2_DB = and:int(var_2_DB:int, ldc:int(-285209434))
            }
            
            return:Integer(invokestatic:Integer(Integer::valueOf, stack_F6_0:int))
        }
        
        return:Integer(invokestatic:Integer(Integer::valueOf, invokevirtual:int(Number::intValue, checkcast:Number(java.lang.Number.class, p0:Object[expected:Number]))))
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
            return:Object(invokevirtual:Integer[expected:Object](\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:ByteBuf))
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
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:ByteBuf, checkcast:Integer(java.lang.Integer.class, p1:Object[expected:Integer]))
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
            return:Object(invokevirtual:Integer[expected:Object](\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u9033\u7c6b\u647c\ufcaf\ubcb0\u98a4, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:Object))
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5E0 : int
        
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
        var_3_5D5 = and:int(ldc:int(-309799045), ldc:int(793676635))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(764238987))
        }
        else {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1532834641))
            var_5_85 = and:int(ldc:int(-183), ldc:int(182))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10677), ldc:int(10676)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5D5:int, ldc:int(428710365))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(9289), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-24319), ldc:int(-24320)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5D5 = and:int(var_3_DA:int, ldc:int(218936218))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(33), ldc:int(32)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-886189852))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(501423579))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(821468639))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(9946803))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-878787621))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-121134544))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1269555135))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(170800391))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-98616770))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(100544557))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1864067952))
                        var_11_EB = and:int(ldc:int(1797), ldc:int(-1798))
                        goto(Label_1396)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-466427237))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(303825079))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1225520231))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(888694363))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1402518398))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-604870126))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1499077908))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-290756892))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1800422936))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1124593435))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1761577275))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-149917487))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1928491141))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-125825164))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1483447059))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(2193), ldc:int(2192))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(953284677))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-823498943))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(930991013))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1214578098))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1545345070))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(250303766))
                        var_11_EB = and:int(ldc:int(-20468), ldc:int(3058))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-947978727))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1195813093))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1277)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1733527031))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-813805587))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-756421732))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(111083645))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1270735538))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2140869187))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1106340878))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1396)
                    }
                    
                    Label_1277:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1415507198))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1069725716))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1597209135))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(174925685))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1396:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1407:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2074031670))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1936522260))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-380058306))
                        var_17_5E0 = add:int(var_16_119:int, xor:int(ldc:int(1025), ldc:int(1024)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1335820123))
                
                if (cmple:boolean(var_5_85 = var_17_5E0:int, sub:int(var_6_8C:int, and:int(ldc:int(641), ldc:int(13))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1578679546))
            goto(Label_0106)
        }
    }
}
