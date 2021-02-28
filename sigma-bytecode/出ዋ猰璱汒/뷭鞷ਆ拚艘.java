public class \u51fa\u12cb\u7330\u74b1\u6c52.\ubded\u97b7\u0a06\u62da\u8258 {
    private void \ubded\u97b7\u0a06\u62da\u8258() {
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
            invokespecial:Object(Object::<init>, this:\ubded\u97b7\u0a06\u62da\u8258)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u9a18\ub83f\ub1b9\u9937\u1187\uc229(java.lang.String p0) {
        var_1_5F : int
        stack_10F_0 : String [generated]
        var_3_114 : UnsupportedEncodingException
        
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
        var_1_5F = and:int(ldc:int(-1321393103), ldc:int(570100817))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(1033724563))
            stack_10F_0 = invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokevirtual:String(String::replace, invokestatic:String(URLEncoder::encode, p0:String, loadelement:String(getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(-23108), ldc:int(21059)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(2112), ldc:int(2113))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(1030), ldc:int(8402)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(7425), ldc:int(7426))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(10305), ldc:int(10309)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(517), ldc:int(181))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(7), ldc:int(8406)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(16927), ldc:int(13575))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(520), ldc:int(9512)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(582), ldc:int(591))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(1829), ldc:int(1839)))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), xor:int(ldc:int(2592), ldc:int(2603))), loadelement:String[expected:CharSequence](getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(1580), ldc:int(4428))))
            var_1_5F = and:int(var_1_5F:int, ldc:int(1069107697))
            return:String(stack_10F_0:String)
        }
        catch (java.io.UnsupportedEncodingException var_3_114) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_3_114:UnsupportedEncodingException[expected:Throwable]))
        }
    }
    
    public static java.lang.String \u76bc\u1187\ubf56\ucb79\ufe34\u99f7(java.lang.String p0) {
        var_1_5F : int
        stack_79_0 : String [generated]
        var_3_7E : UnsupportedEncodingException
        
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
        var_1_5F = and:int(ldc:int(-1017418722), ldc:int(-142893218))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-884291667))
            stack_79_0 = invokestatic:String(URLDecoder::decode, p0:String, loadelement:String(getstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe), and:int(ldc:int(-14860), ldc:int(14857))))
            var_1_5F = and:int(var_1_5F:int, ldc:int(-135734100))
            return:String(stack_79_0:String)
        }
        catch (java.io.UnsupportedEncodingException var_3_7E) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_3_7E:UnsupportedEncodingException[expected:Throwable]))
        }
    }
    
    static {
        var_0_7B : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_27D_0 : byte[] [generated]
        stack_2F4_0 : byte[] [generated]
        stack_34A_0 : byte[] [generated]
        var_4_260 : int
        var_3_265 : byte[]
        var_5_266 : int
        var_0_273 : int
        expr_27D : byte [generated]
        stack_2B9_2 : byte [generated]
        stack_298_0 : byte [generated]
        expr_2FA : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_339 : byte[]
        var_5_33A : int
        var_3_E2 : String
        stack_259_0 : String[] [generated]
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
        var_0_7B = and:int(ldc:int(197252793), ldc:int(986806075))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_27D_0 = stack_2F4_0 = stack_34A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ABT97xX99RT95g795x3S8w7jEubu7A0i0zofGF0H")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_260 = expr_6B:int
        var_3_265 = newarray:byte[](byte.class, expr_6B:int)
        var_5_266 = expr_6B:int
        Label_0616:
        
        while (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2048)), ldc:int(0))) {
            var_0_273 = and:int(var_0_7B:int, ldc:int(1256805115))
            var_5_266 = add:int(var_5_266:int, ldc:int(-1))
            expr_27D = stack_2B9_2 = loadelement(stack_27D_0, var_5_266)
            
            if (cmplt:boolean(add:int(add:int(var_5_266:int, ldc:int(4)), neg:int(var_4_260:int)), ldc:int(0))) {
                stack_2B9_2 = stack_298_0 = add:byte(expr_27D:byte, loadelement:byte(var_3_265:byte[], add:int(var_5_266:int, ldc:int(4))))
                goto(Label_0680)
            }
            
            Label_0650:
            
            if (cmpne:boolean(and:int(var_0_273:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_273 = and:int(var_0_273:int, ldc:int(-1360824333))
                stack_2B9_2 = stack_298_0 = add:byte(expr_27D:byte, ldc:byte(4))
            }
            
            Label_0680:
            
            if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0650)
            }
            
            var_0_7B = and:int(var_0_273:int, ldc:int(-1697286211))
            storeelement:byte(var_3_265:byte[], var_5_266:int, stack_2B9_2:byte)
            
            if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_27D_0 = stack_2F4_0 = stack_34A_0 = var_3_265:byte[]
            goto(Label_0112)
        }
        
        Label_0735:
        
        while (cmpne:boolean(and:int(var_0_7B:int, ldc:int(16384)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1876908735))
            var_5_266 = add:int(var_5_266:int, ldc:int(-1))
            expr_2FA = xor:byte(add:byte(loadelement:byte(stack_2F4_0:byte[], var_5_266:int), ldc:byte(14)), ldc:byte(23))
            storeelement:byte(var_3_265:byte[], var_5_266:int, or:int(and:int(shl:int(expr_2FA:byte, xor:int(ldc:int(5157), ldc:int(5153))), ldc:int(-16)), and:int(shr:int(expr_2FA:byte[expected:int], and:int(ldc:int(198), ldc:int(8244))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_27D_0 = stack_2F4_0 = stack_34A_0 = var_3_265:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0616)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(4096)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1931219307))
            goto(Label_0186)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-336765963))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_260 = expr_8F:int
                var_3_265 = newarray:byte[](byte.class, expr_8F:int)
                var_5_266 = expr_8F:int
                goto(Label_0735)
            }
        }
        
        Label_0148:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_7B = and:int(var_0_7B:int, ldc:int(901423031))
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_7B:int, ldc:int(-338307341))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_339 = newarray:byte[](byte.class, expr_B5:int)
                var_5_33A = expr_B5:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-1091961991))
                    var_5_33A = add:int(var_5_33A:int, ldc:int(-1))
                    storeelement:byte(var_3_339:byte[], var_5_33A:int, add:int(shl:int(loadelement:byte(stack_34A_0:byte[], var_5_33A:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_33A:int, and:int(ldc:int(12497), ldc:int(18437)))), ldc:int(4)), xor:int(ldc:int(2), ldc:int(13)))))
                    
                    if (cmpne:boolean(var_5_33A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_27D_0 = stack_2F4_0 = stack_34A_0 = var_3_339:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(64)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-1286105026))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_259_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(493), ldc:int(20495)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(14), ldc:int(3)))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(3), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-19150), ldc:int(19148)), xor:int(ldc:int(-20352), ldc:int(-20351))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(6404), ldc:int(6406)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(65), ldc:int(64)), xor:int(ldc:int(16391), ldc:int(16387))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(391), ldc:int(1579)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(16488), ldc:int(16492)), xor:int(ldc:int(20524), ldc:int(20523))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(27653), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-32621), ldc:int(-32620)), xor:int(ldc:int(16979), ldc:int(16985))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(18437), ldc:int(18434)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(22059), ldc:int(30)), and:int(ldc:int(13), ldc:int(10765))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(-32476), ldc:int(-32467)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(6669), ldc:int(6656)), xor:int(ldc:int(-16370), ldc:int(-16354))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(4411), ldc:int(19531)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-28651), ldc:int(-28667)), xor:int(ldc:int(1038), ldc:int(1053))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(16896), ldc:int(16902)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(140), ldc:int(159)), xor:int(ldc:int(4626), ldc:int(4614))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(16938), ldc:int(2184)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(5726), ldc:int(2068)), xor:int(ldc:int(2112), ldc:int(2133))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(4254), ldc:int(19018)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(4125), ldc:int(4104)), xor:int(ldc:int(-24571), ldc:int(-24557))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(21761), ldc:int(8233)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(12342), ldc:int(18526)), xor:int(ldc:int(1064), ldc:int(1087))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(17662), ldc:int(-18175)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(31), ldc:int(6167)), and:int(ldc:int(16509), ldc:int(15516))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(588), ldc:int(10510)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-16229), ldc:int(-16249)), xor:int(ldc:int(3738), ldc:int(3719))))
        putstatic:String[](\ubded\u97b7\u0a06\u62da\u8258::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe, expr_F4:String[])
    }
    
    public void \u64ab\u527a\ua6bd\u3c25\u64ab\u446c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_616 : int
        
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
        var_3_60B = and:int(ldc:int(-308511006), ldc:int(-3777041))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u97b7\u0a06\u62da\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(-304677634))
            var_5_7D = and:int(ldc:int(-14729), ldc:int(14728))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16362), ldc:int(15264)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60B:int, ldc:int(-452173826))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(21008), ldc:int(21009)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(657), ldc:int(656)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60B = and:int(var_3_D2:int, ldc:int(-173941253))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2113), ldc:int(17927)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1294971664))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-475759505))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1014062676))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1971937255))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1272147012))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1346446362))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-2113313417))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-466480359))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(910800117))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1518143595))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1460537690))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(2136506363))
                        var_11_E3 = and:int(ldc:int(-8281), ldc:int(8280))
                        goto(Label_1432)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1709857674))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(664760952))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1751687036))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1477470106))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1710743962))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-135176977))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1627795358))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-690730046))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-2069628012))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1328431342))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1975377127))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(2032159594))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1034777118))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1142051098))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-346109957))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(2137481202))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(10753), ldc:int(1301))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-2117522510))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(2037415680))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(2011095034))
                        var_11_E3 = and:int(ldc:int(-27386), ldc:int(2777))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1570492286))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1145886890))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1653818368))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-518246276))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1585211332))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-449020189))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1792258991))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-241901862))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-909478310))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1873021377))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-3091615))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-607703152))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1970887926))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1432)
                    }
                    
                    Label_1295:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1430650871))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-2091864750))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1920488084))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-115783289))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1349315646))
                        loopcontinue()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(2141879531))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1432:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_616 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1443:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1986508018))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1039979939))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1507618781))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1402907368))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-448037146))
                        var_17_616 = add:int(var_16_111:int, xor:int(ldc:int(8256), ldc:int(8257)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60B = and:int(var_3_60B:int, ldc:int(-140256002))
                
                if (cmple:boolean(var_5_7D = var_17_616:int, sub:int(var_6_84:int, xor:int(ldc:int(-28352), ldc:int(-28351))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(-1419543484))
            goto(Label_0106)
        }
    }
}
