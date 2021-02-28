public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3a62\uc910\u1187\u718f\u9255 {
    public void \u3a62\uc910\u1187\u718f\u9255() {
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
            invokespecial:Object(Object::<init>, this:\u3a62\uc910\u1187\u718f\u9255)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6fb0\u1187\u12b2\ua068\u5245\u67e9 \u74b1\u7af6\uc910\u6c52\u61a4(java.lang.String p0, int p1, float p2) {
        var_3_5F : int
        var_5_69 : InputStream
        var_6_7C : Font
        expr_9F : \u6fb0\u1187\u12b2\ua068\u5245\u67e9 [generated]
        var_5_B4 : Exception
        
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
        var_3_5F = and:int(ldc:int(5645079), ldc:int(-2031199481))
        
        try {
            var_3_5F = and:int(var_3_5F:int, ldc:int(1825227693))
            var_5_69 = invokestatic:InputStream(\u5db4\u1187\u647c\u9255\u8258::\ub102\ud4fe\u6b0d\u5245\u8cae, p0:String)
            var_3_5F = and:int(var_3_5F:int, ldc:int(978313967))
            var_6_7C = invokestatic:Font(Font::createFont, and:int(ldc:int(-19603), ldc:int(19600)), var_5_69:InputStream)
            
            do {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2036016039))
                    var_6_7C = invokevirtual:Font(Font::deriveFont, var_6_7C:Font, p1:int, p2:float)
                }
            } while (cmpne:boolean(and:int(var_3_5F:int, ldc:int(64)), ldc:int(0)))
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(960978885))
            expr_9F = initobject:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::<init>, var_6_7C:Font, f2i:int(p2:float))
            var_3_5F = and:int(var_3_5F:int, ldc:int(56796713))
            return:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(expr_9F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9)
        }
        catch (java.lang.Exception var_5_B4) {
            invokevirtual:void(Throwable::printStackTrace, var_5_B4:Exception[expected:Throwable])
            return:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(initobject:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::<init>, initobject:Font(Font::<init>, loadelement:String(getstatic:String[](\u3a62\uc910\u1187\u718f\u9255::\u51b2\u8d98\u8df4\u392e\ub171), and:int(ldc:int(-13751), ldc:int(422))), and:int(ldc:int(4570), ldc:int(-4571)), f2i:int(p2:float)), and:int[expected:boolean](ldc:int(8225), ldc:int(19081))))
        }
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6fb0\u1187\u12b2\ua068\u5245\u67e9 \u183a\u4975\u12b2\u4c04\u5bc4(java.lang.String p0, int p1, float p2) {
        var_3_5F : int
        var_5_69 : InputStream
        var_6_7C : Font
        expr_9F : \u6fb0\u1187\u12b2\ua068\u5245\u67e9 [generated]
        var_5_B9 : Exception
        var_3_DF : int
        expr_E4 : Font [generated]
        stack_12A_2 : int [generated]
        
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
        var_3_5F = and:int(ldc:int(26573894), ldc:int(-1644864145))
        
        try {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-178949386))
            var_5_69 = invokestatic:InputStream(\u5db4\u1187\u647c\u9255\u8258::\ub102\ud4fe\u6b0d\u5245\u8cae, p0:String)
            var_3_5F = and:int(var_3_5F:int, ldc:int(1897689566))
            var_6_7C = invokestatic:Font(Font::createFont, and:int(ldc:int(-32286), ldc:int(15885)), var_5_69:InputStream)
            
            do {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1482824242))
                    var_6_7C = invokevirtual:Font(Font::deriveFont, var_6_7C:Font, p1:int, p2:float)
                }
            } while (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0)))
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(398287726))
            expr_9F = initobject:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::<init>, var_6_7C:Font, xor:int[expected:boolean](ldc:int(2056), ldc:int(2057)))
            var_3_5F = and:int(var_3_5F:int, ldc:int(-39955242))
            return:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(expr_9F:\u6fb0\u1187\u12b2\ua068\u5245\u67e9)
        }
        catch (java.lang.Exception var_5_B9) {
            do {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-377378507))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(32956135))
                    invokevirtual:void(Throwable::printStackTrace, var_5_B9:Exception[expected:Throwable])
                }
            } while (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1048576)), ldc:int(0)))
            
            var_3_DF = and:int(var_3_5F:int, ldc:int(2100741734))
            expr_E4 = initobject:Font(Font::<init>, loadelement:String(getstatic:String[](\u3a62\uc910\u1187\u718f\u9255::\u51b2\u8d98\u8df4\u392e\ub171), and:int(ldc:int(8423), ldc:int(-13032))), and:int(ldc:int(-23430), ldc:int(20869)), f2i:int(p2:float))
            
            if (cmpne:boolean(invokevirtual:\uf995\ubf56\u7af6\u6b0d\u71ae(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8df4\u3711\u7af6\u1833\ubff1, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), getstatic:\uf995\ubf56\u7af6\u6b0d\u71ae(\uf995\ubf56\u7af6\u6b0d\u71ae::\u92ee\u5bc4\uc910\u7043\ud523))) {
                var_3_DF = and:int(var_3_DF:int, ldc:int(1272798791))
                stack_12A_2 = xor:int(ldc:int(-16375), ldc:int(-16376))
            }
            else {
                stack_12A_2 = and:int(ldc:int(-11516), ldc:int(3315))
            }
            
            return:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(initobject:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::<init>, expr_E4:Font, stack_12A_2:boolean))
        }
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_417_0 : byte[] [generated]
        stack_46D_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_37C : int
        var_3_381 : byte[]
        var_5_382 : int
        var_0_3AD : int
        expr_393 : byte [generated]
        stack_3E5_2 : byte [generated]
        stack_3B9_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_405 : byte[]
        var_5_406 : int
        expr_B5 : int [generated]
        var_3_45B : byte[]
        var_5_45C : int
        expr_46D : byte [generated]
        var_3_E2 : String
        expr_EA : String[] [generated]
        expr_F4 : String[] [generated]
        var_3_16C : String[]
        
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
            var_0_5F = and:int(ldc:int(-1874747260), ldc:int(-978606908))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_417_0 = stack_46D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("/VCPcYgjsL92uCAwUMlYqBDX8IAYstgBzsLon14oAXjff4gjyaD2sAJQB6bwgMAYcCdiGWC+95pAAN4gAckq+Lg+95j4I7C/drggMFDJWKgQ1/CAGLLYAc7C6J9eKAF433+II8mg9rACUAem8IDAGHAnYhlgvvfDuGGOIJi6oAA+95j4I7C/drggMFDJWKgQ1/CAGLLYAc7C6J9eKAF433+II8mg9rAC4Ae+GDlPaNLZkD5qZxf9"))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_37C = expr_6B:int
                var_3_381 = newarray:byte[](byte.class, expr_6B:int)
                var_5_382 = expr_6B:int
                
                loop {
                    var_0_3AD = and:int(var_0_5F:int, ldc:int(-271585804))
                    var_5_382 = add:int(var_5_382:int, ldc:int(-1))
                    expr_393 = stack_3E5_2 = loadelement(expr_65, var_5_382)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_382:int, ldc:int(3)), neg:int(var_4_37C:int)), ldc:int(0))) {
                        stack_3E5_2 = stack_3B9_0 = add:byte(expr_393:byte, loadelement:byte(var_3_381:byte[], add:int(var_5_382:int, ldc:int(3))))
                        goto(Label_0969)
                    }
                    
                    Label_0928:
                    
                    if (cmpeq:boolean(and:int(var_0_3AD:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_3AD = and:int(var_0_3AD:int, ldc:int(386462275))
                    }
                    else {
                        var_0_3AD = and:int(var_0_3AD:int, ldc:int(-839581747))
                        stack_3E5_2 = stack_3B9_0 = add:byte(expr_393:byte, ldc:byte(3))
                    }
                    
                    Label_0969:
                    
                    if (cmpeq:boolean(and:int(var_0_3AD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_3AD = and:int(var_0_3AD:int, ldc:int(598310947))
                        goto(Label_0928)
                    }
                    
                    var_0_5F = and:int(var_0_3AD:int, ldc:int(-1787904604))
                    storeelement:byte(var_3_381:byte[], var_5_382:int, stack_3E5_2:byte)
                    
                    if (cmpne:boolean(var_5_382:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_417_0 = stack_46D_0 = var_3_381:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1217159485))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1000081004))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_405 = newarray:byte[](byte.class, expr_91:int)
                        var_5_406 = expr_91:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-1254889787))
                            var_5_406 = add:int(var_5_406:int, ldc:int(-1))
                            storeelement:byte(var_3_405:byte[], var_5_406:int, add:int(shl:int(loadelement:byte(stack_417_0:byte[], var_5_406:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_406:int, xor:int(ldc:int(2272), ldc:int(2273)))), ldc:int(7)), xor:int(ldc:int(8217), ldc:int(8216)))))
                            
                            if (cmpne:boolean(var_5_406:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_417_0 = stack_46D_0 = var_3_405:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(723804157))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-853742146))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_45B = newarray:byte[](byte.class, expr_B5:int)
                        var_5_45C = expr_B5:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-933910634))
                            var_5_45C = add:int(var_5_45C:int, ldc:int(-1))
                            expr_46D = loadelement:byte(stack_46D_0:byte[], var_5_45C:int)
                            storeelement:byte(var_3_45B:byte[], var_5_45C:int, add:int(xor:int(or:int(and:int(shl:int(expr_46D:byte, and:int(ldc:int(15390), ldc:int(36))), ldc:int(-16)), and:int(shr:int(expr_46D:byte[expected:int], and:int(ldc:int(4820), ldc:int(8484))), ldc:int(15))), ldc:int(35)), ldc:int(6)))
                            
                            if (cmpne:boolean(var_5_45C:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_417_0 = stack_46D_0 = var_3_45B:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1317634349))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4503), ldc:int(580)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1602), ldc:int(1606)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(22080), ldc:int(-22089)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(8378), ldc:int(-8892)), and:int(ldc:int(4359), ldc:int(8717))))
            storeelement:String(expr_EA:String[], xor:int(ldc:int(-30336), ldc:int(-30333)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(9250), ldc:int(9255)), and:int(ldc:int(14573), ldc:int(71))))
            storeelement:String(expr_EA:String[], xor:int(ldc:int(8448), ldc:int(8449)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(2677), ldc:int(2608)), xor:int(ldc:int(9259), ldc:int(9391))))
            storeelement:String(expr_EA:String[], xor:int(ldc:int(517), ldc:int(519)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(1156), ldc:int(13005)), xor:int(ldc:int(93), ldc:int(235))))
            putstatic:String[](\u3a62\uc910\u1187\u718f\u9255::\u51b2\u8d98\u8df4\u392e\ub171, expr_F4:String[])
            var_3_16C = expr_EA:String[]
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u8258\u7af6\u98a4\u5d20\u8bb0, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(25153), ldc:int(4357))), and:int(ldc:int(17698), ldc:int(-18211)), ldc:float(12.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u92ff\u3776\ua6bd\uc87f\u8bb0, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(1232), ldc:int(1233))), and:int(ldc:int(10657), ldc:int(-10670)), ldc:float(14.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\uc87f\uc29a\u8d98\u4ab3\u8aa5, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(6147), ldc:int(16529))), and:int(ldc:int(-10362), ldc:int(8313)), ldc:float(18.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua3b4\u4d85\u3e75\u6198\u7330, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(14467), ldc:int(1121))), and:int(ldc:int(-12825), ldc:int(12824)), ldc:float(20.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ubded\u5654\u120d\u7330\u516c, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(19651), ldc:int(513))), and:int(ldc:int(7952), ldc:int(-7954)), ldc:float(25.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u4daf\u72f1\u16f6\u8aa5\u8389, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(-31872), ldc:int(-31871))), and:int(ldc:int(23562), ldc:int(-31919)), ldc:float(40.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u4f4a\u6b5f\ua562\u6d69\u7af6, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(-23040), ldc:int(-23039))), and:int(ldc:int(17548), ldc:int(-17549)), ldc:float(50.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ucb79\u4f4a\u7330\u0c95\u8753, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(2065), ldc:int(4385))), and:int(ldc:int(-24680), ldc:int(24677)), ldc:float(28.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u836c\u3504\uc87f\ud171\u8aa5, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(8836), ldc:int(8837))), and:int(ldc:int(-11677), ldc:int(11668)), ldc:float(24.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u5d20\u71f1\u071d\ub171\ufcaf, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(16717), ldc:int(7731))), and:int(ldc:int(10592), ldc:int(-10593)), ldc:float(36.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ufcaf\uc238\u64ab\uc31c\u3d64, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(1538), ldc:int(1536))), and:int(ldc:int(30790), ldc:int(-30807)), ldc:float(20.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u1187\u7049\u120d\u836c\u3a62, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(7297), ldc:int(7299))), and:int(ldc:int(17094), ldc:int(-17095)), ldc:float(40.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u59ec\u64ab\u4daf\uc246\u839e, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(22567), ldc:int(523))), and:int(ldc:int(-4462), ldc:int(4457)), ldc:float(14.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ub70c\uf9c5\u67d0\ucef1\ucb79, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(16515), ldc:int(7527))), and:int(ldc:int(2615), ldc:int(-6968)), ldc:float(20.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u4ab3\u98a4\ud217\u873d\u40a9, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(4139), ldc:int(4136))), and:int(ldc:int(17329), ldc:int(-18358)), ldc:float(25.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(25987), ldc:int(575))), and:int(ldc:int(18864), ldc:int(-27057)), ldc:float(40.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u8753\ubcb0\u8709\u120d\u873d, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u183a\u4975\u12b2\u4c04\u5bc4, loadelement:String(var_3_16C:String[], and:int(ldc:int(8195), ldc:int(16423))), and:int(ldc:int(2170), ldc:int(-2171)), ldc:float(50.0f)))
            putstatic:\ub102\u4ab3\uc246\u527a\u62da(\u3a62\uc910\u1187\u718f\u9255::\ub70c\u0800\u983f\u4492\u4c04, initobject:\ub102\u4ab3\uc246\u527a\u62da(\ub102\u4ab3\uc246\u527a\u62da::<init>, and:int(ldc:int(1158), ldc:int(31042))))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ub70c\u69d9\u416d\u5d20\uc910, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u74b1\u7af6\uc910\u6c52\u61a4, loadelement:String(var_3_16C:String[], and:int(ldc:int(6625), ldc:int(1027))), and:int(ldc:int(1071), ldc:int(-1200)), ldc:float(18.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u52d3\u5f50\u71ae\uc246\u516c, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u74b1\u7af6\uc910\u6c52\u61a4, loadelement:String(var_3_16C:String[], and:int(ldc:int(133), ldc:int(771))), and:int(ldc:int(17507), ldc:int(-17764)), ldc:float(14.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u839e\ud4fe\u34df\u47c2\u3776, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u74b1\u7af6\uc910\u6c52\u61a4, loadelement:String(var_3_16C:String[], xor:int(ldc:int(-22522), ldc:int(-22523))), and:int(ldc:int(-23579), ldc:int(23578)), ldc:float(20.0f)))
            putstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u3e2a\ub6ab\u6d69\u983f\u965f, invokestatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u74b1\u7af6\uc910\u6c52\u61a4, loadelement:String(var_3_16C:String[], and:int(ldc:int(2719), ldc:int(21795))), and:int(ldc:int(16557), ldc:int(-16622)), ldc:float(25.0f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6b0d\u7330\u6d99\u9033\u5bc4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68E : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_699 : int
        
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
        var_3_68E = and:int(ldc:int(-967808103), ldc:int(-338582759))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\uc910\u1187\u718f\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(-505732232))
        }
        else {
            var_3_68E = and:int(var_3_68E:int, ldc:int(-673749025))
            var_5_8A = and:int(ldc:int(-31425), ldc:int(29376))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17494), ldc:int(17489)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68E:int, ldc:int(-805541089))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(67), ldc:int(24837)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(3332), ldc:int(3333)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68E = and:int(var_3_DA:int, ldc:int(-951900323))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1537), ldc:int(16853)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-176189114))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-397208830))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-882294870))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(49925536))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-753918214))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1887628439))
                    }
                    else {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1035965669))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0425:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1140892238))
                        goto(Label_1576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1728874552))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-592585338))
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-15174885))
                            var_11_EB = and:int(ldc:int(3938), ldc:int(-3939))
                            goto(Label_1565)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0580:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-14892325))
                        goto(Label_1576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1418803918))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1314630832))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1149282635))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-748244997))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-379034762))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1088911826))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1716963634))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(790459122))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1224933327))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-702976035))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2122978393))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1483235182))
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-544065761))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(17504), ldc:int(17505))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1897356616))
                        goto(Label_1576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1157318018))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(738504137))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1099246476))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1474136287))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1748915965))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-672585761))
                        var_11_EB = and:int(ldc:int(-24164), ldc:int(20003))
                    }
                    
                    Label_1128:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(43436410))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-932365189))
                            goto(Label_0951)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1705244472))
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-323484344))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1554176653))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-485758977))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1409409180))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1307501616))
                            goto(Label_0951)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-812552977))
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-2120552168))
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-2004234872))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-822677635))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1565)
                    }
                    
                    Label_1404:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1318167707))
                        goto(Label_1576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1185118874))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2037662293))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(318536953))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(486580094))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-793733826))
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-710515800))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68E = and:int(var_3_68E:int, ldc:int(-231424103))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1565:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_699 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1576:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1747767994))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(708482177))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1432287597))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-883348519))
                        var_17_699 = add:int(var_16_119:int, xor:int(ldc:int(10369), ldc:int(10368)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68E = and:int(var_3_68E:int, ldc:int(-675301477))
                
                if (cmple:boolean(var_5_8A = var_17_699:int, sub:int(var_6_91:int, and:int(ldc:int(259), ldc:int(14389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
