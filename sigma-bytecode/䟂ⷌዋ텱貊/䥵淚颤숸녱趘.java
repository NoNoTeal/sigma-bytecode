public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u4975\uf94d\u98a4\uc238\ub171\u8d98 {
    public void \u4975\uf94d\u98a4\uc238\ub171\u8d98() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u4975\uf94d\u98a4\uc238\ub171\u8d98, loadelement:String(getstatic:String[](\u4975\uf94d\u98a4\uc238\ub171\u8d98::\u62da\u92ff\u4179\u92ff\u7d52\ubf56), and:int(ldc:int(1635), ldc:int(-1636))), ldc:Class<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_67 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_5_7C : ByteBuf
        var_6_85 : int
        var_7_A9 : short
        
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
            var_2_5F = and:int(ldc:int(-1011571511), ldc:int(-205597219))
            var_4_67 = initobject:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::<init>)
            invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u12cb\ud158\u64f2\u527a\u7e3f\u6198, var_4_67:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, and:int(ldc:int(-9557), ldc:int(9300)))
            var_5_7C = invokevirtual:ByteBuf(ByteBuf::order, p0:ByteBuf, getstatic:ByteOrder(ByteOrder::LITTLE_ENDIAN))
            var_6_85 = and:int(ldc:int(19091), ldc:int(-19092))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-382430836))
                
                if (cmpge:boolean(var_6_85:int, and:int(ldc:int(23217), ldc:int(12614)))) {
                    looporswitchbreak()
                }
                
                var_7_A9 = invokevirtual:short(ByteBuf::readShort, var_5_7C:ByteBuf)
                invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u416d\uff55\ub8be\u3d4b\u4bc8\u98a4, var_4_67:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_6_85:int, shr:int(var_7_A9:short[expected:int], xor:int(ldc:int(8227), ldc:int(8231))), and:short(var_7_A9:short, ldc:short(15)))
                inc:int(var_6_85, ldc:int(1))
            }
            
            return:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_4_67:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a p1) {
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
            athrow(initobject:UnsupportedOperationException(UnsupportedOperationException::<init>))
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
            return:Object(invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[expected:Object](\u4975\uf94d\u98a4\uc238\ub171\u8d98::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u4975\uf94d\u98a4\uc238\ub171\u8d98, p0:ByteBuf))
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
            invokevirtual:void(\u4975\uf94d\u98a4\uc238\ub171\u8d98::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u4975\uf94d\u98a4\uc238\ub171\u8d98, p0:ByteBuf, checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, p1:Object[expected:\u4975\u1833\u446c\u5bc4\ubded\u4f4a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_15E : byte[]
        var_4_15F : int
        expr_98 : int [generated]
        var_5_1AE : int
        var_3_1B3 : byte[]
        var_4_1B4 : int
        expr_1CB : byte [generated]
        var_0_21E : int
        expr_228 : byte [generated]
        stack_26C_2 : byte [generated]
        stack_24B_0 : byte [generated]
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_28F : byte[]
        var_4_290 : int
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(2045387404), ldc:int(-101751746))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_2A0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DwcXZ0+i9Q1XF30jVbjXEzdcAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_15E = newarray:byte[](byte.class, expr_6D:int)
                var_4_15F = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-272668002))
                    var_4_15F = add:int(var_4_15F:int, ldc:int(-1))
                    storeelement:byte(var_3_15E:byte[], var_4_15F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_15F:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_15F:int, and:int(ldc:int(18563), ldc:int(13)))), ldc:int(5)), xor:int(ldc:int(2818), ldc:int(2821)))))
                    
                    if (cmpne:boolean(var_4_15F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_2A0_0 = var_3_15E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-599249562))
                    goto(Label_0157)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-303038484))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1AE = expr_98:int
                var_3_1B3 = newarray:byte[](byte.class, expr_98:int)
                var_4_1B4 = expr_98:int
                Label_0438:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-335545602))
                    var_4_1B4 = add:int(var_4_1B4:int, ldc:int(-1))
                    expr_1CB = loadelement:byte(stack_1CB_0:byte[], var_4_1B4:int)
                    storeelement:byte(var_3_1B3:byte[], var_4_1B4:int, add:int(or:int(and:int(shl:int(expr_1CB:byte, xor:int(ldc:int(-23038), ldc:int(-23034))), ldc:int(-16)), and:int(shr:int(expr_1CB:byte[expected:int], and:int(ldc:int(516), ldc:int(20741))), ldc:int(15))), ldc:int(96)))
                    
                    if (cmpne:boolean(var_4_1B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_2A0_0 = var_3_1B3:byte[]
                    goto(Label_0157)
                }
                
                Label_0531:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_21E = and:int(var_0_5F:int, ldc:int(2112303988))
                    var_4_1B4 = add:int(var_4_1B4:int, ldc:int(-1))
                    expr_228 = stack_26C_2 = loadelement(stack_228_0, var_4_1B4)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1B4:int, ldc:int(1)), neg:int(var_5_1AE:int)), ldc:int(0))) {
                        stack_26C_2 = stack_24B_0 = add:byte(expr_228:byte, loadelement:byte(var_3_1B3:byte[], add:int(var_4_1B4:int, ldc:int(1))))
                        goto(Label_0603)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_0_21E = and:int(var_0_21E:int, ldc:int(1452689052))
                    }
                    else {
                        var_0_21E = and:int(var_0_21E:int, ldc:int(1839462653))
                        stack_26C_2 = stack_24B_0 = add:byte(expr_228:byte, ldc:byte(1))
                    }
                    
                    Label_0603:
                    
                    if (cmpne:boolean(and:int(var_0_21E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    var_0_5F = and:int(var_0_21E:int, ldc:int(1773626878))
                    storeelement:byte(var_3_1B3:byte[], var_4_1B4:int, stack_26C_2:byte)
                    
                    if (cmpne:boolean(var_4_1B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_2A0_0 = var_3_1B3:byte[]
                    goto(Label_0200)
                }
                
                goto(Label_0438)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1791694447))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-73206787))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_1AE = expr_C3:int
                        var_3_1B3 = newarray:byte[](byte.class, expr_C3:int)
                        var_4_1B4 = expr_C3:int
                        goto(Label_0531)
                    }
                }
                
                Label_0200:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(-1727231306))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-336152082))
                    expr_EE = arraylength:int(stack_EE_0:byte[])
                    
                    if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                        var_3_28F = newarray:byte[](byte.class, expr_EE:int)
                        var_4_290 = expr_EE:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(1877376061))
                            var_4_290 = add:int(var_4_290:int, ldc:int(-1))
                            storeelement:byte(var_3_28F:byte[], var_4_290:int, xor:byte(loadelement:byte(stack_2A0_0:byte[], var_4_290:int), ldc:byte(10)))
                            
                            if (cmpne:boolean(var_4_290:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_2A0_0 = var_3_28F:byte[]
                    }
                }
                
                Label_0243:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(278306867))
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_155_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4128), ldc:int(4129)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31424), ldc:int(-31423)))
            storeelement:String(expr_134:String[], and:int(ldc:int(6721), ldc:int(-6722)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(12434), ldc:int(-12699)), xor:int(ldc:int(10), ldc:int(24))))
            putstatic:String[](\u4975\uf94d\u98a4\uc238\ub171\u8d98::\u62da\u92ff\u4179\u92ff\u7d52\ubf56, expr_134:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_634 = and:int(ldc:int(1860529970), ldc:int(-1628715138))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\uf94d\u98a4\uc238\ub171\u8d98[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-72134200))
        }
        else {
            var_3_634 = and:int(var_3_634:int, ldc:int(1609637686))
            var_5_85 = and:int(ldc:int(8780), ldc:int(-26319))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28780), ldc:int(28707)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_634:int, ldc:int(1435850301))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(8460), ldc:int(8461)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(154), ldc:int(155)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_DA:int, ldc:int(-1115470089))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(9), ldc:int(8)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1322431347))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2011546803))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(930642654))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1280317618))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(812340212))
                    }
                    else {
                        var_3_634 = and:int(var_3_634:int, ldc:int(752305918))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-857101017))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1730019261))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-190072973))
                            var_11_EB = and:int(ldc:int(-8026), ldc:int(4937))
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1724829653))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1064277071))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(671895451))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(543031561))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1037562505))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-962468037))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(406454238))
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(590562656))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1150098284))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-861873912))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1435879411))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1150886195))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1929592483))
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1654451357))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-837136787))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1441645577))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(504299579))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-325507528))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(2052), ldc:int(2053))
                                goto(Label_1082)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1291944835))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1344345063))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(187661798))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-834308234))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-588603752))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-942705249))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(635254586))
                        var_11_EB = and:int(ldc:int(10953), ldc:int(-10976))
                    }
                    
                    Label_1082:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(139570412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(2009165477))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-2035540051))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-964888517))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1278002142))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1393047887))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1345)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(628831307))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1082)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1098871942))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1266355390))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1316550728))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-2104292288))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-587487369))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1473)
                    }
                    
                    Label_1345:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(599034285))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(541904133))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-111850259))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-96278710))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1398966277))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(959574689))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(267642045))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1663120122))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1649389733))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(95147900))
                        var_17_63F = add:int(var_16_119:int, xor:int(ldc:int(10276), ldc:int(10277)))
                        looporswitchbreak()
                    }
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-1226748239))
                
                if (cmple:boolean(var_5_85 = var_17_63F:int, sub:int(var_6_8C:int, xor:int(ldc:int(132), ldc:int(133))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-2003136780))
            goto(Label_0106)
        }
    }
}
