public class \u6b0d\u12cb\u156b\u4179\u8bb0.\uc31c\u8df4\u8258\u759a\u7af6\u9033 {
    public void \uc31c\u8df4\u8258\u759a\u7af6\u9033() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\uc31c\u8df4\u8258\u759a\u7af6\u9033, ldc:Class<UUID>(java.util.UUID.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        expr_67 : int[] [generated]
        
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
            expr_67 = newarray:int[](int.class, and:int(ldc:int(156), ldc:int(5124)))
            storeelement:int(expr_67:int[], and:int(ldc:int(-19962), ldc:int(19641)), invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
            storeelement:int(expr_67:int[], and:int(ldc:int(599), ldc:int(2081)), invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
            storeelement:int(expr_67:int[], and:int(ldc:int(20002), ldc:int(155)), invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
            storeelement:int(expr_67:int[], xor:int(ldc:int(5169), ldc:int(5170)), invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
            return:UUID(invokestatic:UUID(\uc31c\u8df4\u8258\u759a\u7af6\u9033::\u3a62\uc910\ufcaf\ud217\ucb79\u5fe1, expr_67:int[]))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.util.UUID p1) {
        var_5_64 : int[]
        
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
            var_5_64 = invokestatic:int[](\uc31c\u8df4\u8258\u759a\u7af6\u9033::\u6d99\ud158\u0b8e\u16f6\u7d52\u8308, p1:UUID)
            invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, loadelement:int(var_5_64:int[], and:int(ldc:int(6834), ldc:int(-6847))))
            invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, loadelement:int(var_5_64:int[], xor:int(ldc:int(129), ldc:int(128))))
            invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, loadelement:int(var_5_64:int[], and:int(ldc:int(11498), ldc:int(20487))))
            invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, loadelement:int(var_5_64:int[], and:int(ldc:int(12699), ldc:int(18979))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.UUID \u3a62\uc910\ufcaf\ud217\ucb79\u5fe1(int[] p0) {
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
            return:UUID(initobject:UUID(UUID::<init>, or:long(shl:long(i2l:long(loadelement:int(p0:int[], and:int(ldc:int(-19139), ldc:int(19138)))), ldc:int(32)), and:long(i2l:long(loadelement:int(p0:int[], xor:int(ldc:int(-24576), ldc:int(-24575)))), ldc:long(4294967295L))), or:long(shl:long(i2l:long(loadelement:int(p0:int[], and:int(ldc:int(1894), ldc:int(18442)))), ldc:int(32)), and:long(i2l:long(loadelement:int(p0:int[], and:int(ldc:int(2099), ldc:int(5643)))), ldc:long(4294967295L)))))
        }
        
        goto(Label_0006)
    }
    
    public static int[] \u6d99\ud158\u0b8e\u16f6\u7d52\u8308(java.util.UUID p0) {
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
            return:int[](invokestatic:int[](\uc31c\u8df4\u8258\u759a\u7af6\u9033::\u5140\u7bad\u516c\uc2bd\u4f4a\u4c2b, invokevirtual:long(UUID::getMostSignificantBits, p0:UUID), invokevirtual:long(UUID::getLeastSignificantBits, p0:UUID)))
        }
        
        goto(Label_0006)
    }
    
    public static int[] \u5140\u7bad\u516c\uc2bd\u4f4a\u4c2b(long p0, long p1) {
        expr_6A : int[] [generated]
        
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
            expr_6A = newarray:int[](int.class, and:int(ldc:int(20740), ldc:int(1213)))
            storeelement:int(expr_6A:int[], and:int(ldc:int(23636), ldc:int(-24191)), l2i:int(shr:long(p0:long, ldc:int(32))))
            storeelement:int(expr_6A:int[], and:int(ldc:int(22923), ldc:int(5)), l2i:int(p0:long))
            storeelement:int(expr_6A:int[], xor:int(ldc:int(265), ldc:int(267)), l2i:int(shr:long(p1:long, ldc:int(32))))
            storeelement:int(expr_6A:int[], and:int(ldc:int(4387), ldc:int(147)), l2i:int(p1:long))
            return:int[](expr_6A:int[])
        }
        
        goto(Label_0006)
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
            return:Object(invokevirtual:UUID[expected:Object](\uc31c\u8df4\u8258\u759a\u7af6\u9033::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\uc31c\u8df4\u8258\u759a\u7af6\u9033, p0:ByteBuf))
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
            invokevirtual:void(\uc31c\u8df4\u8258\u759a\u7af6\u9033::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\uc31c\u8df4\u8258\u759a\u7af6\u9033, p0:ByteBuf, checkcast:UUID(java.util.UUID.class, p1:Object[expected:UUID]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_638 : int
        
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
        var_3_62D = and:int(ldc:int(-1098953635), ldc:int(-19976705))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc31c\u8df4\u8258\u759a\u7af6\u9033[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(2025737947))
        }
        else {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-1694550449))
            var_5_85 = and:int(ldc:int(22580), ldc:int(-23861))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19605), ldc:int(-24222)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62D:int, ldc:int(-212338307))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2131), ldc:int(16937)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(25729), ldc:int(593)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_DA:int, ldc:int(-1150346753))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1006680003))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2120621503))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1062036687))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1460579068))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(940831937))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-242393507))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-428876849))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1827403677))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(784110470))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(108201816))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1524279488))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1903818266))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1479586739))
                        var_11_EB = and:int(ldc:int(2374), ldc:int(-10567))
                        goto(Label_1439)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-674117160))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(69532713))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1959609734))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1916125433))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1756398083))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-690745019))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1319196153))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1502335559))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2071915755))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1963999281))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1820901408))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1422835344))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(623278172))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(393864535))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(932997428))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-233644122))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2014370451))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(615), ldc:int(25))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1577339758))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1373947063))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1877198969))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1947016397))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-839376821))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-84958385))
                        var_11_EB = and:int(ldc:int(-21102), ldc:int(17004))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-619786718))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1378502204))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1890350603))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-570559200))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2013318819))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(855490373))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-458098302))
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(943014000))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-796465948))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2131260473))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1640685671))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1277699217))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1439)
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1705307100))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1919089791))
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(-1754827795))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(299772447))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1137634790))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1992578576))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-410638311))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(326621117))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-989616905))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-667428303))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-213390995))
                        var_17_638 = add:int(var_16_119:int, and:int(ldc:int(2833), ldc:int(8297)))
                        looporswitchbreak()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(1178584106))
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-2109267585))
                
                if (cmple:boolean(var_5_85 = var_17_638:int, sub:int(var_6_8C:int, and:int(ldc:int(4257), ldc:int(8257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-1731521465))
            goto(Label_0106)
        }
    }
}
