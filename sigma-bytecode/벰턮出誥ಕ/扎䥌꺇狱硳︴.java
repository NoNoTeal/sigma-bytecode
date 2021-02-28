public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u624e\u494c\uae87\u72f1\u7873\ufe34 {
    public void \u624e\u494c\uae87\u72f1\u7873\ufe34() {
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
            invokespecial:Object(Object::<init>, this:\u624e\u494c\uae87\u72f1\u7873\ufe34)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\u8350\ub70c\u7049\u8df4\u5654 \u9af2\u8c8a\u12b2\u8350\uc4d2\ua562(int p0, boolean p1) {
        var_2_5F : int
        var_4_6D : Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>
        
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
        var_2_5F = and:int(ldc:int(-1085329702), ldc:int(1587494398))
        
        if (logicalnot:boolean(p1:boolean)) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(1876901886))
            var_4_6D = invokestatic:Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>(\u5bc4\u8350\ub70c\u7049\u8df4\u5654::\u6d99\u40a9\u3a62\u718f\u8d90\u2dcc, p0:int)
        }
        else {
            var_4_6D = invokestatic:Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>(\u600f\uc84e\u4f4a\u5f50\uafe7\u71ae::\u946b\ua6bd\u9af2\u51b2\ud36e\uc9f6, p0:int)
        }
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_4_6D:Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>)) {
            return:\u5bc4\u8350\ub70c\u7049\u8df4\u5654(checkcast:\u5bc4\u8350\ub70c\u7049\u8df4\u5654(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\u8350\ub70c\u7049\u8df4\u5654.class, invokevirtual:\u5bc4\u8350\ub70c\u7049\u8df4\u5654(Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>::get, var_4_6D:Optional<\u5bc4\u8350\ub70c\u7049\u8df4\u5654>)))
        }
        
        invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u624e\u494c\uae87\u72f1\u7873\ufe34::\u4f4a\u5db4\ud523\u4f52\u624e\u4492), and:int(ldc:int(-5778), ldc:int(5777)))), p0:int), loadelement:String(getstatic:String[](\u624e\u494c\uae87\u72f1\u7873\ufe34::\u4f4a\u5db4\ud523\u4f52\u624e\u4492), xor:int(ldc:int(5140), ldc:int(5141)))), p1:boolean)))
        return:\u5bc4\u8350\ub70c\u7049\u8df4\u5654(getstatic:\u5bc4\u8350\ub70c\u7049\u8df4\u5654(\u5bc4\u8350\ub70c\u7049\u8df4\u5654::\ube23\ub18d\uae5d\u8aa5\u4cd9\ud171))
    }
    
    static {
        var_0_1FC : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_20E_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2E3_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_199 : byte[]
        var_4_19A : int
        expr_A0 : int [generated]
        var_5_1E9 : int
        var_3_1EE : byte[]
        var_4_1EF : int
        expr_20E : byte [generated]
        var_0_261 : int
        expr_26B : byte [generated]
        stack_2AF_2 : byte [generated]
        stack_28E_0 : byte [generated]
        expr_DB : int [generated]
        expr_116 : int [generated]
        var_3_2D2 : byte[]
        var_4_2D3 : int
        var_3_142 : String
        stack_190_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
            var_0_1FC = and:int(ldc:int(1294440654), ldc:int(1277467311))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_20E_0 = stack_26B_0 = stack_2E3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A/UrKM3U2gIHKuX5J3zX3oxrKSCQK28UHc3cL5uSnSt1IyIkY2/Q"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_199 = newarray:byte[](byte.class, expr_6D:int)
                var_4_19A = expr_6D:int
                
                loop {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(-557987362))
                    var_4_19A = add:int(var_4_19A:int, ldc:int(-1))
                    storeelement:byte(var_3_199:byte[], var_4_19A:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_19A:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_19A:int, and:int(ldc:int(16929), ldc:int(2177)))), ldc:int(4)), xor:int(ldc:int(-32765), ldc:int(-32756)))))
                    
                    if (cmpne:boolean(var_4_19A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_20E_0 = stack_26B_0 = stack_2E3_0 = var_3_199:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(2094248658))
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(1731390768))
                    goto(Label_0165)
                }
                
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(1341968892))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1E9 = expr_A0:int
                var_3_1EE = newarray:byte[](byte.class, expr_A0:int)
                var_4_1EF = expr_A0:int
                Label_0497:
                
                while (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(1596301978))
                    var_4_1EF = add:int(var_4_1EF:int, ldc:int(-1))
                    expr_20E = loadelement:byte(stack_20E_0:byte[], var_4_1EF:int)
                    storeelement:byte(var_3_1EE:byte[], var_4_1EF:int, xor:int(or:int(and:int(shl:int(expr_20E:byte, and:int(ldc:int(17486), ldc:int(2980))), ldc:int(-16)), and:int(shr:int(expr_20E:byte[expected:int], and:int(ldc:int(2070), ldc:int(1668))), ldc:int(15))), ldc:int(34)))
                    
                    if (cmpne:boolean(var_4_1EF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_20E_0 = stack_26B_0 = stack_2E3_0 = var_3_1EE:byte[]
                    goto(Label_0165)
                }
                
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(-1371380204))
                Label_0598:
                
                while (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_261 = and:int(var_0_1FC:int, ldc:int(-570951718))
                    var_4_1EF = add:int(var_4_1EF:int, ldc:int(-1))
                    expr_26B = stack_2AF_2 = loadelement(stack_26B_0, var_4_1EF)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1EF:int, ldc:int(3)), neg:int(var_5_1E9:int)), ldc:int(0))) {
                        stack_2AF_2 = stack_28E_0 = add:byte(expr_26B:byte, loadelement:byte(var_3_1EE:byte[], add:int(var_4_1EF:int, ldc:int(3))))
                        goto(Label_0670)
                    }
                    
                    Label_0632:
                    
                    if (cmpne:boolean(and:int(var_0_261:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_261 = and:int(var_0_261:int, ldc:int(1281681552))
                    }
                    else {
                        var_0_261 = and:int(var_0_261:int, ldc:int(2095888008))
                        stack_2AF_2 = stack_28E_0 = add:byte(expr_26B:byte, ldc:byte(3))
                    }
                    
                    Label_0670:
                    
                    if (cmpne:boolean(and:int(var_0_261:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0632)
                    }
                    
                    var_0_1FC = and:int(var_0_261:int, ldc:int(-815296562))
                    storeelement:byte(var_3_1EE:byte[], var_4_1EF:int, stack_2AF_2:byte)
                    
                    if (cmpne:boolean(var_4_1EF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_20E_0 = stack_26B_0 = stack_2E3_0 = var_3_1EE:byte[]
                    goto(Label_0224)
                }
                
                goto(Label_0497)
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(128)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(-733940393))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(128)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(-440852816))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_1FC = and:int(var_0_1FC:int, ldc:int(-307309524))
                        loopcontinue()
                    }
                    
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(1336933804))
                    expr_DB = arraylength:int(stack_DB_0:byte[])
                    
                    if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                        var_5_1E9 = expr_DB:int
                        var_3_1EE = newarray:byte[](byte.class, expr_DB:int)
                        var_4_1EF = expr_DB:int
                        goto(Label_0598)
                    }
                }
                
                Label_0224:
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(-994668631))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_0_1FC = and:int(var_0_1FC:int, ldc:int(2104452844))
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_1FC = and:int(var_0_1FC:int, ldc:int(30008424))
                        loopcontinue()
                    }
                    
                    var_0_1FC = and:int(var_0_1FC:int, ldc:int(-281235252))
                    expr_116 = arraylength:int(stack_116_0:byte[])
                    
                    if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                        var_3_2D2 = newarray:byte[](byte.class, expr_116:int)
                        var_4_2D3 = expr_116:int
                        
                        loop {
                            var_0_1FC = and:int(var_0_1FC:int, ldc:int(1554952360))
                            var_4_2D3 = add:int(var_4_2D3:int, ldc:int(-1))
                            storeelement:byte(var_3_2D2:byte[], var_4_2D3:int, add:byte(loadelement:byte(stack_2E3_0:byte[], var_4_2D3:int), ldc:byte(32)))
                            
                            if (cmpne:boolean(var_4_2D3:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_20E_0 = stack_26B_0 = stack_2E3_0 = var_3_2D2:byte[]
                    }
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_190_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(641), ldc:int(643)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16410), ldc:int(1319)))
            storeelement:String(expr_154:String[], xor:int(ldc:int(3120), ldc:int(3121)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(5179), ldc:int(-5180)), xor:int(ldc:int(2701), ldc:int(2695))))
            storeelement:String(expr_154:String[], and:int(ldc:int(7360), ldc:int(-7362)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(10403), ldc:int(10409)), and:int(ldc:int(310), ldc:int(1071))))
            putstatic:String[](\u624e\u494c\uae87\u72f1\u7873\ufe34::\u4f4a\u5db4\ud523\u4f52\u624e\u4492, expr_154:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u71ae\ub7dc\ua3b4\u071d\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_610 : int
        
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
        var_3_605 = and:int(ldc:int(-877445116), ldc:int(1336803076))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u494c\uae87\u72f1\u7873\ufe34[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(1635180904))
        }
        else {
            var_3_605 = and:int(var_3_605:int, ldc:int(250206429))
            var_5_85 = and:int(ldc:int(4310), ldc:int(-21720))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5555), ldc:int(5552)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_605:int, ldc:int(524624482))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-28655), ldc:int(-28656)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(3078), ldc:int(3079)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_DA:int, ldc:int(705507400))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(24576), ldc:int(24577)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1167587514))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1507612271))
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2138848487))
                    }
                    else {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1055642716))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1551269998))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(747023256))
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1551867203))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(153969276))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1316659250))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-272945366))
                        var_11_EB = and:int(ldc:int(3241), ldc:int(-3242))
                        goto(Label_1425)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1109969135))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1973744346))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-156645235))
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1685360615))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2030280533))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(39129456))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1192377477))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-514104630))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(2060662509))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0698:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-77245051))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-248330963))
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-536873923))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1874508339))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(465390449))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0698)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-414063634))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-555111314))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-344354032))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(4193), ldc:int(1027))
                                goto(Label_1062)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1542493007))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-185019290))
                            goto(Label_0698)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1353667579))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1098416697))
                        var_11_EB = and:int(ldc:int(28931), ldc:int(-28932))
                    }
                    
                    Label_1062:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(755712874))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1270682384))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0698)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1372345716))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1161:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(685534309))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1139006200))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-345577049))
                            goto(Label_1062)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(508646997))
                            goto(Label_0698)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(508950991))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1425)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-493788473))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1550114747))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1109608061))
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-516841478))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1304847335))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(801368276))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1425:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1436:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1784521136))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-744605028))
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-760143297))
                        goto(Label_0698)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1932923327))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1441712015))
                        var_17_610 = add:int(var_16_119:int, xor:int(ldc:int(-30720), ldc:int(-30719)))
                        looporswitchbreak()
                    }
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(-558505004))
                
                if (cmple:boolean(var_5_85 = var_17_610:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32495), ldc:int(-32496))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(1466815109))
            goto(Label_0106)
        }
    }
}
