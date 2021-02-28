public class \u12b2\u7049\u8df4\uc9f6\uae87.\ud523\u5d20\u183a\u62da\u6d99\u836c {
    public void \ud523\u5d20\u183a\u62da\u6d99\u836c(java.lang.Integer p0) {
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
            invokespecial:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<byte[], Integer>(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<byte[], Integer>::<init>, this:\ud523\u5d20\u183a\u62da\u6d99\u836c[expected:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<byte[], Integer>], p0:Integer, ldc:Class<byte[]>(byte[].class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0, java.lang.Integer p1) {
        var_5_76 : byte[]
        
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
        
        if (cmpge:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), invokevirtual:int(Integer::intValue, p1:Integer))) {
            var_5_76 = newarray:byte[](byte.class, invokevirtual:int(Integer::intValue, p1:Integer))
            invokevirtual:ByteBuf(ByteBuf::readBytes, p0:ByteBuf, var_5_76:byte[])
            return:byte[](var_5_76:byte[])
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\ud523\u5d20\u183a\u62da\u6d99\u836c::\u3dd3\u6ec6\u9255\u0c95\u5245\u6b5f), and:int(ldc:int(20875), ldc:int(-29168)))))
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Integer p1, byte[] p2) {
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
            invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, p2:byte[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1, java.lang.Object p2) {
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
            invokevirtual:void(\ud523\u5d20\u183a\u62da\u6d99\u836c::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ud523\u5d20\u183a\u62da\u6d99\u836c, p0:ByteBuf, checkcast:Integer(java.lang.Integer.class, p1:Object[expected:Integer]), checkcast:byte[](byte[].class, p2:Object[expected:byte[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            return:Object(invokevirtual:byte[][expected:Object](\ud523\u5d20\u183a\u62da\u6d99\u836c::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ud523\u5d20\u183a\u62da\u6d99\u836c, p0:ByteBuf, checkcast:Integer(java.lang.Integer.class, p1:Object[expected:Integer])))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1D9 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_A6_0 : byte[] [generated]
        stack_A8_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_237_0 : byte[] [generated]
        stack_2AF_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_176 : byte[]
        var_4_177 : int
        expr_A8 : int [generated]
        var_5_1C6 : int
        var_3_1CB : byte[]
        var_4_1CC : int
        var_0_22D : int
        expr_237 : byte [generated]
        stack_27B_2 : byte [generated]
        stack_25A_0 : byte [generated]
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_29E : byte[]
        var_4_29F : int
        expr_2B2 : byte [generated]
        var_3_13A : String
        stack_16D_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
            var_0_1D9 = and:int(ldc:int(1081046410), ldc:int(1768947134))
            expr_65 = var_2_69 = stack_A6_0 = stack_A8_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1EB_0 = stack_237_0 = stack_2AF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BOcRGxVUFuTu2u1EAhoIoFUSGxQVGhQY0RVbDuPu1hAfBRZZeklOAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_176 = newarray:byte[](byte.class, expr_6D:int)
                var_4_177 = expr_6D:int
                
                loop {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-663751313))
                    var_4_177 = add:int(var_4_177:int, ldc:int(-1))
                    storeelement:byte(var_3_176:byte[], var_4_177:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_177:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_177:int, xor:int(ldc:int(18444), ldc:int(18445)))), ldc:int(4)), and:int(ldc:int(79), ldc:int(4383)))))
                    
                    if (cmpne:boolean(var_4_177:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1EB_0 = stack_237_0 = stack_2AF_0 = var_3_176:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(202328119))
                    goto(Label_0267)
                }
                
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-1468602130))
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-1397367045))
                    goto(Label_0173)
                }
                
                var_0_1D9 = and:int(var_0_1D9:int, ldc:int(961537913))
                expr_A8 = arraylength:int(stack_A8_0:byte[])
                
                if (cmpeq:boolean(expr_A8:int, ldc:int(0))) {
                    goto(Label_0173)
                }
                
                var_5_1C6 = expr_A8:int
                var_3_1CB = newarray:byte[](byte.class, expr_A8:int)
                var_4_1CC = expr_A8:int
                Label_0462:
                
                while (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-352322216))
                    var_4_1CC = add:int(var_4_1CC:int, ldc:int(-1))
                    storeelement:byte(var_3_1CB:byte[], var_4_1CC:int, xor:byte(loadelement:byte(stack_1EB_0:byte[], var_4_1CC:int), ldc:byte(65)))
                    
                    if (cmpne:boolean(var_4_1CC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1EB_0 = stack_237_0 = stack_2AF_0 = var_3_1CB:byte[]
                    goto(Label_0173)
                }
                
                var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-1184089784))
                Label_0538:
                
                while (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(8)), ldc:int(0))) {
                    var_0_22D = and:int(var_0_1D9:int, ldc:int(-159384114))
                    var_4_1CC = add:int(var_4_1CC:int, ldc:int(-1))
                    expr_237 = stack_27B_2 = loadelement(stack_237_0, var_4_1CC)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1CC:int, ldc:int(4)), neg:int(var_5_1C6:int)), ldc:int(0))) {
                        stack_27B_2 = stack_25A_0 = add:byte(expr_237:byte, loadelement:byte(var_3_1CB:byte[], add:int(var_4_1CC:int, ldc:int(4))))
                        goto(Label_0618)
                    }
                    
                    Label_0580:
                    
                    if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_22D = and:int(var_0_22D:int, ldc:int(1182588489))
                    }
                    else {
                        var_0_22D = and:int(var_0_22D:int, ldc:int(1904211743))
                        stack_27B_2 = stack_25A_0 = add:byte(expr_237:byte, ldc:byte(4))
                    }
                    
                    Label_0618:
                    
                    if (cmpne:boolean(and:int(var_0_22D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    var_0_1D9 = and:int(var_0_22D:int, ldc:int(-1468045937))
                    storeelement:byte(var_3_1CB:byte[], var_4_1CC:int, stack_27B_2:byte)
                    
                    if (cmpne:boolean(var_4_1CC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1EB_0 = stack_237_0 = stack_2AF_0 = var_3_1CB:byte[]
                    goto(Label_0216)
                }
                
                var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-256249364))
                goto(Label_0462)
                Label_0173:
                
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(660165052))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(796878668))
                    expr_D3 = arraylength:int(stack_D3_0:byte[])
                    
                    if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                        var_5_1C6 = expr_D3:int
                        var_3_1CB = newarray:byte[](byte.class, expr_D3:int)
                        var_4_1CC = expr_D3:int
                        goto(Label_0538)
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(474379418))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-2140014845))
                        loopcontinue()
                    }
                    
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-385876662))
                    expr_106 = arraylength:int(stack_106_0:byte[])
                    
                    if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                        var_3_29E = newarray:byte[](byte.class, expr_106:int)
                        var_4_29F = expr_106:int
                        
                        loop {
                            var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-1529874548))
                            var_4_29F = add:int(var_4_29F:int, ldc:int(-1))
                            expr_2B2 = add:byte(loadelement:byte(stack_2AF_0:byte[], var_4_29F:int), ldc:byte(109))
                            storeelement:byte(var_3_29E:byte[], var_4_29F:int, or:int(and:int(shl:int(expr_2B2:byte, and:int(ldc:int(28855), ldc:int(2892))), ldc:int(-16)), and:int(shr:int(expr_2B2:byte[expected:int], and:int(ldc:int(612), ldc:int(11286))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_29F:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A8_0 = stack_A6_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1EB_0 = stack_237_0 = stack_2AF_0 = var_3_29E:byte[]
                    }
                }
                
                Label_0267:
                
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1D9 = and:int(var_0_1D9:int, ldc:int(-932604785))
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_0_1D9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0173)
                }
                
                if (cmpne:boolean(and:int(var_0_1D9:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_16D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9241), ldc:int(133)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28576), ldc:int(-28575)))
            storeelement:String(expr_14C:String[], and:int(ldc:int(-17522), ldc:int(17521)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(26185), ldc:int(-26202)), xor:int(ldc:int(-16362), ldc:int(-16335))))
            putstatic:String[](\ud523\u5d20\u183a\u62da\u6d99\u836c::\u3dd3\u6ec6\u9255\u0c95\u5245\u6b5f, expr_14C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-1229779739), ldc:int(-1361330452))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud523\u5d20\u183a\u62da\u6d99\u836c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(1700236871))
            var_5_7D = and:int(ldc:int(11357), ldc:int(-11744))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1218), ldc:int(1217)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_634:int, ldc:int(-1222648224))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(16513), ldc:int(16173)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(96), ldc:int(97)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_CA:int, ldc:int(-55341974))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(17409), ldc:int(359)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1469864361))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1675694315))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1555986667))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1781421040))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(652650864))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1390956722))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-270470564))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1780205709))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(202361005))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1099452556))
                            var_11_DB = and:int(ldc:int(3304), ldc:int(-3305))
                            goto(Label_1461)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-510613796))
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-331186168))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1201368943))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-338119479))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1203949460))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(784735733))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-415801991))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1434772745))
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-786970238))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(41079447))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-81989646))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1113656828))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-2071844412))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(627018964))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(775289651))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-316965919))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1514375304))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1798919825))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-306229255))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(3140), ldc:int(3141))
                                goto(Label_1061)
                            }
                        }
                    }
                    
                    Label_0909:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-796433367))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-2034018241))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-412511662))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-35541483))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1949502824))
                        var_11_DB = and:int(ldc:int(14160), ldc:int(-14166))
                    }
                    
                    Label_1061:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1522138239))
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0909)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-58484090))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1090343347))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(663973108))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1306)
                            }
                        }
                    }
                    
                    Label_1169:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1134717964))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1052499585))
                            goto(Label_1061)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1591146490))
                            goto(Label_0909)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-856575155))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(407817515))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1966308984))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1461)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1306:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1424453917))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1445127253))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(357547881))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2031513781))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1055476237))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(452027405))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1622414411))
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1349026365))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1461:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1472:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-158286247))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-144728340))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1976362321))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(94620963))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1014701125))
                        var_17_63F = add:int(var_16_109:int, and:int(ldc:int(4737), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-59182314))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(768826827))
                
                if (cmple:boolean(var_5_7D = var_17_63F:int, sub:int(var_6_84:int, and:int(ldc:int(1025), ldc:int(12581))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
