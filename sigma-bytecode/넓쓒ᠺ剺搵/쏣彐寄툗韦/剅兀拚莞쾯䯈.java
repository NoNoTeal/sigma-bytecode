public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5245\u5140\u62da\u839e\ucfaf\u4bc8 {
    public void \u5245\u5140\u62da\u839e\ucfaf\u4bc8() {
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
            invokespecial:Object(Object::<init>, this:\u5245\u5140\u62da\u839e\ucfaf\u4bc8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\u52d3\u7873\ud51e\uc31c\ud51e\u385b \u3e2a\u2dcc\u6198\u3c25\ucfaf\u9255(int p0, boolean p1) {
        var_2_5F : int
        var_4_6D : Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>
        
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
        var_2_5F = and:int(ldc:int(650843909), ldc:int(1994106861))
        
        if (logicalnot:boolean(p1:boolean)) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(1607929175))
            var_4_6D = invokestatic:Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>(\u52d3\u7873\ud51e\uc31c\ud51e\u385b::\u0800\u6c52\ua61f\ufe34\u071d\u6ec6, p0:int)
        }
        else {
            var_4_6D = invokestatic:Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>(\u4ab3\ud36e\uc2e8\u64f2\uc2bd\u446c::\u62da\u93a2\u3504\u4d85\u516c\u3776, p0:int)
        }
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_4_6D:Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>)) {
            return:\u52d3\u7873\ud51e\uc31c\ud51e\u385b(checkcast:\u52d3\u7873\ud51e\uc31c\ud51e\u385b(\u71f1\uc910\u3bc9\u516c\u93a2.\u52d3\u7873\ud51e\uc31c\ud51e\u385b.class, invokevirtual:\u52d3\u7873\ud51e\uc31c\ud51e\u385b(Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>::get, var_4_6D:Optional<\u52d3\u7873\ud51e\uc31c\ud51e\u385b>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5245\u5140\u62da\u839e\ucfaf\u4bc8::\ud12e\u7873\u7af6\u6b5f\u5f50\ub19c), and:int(ldc:int(25156), ldc:int(-28261)))), p0:int), loadelement:String(getstatic:String[](\u5245\u5140\u62da\u839e\ucfaf\u4bc8::\ud12e\u7873\u7af6\u6b5f\u5f50\ub19c), xor:int(ldc:int(-30144), ldc:int(-30143)))), p1:boolean)))
        return:\u52d3\u7873\ud51e\uc31c\ud51e\u385b(getstatic:\u52d3\u7873\ud51e\uc31c\ud51e\u385b(\u52d3\u7873\ud51e\uc31c\ud51e\u385b::\ub1b9\uafe7\u9937\u34df\u12b2\ub1b9))
    }
    
    static {
        var_0_22F : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1A3_0 : byte[] [generated]
        stack_1DD_0 : byte[] [generated]
        stack_250_0 : byte[] [generated]
        stack_2B4_0 : byte[] [generated]
        var_4_17F : int
        var_3_184 : byte[]
        var_5_185 : int
        expr_250 : byte [generated]
        var_0_2AA : int
        expr_2B4 : byte [generated]
        stack_2E2_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1CC : byte[]
        var_5_1CD : int
        expr_D3 : int [generated]
        expr_F6 : int [generated]
        var_3_12A : String
        stack_178_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_22F = and:int(ldc:int(-1262198843), ldc:int(-538543130))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2B4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CZN9O2N0LEsF84Lz1Fz+McvrfvG76+z+SyQ7nBTBa9Rk9gl0/kR0")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17F = expr_6B:int
        var_3_184 = newarray:byte[](byte.class, expr_6B:int)
        var_5_185 = expr_6B:int
        Label_0391:
        
        while (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0548)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(939358958))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            storeelement:byte(var_3_184:byte[], var_5_185:int, add:byte(loadelement:byte(stack_1A3_0:byte[], var_5_185:int), ldc:byte(12)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2B4_0 = var_3_184:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0664)
        Label_0548:
        
        while (cmpne:boolean(and:int(var_0_22F:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_22F = and:int(var_0_22F:int, ldc:int(535025720))
                goto(Label_0391)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-721978659))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_250 = loadelement:byte(stack_250_0:byte[], var_5_185:int)
            storeelement:byte(var_3_184:byte[], var_5_185:int, xor:int(or:int(and:int(shl:int(expr_250:byte, xor:int(ldc:int(0), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_250:byte[expected:int], xor:int(ldc:int(1026), ldc:int(1030))), ldc:int(15))), ldc:int(5)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2B4_0 = var_3_184:byte[]
            goto(Label_0216)
        }
        
        var_0_22F = and:int(var_0_22F:int, ldc:int(685425500))
        Label_0664:
        
        while (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0391)
            }
            
            var_0_2AA = and:int(var_0_22F:int, ldc:int(264534725))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_2B4 = loadelement:byte(stack_2B4_0:byte[], var_5_185:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_185:int, ldc:int(1)), neg:int(var_4_17F:int)), ldc:int(0))) {
                var_0_2AA = and:int(var_0_2AA:int, ldc:int(1573871341))
                stack_2E2_2 = add:byte(expr_2B4:byte, ldc:byte(1))
            }
            else {
                stack_2E2_2 = add:byte(expr_2B4:byte, loadelement:byte(var_3_184:byte[], add:int(var_5_185:int, ldc:int(1))))
            }
            
            var_0_22F = and:int(var_0_2AA:int, ldc:int(1961876445))
            storeelement:byte(var_3_184:byte[], var_5_185:int, stack_2E2_2:byte)
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2B4_0 = var_3_184:byte[]
            goto(Label_0251)
        }
        
        goto(Label_0548)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1590630614))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1659267872))
        }
        else {
            var_0_22F = and:int(var_0_22F:int, ldc:int(516750070))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1CC = newarray:byte[](byte.class, expr_A0:int)
                var_5_1CD = expr_A0:int
                
                loop {
                    var_0_22F = and:int(var_0_22F:int, ldc:int(-723125298))
                    var_5_1CD = add:int(var_5_1CD:int, ldc:int(-1))
                    storeelement:byte(var_3_1CC:byte[], var_5_1CD:int, add:int(shl:int(loadelement:byte(stack_1DD_0:byte[], var_5_1CD:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1CD:int, and:int(ldc:int(8529), ldc:int(2049)))), ldc:int(7)), xor:int(ldc:int(1040), ldc:int(1041)))))
                    
                    if (cmpne:boolean(var_5_1CD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1A3_0 = stack_1DD_0 = stack_250_0 = stack_2B4_0 = var_3_1CC:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(1482611411))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(32)), ldc:int(0))) {
                var_0_22F = and:int(var_0_22F:int, ldc:int(-407877488))
                goto(Label_0112)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-1510580228))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_17F = expr_D3:int
                var_3_184 = newarray:byte[](byte.class, expr_D3:int)
                var_5_185 = expr_D3:int
                goto(Label_0548)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22F = and:int(var_0_22F:int, ldc:int(-135888906))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_4_17F = expr_F6:int
                var_3_184 = newarray:byte[](byte.class, expr_F6:int)
                var_5_185 = expr_F6:int
                goto(Label_0664)
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_22F:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(2)), ldc:int(0))) {
            var_0_22F = and:int(var_0_22F:int, ldc:int(236100048))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_22F:int, ldc:int(512)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_178_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31227), ldc:int(-31225)))
            expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2306), ldc:int(2304)))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(3078), ldc:int(3079)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-5952), ldc:int(4627)), xor:int(ldc:int(653), ldc:int(647))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(20586), ldc:int(-28783)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-32666), ldc:int(-32660)), and:int(ldc:int(1830), ldc:int(38))))
            putstatic:String[](\u5245\u5140\u62da\u839e\ucfaf\u4bc8::\ud12e\u7873\u7af6\u6b5f\u5f50\ub19c, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ubded\uae87\u718f\u5db4\u5140\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_639 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_644 : int
        
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
        var_3_639 = and:int(ldc:int(-780458278), ldc:int(-563888516))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\u5140\u62da\u839e\ucfaf\u4bc8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
            var_3_639 = and:int(var_3_639:int, ldc:int(-646026226))
        }
        else {
            var_3_639 = and:int(var_3_639:int, ldc:int(1386430335))
            var_5_85 = and:int(ldc:int(25482), ldc:int(-26540))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23265), ldc:int(23136)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_639:int, ldc:int(-114563329))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(21633), ldc:int(10753)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2560), ldc:int(2561)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_639 = and:int(var_3_D2:int, ldc:int(-60597005))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1), ldc:int(8205)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1892022278))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-961198116))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(33410146))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-698653450))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1242627670))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(457310717))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(789065245))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1220360014))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2041050611))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1437184773))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1559547584))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(672372259))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1684218766))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(426206552))
                        var_11_E3 = and:int(ldc:int(14504), ldc:int(-14505))
                        goto(Label_1478)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1811656574))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(968827910))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1107558381))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1763812936))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(16)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1649004723))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1558692980))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-2009475042))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-324908942))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(726221531))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1347247477))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1842236817))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-828870183))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-990684793))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-618154883))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1533340915))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1636827026))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(1526423295))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2337), ldc:int(2336))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-857946033))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1419840310))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-641034133))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-788706809))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(2058815195))
                        var_11_E3 = and:int(ldc:int(14752), ldc:int(-15265))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(772191987))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(242300419))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(373640164))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(513058514))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1082713839))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1904536047))
                            loopcontinue()
                        }
                        
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1808847626))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1238:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1493451747))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-1223981256))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_639:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(-2118634528))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_639 = and:int(var_3_639:int, ldc:int(1345551445))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1478)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1357:
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2051033037))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(2094025572))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-43514968))
                        loopcontinue()
                    }
                    
                    var_3_639 = and:int(var_3_639:int, ldc:int(-1187551276))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_644 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1922453447))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(99876144))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(442623879))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(1238374759))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_639:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_639 = and:int(var_3_639:int, ldc:int(-1086876041))
                        var_17_644 = add:int(var_16_111:int, and:int(ldc:int(81), ldc:int(267)))
                        looporswitchbreak()
                    }
                }
                
                var_3_639 = and:int(var_3_639:int, ldc:int(-704969612))
                
                if (cmple:boolean(var_5_85 = var_17_644:int, sub:int(var_6_8C:int, and:int(ldc:int(16929), ldc:int(4225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_639:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
