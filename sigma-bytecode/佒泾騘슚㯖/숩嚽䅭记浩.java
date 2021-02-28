public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc229\u56bd\u416d\u8bb0\u6d69 {
    public void \uc229\u56bd\u416d\u8bb0\u6d69(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u927d\u3504\u9937\u5d20\uf995 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud4fe\u156b\ud523\ucef1\uc7fe p1) {
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
            putfield:\u927d\u3504\u9937\u5d20\uf995(\uc229\u56bd\u416d\u8bb0\u6d69::\u3776\ud158\u51fa\u7ce1\u12b2\u071d, this:\uc229\u56bd\u416d\u8bb0\u6d69, p0:\u927d\u3504\u9937\u5d20\uf995)
            putfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\uc229\u56bd\u416d\u8bb0\u6d69::\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52, this:\uc229\u56bd\u416d\u8bb0\u6d69, p1:\ud4fe\u156b\ud523\ucef1\uc7fe)
            invokespecial:Object(Object::<init>, this:\uc229\u56bd\u416d\u8bb0\u6d69)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\u5245\ucb79\u5654\u9af2\u9033(java.lang.Object[] p0) {
        var_4_7B : Object
        stack_C3_0 : \ud4fe\u156b\ud523\ucef1\uc7fe [generated]
        stack_C3_1 : String [generated]
        expr_B5 : Object[] [generated]
        
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
            var_4_7B = ternaryop:Object(cmple:boolean(arraylength:int(p0:Object[]), ldc:int(0)), aconstnull:Object(), loadelement:Object(p0:Object[], and:int(ldc:int(26821), ldc:int(-26824))))
            invokevirtual:void(Logger::fine, invokestatic:Logger(\ud4fe\u156b\ud523\ucef1\uc7fe::\uceb8\u40a9\u0b8e\u4daf\ub32d\ufe34), loadelement:String(getstatic:String[](\uc229\u56bd\u416d\u8bb0\u6d69::\ub8be\u4179\u183a\u8c8a\u7c6b\ub32d), and:int(ldc:int(12441), ldc:int(-28828))))
            invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u4c04\ud12e\u3504\u92ff\u392e\uf9c5, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\uc229\u56bd\u416d\u8bb0\u6d69::\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52, this:\uc229\u56bd\u416d\u8bb0\u6d69))
            putfield:\u946b\u76bc\u47c2\u7049\uf995(\ud4fe\u156b\ud523\ucef1\uc7fe::\ucb79\u12b2\uc84e\u965f\u927d\ufe34, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\uc229\u56bd\u416d\u8bb0\u6d69::\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52, this:\uc229\u56bd\u416d\u8bb0\u6d69), getstatic:\u946b\u76bc\u47c2\u7049\uf995(\u946b\u76bc\u47c2\u7049\uf995::\u64ab\u92ee\u718f\u836c\u67d0\u0a06))
            stack_C3_0 = getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\uc229\u56bd\u416d\u8bb0\u6d69::\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52, this:\uc229\u56bd\u416d\u8bb0\u6d69)
            stack_C3_1 = loadelement:String(getstatic:String[](\uc229\u56bd\u416d\u8bb0\u6d69::\ub8be\u4179\u183a\u8c8a\u7c6b\ub32d), and:int(ldc:int(31249), ldc:int(-31346)))
            expr_B5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(14345), ldc:int(16385)))
            storeelement:Object(expr_B5:Object[], and:int(ldc:int(-4020), ldc:int(3219)), var_4_7B:Exception[expected:Object])
            invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u47c2\ud171\u9937\uf94d\uae87\u34df, stack_C3_0:\ud4fe\u156b\ud523\ucef1\uc7fe, stack_C3_1:String, expr_B5:Object[])
            
            if (cmpeq:boolean(getfield:\u4cd9\u4daf\u647c\u6cfe\uc31c(\u927d\u3504\u9937\u5d20\uf995::\u4cd9\u6c52\u5654\u416d\uc910\u97e6, getfield:\u927d\u3504\u9937\u5d20\uf995(\uc229\u56bd\u416d\u8bb0\u6d69::\u3776\ud158\u51fa\u7ce1\u12b2\u071d, this:\uc229\u56bd\u416d\u8bb0\u6d69)), aconstnull:\u4cd9\u4daf\u647c\u6cfe\uc31c())) {
                invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\uf9c5\u62da\ua61f\u527a\ua068\uc3e3, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\uc229\u56bd\u416d\u8bb0\u6d69::\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52, this:\uc229\u56bd\u416d\u8bb0\u6d69))
            }
            else {
                invokeinterface:void(\u4cd9\u4daf\u647c\u6cfe\uc31c::\u5fe1\u946b\u97b7\u67d0\u446c\ufcaf, getfield:\u4cd9\u4daf\u647c\u6cfe\uc31c(\u927d\u3504\u9937\u5d20\uf995::\u4cd9\u6c52\u5654\u416d\uc910\u97e6, getfield:\u927d\u3504\u9937\u5d20\uf995(\uc229\u56bd\u416d\u8bb0\u6d69::\u3776\ud158\u51fa\u7ce1\u12b2\u071d, this:\uc229\u56bd\u416d\u8bb0\u6d69)), initobject:\u071d\u3d4b\u7af6\u71f1\u71ae(\u071d\u3d4b\u7af6\u71f1\u71ae::<init>, loadelement:String(getstatic:String[](\uc229\u56bd\u416d\u8bb0\u6d69::\ub8be\u4179\u183a\u8c8a\u7c6b\ub32d), xor:int(ldc:int(4352), ldc:int(4353))), ternaryop:Exception(instanceof:boolean(java.lang.Exception.class, var_4_7B:Exception[expected:Object]), checkcast:Exception(java.lang.Exception.class, var_4_7B:Exception[expected:Object]), aconstnull:Exception())))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23B : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_24D_0 : byte[] [generated]
        stack_2BD_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_191 : byte[]
        var_4_192 : int
        expr_A0 : int [generated]
        var_5_1E1 : int
        var_3_1E6 : byte[]
        var_4_1E7 : int
        var_0_243 : int
        expr_24D : byte [generated]
        stack_289_2 : byte [generated]
        stack_268_0 : byte [generated]
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2AC : byte[]
        var_4_2AD : int
        expr_2BD : byte [generated]
        var_3_13A : String
        stack_188_0 : String[] [generated]
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
            var_0_23B = and:int(ldc:int(-321047628), ldc:int(-268595040))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1FE_0 = stack_24D_0 = stack_2BD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NGrmyu7gkw7q3c/wpvMYozbq5sru4LtMsKbzGK5A"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_191 = newarray:byte[](byte.class, expr_6D:int)
                var_4_192 = expr_6D:int
                
                loop {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-467815823))
                    var_4_192 = add:int(var_4_192:int, ldc:int(-1))
                    storeelement:byte(var_3_191:byte[], var_4_192:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_192:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_192:int, xor:int(ldc:int(16512), ldc:int(16513)))), ldc:int(6)), and:int(ldc:int(3), ldc:int(12355)))))
                    
                    if (cmpne:boolean(var_4_192:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1FE_0 = stack_24D_0 = stack_2BD_0 = var_3_191:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-205993947))
                    goto(Label_0267)
                }
                
                if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(8)), ldc:int(0))) {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-1545194555))
                    goto(Label_0165)
                }
                
                var_0_23B = and:int(var_0_23B:int, ldc:int(-287450182))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1E1 = expr_A0:int
                var_3_1E6 = newarray:byte[](byte.class, expr_A0:int)
                var_4_1E7 = expr_A0:int
                Label_0489:
                
                while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-153100750))
                    var_4_1E7 = add:int(var_4_1E7:int, ldc:int(-1))
                    storeelement:byte(var_3_1E6:byte[], var_4_1E7:int, xor:byte(add:byte(loadelement:byte(stack_1FE_0:byte[], var_4_1E7:int), ldc:byte(105)), ldc:byte(4)))
                    
                    if (cmpne:boolean(var_4_1E7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1FE_0 = stack_24D_0 = stack_2BD_0 = var_3_1E6:byte[]
                    goto(Label_0165)
                }
                
                Label_0560:
                
                while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_243 = and:int(var_0_23B:int, ldc:int(1834875187))
                    var_4_1E7 = add:int(var_4_1E7:int, ldc:int(-1))
                    expr_24D = stack_289_2 = loadelement(stack_24D_0, var_4_1E7)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1E7:int, ldc:int(1)), neg:int(var_5_1E1:int)), ldc:int(0))) {
                        stack_289_2 = stack_268_0 = add:byte(expr_24D:byte, loadelement:byte(var_3_1E6:byte[], add:int(var_4_1E7:int, ldc:int(1))))
                        goto(Label_0632)
                    }
                    
                    Label_0602:
                    
                    if (cmpeq:boolean(and:int(var_0_243:int, ldc:int(16777216)), ldc:int(0))) {
                        var_0_243 = and:int(var_0_243:int, ldc:int(-432014536))
                        stack_289_2 = stack_268_0 = add:byte(expr_24D:byte, ldc:byte(1))
                    }
                    
                    Label_0632:
                    
                    if (cmpeq:boolean(and:int(var_0_243:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    var_0_23B = and:int(var_0_243:int, ldc:int(-39855965))
                    storeelement:byte(var_3_1E6:byte[], var_4_1E7:int, stack_289_2:byte)
                    
                    if (cmpne:boolean(var_4_1E7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1FE_0 = stack_24D_0 = stack_2BD_0 = var_3_1E6:byte[]
                    goto(Label_0216)
                }
                
                var_0_23B = and:int(var_0_23B:int, ldc:int(1481077699))
                goto(Label_0489)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(8)), ldc:int(0))) {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(132785408))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_23B = and:int(var_0_23B:int, ldc:int(778965239))
                        loopcontinue()
                    }
                    
                    var_0_23B = and:int(var_0_23B:int, ldc:int(2141035248))
                    expr_D3 = arraylength:int(stack_D3_0:byte[])
                    
                    if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                        var_5_1E1 = expr_D3:int
                        var_3_1E6 = newarray:byte[](byte.class, expr_D3:int)
                        var_4_1E7 = expr_D3:int
                        goto(Label_0560)
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(273600645))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_23B = and:int(var_0_23B:int, ldc:int(-1097970108))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_23B = and:int(var_0_23B:int, ldc:int(-329264087))
                    expr_106 = arraylength:int(stack_106_0:byte[])
                    
                    if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                        var_3_2AC = newarray:byte[](byte.class, expr_106:int)
                        var_4_2AD = expr_106:int
                        
                        loop {
                            var_0_23B = and:int(var_0_23B:int, ldc:int(-149081238))
                            var_4_2AD = add:int(var_4_2AD:int, ldc:int(-1))
                            expr_2BD = loadelement:byte(stack_2BD_0:byte[], var_4_2AD:int)
                            storeelement:byte(var_3_2AC:byte[], var_4_2AD:int, or:int(and:int(shl:int(expr_2BD:byte, xor:int(ldc:int(-28541), ldc:int(-28537))), ldc:int(-16)), and:int(shr:int(expr_2BD:byte[expected:int], xor:int(ldc:int(1121), ldc:int(1125))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2AD:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1FE_0 = stack_24D_0 = stack_2BD_0 = var_3_2AC:byte[]
                    }
                }
                
                Label_0267:
                
                if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_23B = and:int(var_0_23B:int, ldc:int(718021969))
            }
            
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_188_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(11776), ldc:int(11778)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12803), ldc:int(12801)))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(-32634), ldc:int(-32633)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(6661), ldc:int(-23046)), xor:int(ldc:int(4096), ldc:int(4112))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(6706), ldc:int(-15924)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(31832), ldc:int(21)), xor:int(ldc:int(95), ldc:int(66))))
            putstatic:String[](\uc229\u56bd\u416d\u8bb0\u6d69::\ub8be\u4179\u183a\u8c8a\u7c6b\ub32d, expr_14C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u93a2\u4492\u0a06\u4bc8\ubcb0\u97b7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_62E = and:int(ldc:int(-1611940575), ldc:int(1541643182))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc229\u56bd\u416d\u8bb0\u6d69[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_62E = and:int(var_3_62E:int, ldc:int(1610588032))
            var_5_7D = and:int(ldc:int(27846), ldc:int(-31943))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31474), ldc:int(26737)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_62E:int, ldc:int(-1074550318))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(17), ldc:int(18733)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(8195), ldc:int(677)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_62E = and:int(var_3_CA:int, ldc:int(1409259801))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32635), ldc:int(-32636)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-155757586))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1399966265))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1187426701))
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1475325426))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(753014617))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-2124727743))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(207072243))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-2126100454))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1894702366))
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1613739111))
                        goto(Label_0647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1073187598))
                            var_11_DB = and:int(ldc:int(20568), ldc:int(-23418))
                            goto(Label_1440)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1574342791))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1395913620))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-369761007))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-68948710))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0647:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1976010512))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1589431727))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(887388064))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(2004237901))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1276909250))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0772:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(964012814))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(1348456987))
                            goto(Label_0647)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(498367750))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-54262))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(2080082180))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(797), ldc:int(30753))
                                goto(Label_1049)
                            }
                        }
                    }
                    
                    Label_0888:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1327879661))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1253174126))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(927659775))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0647)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1919209986))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(628516217))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(2079845322))
                        var_11_DB = and:int(ldc:int(21738), ldc:int(-30459))
                    }
                    
                    Label_1049:
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1940393614))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1884674954))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(71344787))
                            goto(Label_0647)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-778121997))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-958579260))
                            loopcontinue()
                        }
                        
                        var_3_62E = and:int(var_3_62E:int, ldc:int(2011414426))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1311)
                            }
                        }
                    }
                    
                    Label_1175:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(979381303))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1429985550))
                            goto(Label_1049)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1810444099))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0647)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1235815171))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-999185201))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62E = and:int(var_3_62E:int, ldc:int(-1140867687))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1440)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1311:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1377661470))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1099326162))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1647639925))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(1335874999))
                        loopcontinue()
                    }
                    
                    var_3_62E = and:int(var_3_62E:int, ldc:int(2011666701))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1440:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_639 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1827194351))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-64739833))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(441902483))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1839316180))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(212082165))
                        goto(Label_0647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-1083735325))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-492581654))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62E = and:int(var_3_62E:int, ldc:int(-537924861))
                        var_17_639 = add:int(var_16_109:int, and:int(ldc:int(23041), ldc:int(8199)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62E = and:int(var_3_62E:int, ldc:int(-1208514238))
                
                if (cmple:boolean(var_5_7D = var_17_639:int, sub:int(var_6_84:int, and:int(ldc:int(2565), ldc:int(385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_62E:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
