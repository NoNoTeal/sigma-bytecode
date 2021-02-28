public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d {
    public void \u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d(java.lang.Class p0, java.lang.Class[] p1, java.lang.Class p2, java.lang.Class[] p3, java.lang.String p4) {
        var_8_6D : Field[]
        var_9_76 : ArrayList<Object>
        var_10_7F : int
        var_10_98 : ArrayList<Object>
        var_11_C3 : int
        
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
            invokespecial:Object(Object::<init>, this:\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d)
            putfield:Field(\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\ub6ab\u67d0\u7006\uae87\uafe7\u69d9, this:\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d, aconstnull:Field())
            var_8_6D = invokevirtual:Field[](Class::getDeclaredFields, p0:Class)
            var_9_76 = initobject:ArrayList<Object>(ArrayList<E>::<init>)
            var_10_7F = and:int(ldc:int(-29329), ldc:int(21136))
            
            while (cmplt:boolean(var_10_7F:int, arraylength:int(var_8_6D:Field[]))) {
                invokeinterface:boolean(List<Class<?>>::add, var_9_76:List<Class<?>>, invokevirtual:Class<?>(Field::getType, loadelement:Field(var_8_6D:Field[], var_10_7F:int)))
                inc:int(var_10_7F, ldc:int(1))
            }
            
            var_10_98 = initobject:ArrayList<Object>(ArrayList<E>::<init>)
            invokeinterface:boolean(List<Object>::addAll, var_10_98:ArrayList<Object>[expected:List<Object>], invokestatic:List<Class>[expected:Collection<?>](Arrays::asList, p1:Class[]))
            invokeinterface:boolean(List<?>::add, var_10_98:ArrayList<Object>[expected:List<?>], p2:Object[expected:?])
            invokeinterface:boolean(List<Object>::addAll, var_10_98:ArrayList<Object>[expected:List<Object>], invokestatic:List<Class>[expected:Collection<?>](Arrays::asList, p3:Class[]))
            var_11_C3 = invokestatic:int(Collections::indexOfSubList, var_9_76:ArrayList<Object>[expected:List<?>], var_10_98:ArrayList<Object>[expected:List<?>])
            
            if (cmpge:boolean(var_11_C3:int, ldc:int(0))) {
                if (cmplt:boolean(invokestatic:int(Collections::indexOfSubList, invokeinterface:List<Object>(List<Object>::subList, var_9_76:ArrayList<Object>[expected:List<Object>], add:int(var_11_C3:int, and:int(ldc:int(2179), ldc:int(1357))), invokeinterface:int(List<E>::size, var_9_76:ArrayList<Object>[expected:List<Object>])), var_10_98:ArrayList<Object>[expected:List<?>]), ldc:int(0))) {
                    putfield:Field(\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\ub6ab\u67d0\u7006\uae87\uafe7\u69d9, this:\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d, loadelement:Field(var_8_6D:Field[], add:int(var_11_C3:int, arraylength:int(p1:Class[]))))
                }
                else {
                    invokestatic:void(\u47c2\ud171\u9937\uf94d\uae87\u34df::\u72f1\u7e3f\u3711\u8350\ub102\u12b2, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\uc2e8\u183a\u76bc\u5654\u8413\u5bc4), xor:int(ldc:int(-32767), ldc:int(-32768)))), p4:String)))
                }
            }
            else {
                invokestatic:void(\u47c2\ud171\u9937\uf94d\uae87\u34df::\u72f1\u7e3f\u3711\u8350\ub102\u12b2, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\uc2e8\u183a\u76bc\u5654\u8413\u5bc4), and:int(ldc:int(-15854), ldc:int(14445)))), p4:String)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.reflect.Field \u4975\ubf56\u3504\u4c04\uae87\u8389() {
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
            return:Field(getfield:Field(\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\ub6ab\u67d0\u7006\uae87\uafe7\u69d9, this:\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d))
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
        stack_C6_0 : byte[] [generated]
        stack_144_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_221_0 : byte[] [generated]
        var_4_127 : int
        var_3_12C : byte[]
        var_5_12D : int
        var_0_15C : int
        expr_144 : byte [generated]
        stack_190_2 : byte [generated]
        stack_167_0 : byte [generated]
        expr_1CB : byte [generated]
        expr_8F : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_210 : byte[]
        var_5_211 : int
        var_3_D2 : String
        stack_120_0 : String[] [generated]
        expr_E4 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(1611698865), ldc:int(2051949053))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_144_0 = stack_1CB_0 = stack_221_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ms3sHIh6NsYK1IwGsAAkjvhsNgbeEIx8OxIGXHyazewciHomzC7mDp7IBsx4ZtYMiv6GMhL69hDqBPIGCAAAAJL8bAIG4gyMzFdfUcHNmQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_127 = expr_6B:int
        var_3_12C = newarray:byte[](byte.class, expr_6B:int)
        var_5_12D = expr_6B:int
        Label_0303:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_15C = and:int(var_0_5F:int, ldc:int(1823854257))
            var_5_12D = add:int(var_5_12D:int, ldc:int(-1))
            expr_144 = stack_190_2 = loadelement(stack_144_0, var_5_12D)
            
            if (cmplt:boolean(add:int(add:int(var_5_12D:int, ldc:int(6)), neg:int(var_4_127:int)), ldc:int(0))) {
                stack_190_2 = stack_167_0 = add:byte(expr_144:byte, loadelement:byte(var_3_12C:byte[], add:int(var_5_12D:int, ldc:int(6))))
                goto(Label_0375)
            }
            
            Label_0337:
            
            if (cmpne:boolean(and:int(var_0_15C:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_15C = and:int(var_0_15C:int, ldc:int(935284217))
            }
            else {
                var_0_15C = and:int(var_0_15C:int, ldc:int(1437343993))
                stack_190_2 = stack_167_0 = add:byte(expr_144:byte, ldc:byte(6))
            }
            
            Label_0375:
            
            if (cmpne:boolean(and:int(var_0_15C:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_15C = and:int(var_0_15C:int, ldc:int(1821423900))
                goto(Label_0337)
            }
            
            var_0_5F = and:int(var_0_15C:int, ldc:int(1503066803))
            storeelement:byte(var_3_12C:byte[], var_5_12D:int, stack_190_2:byte)
            
            if (cmpne:boolean(var_5_12D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_144_0 = stack_1CB_0 = stack_221_0 = var_3_12C:byte[]
            goto(Label_0112)
        }
        
        Label_0438:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1519279543))
            var_5_12D = add:int(var_5_12D:int, ldc:int(-1))
            expr_1CB = loadelement:byte(stack_1CB_0:byte[], var_5_12D:int)
            storeelement:byte(var_3_12C:byte[], var_5_12D:int, xor:int(add:int(or:int(and:int(shl:int(expr_1CB:byte, and:int(ldc:int(5644), ldc:int(27076))), ldc:int(-16)), and:int(shr:int(expr_1CB:byte[expected:int], xor:int(ldc:int(5194), ldc:int(5198))), ldc:int(15))), ldc:int(65)), ldc:int(58)))
            
            if (cmpne:boolean(var_5_12D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_144_0 = stack_1CB_0 = stack_221_0 = var_3_12C:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0303)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(2031950654))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-169310219))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_127 = expr_8F:int
                var_3_12C = newarray:byte[](byte.class, expr_8F:int)
                var_5_12D = expr_8F:int
                goto(Label_0438)
            }
        }
        
        Label_0148:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1921669119))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_210 = newarray:byte[](byte.class, expr_AD:int)
                var_5_211 = expr_AD:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1702645495))
                    var_5_211 = add:int(var_5_211:int, ldc:int(-1))
                    storeelement:byte(var_3_210:byte[], var_5_211:int, add:int(shl:int(loadelement:byte(stack_221_0:byte[], var_5_211:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_211:int, and:int(ldc:int(8209), ldc:int(3937)))), ldc:int(5)), xor:int(ldc:int(549), ldc:int(546)))))
                    
                    if (cmpne:boolean(var_5_211:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_144_0 = stack_1CB_0 = stack_221_0 = var_3_210:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            var_3_D2 = initobject:String(String::<init>, stack_C6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_120_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4250), ldc:int(35)))
            expr_E4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1026), ldc:int(1024)))
            storeelement:String(expr_E4:String[], and:int(ldc:int(11843), ldc:int(-15956)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(-9481), ldc:int(9480)), and:int(ldc:int(19487), ldc:int(8477))))
            storeelement:String(expr_E4:String[], and:int(ldc:int(193), ldc:int(20537)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(11295), ldc:int(4765)), xor:int(ldc:int(1124), ldc:int(1066))))
            putstatic:String[](\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d::\uc2e8\u183a\u76bc\u5654\u8413\u5bc4, expr_E4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u5245\u718f\ubff1\u494c\u6d69\u416d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_616 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_616 = and:int(ldc:int(-91670498), ldc:int(-1227245069))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\u6d69\u5fe1\u7af6\u6b5f\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
            var_3_616 = and:int(var_3_616:int, ldc:int(171864059))
        }
        else {
            var_3_616 = and:int(var_3_616:int, ldc:int(-455525321))
            var_5_85 = and:int(ldc:int(11206), ldc:int(-11207))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18280), ldc:int(1381)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_616:int, ldc:int(-208946277))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(564), ldc:int(565)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(669), ldc:int(2049)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_616 = and:int(var_3_D2:int, ldc:int(-292571110))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16517), ldc:int(2169)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0777)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1091189160))
                    }
                    else {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-134645702))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0777)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1908924063))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(32)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1081610592))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1791641596))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(67036200))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(626274785))
                        goto(Label_0777)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1586458096))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(255797794))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1665616591))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1343652198))
                        var_11_E3 = and:int(ldc:int(-29043), ldc:int(12626))
                        goto(Label_1422)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2024891624))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1157398900))
                        goto(Label_0777)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-891637037))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-1985438759))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1182155238))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0777)
                        }
                    }
                    
                    Label_0669:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1238272463))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(143049439))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-55575717))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0777:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(91201910))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-404625059))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-810642353))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-71974594))
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1476445453))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4109), ldc:int(4108))
                                goto(Label_1050)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1315490630))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1400311784))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(381758433))
                            goto(Label_0777)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1484823000))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1179043489))
                        var_11_E3 = and:int(ldc:int(4942), ldc:int(-4975))
                    }
                    
                    Label_1050:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(2122321086))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-737138523))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(267026984))
                            goto(Label_0777)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(811200971))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1192281674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1489869196))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1050)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1130807226))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0777)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1241896021))
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(512)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(-384952460))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                            var_3_616 = and:int(var_3_616:int, ldc:int(1087458499))
                            loopcontinue()
                        }
                        
                        var_3_616 = and:int(var_3_616:int, ldc:int(-37127586))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1422)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(64)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(755321469))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(2095320550))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0777)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(-1280607297))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1422:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_621 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1433:
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-201438926))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(1739218026))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(840121907))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(717066581))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_616:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0777)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-2003116907))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_616:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_616 = and:int(var_3_616:int, ldc:int(-1110590114))
                        var_17_621 = add:int(var_16_111:int, and:int(ldc:int(20519), ldc:int(10513)))
                        looporswitchbreak()
                    }
                    
                    var_3_616 = and:int(var_3_616:int, ldc:int(2027918093))
                }
                
                var_3_616 = and:int(var_3_616:int, ldc:int(-1093010498))
                
                if (cmple:boolean(var_5_85 = var_17_621:int, sub:int(var_6_8C:int, xor:int(ldc:int(2216), ldc:int(2217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_616:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
