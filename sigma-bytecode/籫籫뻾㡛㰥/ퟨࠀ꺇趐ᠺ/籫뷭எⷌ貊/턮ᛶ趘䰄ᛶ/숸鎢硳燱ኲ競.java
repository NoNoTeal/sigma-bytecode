public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\uc238\u93a2\u7873\u71f1\u12b2\u7af6 {
    public void \uc238\u93a2\u7873\u71f1\u12b2\u7af6(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::<init>, this:\uc238\u93a2\u7873\u71f1\u12b2\u7af6, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerBlockEntities(com.mojang.datafixers.schemas.Schema p0) {
        var_4_65 : Map
        
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
            var_4_65 = invokespecial:Map(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::registerBlockEntities, this:\uc238\u93a2\u7873\u71f1\u12b2\u7af6[expected:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8], p0:Schema)
            invokeinterface:Supplier<TypeTemplate>(Map<String, Supplier<TypeTemplate>>::remove, var_4_65:Map<String, Supplier<TypeTemplate>>, loadelement:String[expected:Object](getstatic:String[](\uc238\u93a2\u7873\u71f1\u12b2\u7af6::\u4492\u3776\ub113\u67d0\u960f\u71f1), and:int(ldc:int(-8502), ldc:int(8501))))
            invokeinterface:Supplier<TypeTemplate>(Map<String, Supplier<TypeTemplate>>::remove, var_4_65:Map<String, Supplier<TypeTemplate>>, loadelement:String[expected:Object](getstatic:String[](\uc238\u93a2\u7873\u71f1\u12b2\u7af6::\u4492\u3776\ub113\u67d0\u960f\u71f1), xor:int(ldc:int(9473), ldc:int(9472))))
            return:Map<String, Supplier<TypeTemplate>>(var_4_65:Map<String, Supplier<TypeTemplate>>)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19A : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1AC_0 : byte[] [generated]
        stack_22B_0 : byte[] [generated]
        stack_268_0 : byte[] [generated]
        stack_2BD_0 : byte[] [generated]
        var_4_187 : int
        var_3_18C : byte[]
        var_5_18D : int
        var_0_1A2 : int
        expr_1AC : byte [generated]
        stack_1F0_2 : byte [generated]
        stack_1CF_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_257 : byte[]
        var_5_258 : int
        expr_FE : int [generated]
        var_3_2AC : byte[]
        var_5_2AD : int
        expr_2BD : byte [generated]
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_19A = and:int(ldc:int(2122682989), ldc:int(-7691273))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_22B_0 = stack_268_0 = stack_2BD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("2O7sPpoE7P4e0I7YIP4QCuIW2Az47uw+qgbaGgzUXvga6j87OUExQw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_187 = expr_6B:int
        var_3_18C = newarray:byte[](byte.class, expr_6B:int)
        var_5_18D = expr_6B:int
        Label_0399:
        
        while (cmpne:boolean(and:int(var_0_19A:int, ldc:int(64)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_19A:int, ldc:int(-86332457))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_1AC = stack_1F0_2 = loadelement(stack_1AC_0, var_5_18D)
            
            if (cmplt:boolean(add:int(add:int(var_5_18D:int, ldc:int(6)), neg:int(var_4_187:int)), ldc:int(0))) {
                stack_1F0_2 = stack_1CF_0 = add:byte(expr_1AC:byte, loadelement:byte(var_3_18C:byte[], add:int(var_5_18D:int, ldc:int(6))))
                goto(Label_0479)
            }
            
            Label_0441:
            
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(814384129))
            }
            else {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1854274285))
                stack_1F0_2 = stack_1CF_0 = add:byte(expr_1AC:byte, ldc:byte(6))
            }
            
            Label_0479:
            
            if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0441)
            }
            
            var_0_19A = and:int(var_0_1A2:int, ldc:int(-88029355))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, stack_1F0_2:byte)
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_22B_0 = stack_268_0 = stack_2BD_0 = var_3_18C:byte[]
            goto(Label_0112)
        }
        
        var_0_19A = and:int(var_0_19A:int, ldc:int(623815438))
        Label_0534:
        
        while (cmpne:boolean(and:int(var_0_19A:int, ldc:int(32768)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(2123274991))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, xor:byte(add:byte(loadelement:byte(stack_22B_0:byte[], var_5_18D:int), ldc:byte(107)), ldc:byte(116)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_22B_0 = stack_268_0 = stack_2BD_0 = var_3_18C:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0399)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(16384)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(-104932837))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(256)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(938637564))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(1860751327))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_187 = expr_9E:int
                var_3_18C = newarray:byte[](byte.class, expr_9E:int)
                var_5_18D = expr_9E:int
                goto(Label_0534)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(2048)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(576949577))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-288053545))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_257 = newarray:byte[](byte.class, expr_CB:int)
                var_5_258 = expr_CB:int
                
                loop {
                    var_0_19A = and:int(var_0_19A:int, ldc:int(1804904261))
                    var_5_258 = add:int(var_5_258:int, ldc:int(-1))
                    storeelement:byte(var_3_257:byte[], var_5_258:int, add:int(shl:int(loadelement:byte(stack_268_0:byte[], var_5_258:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_258:int, and:int(ldc:int(393), ldc:int(12805)))), ldc:int(5)), and:int(ldc:int(26791), ldc:int(31)))))
                    
                    if (cmpne:boolean(var_5_258:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_22B_0 = stack_268_0 = stack_2BD_0 = var_3_257:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(-1232101130))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(16)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(667594380))
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(2143550439))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2AC = newarray:byte[](byte.class, expr_FE:int)
                var_5_2AD = expr_FE:int
                
                loop {
                    var_0_19A = and:int(var_0_19A:int, ldc:int(1875754591))
                    var_5_2AD = add:int(var_5_2AD:int, ldc:int(-1))
                    expr_2BD = loadelement:byte(stack_2BD_0:byte[], var_5_2AD:int)
                    storeelement:byte(var_3_2AC:byte[], var_5_2AD:int, or:int(and:int(shl:int(expr_2BD:byte, xor:int(ldc:int(4867), ldc:int(4871))), ldc:int(-16)), and:int(shr:int(expr_2BD:byte[expected:int], and:int(ldc:int(4100), ldc:int(16405))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2AD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1AC_0 = stack_22B_0 = stack_268_0 = stack_2BD_0 = var_3_2AC:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(-639472874))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_180_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(13313), ldc:int(13315)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4166), ldc:int(4164)))
        storeelement:String(expr_144:String[], and:int(ldc:int(20724), ldc:int(-20725)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-2443), ldc:int(2442)), and:int(ldc:int(20501), ldc:int(10356))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(6274), ldc:int(6275)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(1077), ldc:int(16532)), and:int(ldc:int(39), ldc:int(8887))))
        putstatic:String[](\uc238\u93a2\u7873\u71f1\u12b2\u7af6::\u4492\u3776\ub113\u67d0\u960f\u71f1, expr_144:String[])
    }
    
    public void \u624e\u67d0\uc87f\ub18d\uc2e8\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_603 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60E : int
        
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
        var_3_603 = and:int(ldc:int(2087756387), ldc:int(970191781))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc238\u93a2\u7873\u71f1\u12b2\u7af6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_603 = and:int(var_3_603:int, ldc:int(1249178157))
            var_5_7D = and:int(ldc:int(-2293), ldc:int(2292))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3072), ldc:int(3038)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_603:int, ldc:int(-1889556636))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2136), ldc:int(2137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2077), ldc:int(16387)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_603 = and:int(var_3_D2:int, ldc:int(-850073667))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(21024), ldc:int(21025)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1082931220))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-438032438))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2134963715))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1740961277))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1606561638))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(558152325))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(38375503))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1613059100))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(256)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2035453246))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-361398721))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(672252199))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-2109298023))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1628247170))
                            var_11_E3 = and:int(ldc:int(-32747), ldc:int(2922))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(129214345))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(-279665802))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(2034165002))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-921603807))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-695734176))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1311539840))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-2052974211))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-40736419))
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1688880276))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1720269776))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-4493947))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(2034361101))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1577269190))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-657955082))
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(-42605897))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(17154), ldc:int(17155))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1873646512))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-393502443))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1922427007))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(480894047))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(139832867))
                        var_11_E3 = and:int(ldc:int(17581), ldc:int(-17582))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-457149160))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1942075050))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(573082232))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_603 = and:int(var_3_603:int, ldc:int(175547940))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1513106395))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1066115022))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(165181938))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_603:int, ldc:int(256)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1453975141))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(-1685559021))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_603 = and:int(var_3_603:int, ldc:int(1775483634))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1310086937))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-442650474))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1517738619))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(764508207))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-455972827))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_603 = and:int(var_3_603:int, ldc:int(2044640231))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(1373663211))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(564218342))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1082097564))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(246881029))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_603:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_603 = and:int(var_3_603:int, ldc:int(-1185810829))
                        var_17_60E = add:int(var_16_111:int, and:int(ldc:int(261), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_603 = and:int(var_3_603:int, ldc:int(738489898))
                }
                
                var_3_603 = and:int(var_3_603:int, ldc:int(-1384991953))
                
                if (cmple:boolean(var_5_7D = var_17_60E:int, sub:int(var_6_84:int, xor:int(ldc:int(29), ldc:int(28))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_603:int, ldc:int(512)), ldc:int(0))) {
            var_3_603 = and:int(var_3_603:int, ldc:int(36374509))
            goto(Label_0106)
        }
    }
}
