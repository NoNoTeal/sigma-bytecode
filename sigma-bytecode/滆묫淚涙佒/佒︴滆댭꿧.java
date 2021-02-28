public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4f52\ufe34\u6ec6\ub32d\uafe7 {
    public void \u4f52\ufe34\u6ec6\ub32d\uafe7(int p0) {
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
            invokespecial:ByteToMessageDecoder(ByteToMessageDecoder::<init>, this:\u4f52\ufe34\u6ec6\ub32d\uafe7)
            putfield:int(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\u071d\u56bd\ua61f\u64f2\u0800, this:\u4f52\ufe34\u6ec6\ub32d\uafe7, p0:int)
            putfield:Inflater(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\uf995\ube23\u4ab3\u56bd\u0a06, this:\u4f52\ufe34\u6ec6\ub32d\uafe7, initobject:Inflater(Inflater::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void decode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, java.util.List<java.lang.Object> p2) {
        var_4_99 : int
        var_6_7E : \u98a4\uafe7\uc3e3\ua6bd\u8640
        var_7_85 : int
        var_4_BB : int
        var_8_D2 : byte[]
        var_9_E9 : byte[]
        
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
            var_4_99 = and:int(ldc:int(-1546336873), ldc:int(-1158414443))
            
            if (cmpne:boolean(invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf), ldc:int(0))) {
                var_6_7E = initobject:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::<init>, p1:ByteBuf)
                var_7_85 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, var_6_7E:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                
                if (cmpne:boolean(var_7_85:int, ldc:int(0))) {
                    loop {
                        if (cmpeq:boolean(and:int(var_4_99:int, ldc:int(131072)), ldc:int(0))) {
                            var_4_99 = and:int(var_4_99:int, ldc:int(553183198))
                            
                            if (cmplt:boolean(var_7_85:int, getfield:int(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\u071d\u56bd\ua61f\u64f2\u0800, this:\u4f52\ufe34\u6ec6\ub32d\uafe7))) {
                                athrow(initobject:DecoderException(DecoderException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4f52\ufe34\u6ec6\ub32d\uafe7::\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b), and:int(ldc:int(27749), ldc:int(-27750)))), var_7_85:int), loadelement:String(getstatic:String[](\u4f52\ufe34\u6ec6\ub32d\uafe7::\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b), and:int(ldc:int(20515), ldc:int(1029)))), getfield:int(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\u071d\u56bd\ua61f\u64f2\u0800, this:\u4f52\ufe34\u6ec6\ub32d\uafe7)))))
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_4_99:int, ldc:int(524288)), ldc:int(0))) {
                            var_4_99 = and:int(var_4_99:int, ldc:int(-2050651823))
                        }
                        else {
                            var_4_BB = and:int(var_4_99:int, ldc:int(973037006))
                            
                            if (cmple:boolean(var_7_85:int, ldc:int(2097152))) {
                                var_4_99 = and:int(var_4_BB:int, ldc:int(687362012))
                                var_8_D2 = newarray:byte[](byte.class, invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::readableBytes, var_6_7E:\u98a4\uafe7\uc3e3\ua6bd\u8640))
                                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBytes, var_6_7E:\u98a4\uafe7\uc3e3\ua6bd\u8640, var_8_D2:byte[])
                                invokevirtual:void(Inflater::setInput, getfield:Inflater(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\uf995\ube23\u4ab3\u56bd\u0a06, this:\u4f52\ufe34\u6ec6\ub32d\uafe7), var_8_D2:byte[])
                                var_9_E9 = newarray:byte[](byte.class, var_7_85:int)
                                invokevirtual:int(Inflater::inflate, getfield:Inflater(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\uf995\ube23\u4ab3\u56bd\u0a06, this:\u4f52\ufe34\u6ec6\ub32d\uafe7), var_9_E9:byte[])
                                invokeinterface:boolean(List<ByteBuf>::add, p2:List<ByteBuf>, invokestatic:ByteBuf(Unpooled::wrappedBuffer, var_9_E9:byte[]))
                                invokevirtual:void(Inflater::reset, getfield:Inflater(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\uf995\ube23\u4ab3\u56bd\u0a06, this:\u4f52\ufe34\u6ec6\ub32d\uafe7))
                                looporswitchbreak()
                            }
                            
                            athrow(initobject:DecoderException(DecoderException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4f52\ufe34\u6ec6\ub32d\uafe7::\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b), and:int(ldc:int(-16495), ldc:int(16494)))), var_7_85:int), loadelement:String(getstatic:String[](\u4f52\ufe34\u6ec6\ub32d\uafe7::\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b), and:int(ldc:int(142), ldc:int(9314)))), ldc:int(2097152)))))
                        }
                    }
                }
                else {
                    invokeinterface:boolean(List<ByteBuf>::add, p2:List<ByteBuf>, invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBytes, var_6_7E:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::readableBytes, var_6_7E:\u98a4\uafe7\uc3e3\ua6bd\u8640)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0b8e\u7330\u3e75\u4d85\u7330\ub32d(int p0) {
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
            putfield:int(\u4f52\ufe34\u6ec6\ub32d\uafe7::\ubded\u071d\u56bd\ua61f\u64f2\u0800, this:\u4f52\ufe34\u6ec6\ub32d\uafe7, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A6 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_16F_0 : byte[] [generated]
        stack_1CF_0 : byte[] [generated]
        stack_23C_0 : byte[] [generated]
        var_4_152 : int
        var_3_157 : byte[]
        var_5_158 : int
        expr_175 : byte [generated]
        var_0_1C5 : int
        expr_1CF : byte [generated]
        stack_20B_2 : byte [generated]
        stack_1EA_0 : byte [generated]
        expr_8F : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_22B : byte[]
        var_5_22C : int
        var_3_E2 : String
        stack_14B_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_A6 = and:int(ldc:int(1191386446), ldc:int(512075262))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_16F_0 = stack_1CF_0 = stack_23C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lGIyWTz84/yzWuAoYbzpcRmgqCLoIW/jbb+d4f8urGIyWaJvYG8tcRmgqG5xGKE8bWPuqKJ9n2Go52i8o7/Y4f8eJOX8o3Hb/KIt/DzoIa0o/Z2haDyjLvGqYdjgL2D63uH/LpQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_152 = expr_6B:int
        var_3_157 = newarray:byte[](byte.class, expr_6B:int)
        var_5_158 = expr_6B:int
        Label_0346:
        
        while (cmpne:boolean(and:int(var_0_A6:int, ldc:int(1024)), ldc:int(0))) {
            var_0_A6 = and:int(var_0_A6:int, ldc:int(1059933427))
            var_5_158 = add:int(var_5_158:int, ldc:int(-1))
            expr_175 = add:byte(xor:byte(loadelement:byte(stack_16F_0:byte[], var_5_158:int), ldc:byte(12)), ldc:byte(95))
            storeelement:byte(var_3_157:byte[], var_5_158:int, or:int(and:int(shl:int(expr_175:byte, and:int(ldc:int(17751), ldc:int(12))), ldc:int(-16)), and:int(shr:int(expr_175:byte[expected:int], xor:int(ldc:int(25601), ldc:int(25605))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_158:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_16F_0 = stack_1CF_0 = stack_23C_0 = var_3_157:byte[]
            goto(Label_0112)
        }
        
        Label_0442:
        
        while (cmpne:boolean(and:int(var_0_A6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_A6:int, ldc:int(2131470298))
            var_5_158 = add:int(var_5_158:int, ldc:int(-1))
            expr_1CF = stack_20B_2 = loadelement(stack_1CF_0, var_5_158)
            
            if (cmplt:boolean(add:int(add:int(var_5_158:int, ldc:int(1)), neg:int(var_4_152:int)), ldc:int(0))) {
                stack_20B_2 = stack_1EA_0 = add:byte(expr_1CF:byte, loadelement:byte(var_3_157:byte[], add:int(var_5_158:int, ldc:int(1))))
                goto(Label_0506)
            }
            
            Label_0476:
            
            if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(524288)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(1462759039))
                stack_20B_2 = stack_1EA_0 = add:byte(expr_1CF:byte, ldc:byte(1))
            }
            
            Label_0506:
            
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0476)
            }
            
            var_0_A6 = and:int(var_0_1C5:int, ldc:int(1583566591))
            storeelement:byte(var_3_157:byte[], var_5_158:int, stack_20B_2:byte)
            
            if (cmpne:boolean(var_5_158:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_16F_0 = stack_1CF_0 = stack_23C_0 = var_3_157:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0346)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_A6:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_A6:int, ldc:int(512)), ldc:int(0))) {
            var_0_A6 = and:int(var_0_A6:int, ldc:int(1168618971))
        }
        else {
            var_0_A6 = and:int(var_0_A6:int, ldc:int(-28713105))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_152 = expr_8F:int
                var_3_157 = newarray:byte[](byte.class, expr_8F:int)
                var_5_158 = expr_8F:int
                goto(Label_0442)
            }
        }
        
        Label_0148:
        
        if (cmpeq:boolean(and:int(var_0_A6:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_A6:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_A6 = and:int(var_0_A6:int, ldc:int(1847707210))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_22B = newarray:byte[](byte.class, expr_AD:int)
                var_5_22C = expr_AD:int
                
                loop {
                    var_0_A6 = and:int(var_0_A6:int, ldc:int(-1232532261))
                    var_5_22C = add:int(var_5_22C:int, ldc:int(-1))
                    storeelement:byte(var_3_22B:byte[], var_5_22C:int, add:int(shl:int(loadelement:byte(stack_23C_0:byte[], var_5_22C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_22C:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), ldc:int(2)), and:int(ldc:int(4671), ldc:int(8511)))))
                    
                    if (cmpne:boolean(var_5_22C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_16F_0 = stack_1CF_0 = stack_23C_0 = var_3_22B:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_A6:int, ldc:int(8192)), ldc:int(0))) {
            var_0_A6 = and:int(var_0_A6:int, ldc:int(-972106144))
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_A6:int, ldc:int(1024)), ldc:int(0))) {
            var_0_A6 = and:int(var_0_A6:int, ldc:int(-1404626619))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_14B_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16535), ldc:int(4451)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24576), ldc:int(-24573)))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(5380), ldc:int(5381)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(10608), ldc:int(-31217)), xor:int(ldc:int(581), ldc:int(603))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(960), ldc:int(962)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(852), ldc:int(842)), xor:int(ldc:int(4107), ldc:int(4169))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(7268), ldc:int(-7269)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(16979), ldc:int(1218)), xor:int(ldc:int(21544), ldc:int(21580))))
        putstatic:String[](\u4f52\ufe34\u6ec6\ub32d\uafe7::\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b, expr_F4:String[])
    }
    
    public void \u71ae\u120d\u516c\u4c04\u8258\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_630 : int
        
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
        var_3_625 = and:int(ldc:int(-260628998), ldc:int(-914395821))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\ufe34\u6ec6\ub32d\uafe7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-2077663710))
        }
        else {
            var_3_625 = and:int(var_3_625:int, ldc:int(-446725097))
            var_5_85 = and:int(ldc:int(-17645), ldc:int(1260))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31746), ldc:int(-31747)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_625:int, ldc:int(-1890232457))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(685), ldc:int(11347)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(18081), ldc:int(2127)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_DA:int, ldc:int(-581053221))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(66), ldc:int(67)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1141222958))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-313061432))
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1810496458))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-726268611))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-930963245))
                        goto(Label_0579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1934190569))
                    }
                    else {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1847756998))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0579)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(781902066))
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1432866851))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1842198321))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1771300291))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1013370525))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1571330662))
                        var_11_EB = and:int(ldc:int(3242), ldc:int(-3259))
                        goto(Label_1456)
                    }
                    
                    Label_0579:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-726340408))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1202384743))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1346372667))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(376136231))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2141890861))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(626246191))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-172214135))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(307822556))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1727079384))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1539375906))
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-755028229))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1175030674))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(453219829))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-608081028))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-52735440))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(2039086427))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1980257070))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(258), ldc:int(259))
                                goto(Label_1081)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(569636195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-301992554))
                        var_11_EB = and:int(ldc:int(-15101), ldc:int(13052))
                    }
                    
                    Label_1081:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1945043457))
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-248205313))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-85996809))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-664812362))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1318)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-406905167))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1081)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(743223212))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-857956354))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1673019214))
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1368009101))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1456)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1318:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-867789686))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-100598728))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-473067866))
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(780685584))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1329798091))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-84462433))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1456:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1467:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1482183455))
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-797852232))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(696213397))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-386593674))
                        var_17_630 = add:int(var_16_119:int, xor:int(ldc:int(1176), ldc:int(1177)))
                        looporswitchbreak()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-2024502685))
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-1042301262))
                
                if (cmple:boolean(var_5_85 = var_17_630:int, sub:int(var_6_8C:int, xor:int(ldc:int(6464), ldc:int(6465))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(1725523777))
            goto(Label_0106)
        }
    }
}
