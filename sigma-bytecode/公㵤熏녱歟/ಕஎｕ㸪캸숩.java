public class \u516c\u3d64\u718f\ub171\u6b5f.\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229 {
    public void \u0c95\u0b8e\uff55\u3e2a\uceb8\uc229() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229, ldc:Class<\ub83f\u6c52\u12cb\u3c25\u3776>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776 \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        stack_8E_0 : int [generated]
        var_4_95 : int
        
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
        var_2_5F = and:int(ldc:int(-393827568), ldc:int(-1277805602))
        
        if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), ldc:int(2097152))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1383121987))
            stack_8E_0 = and:int[expected:boolean](ldc:int(-8319), ldc:int(8318))
        }
        else {
            stack_8E_0 = and:int[expected:boolean](ldc:int(2433), ldc:int(8267))
        }
        
        invokestatic:void(Preconditions::checkArgument, stack_8E_0:boolean, ldc:String("Cannot read NBT (got %s bytes)"), invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf))
        var_4_95 = invokevirtual:int(ByteBuf::readerIndex, p0:ByteBuf)
        
        if (cmpne:boolean(invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf), ldc:byte(0))) {
            invokevirtual:ByteBuf(ByteBuf::readerIndex, p0:ByteBuf, var_4_95:int)
            return:\ub83f\u6c52\u12cb\u3c25\u3776(checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokestatic:\uc2bd\u5fe1\uc29a\u5140\ud171[expected:\ub83f\u6c52\u12cb\u3c25\u3776](\u0c95\u34df\u71f1\u56bd\u4f52::\u9af2\ub171\u71f1\u0800\u51b2\u92ff, initobject:ByteBufInputStream[expected:DataInput](ByteBufInputStream::<init>, p0:ByteBuf))))
        }
        
        return:\ub83f\u6c52\u12cb\u3c25\u3776(aconstnull:\ub83f\u6c52\u12cb\u3c25\u3776())
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776 p1) {
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
            var_3_5F = and:int(ldc:int(-1010483649), ldc:int(-269536626))
            
            if (cmpne:boolean(p1:\ub83f\u6c52\u12cb\u3c25\u3776, aconstnull:\ub83f\u6c52\u12cb\u3c25\u3776())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-371196186))
                invokestatic:void(\u0c95\u34df\u71f1\u56bd\u4f52::\u3d64\u4d85\u3d4b\u69d9\u3e2a\u1187, initobject:ByteBufOutputStream[expected:DataOutput](ByteBufOutputStream::<init>, p0:ByteBuf), p1:\ub83f\u6c52\u12cb\u3c25\u3776[expected:\uc2bd\u5fe1\uc29a\u5140\ud171])
            }
            else {
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, and:int(ldc:int(-12684), ldc:int(12683)))
            }
            
            return:void()
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
            return:Object(invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776[expected:Object](\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229, p0:ByteBuf))
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
            invokevirtual:void(\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229, p0:ByteBuf, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, p1:Object[expected:\ub83f\u6c52\u12cb\u3c25\u3776]))
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
            invokestatic:void(\u3d4b\uc238\ubcb0\u67e9\u5d20::\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, ldc:int(60))
            invokestatic:void(\u3d4b\uc238\ubcb0\u67e9\u5d20::\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, ldc:int(61))
            invokestatic:void(\u3d4b\uc238\ubcb0\u67e9\u5d20::\u6fb0\u93a2\u8350\u3a62\u760c\ucfaf, ldc:int(65))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FB : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_606 : int
        
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
        var_3_5FB = and:int(ldc:int(1797049548), ldc:int(2138459532))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-325279398))
        }
        else {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(2075485767))
            var_5_85 = and:int(ldc:int(-22473), ldc:int(21384))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28521), ldc:int(28448)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FB:int, ldc:int(-11054179))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8225), ldc:int(19541)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1062), ldc:int(1063)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FB = and:int(var_3_DA:int, ldc:int(2140567333))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(85), ldc:int(31497)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-828924321))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1355744240))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-712450341))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1650752722))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-6993580))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1907111928))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(319690255))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2092523141))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1207364810))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(2098685831))
                            var_11_EB = and:int(ldc:int(-25089), ldc:int(25088))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2108971))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1201879696))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1663868896))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(547987906))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-14877532))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(280781152))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1113181368))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(73179996))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1938198686))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-958634808))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(219804329))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-467899054))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2069878053))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1883189741))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1392686457))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2048517947))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1652377476))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-266195672))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1129339352))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1467321559))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2103375578))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(13314), ldc:int(13315))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1320154285))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-318497368))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-384370316))
                        var_11_EB = and:int(ldc:int(20400), ldc:int(-20409))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(842123420))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1591879810))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-281171546))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1781184863))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-8986165))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-239510095))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-356977579))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-87514279))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1767860967))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1407)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(399893249))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-2059230))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1272789873))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FB = and:int(var_3_5FB:int, ldc:int(-338207727))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_606 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1221482883))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1387121267))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(2027463771))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(402746134))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-384415855))
                        var_17_606 = add:int(var_16_119:int, xor:int(ldc:int(-32731), ldc:int(-32732)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1278749478))
                }
                
                var_3_5FB = and:int(var_3_5FB:int, ldc:int(2145184167))
                
                if (cmple:boolean(var_5_85 = var_17_606:int, sub:int(var_6_8C:int, xor:int(ldc:int(18690), ldc:int(18691))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1361251174))
            goto(Label_0106)
        }
    }
}
