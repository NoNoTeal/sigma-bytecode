public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ufe34\ubefe\u6fb0\u16f6\u946b\u647c {
    public void \ufe34\ubefe\u6fb0\u16f6\u946b\u647c() {
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
            invokespecial:Object(Object::<init>, this:\ufe34\ubefe\u6fb0\u16f6\u946b\u647c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u6435\u99f7\u946b\u760c\u76bc\uae5d \u3d4b\u0b8e\uc29a\u51b2\u7330\ubded(int p0, boolean p1) {
        var_2_5F : int
        var_4_6D : Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>
        
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
        var_2_5F = and:int(ldc:int(1278951115), ldc:int(-1384203356))
        
        if (logicalnot:boolean(p1:boolean)) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-542458923))
            var_4_6D = invokestatic:Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>(\u6435\u99f7\u946b\u760c\u76bc\uae5d::\u8c8a\u99f7\ub102\u3711\ua6bd\ucfaf, p0:int)
        }
        else {
            var_4_6D = invokestatic:Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>(\ub83f\ube23\u3d64\u983f\u12cb\uc31c::\u40a9\u5bc4\u8cae\u0800\u600f\uc87f, p0:int)
        }
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_4_6D:Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>)) {
            return:\u6435\u99f7\u946b\u760c\u76bc\uae5d(checkcast:\u6435\u99f7\u946b\u760c\u76bc\uae5d(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u6435\u99f7\u946b\u760c\u76bc\uae5d.class, invokevirtual:\u6435\u99f7\u946b\u760c\u76bc\uae5d(Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>::get, var_4_6D:Optional<\u6435\u99f7\u946b\u760c\u76bc\uae5d>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ufe34\ubefe\u6fb0\u16f6\u946b\u647c::\u3e2a\uf94d\uc910\ua61f\uc87f\ufe34), and:int(ldc:int(-24091), ldc:int(23570)))), p0:int), loadelement:String(getstatic:String[](\ufe34\ubefe\u6fb0\u16f6\u946b\u647c::\u3e2a\uf94d\uc910\ua61f\uc87f\ufe34), xor:int(ldc:int(8224), ldc:int(8225)))), p1:boolean)))
        return:\u6435\u99f7\u946b\u760c\u76bc\uae5d(getstatic:\u6435\u99f7\u946b\u760c\u76bc\uae5d(\u6435\u99f7\u946b\u760c\u76bc\uae5d::\u927d\u5fe1\uf94d\ub8be\u624e\u760c))
    }
    
    static {
        var_0_22F : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1A3_0 : byte[] [generated]
        stack_1DD_0 : byte[] [generated]
        stack_250_0 : byte[] [generated]
        stack_2C4_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        expr_253 : byte [generated]
        var_0_2BA : int
        expr_2C4 : byte [generated]
        stack_2F2_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1CC : byte[]
        var_5_1CD : int
        expr_CB : int [generated]
        expr_F6 : int [generated]
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
        var_0_22F = and:int(ldc:int(-1344501800), ldc:int(-10508326))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2C4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("9xJaNfUq1TPbbOzK2oCtV41o8qedOvDLTWLtWn8nwsJgfX+Y0fIk")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(128)), ldc:int(0))) {
                var_0_22F = and:int(var_0_22F:int, ldc:int(-613368631))
                goto(Label_0548)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-53626919))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:byte(loadelement:byte(stack_1A3_0:byte[], var_5_17D:int), ldc:byte(92)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2C4_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0664)
        Label_0548:
        
        while (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_22F = and:int(var_0_22F:int, ldc:int(1600334465))
                goto(Label_0383)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-298330165))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_253 = xor:byte(loadelement:byte(stack_250_0:byte[], var_5_17D:int), ldc:byte(124))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, or:int(and:int(shl:int(expr_253:byte, xor:int(ldc:int(-24512), ldc:int(-24508))), ldc:int(-16)), and:int(shr:int(expr_253:byte[expected:int], and:int(ldc:int(2068), ldc:int(21836))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2C4_0 = var_3_17C:byte[]
            goto(Label_0208)
        }
        
        var_0_22F = and:int(var_0_22F:int, ldc:int(-854007072))
        Label_0664:
        
        while (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(64)), ldc:int(0))) {
                var_0_22F = and:int(var_0_22F:int, ldc:int(-417081389))
                goto(Label_0383)
            }
            
            var_0_2BA = and:int(var_0_22F:int, ldc:int(-516962616))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_2C4 = loadelement:byte(stack_2C4_0:byte[], var_5_17D:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_17D:int, ldc:int(2)), neg:int(var_4_177:int)), ldc:int(0))) {
                var_0_2BA = and:int(var_0_2BA:int, ldc:int(-141586466))
                stack_2F2_2 = add:byte(expr_2C4:byte, ldc:byte(2))
            }
            else {
                stack_2F2_2 = add:byte(expr_2C4:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(2))))
            }
            
            var_0_22F = and:int(var_0_2BA:int, ldc:int(-1546272772))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_2F2_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2C4_0 = var_3_17C:byte[]
            goto(Label_0251)
        }
        
        var_0_22F = and:int(var_0_22F:int, ldc:int(2053051450))
        goto(Label_0548)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(8192)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-395055277))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1528968062))
        }
        else {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-395474999))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1CC = newarray:byte[](byte.class, expr_A0:int)
                var_5_1CD = expr_A0:int
                
                loop {
                    var_0_22F = and:int(var_0_22F:int, ldc:int(-1263097857))
                    var_5_1CD = add:int(var_5_1CD:int, ldc:int(-1))
                    storeelement:byte(var_3_1CC:byte[], var_5_1CD:int, add:int(shl:int(loadelement:byte(stack_1DD_0:byte[], var_5_1CD:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1CD:int, xor:int(ldc:int(-28288), ldc:int(-28287)))), ldc:int(7)), xor:int(ldc:int(544), ldc:int(545)))))
                    
                    if (cmpne:boolean(var_5_1CD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2C4_0 = var_3_1CC:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(128)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1261396901))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1419387153))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_177 = expr_CB:int
                var_3_17C = newarray:byte[](byte.class, expr_CB:int)
                var_5_17D = expr_CB:int
                goto(Label_0548)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(64)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(1844047476))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-299964673))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_4_177 = expr_F6:int
                var_3_17C = newarray:byte[](byte.class, expr_F6:int)
                var_5_17D = expr_F6:int
                goto(Label_0664)
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(8192)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_170_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(514), ldc:int(22658)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8231), ldc:int(8229)))
            storeelement:String(expr_134:String[], and:int(ldc:int(2097), ldc:int(8449)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(29296), ldc:int(-29561)), and:int(ldc:int(7307), ldc:int(74))))
            storeelement:String(expr_134:String[], and:int(ldc:int(18522), ldc:int(-18523)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(16400), ldc:int(16410)), xor:int(ldc:int(8268), ldc:int(8298))))
            putstatic:String[](\ufe34\ubefe\u6fb0\u16f6\u946b\u647c::\u3e2a\uf94d\uc910\ua61f\uc87f\ufe34, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u1833\u5d20\u56bd\u8753\u3c25\uc29a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_616 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_621 : int
        
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
        var_3_616 = and:int(ldc:int(-505036577), ldc:int(-1989551657))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufe34\ubefe\u6fb0\u16f6\u946b\u647c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
            var_3_616 = and:int(var_3_616:int, ldc:int(-523381288))
        }
        else {
            var_3_616 = and:int(var_3_616:int, ldc:int(-940185605))
            var_5_85 = and:int(ldc:int(-29100), ldc:int(20907))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-529), ldc:int(528)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_616:int, ldc:int(-1937795073))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(25093), ldc:int(4465)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(6339), ldc:int(9233)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_616 = and:int(var_3_DA:int, ldc:int(-419854125))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2056), ldc:int(2057)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-799651599))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1061462801))
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1103698841))
                    }
                    else {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1158550023))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0785)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(257936259))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1649829647))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1123133537))
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0785)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2001442212))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(231601712))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-134488367))
                        var_11_EB = and:int(ldc:int(1134), ldc:int(-1647))
                        goto(Label_1451)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1169534965))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1723844387))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2054782173))
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-303502458))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-529411595))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0785)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2036747887))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(455684930))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-576342690))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1423966459))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-847276065))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0785:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-80209347))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1297260254))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-2049469145))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1249923873))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(34), ldc:int(35))
                                goto(Label_1038)
                            }
                        }
                    }
                    
                    Label_0895:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(849435898))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1665565133))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0785)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1046484504))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-75903265))
                        var_11_EB = and:int(ldc:int(5299), ldc:int(-13556))
                    }
                    
                    Label_1038:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1517621287))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-424685568))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-771507343))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-491617739))
                            goto(Label_0895)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-1887870289))
                            goto(Label_0785)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-1187512383))
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(269783665))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1745641225))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1322)
                            }
                        }
                    }
                    
                    Label_1185:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-194739988))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-870916227))
                            goto(Label_1038)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1495298557))
                            goto(Label_0785)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(504324100))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-1284709637))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1284263723))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1451)
                    }
                    
                    Label_1322:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1564220495))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1622089433))
                        goto(Label_0785)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1251258801))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1783385635))
                        loopcontinue()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(-1887856161))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_621 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-49547567))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2101965543))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1038)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0785)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2097571855))
                        var_17_621 = add:int(var_16_119:int, and:int(ldc:int(6419), ldc:int(9737)))
                        looporswitchbreak()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(1566965975))
                }
                
                var_3_616 = and:int(var_3_616:int, ldc:int(-1191212807))
                
                if (cmple:boolean(var_5_85 = var_17_621:int, sub:int(var_6_8C:int, and:int(ldc:int(257), ldc:int(3585))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_616 = and:int(var_3_616:int, ldc:int(1840083039))
            goto(Label_0106)
        }
    }
}
