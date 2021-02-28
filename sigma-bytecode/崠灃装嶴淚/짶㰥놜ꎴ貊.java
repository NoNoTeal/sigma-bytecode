public class \u5d20\u7043\u88c5\u5db4\uf94d.\uc9f6\u3c25\ub19c\ua3b4\u8c8a {
    public void \uc9f6\u3c25\ub19c\ua3b4\u8c8a() {
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
            invokespecial:MessageToByteEncoder(MessageToByteEncoder::<init>, this:\uc9f6\u3c25\ub19c\ua3b4\u8c8a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void encode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, io.netty.buffer.ByteBuf p2) {
        var_6_67 : int
        var_7_6E : int
        var_8_8B : \u98a4\uafe7\uc3e3\ua6bd\u8640
        
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
        var_6_67 = invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf)
        var_7_6E = invokestatic:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u40a9\ua562\ud523\u1833\ud4fe\u4c2b, var_6_67:int)
        
        if (cmple:boolean(var_7_6E:int, and:int(ldc:int(10755), ldc:int(1075)))) {
            var_8_8B = initobject:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::<init>, p2:ByteBuf)
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::ensureWritable, var_8_8B:\u98a4\uafe7\uc3e3\ua6bd\u8640, add:int(var_7_6E:int, var_6_67:int))
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, var_8_8B:\u98a4\uafe7\uc3e3\ua6bd\u8640, var_6_67:int)
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBytes, var_8_8B:\u98a4\uafe7\uc3e3\ua6bd\u8640, p1:ByteBuf, invokevirtual:int(ByteBuf::readerIndex, p1:ByteBuf), var_6_67:int)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc9f6\u3c25\ub19c\ua3b4\u8c8a::\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9), and:int(ldc:int(10042), ldc:int(-26623)))), var_6_67:int), loadelement:String(getstatic:String[](\uc9f6\u3c25\ub19c\ua3b4\u8c8a::\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9), xor:int(ldc:int(5640), ldc:int(5641)))), xor:int(ldc:int(50), ldc:int(49))))))
    }
    
    public void encode(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1, io.netty.buffer.ByteBuf p2) {
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
            invokevirtual:void(\uc9f6\u3c25\ub19c\ua3b4\u8c8a::encode, this:\uc9f6\u3c25\ub19c\ua3b4\u8c8a, p0:ChannelHandlerContext, checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf]), p2:ByteBuf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18A : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1A3_0 : byte[] [generated]
        stack_1F9_0 : byte[] [generated]
        stack_27F_0 : byte[] [generated]
        stack_2CF_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_1EF : int
        expr_1F9 : byte [generated]
        stack_235_2 : byte [generated]
        stack_214_0 : byte [generated]
        expr_27F : byte [generated]
        expr_8E : int [generated]
        expr_B9 : int [generated]
        var_2_E2 : byte[]
        expr_E6 : int [generated]
        var_3_2BE : byte[]
        var_5_2BF : int
        var_3_122 : String
        stack_170_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_18A = and:int(ldc:int(-804188482), ldc:int(-128634405))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B7_0 = stack_B9_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_1A3_0 = stack_1F9_0 = stack_27F_0 = stack_2CF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FoD8CMtby7YLfAuNDYv3GnD6JHF2")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0469)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-450267141))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:byte(xor:byte(loadelement:byte(stack_1A3_0:byte[], var_5_17D:int), ldc:byte(119)), ldc:byte(4)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_1A3_0 = stack_1F9_0 = stack_27F_0 = stack_2CF_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(705888018))
        goto(Label_0603)
        Label_0469:
        
        while (cmpne:boolean(and:int(var_0_18A:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            var_0_1EF = and:int(var_0_18A:int, ldc:int(-425875529))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_1F9 = stack_235_2 = loadelement(stack_1F9_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(3)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_235_2 = stack_214_0 = add:byte(expr_1F9:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(3))))
                goto(Label_0548)
            }
            
            Label_0518:
            
            if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1EF = and:int(var_0_1EF:int, ldc:int(-606602102))
                stack_235_2 = stack_214_0 = add:byte(expr_1F9:byte, ldc:byte(3))
            }
            
            Label_0548:
            
            if (cmpeq:boolean(and:int(var_0_1EF:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0518)
            }
            
            var_0_18A = and:int(var_0_1EF:int, ldc:int(-552260885))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_235_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_1A3_0 = stack_1F9_0 = stack_27F_0 = stack_2CF_0 = var_3_17C:byte[]
            goto(Label_0147)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(2045467262))
        Label_0603:
        
        while (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-70967158))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_27F = loadelement:byte(stack_27F_0:byte[], var_5_17D:int)
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, or:int(and:int(shl:int(expr_27F:byte, and:int(ldc:int(343), ldc:int(6148))), ldc:int(-16)), and:int(shr:int(expr_27F:byte[expected:int], xor:int(ldc:int(-16367), ldc:int(-16363))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_1A3_0 = stack_1F9_0 = stack_27F_0 = stack_2CF_0 = var_3_17C:byte[]
            goto(Label_0190)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(1501582287))
        goto(Label_0469)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0190)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(64)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-950296577))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_177 = expr_8E:int
                var_3_17C = newarray:byte[](byte.class, expr_8E:int)
                var_5_17D = expr_8E:int
                goto(Label_0469)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(128)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-180030083))
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-213825841))
            expr_B9 = arraylength:int(stack_B9_0:byte[])
            
            if (cmpne:boolean(expr_B9:int, ldc:int(0))) {
                var_4_177 = expr_B9:int
                var_3_17C = newarray:byte[](byte.class, expr_B9:int)
                var_5_17D = expr_B9:int
                goto(Label_0603)
            }
        }
        
        Label_0190:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-839548208))
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-915936053))
            var_2_E2 = stack_E2_0:byte[]
            expr_E6 = add:int(arraylength:int(stack_E4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_2BE = newarray:byte[](byte.class, expr_E6:int)
                var_5_2BF = expr_E6:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(-125620345))
                    var_5_2BF = add:int(var_5_2BF:int, ldc:int(-1))
                    storeelement:byte(var_3_2BE:byte[], var_5_2BF:int, add:int(shl:int(loadelement:byte(stack_2CF_0:byte[], var_5_2BF:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_E2:byte[], add:int(var_5_2BF:int, xor:int(ldc:int(4648), ldc:int(4649)))), ldc:int(2)), xor:int(ldc:int(33), ldc:int(30)))))
                    
                    if (cmpne:boolean(var_5_2BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_1A3_0 = stack_1F9_0 = stack_27F_0 = stack_2CF_0 = var_3_2BE:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(16384)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(279720142))
            goto(Label_0190)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(484394398))
            goto(Label_0147)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(65536)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_170_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10), ldc:int(2370)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24048), ldc:int(-24046)))
            storeelement:String(expr_134:String[], xor:int(ldc:int(9473), ldc:int(9472)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(14976), ldc:int(-31369)), and:int(ldc:int(8214), ldc:int(3663))))
            storeelement:String(expr_134:String[], and:int(ldc:int(25864), ldc:int(-25865)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(270), ldc:int(16455)), and:int(ldc:int(16916), ldc:int(2364))))
            putstatic:String[](\uc9f6\u3c25\ub19c\ua3b4\u8c8a::\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \uc84e\u98a4\u5bc4\u67e9\u8389\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_601 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60C : int
        
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
        var_3_601 = and:int(ldc:int(1263280890), ldc:int(-749459523))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc9f6\u3c25\ub19c\ua3b4\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(8192)), ldc:int(0))) {
            var_3_601 = and:int(var_3_601:int, ldc:int(-31647067))
        }
        else {
            var_3_601 = and:int(var_3_601:int, ldc:int(-364532740))
            var_5_85 = and:int(ldc:int(-13424), ldc:int(5230))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20582), ldc:int(-22136)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_601:int, ldc:int(1281667001))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(16388), ldc:int(16389)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4385), ldc:int(24781)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_601 = and:int(var_3_D2:int, ldc:int(2094479355))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8448), ldc:int(8449)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(128)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-320576744))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(1137406355))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(128)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(2083334362))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-247438659))
                        goto(Label_0896)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(410844044))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(2087497725))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(811947911))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(1103426462))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(1634113189))
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(-227082564))
                        var_11_E3 = and:int(ldc:int(-26924), ldc:int(24875))
                        goto(Label_1403)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(128)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(1421551321))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-1509092759))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-1601596721))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-1844834478))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1788015593))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-678855187))
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(-237607240))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(8)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-535795828))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(821664246))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(106151466))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(16)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-1963119295))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(128)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1287975258))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(1776631803))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1267133849))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(-311434248))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(28736), ldc:int(28737))
                                goto(Label_1039)
                            }
                        }
                    }
                    
                    Label_0896:
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(895308393))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-98103971))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1256973333))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(1264022270))
                        var_11_E3 = and:int(ldc:int(-6074), ldc:int(5784))
                    }
                    
                    Label_1039:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(496600174))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(2077533079))
                            goto(Label_0896)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1955840021))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-355931757))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-782106987))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(1132445625))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1289)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(545574723))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1039)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(655526188))
                            goto(Label_0896)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_601 = and:int(var_3_601:int, ldc:int(-1199764200))
                            loopcontinue()
                        }
                        
                        var_3_601 = and:int(var_3_601:int, ldc:int(-226578696))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1403)
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(761235561))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(2103831762))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_601 = and:int(var_3_601:int, ldc:int(1786653625))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1403:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1414:
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(32)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-1228727175))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(1801472463))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(1496610822))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(16)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(85582976))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(512)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(359572895))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_601:int, ldc:int(256)), ldc:int(0))) {
                        var_3_601 = and:int(var_3_601:int, ldc:int(-998806529))
                        var_17_60C = add:int(var_16_111:int, xor:int(ldc:int(19712), ldc:int(19713)))
                        looporswitchbreak()
                    }
                    
                    var_3_601 = and:int(var_3_601:int, ldc:int(-70123217))
                }
                
                var_3_601 = and:int(var_3_601:int, ldc:int(-345539590))
                
                if (cmple:boolean(var_5_85 = var_17_60C:int, sub:int(var_6_8C:int, and:int(ldc:int(1025), ldc:int(2281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_601:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
