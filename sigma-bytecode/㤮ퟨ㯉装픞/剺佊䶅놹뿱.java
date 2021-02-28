public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u527a\u4f4a\u4d85\ub1b9\ubff1 {
    public void \u527a\u4f4a\u4d85\ub1b9\ubff1() {
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
            invokespecial:\ud158\u839e\u7006\uc3e3\u446c(\ud158\u839e\u7006\uc3e3\u446c::<init>, this:\u527a\u4f4a\u4d85\ub1b9\ubff1, getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\ud51e\u5db4\u51fa\u36d3\uc87f), loadelement:String(getstatic:String[](\u527a\u4f4a\u4d85\ub1b9\ubff1::\u624e\u4bc8\u2dcc\u600f\u120d), and:int(ldc:int(-4205), ldc:int(4204))), loadelement:String(getstatic:String[](\u527a\u4f4a\u4d85\ub1b9\ubff1::\u624e\u4bc8\u2dcc\u600f\u120d), xor:int(ldc:int(6912), ldc:int(6913))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u1833\u99f7\ucef1\u4ab3\u2dcc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_5F : int
        var_4_101 : \ub113\u1187\uc229\ub1b9\uc238
        
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
        var_2_5F = and:int(ldc:int(339921461), ldc:int(1892534811))
        
        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u527a\u4f4a\u4d85\ub1b9\ubff1[expected:\ud158\u839e\u7006\uc3e3\u446c]))) {
            return:void()
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1158531364))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1067908859))
                
                if (cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    return:void()
                }
            }
            
            Label_0139:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2097152)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(2064834365))
                
                if (cmplt:boolean(getfield:int(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b))), ldc:int(10))) {
                    return:void()
                }
            }
            
            Label_0172:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0139)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub113\u1187\uc229\ub1b9\uc238.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))) {
                        var_4_101 = checkcast:\ub113\u1187\uc229\ub1b9\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub113\u1187\uc229\ub1b9\uc238.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\ub113\u1187\uc229\ub1b9\uc238](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                        putfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u5245\uae87\ua068\u6cfe\u6198\u0a06, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b)), getfield:float(\ub113\u1187\uc229\ub1b9\uc238::\u3dd3\ub1b9\u6d99\u74b1\u927d\u392e, var_4_101:\ub113\u1187\uc229\ub1b9\uc238))
                        putfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u516c\u3dd3\u3bd6\u93a2\u0c95\u8cae, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b)), getfield:float(\ub113\u1187\uc229\ub1b9\uc238::\u624e\uceb8\u4492\uc31c\ub113\ud171, var_4_101:\ub113\u1187\uc229\ub1b9\uc238))
                        putfield:float(\ub113\u1187\uc229\ub1b9\uc238::\u3dd3\ub1b9\u6d99\u74b1\u927d\u392e, var_4_101:\ub113\u1187\uc229\ub1b9\uc238, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b))))
                        putfield:float(\ub113\u1187\uc229\ub1b9\uc238::\u624e\uceb8\u4492\uc31c\ub113\ud171, var_4_101:\ub113\u1187\uc229\ub1b9\uc238, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u527a\u4f4a\u4d85\ub1b9\ubff1::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    }
                }
                
                return:void()
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(590060406))
        }
    }
    
    static {
        var_0_1B1 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_102_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1C3_0 : byte[] [generated]
        stack_211_0 : byte[] [generated]
        stack_29F_0 : byte[] [generated]
        stack_2EF_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        var_0_207 : int
        expr_211 : byte [generated]
        stack_24D_2 : byte [generated]
        stack_22C_0 : byte [generated]
        expr_29F : byte [generated]
        expr_9E : int [generated]
        expr_D9 : int [generated]
        var_2_102 : byte[]
        expr_106 : int [generated]
        var_3_2DE : byte[]
        var_5_2DF : int
        var_3_142 : String
        stack_190_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_1B1 = and:int(ldc:int(-2063101236), ldc:int(-724330505))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D7_0 = stack_D9_0 = stack_102_0 = stack_104_0 = stack_136_0 = stack_1C3_0 = stack_211_0 = stack_29F_0 = stack_2EF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("qIrImTFBScHp4bk4YcGjsSmxu+fpmeFXaRvZEaEhaZHhifEPYVERaZNReYHJOaFB2eG34duxEXEb57HRmR+8L5c/92w=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-105227412))
                goto(Label_0501)
            }
            
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1078216026))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, xor:byte(add:byte(loadelement:byte(stack_1C3_0:byte[], var_5_19D:int), ldc:byte(47)), ldc:byte(96)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_102_0 = stack_104_0 = stack_136_0 = stack_1C3_0 = stack_211_0 = stack_29F_0 = stack_2EF_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0627)
        Label_0501:
        
        while (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0415)
            }
            
            var_0_207 = and:int(var_0_1B1:int, ldc:int(-1268862353))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_211 = stack_24D_2 = loadelement(stack_211_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(5)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_24D_2 = stack_22C_0 = add:byte(expr_211:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(5))))
                goto(Label_0572)
            }
            
            Label_0542:
            
            if (cmpeq:boolean(and:int(var_0_207:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_207 = and:int(var_0_207:int, ldc:int(-699140425))
                stack_24D_2 = stack_22C_0 = add:byte(expr_211:byte, ldc:byte(5))
            }
            
            Label_0572:
            
            if (cmpne:boolean(and:int(var_0_207:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0542)
            }
            
            var_0_1B1 = and:int(var_0_207:int, ldc:int(-155123769))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_24D_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_102_0 = stack_104_0 = stack_136_0 = stack_1C3_0 = stack_211_0 = stack_29F_0 = stack_2EF_0 = var_3_19C:byte[]
            goto(Label_0163)
        }
        
        Label_0627:
        
        while (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(32)), ldc:int(0))) {
                var_0_1B1 = and:int(var_0_1B1:int, ldc:int(1201341023))
                goto(Label_0415)
            }
            
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1915183585))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_29F = loadelement:byte(stack_29F_0:byte[], var_5_19D:int)
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, or:int(and:int(shl:int(expr_29F:byte, and:int(ldc:int(2068), ldc:int(8716))), ldc:int(-16)), and:int(shr:int(expr_29F:byte[expected:int], and:int(ldc:int(8588), ldc:int(5189))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_102_0 = stack_104_0 = stack_136_0 = stack_1C3_0 = stack_211_0 = stack_29F_0 = stack_2EF_0 = var_3_19C:byte[]
            goto(Label_0222)
        }
        
        var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1722035089))
        goto(Label_0501)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(512)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-384840257))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(2)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(816642903))
        }
        else {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1656105084))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_197 = expr_9E:int
                var_3_19C = newarray:byte[](byte.class, expr_9E:int)
                var_5_19D = expr_9E:int
                goto(Label_0501)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(4)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(1173887658))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(1609920705))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(32)), ldc:int(0))) {
                var_0_1B1 = and:int(var_0_1B1:int, ldc:int(1261384637))
                goto(Label_0112)
            }
            
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1507870027))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_197 = expr_D9:int
                var_3_19C = newarray:byte[](byte.class, expr_D9:int)
                var_5_19D = expr_D9:int
                goto(Label_0627)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1232201169))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1800687051))
            var_2_102 = stack_102_0:byte[]
            expr_106 = add:int(arraylength:int(stack_104_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2DE = newarray:byte[](byte.class, expr_106:int)
                var_5_2DF = expr_106:int
                
                loop {
                    var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1371669931))
                    var_5_2DF = add:int(var_5_2DF:int, ldc:int(-1))
                    storeelement:byte(var_3_2DE:byte[], var_5_2DF:int, add:int(shl:int(loadelement:byte(stack_2EF_0:byte[], var_5_2DF:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_102:byte[], add:int(var_5_2DF:int, and:int(ldc:int(2177), ldc:int(1825)))), ldc:int(7)), xor:int(ldc:int(4100), ldc:int(4101)))))
                    
                    if (cmpne:boolean(var_5_2DF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_102_0 = stack_104_0 = stack_136_0 = stack_1C3_0 = stack_211_0 = stack_29F_0 = stack_2EF_0 = var_3_2DE:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(2)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-7650879))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1B1:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B1:int, ldc:int(4)), ldc:int(0))) {
            var_0_1B1 = and:int(var_0_1B1:int, ldc:int(-1540440107))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_190_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4160), ldc:int(4162)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(354), ldc:int(4747)))
        storeelement:String(expr_154:String[], and:int(ldc:int(-6083), ldc:int(1984)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(563), ldc:int(-564)), xor:int(ldc:int(12289), ldc:int(12298))))
        storeelement:String(expr_154:String[], and:int(ldc:int(521), ldc:int(13713)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(12971), ldc:int(2079)), and:int(ldc:int(1347), ldc:int(21219))))
        putstatic:String[](\u527a\u4f4a\u4d85\ub1b9\ubff1::\u624e\u4bc8\u2dcc\u600f\u120d, expr_154:String[])
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F8 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_603 : int
        
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
        var_3_5F8 = and:int(ldc:int(155779089), ldc:int(-1620168047))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u527a\u4f4a\u4d85\ub1b9\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1685343761))
        }
        else {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1397779859))
            var_5_85 = and:int(ldc:int(-25927), ldc:int(25926))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10525), ldc:int(-14624)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F8:int, ldc:int(-1318723791))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(9221), ldc:int(9220)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(30477), ldc:int(65)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F8 = and:int(var_3_DA:int, ldc:int(-1300752167))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(5120), ldc:int(5121)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1601492781))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2077174207))
                        goto(Label_0647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1385184946))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2142375101))
                    }
                    else {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-20069857))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0753)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(836783867))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1569168057))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1583162520))
                        goto(Label_0647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1236115967))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1113370303))
                            var_11_EB = and:int(ldc:int(16464), ldc:int(-16465))
                            goto(Label_1422)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(633899162))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-933950318))
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1975540983))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0753)
                        }
                    }
                    
                    Label_0647:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1050794565))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1165692249))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-422434383))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0753:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(315760770))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(979114427))
                            goto(Label_0647)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1338342531))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2016632719))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(8737), ldc:int(18441))
                                goto(Label_1020)
                            }
                        }
                    }
                    
                    Label_0860:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-920554509))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1857541726))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1893094323))
                            goto(Label_0753)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0647)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(692140615))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-862362908))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1767328507))
                        var_11_EB = and:int(ldc:int(12609), ldc:int(-12610))
                    }
                    
                    Label_1020:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-471849295))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0753)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(62010880))
                            goto(Label_0647)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-913022698))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1486929581))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1129:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2120008639))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(193881618))
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0753)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1273571850))
                            goto(Label_0647)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1764067048))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-908700607))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1681228823))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1493744463))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1422)
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(440382160))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1332003213))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(270511388))
                        goto(Label_0647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(497210842))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1508092220))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1999736071))
                        loopcontinue()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1350643785))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1422:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_603 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1433:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1307367475))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1643085087))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0753)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-34340289))
                        var_17_603 = add:int(var_16_119:int, xor:int(ldc:int(10504), ldc:int(10505)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-399180271))
                }
                
                var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-202664491))
                
                if (cmple:boolean(var_5_85 = var_17_603:int, sub:int(var_6_8C:int, xor:int(ldc:int(-12284), ldc:int(-12283))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1423341583))
            goto(Label_0106)
        }
    }
}
