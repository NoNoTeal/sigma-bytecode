public class \u56bd\u8413\u647c\u5bc4\ud158.\u946b\u64f2\ud12e\u4d85\ucef1\ub83f {
    public void \u946b\u64f2\ud12e\u4d85\ucef1\ub83f(java.util.List<java.lang.String> p0) {
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
            invokespecial:Object(Object::<init>, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f)
            putfield:List<String>(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u56bd\u3c25\u3a62\ua6bd\u56bd\ubf56, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f, p0:List<String>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object invoke(java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2) {
        var_6_67 : String
        var_7_6D : Class<?>
        var_8_1AD : List
        var_9_1B6 : int
        
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
        var_6_67 = invokevirtual:String(Method::getName, p1:Method)
        var_7_6D = invokevirtual:Class<?>(Method::getReturnType, p1:Method)
        
        if (cmpeq:boolean(var_3_F3:Object[], aconstnull:Object[]())) {
            var_3_F3 = getstatic:String[][expected:Object[]](\ubcb0\u4c04\u4ab3\ub1b9\u8cae\u8389::\u6c56\u88c5\ud7e8\ud523\u156b\u494c)
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), and:int(ldc:int(-2463), ldc:int(2460)))), cmpeq:boolean(getstatic:Class<Boolean>(Boolean::TYPE), var_7_6D:Class<Boolean>))) {
            return:Object(invokestatic:Boolean[expected:Object](Boolean::valueOf, and:int[expected:boolean](ldc:int(29249), ldc:int(2179))))
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), and:int(ldc:int(6803), ldc:int(24645)))), cmpeq:boolean(getstatic:Class<Void>(Void::TYPE), var_7_6D:Class<Void>))) {
            putfield:boolean(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\uc238\u16f6\u8258\u156b\u51b2\u7873, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f, and:int[expected:boolean](ldc:int(513), ldc:int(5159)))
            return:Object(aconstnull:Object())
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), xor:int(ldc:int(6721), ldc:int(6723)))), cmpeq:boolean(arraylength:int(var_3_F3:Object[]), ldc:int(0)))) {
            return:Object(getfield:List<String>[expected:Object](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u56bd\u3c25\u3a62\ua6bd\u56bd\ubf56, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f))
        }
        
        if (logicalor:boolean(invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), and:int(ldc:int(439), ldc:int(12355)))), invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), xor:int(ldc:int(-30592), ldc:int(-30588)))))) {
            if (cmpeq:boolean(ldc:Class<String>(java.lang.String.class), var_7_6D:Class<String>)) {
                if (cmpeq:boolean(arraylength:int(var_3_F3:Object[]), and:int(ldc:int(6165), ldc:int(1027)))) {
                    if (instanceof:boolean(java.util.List.class, loadelement:Object(var_3_F3:Object[], and:int(ldc:int(-18942), ldc:int(509))))) {
                        var_8_1AD = checkcast:List(java.util.List.class, loadelement:Object[expected:List](var_3_F3:Object[], and:int(ldc:int(-18647), ldc:int(18646))))
                        var_9_1B6 = and:int(ldc:int(-10357), ldc:int(10356))
                        
                        while (cmplt:boolean(var_9_1B6:int, invokeinterface:int(List<E>::size, var_8_1AD:List<String>))) {
                            if (invokeinterface:boolean(List<E>::contains, getfield:List<String>(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u56bd\u3c25\u3a62\ua6bd\u56bd\ubf56, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f), invokeinterface:Object(List<Object>::get, var_8_1AD:List<Object>, var_9_1B6:int))) {
                                return:Object(putfield:String(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u385b\uf9c5\u40a9\u97b7\u93a2\u3d4b, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f, checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, var_8_1AD:List<String>, var_9_1B6:int))))
                            }
                            
                            inc:int(var_9_1B6, ldc:int(1))
                        }
                        
                        return:Object(putfield:String[expected:Object](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u385b\uf9c5\u40a9\u97b7\u93a2\u3d4b, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f, checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u56bd\u3c25\u3a62\ua6bd\u56bd\ubf56, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f), and:int(ldc:int(465), ldc:int(-29138))))))
                    }
                }
            }
        }
        
        if (logicalor:boolean(invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), xor:int(ldc:int(11267), ldc:int(11270)))), invokevirtual:boolean(String::equals, var_6_67:String, loadelement:String[expected:Object](getstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7), and:int(ldc:int(22), ldc:int(16647)))))) {
            if (cmpeq:boolean(arraylength:int(var_3_F3:Object[]), xor:int(ldc:int(20500), ldc:int(20501)))) {
                putfield:String(\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u385b\uf9c5\u40a9\u97b7\u93a2\u3d4b, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f, checkcast:String(java.lang.String.class, loadelement:Object[expected:String](var_3_F3:Object[], and:int(ldc:int(-31279), ldc:int(26636)))))
                return:Object(aconstnull:Object())
            }
        }
        
        return:Object(invokevirtual:Object(Method::invoke, p1:Method, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f[expected:Object], var_3_F3:Object[]))
    }
    
    static {
        var_0_2A8 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        stack_2BA_0 : byte[] [generated]
        stack_2F4_0 : byte[] [generated]
        stack_349_0 : byte[] [generated]
        var_4_216 : int
        var_3_21B : byte[]
        var_5_21C : int
        var_0_229 : int
        expr_233 : byte [generated]
        stack_277_2 : byte [generated]
        stack_256_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_2E3 : byte[]
        var_5_2E4 : int
        expr_FE : int [generated]
        var_3_338 : byte[]
        var_5_339 : int
        expr_34C : byte [generated]
        var_3_13A : String
        stack_20F_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_2A8 = and:int(ldc:int(-1471452962), ldc:int(-1571864969))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_233_0 = stack_2BA_0 = stack_2F4_0 = stack_349_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("rEQU/Gjk6BwEgCAczMxMzOxEFPzwuNQUAEQI1Oz4/EQcaNgEzCzEFPzo5OgcBAAgCLjQHMwMDOzkDPT0FBz0DAzkMClOlqJWYQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_216 = expr_6B:int
        var_3_21B = newarray:byte[](byte.class, expr_6B:int)
        var_5_21C = expr_6B:int
        Label_0542:
        
        while (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(1)), ldc:int(0))) {
            var_0_229 = and:int(var_0_2A8:int, ldc:int(-207918473))
            var_5_21C = add:int(var_5_21C:int, ldc:int(-1))
            expr_233 = stack_277_2 = loadelement(stack_233_0, var_5_21C)
            
            if (cmplt:boolean(add:int(add:int(var_5_21C:int, ldc:int(5)), neg:int(var_4_216:int)), ldc:int(0))) {
                stack_277_2 = stack_256_0 = add:byte(expr_233:byte, loadelement:byte(var_3_21B:byte[], add:int(var_5_21C:int, ldc:int(5))))
                goto(Label_0614)
            }
            
            Label_0576:
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_229 = and:int(var_0_229:int, ldc:int(-33643637))
            }
            else {
                var_0_229 = and:int(var_0_229:int, ldc:int(-1376523184))
                stack_277_2 = stack_256_0 = add:byte(expr_233:byte, ldc:byte(5))
            }
            
            Label_0614:
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0576)
            }
            
            var_0_2A8 = and:int(var_0_229:int, ldc:int(-88100368))
            storeelement:byte(var_3_21B:byte[], var_5_21C:int, stack_277_2:byte)
            
            if (cmpne:boolean(var_5_21C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_233_0 = stack_2BA_0 = stack_2F4_0 = stack_349_0 = var_3_21B:byte[]
            goto(Label_0112)
        }
        
        Label_0669:
        
        while (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(1)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-263477673))
            var_5_21C = add:int(var_5_21C:int, ldc:int(-1))
            storeelement:byte(var_3_21B:byte[], var_5_21C:int, xor:byte(loadelement:byte(stack_2BA_0:byte[], var_5_21C:int), ldc:byte(38)))
            
            if (cmpne:boolean(var_5_21C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_233_0 = stack_2BA_0 = stack_2F4_0 = stack_349_0 = var_3_21B:byte[]
            goto(Label_0163)
        }
        
        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(230054365))
        goto(Label_0542)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-78053163))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(870280061))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(65536)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-290980998))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_216 = expr_9E:int
                var_3_21B = newarray:byte[](byte.class, expr_9E:int)
                var_5_21C = expr_9E:int
                goto(Label_0669)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(512)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1868720245))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1544082053))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_2E3 = newarray:byte[](byte.class, expr_CB:int)
                var_5_2E4 = expr_CB:int
                
                loop {
                    var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-336125328))
                    var_5_2E4 = add:int(var_5_2E4:int, ldc:int(-1))
                    storeelement:byte(var_3_2E3:byte[], var_5_2E4:int, add:int(shl:int(loadelement:byte(stack_2F4_0:byte[], var_5_2E4:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_2E4:int, xor:int(ldc:int(6144), ldc:int(6145)))), ldc:int(6)), and:int(ldc:int(9771), ldc:int(4439)))))
                    
                    if (cmpne:boolean(var_5_2E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_233_0 = stack_2BA_0 = stack_2F4_0 = stack_349_0 = var_3_2E3:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1840306678))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(32)), ldc:int(0))) {
                var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-380553885))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1600426665))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_338 = newarray:byte[](byte.class, expr_FE:int)
                var_5_339 = expr_FE:int
                
                loop {
                    var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1504483845))
                    var_5_339 = add:int(var_5_339:int, ldc:int(-1))
                    expr_34C = add:byte(loadelement:byte(stack_349_0:byte[], var_5_339:int), ldc:byte(81))
                    storeelement:byte(var_3_338:byte[], var_5_339:int, or:int(and:int(shl:int(expr_34C:byte, xor:int(ldc:int(2376), ldc:int(2380))), ldc:int(-16)), and:int(shr:int(expr_34C:byte[expected:int], and:int(ldc:int(18764), ldc:int(4645))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_339:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_233_0 = stack_2BA_0 = stack_2F4_0 = stack_349_0 = var_3_338:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(1516711789))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-493709884))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_20F_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17159), ldc:int(4207)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3098), ldc:int(3101)))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(8752), ldc:int(8757)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-32076), ldc:int(30985)), xor:int(ldc:int(8258), ldc:int(8274))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(17480), ldc:int(17482)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(1229), ldc:int(1245)), and:int(ldc:int(8221), ldc:int(27))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(16900), ldc:int(2052)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(21529), ldc:int(10841)), and:int(ldc:int(63), ldc:int(10783))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(-16310), ldc:int(-16311)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(671), ldc:int(6527)), xor:int(ldc:int(-30713), ldc:int(-30678))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(-32768), ldc:int(-32762)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(8746), ldc:int(8711)), xor:int(ldc:int(795), ldc:int(814))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-8396), ldc:int(8393)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(9975), ldc:int(16437)), xor:int(ldc:int(-32461), ldc:int(-32498))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(5253), ldc:int(97)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(540), ldc:int(545)), and:int(ldc:int(92), ldc:int(20552))))
        putstatic:String[](\u946b\u64f2\ud12e\u4d85\ucef1\ub83f::\u7330\u600f\uc7fe\u3504\u7043\u97b7, expr_14C:String[])
    }
    
    public void \u3dd3\ub70c\u8753\u1833\ubb2b\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_636 : int
        
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
        var_3_62B = and:int(ldc:int(-774058972), ldc:int(-143118539))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\u64f2\ud12e\u4d85\ucef1\ub83f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-392638685))
            var_5_7D = and:int(ldc:int(-27360), ldc:int(24667))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13509), ldc:int(-13768)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_62B:int, ldc:int(-437498251))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(6144), ldc:int(6145)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_62B = and:int(var_3_CA:int, ldc:int(-114479241))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8199), ldc:int(553)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1893242122))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2032863465))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-47133443))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1260666835))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1438792604))
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(119594568))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-148033625))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0781)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-505439911))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1400493631))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-903331850))
                        var_11_DB = and:int(ldc:int(11923), ldc:int(-11924))
                        goto(Label_1455)
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1653794132))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1303767909))
                        goto(Label_0781)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-848556143))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-2031845564))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(529959456))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-146108960))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0781)
                        }
                    }
                    
                    Label_0658:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1425932127))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(475186006))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1148676244))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1612884037))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1068802957))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0781:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1708139589))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1547479182))
                            goto(Label_0658)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(940513155))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(142068606))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-708174284))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(13457), ldc:int(771))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-652690620))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-347438410))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-489115203))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1850348274))
                            goto(Label_0781)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1166275602))
                            goto(Label_0658)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(509201944))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-776449797))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1050882189))
                        var_11_DB = and:int(ldc:int(-26447), ldc:int(18248))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1631465096))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(795544671))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1084771740))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0781)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0658)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1945342983))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1043431774))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1309)
                            }
                        }
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1164913748))
                            goto(Label_0781)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0658)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(349467678))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(920254570))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-350368598))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1455)
                    }
                    
                    Label_1309:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-500031966))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1733406102))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1940192816))
                        goto(Label_0781)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(855738532))
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(888523386))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1359668910))
                        loopcontinue()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(-358699795))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_636 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(323562980))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1337706189))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1867400007))
                        goto(Label_0781)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-875446624))
                        goto(Label_0658)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1756830802))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-959668296))
                        var_17_636 = add:int(var_16_109:int, xor:int(ldc:int(9504), ldc:int(9505)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62B = and:int(var_3_62B:int, ldc:int(-30568927))
                
                if (cmple:boolean(var_5_7D = var_17_636:int, sub:int(var_6_84:int, and:int(ldc:int(2105), ldc:int(4675))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
