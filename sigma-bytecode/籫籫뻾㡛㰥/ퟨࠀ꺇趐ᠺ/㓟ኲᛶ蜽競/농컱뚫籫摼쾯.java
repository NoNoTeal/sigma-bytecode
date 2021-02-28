public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf {
    public void \ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf() {
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
            invokespecial:Object(Object::<init>, this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)
            putfield:List<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>(\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf::\u3dd3\u6c52\u9033\u7e3f\uafe7\u527a, this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf, initobject:ArrayList<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>[expected:List<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>](ArrayList<E>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf \u47c2\u5f50\u5bc4\u8cae\u9255\u9033(java.lang.String p0, java.lang.String[] p1) {
        var_6_6F : int
        var_7_78 : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_6_6F = arraylength:int(p1:String[])
            var_7_78 = and:int(ldc:int(-30284), ldc:int(28746))
            
            while (cmplt:boolean(var_7_78:int, var_6_6F:int)) {
                invokeinterface:boolean(List<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>::add, getfield:List<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>(\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf::\u3dd3\u6c52\u9033\u7e3f\uafe7\u527a, this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf), initobject:\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a(\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a::<init>, p0:String, loadelement:String(p1:String[], var_7_78:int)))
                inc:int(var_7_78, ldc:int(1))
            }
            
            return:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf(this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)
        }
        
        athrow(initobject:NullPointerException(NullPointerException::<init>, loadelement:String(getstatic:String[](\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf::\uc246\ud51e\u8640\u5bc4\ube23\u7049), and:int(ldc:int(-11893), ldc:int(11892)))))
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u0b8e\u8c8a\u836c\ua068\ucef1\u4f52 \uf9c5\u64f2\u8aa5\u624e\u76bc\u36d3() {
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
            return:\u0b8e\u8c8a\u836c\ua068\ucef1\u4f52(initobject:\u0b8e\u8c8a\u836c\ua068\ucef1\u4f52(\u0b8e\u8c8a\u836c\ua068\ucef1\u4f52::<init>, initobject:LinkedHashSet<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>[expected:Set<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>](LinkedHashSet<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>::<init>, getfield:List<\u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>[expected:Collection<? extends \u4e72\u3e75\u6d69\u8d90\u67e9\uc29a>](\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf::\u3dd3\u6c52\u9033\u7e3f\uafe7\u527a, this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)), aconstnull:\u4975\uafe7\ub102\u8413\uc7fe\u61a4()))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_191_0 : byte[] [generated]
        stack_206_0 : byte[] [generated]
        var_4_114 : int
        var_3_119 : byte[]
        var_5_11A : int
        expr_131 : byte [generated]
        var_0_187 : int
        expr_191 : byte [generated]
        stack_1D5_2 : byte [generated]
        stack_1B4_0 : byte [generated]
        expr_8F : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_1F5 : byte[]
        var_5_1F6 : int
        var_3_DA : String
        stack_10D_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-1593841186), ldc:int(1868552410))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_131_0 = stack_191_0 = stack_206_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("cGENBXV8CD+oHUy+lrK+yA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_114 = expr_6B:int
        var_3_119 = newarray:byte[](byte.class, expr_6B:int)
        var_5_11A = expr_6B:int
        Label_0284:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1457375950))
            var_5_11A = add:int(var_5_11A:int, ldc:int(-1))
            expr_131 = loadelement:byte(stack_131_0:byte[], var_5_11A:int)
            storeelement:byte(var_3_119:byte[], var_5_11A:int, add:int(xor:int(or:int(and:int(shl:int(expr_131:byte, xor:int(ldc:int(-32505), ldc:int(-32509))), ldc:int(-16)), and:int(shr:int(expr_131:byte[expected:int], xor:int(ldc:int(-30717), ldc:int(-30713))), ldc:int(15))), ldc:int(42)), ldc:int(84)))
            
            if (cmpne:boolean(var_5_11A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_131_0 = stack_191_0 = stack_206_0 = var_3_119:byte[]
            goto(Label_0112)
        }
        
        Label_0380:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            var_0_187 = and:int(var_0_5F:int, ldc:int(-734016535))
            var_5_11A = add:int(var_5_11A:int, ldc:int(-1))
            expr_191 = stack_1D5_2 = loadelement(stack_191_0, var_5_11A)
            
            if (cmplt:boolean(add:int(add:int(var_5_11A:int, ldc:int(6)), neg:int(var_4_114:int)), ldc:int(0))) {
                stack_1D5_2 = stack_1B4_0 = add:byte(expr_191:byte, loadelement:byte(var_3_119:byte[], add:int(var_5_11A:int, ldc:int(6))))
                goto(Label_0452)
            }
            
            Label_0414:
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(128)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(255578721))
            }
            else {
                var_0_187 = and:int(var_0_187:int, ldc:int(580733420))
                stack_1D5_2 = stack_1B4_0 = add:byte(expr_191:byte, ldc:byte(6))
            }
            
            Label_0452:
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0414)
            }
            
            var_0_5F = and:int(var_0_187:int, ldc:int(-1709310482))
            storeelement:byte(var_3_119:byte[], var_5_11A:int, stack_1D5_2:byte)
            
            if (cmpne:boolean(var_5_11A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_131_0 = stack_191_0 = stack_206_0 = var_3_119:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0284)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(841714588))
            goto(Label_0178)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1635955715))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_114 = expr_8F:int
                var_3_119 = newarray:byte[](byte.class, expr_8F:int)
                var_5_11A = expr_8F:int
                goto(Label_0380)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-709009959))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_1F5 = newarray:byte[](byte.class, expr_AD:int)
                var_5_1F6 = expr_AD:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-853676087))
                    var_5_1F6 = add:int(var_5_1F6:int, ldc:int(-1))
                    storeelement:byte(var_3_1F5:byte[], var_5_1F6:int, add:int(shl:int(loadelement:byte(stack_206_0:byte[], var_5_1F6:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_1F6:int, xor:int(ldc:int(16425), ldc:int(16424)))), ldc:int(6)), and:int(ldc:int(1339), ldc:int(21123)))))
                    
                    if (cmpne:boolean(var_5_1F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_CE_0 = stack_131_0 = stack_191_0 = stack_206_0 = var_3_1F5:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1350429532))
            goto(Label_0112)
        }
        
        var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_10D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5249), ldc:int(31)))
        expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3155), ldc:int(513)))
        storeelement:String(expr_EC:String[], and:int(ldc:int(-7480), ldc:int(7427)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(25730), ldc:int(-25731)), xor:int(ldc:int(2251), ldc:int(2244))))
        putstatic:String[](\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf::\uc246\ud51e\u8640\u5bc4\ube23\u7049, expr_EC:String[])
    }
    
    public void \u8753\u1833\u6198\u0a06\uc229\ub102(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62E : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_639 : int
        
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
        var_3_62E = and:int(ldc:int(-386352960), ldc:int(-51518920))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
            var_3_62E = and:int(var_3_62E:int, ldc:int(-575930727))
        }
        else {
            var_3_62E = and:int(var_3_62E:int, ldc:int(-1996689269))
            var_5_85 = and:int(ldc:int(-1520), ldc:int(1518))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3185), ldc:int(3184)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62E:int, ldc:int(-50616636))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(22577), ldc:int(9)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8962), ldc:int(8963)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62E = and:int(var_3_DA:int, ldc:int(-553931774))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8339), ldc:int(2089)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1622712856))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1391142834))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(248565607))
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1146378760))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(189209247))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1591777882))
                    }
                    else {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-587991250))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1483276132))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-608483350))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(810462712))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1401545953))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(253469038))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1883444273))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-370286480))
                            var_11_EB = and:int(ldc:int(-12346), ldc:int(12345))
                            goto(Label_1467)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1065455973))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(913810250))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1674103543))
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1770562955))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1849965356))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1158417219))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1777157859))
                        goto(Label_1087)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(187410413))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1931297163))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(180016204))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1426721097))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(897050674))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(2016678482))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(11937559))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-150281667))
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1334765419))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-549421819))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1377770808))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(18432), ldc:int(18433))
                                goto(Label_1087)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-907143538))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(2116332390))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(328093399))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-67706848))
                        var_11_EB = and:int(ldc:int(8715), ldc:int(-8716))
                    }
                    
                    Label_1087:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(811435709))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-58928533))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1669412551))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(883698716))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1645628991))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1339)
                            }
                        }
                    }
                    
                    Label_1203:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-915709994))
                            goto(Label_1087)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1923465596))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1118353763))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1270701093))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(690442315))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1175411901))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1467)
                    }
                    
                    Label_1339:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-835396512))
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1647017690))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1498957196))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-994640056))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62E = and:int(var_3_62E:int, ldc:int(-353966319))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1467:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_639 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1478:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(93168312))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(747400801))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1415030862))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(404571898))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-537922202))
                        var_17_639 = add:int(var_16_119:int, xor:int(ldc:int(8451), ldc:int(8450)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62E = and:int(var_3_62E:int, ldc:int(-823134611))
                
                if (cmple:boolean(var_5_85 = var_17_639:int, sub:int(var_6_8C:int, and:int(ldc:int(129), ldc:int(22531))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
            var_3_62E = and:int(var_3_62E:int, ldc:int(-1744788496))
            goto(Label_0106)
        }
    }
}
