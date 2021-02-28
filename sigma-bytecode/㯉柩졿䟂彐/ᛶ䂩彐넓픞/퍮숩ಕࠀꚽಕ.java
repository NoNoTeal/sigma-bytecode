public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud36e\uc229\u0c95\u0800\ua6bd\u0c95 {
    public void \ud36e\uc229\u0c95\u0800\ua6bd\u0c95(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static java.lang.String lambda$\u67e9\u12cb\ub83f\u0b8e\u67d0\u64ab$0(java.lang.String p0) {
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
            return:String(checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::getOrDefault, getstatic:Map<String, String>(\ud36e\uc229\u0c95\u0800\ua6bd\u0c95::\ud12e\u59ec\u6435\uafe7\u6cfe\ub6ab), p0:String[expected:Object], p0:String)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3C4 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_31C_0 : byte[] [generated]
        stack_372_0 : byte[] [generated]
        stack_3D6_0 : byte[] [generated]
        var_4_2FF : int
        var_3_304 : byte[]
        var_5_305 : int
        expr_31C : byte [generated]
        var_0_3CC : int
        expr_3D6 : byte [generated]
        stack_404_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_361 : byte[]
        var_5_362 : int
        expr_B5 : int [generated]
        var_3_E2 : String
        expr_EA : String[] [generated]
        expr_F4 : String[] [generated]
        var_3_271 : String[]
        
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
        var_0_3C4 = and:int(ldc:int(541645246), ldc:int(-1125500242))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_31C_0 = stack_372_0 = stack_3D6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ijKKpkg7uln6ebqKhMorP/lJ1sVL+/0I9E/K9rS6+c3MtDo6eojGhUW0uTkI9E/K9rS6+c3MtDoKhwQG+zg5SvoI9E/K9oTKewrMNDi+CgWFRbS5OQj0T8r2hMp7Csw0CMuFRPs4OUr6CPRPyvaEe3kK/kk2frq6f4pEhUW0uTkI9E/K9oR7eQr+STZ+uoqEBov7ODlK+gj0T8r2hMR2Cc07vv55z8WFRbS5OQj0T8r2hMR2Cc07vs6GSwX7ODlK+gj0T8r2hDZ5SPN/ikSFRbS5OQj0T8r2hDZ5SMOEBov7ODlK+gj0T8r2hAc1Cnm+//39CsWFRbS5OQj0T8r2hAc1Cnm+/80LhQXr5efnsg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2FF = expr_6B:int
        var_3_304 = newarray:byte[](byte.class, expr_6B:int)
        var_5_305 = expr_6B:int
        Label_0775:
        
        while (cmpne:boolean(and:int(var_0_3C4:int, ldc:int(128)), ldc:int(0))) {
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(715094439))
            var_5_305 = add:int(var_5_305:int, ldc:int(-1))
            expr_31C = loadelement:byte(stack_31C_0:byte[], var_5_305:int)
            storeelement:byte(var_3_304:byte[], var_5_305:int, add:int(xor:int(or:int(and:int(shl:int(expr_31C:byte, xor:int(ldc:int(4257), ldc:int(4261))), ldc:int(-16)), and:int(shr:int(expr_31C:byte[expected:int], and:int(ldc:int(12292), ldc:int(3724))), ldc:int(15))), ldc:int(63)), ldc:int(108)))
            
            if (cmpne:boolean(var_5_305:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_31C_0 = stack_372_0 = stack_3D6_0 = var_3_304:byte[]
            goto(Label_0112)
        }
        
        Label_0953:
        
        while (cmpne:boolean(and:int(var_0_3C4:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_3CC = and:int(var_0_3C4:int, ldc:int(-426189644))
            var_5_305 = add:int(var_5_305:int, ldc:int(-1))
            expr_3D6 = loadelement:byte(stack_3D6_0:byte[], var_5_305:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_305:int, ldc:int(4)), neg:int(var_4_2FF:int)), ldc:int(0))) {
                var_0_3CC = and:int(var_0_3CC:int, ldc:int(-520429852))
                stack_404_2 = add:byte(expr_3D6:byte, ldc:byte(4))
            }
            else {
                stack_404_2 = add:byte(expr_3D6:byte, loadelement:byte(var_3_304:byte[], add:int(var_5_305:int, ldc:int(4))))
            }
            
            var_0_3C4 = and:int(var_0_3CC:int, ldc:int(-134226954))
            storeelement:byte(var_3_304:byte[], var_5_305:int, stack_404_2:byte)
            
            if (cmpne:boolean(var_5_305:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_31C_0 = stack_372_0 = stack_3D6_0 = var_3_304:byte[]
            goto(Label_0186)
        }
        
        var_0_3C4 = and:int(var_0_3C4:int, ldc:int(-30690828))
        goto(Label_0775)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_3C4:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(-994826190))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_3C4:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(1764990381))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_361 = newarray:byte[](byte.class, expr_91:int)
                var_5_362 = expr_91:int
                
                loop {
                    var_0_3C4 = and:int(var_0_3C4:int, ldc:int(2106252029))
                    var_5_362 = add:int(var_5_362:int, ldc:int(-1))
                    storeelement:byte(var_3_361:byte[], var_5_362:int, add:int(shl:int(loadelement:byte(stack_372_0:byte[], var_5_362:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_362:int, xor:int(ldc:int(-10240), ldc:int(-10239)))), ldc:int(2)), xor:int(ldc:int(299), ldc:int(276)))))
                    
                    if (cmpne:boolean(var_5_362:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_31C_0 = stack_372_0 = stack_3D6_0 = var_3_361:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpeq:boolean(and:int(var_0_3C4:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(1536518276))
        }
        else {
            if (cmpne:boolean(and:int(var_0_3C4:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(644332965))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_2FF = expr_B5:int
                var_3_304 = newarray:byte[](byte.class, expr_B5:int)
                var_5_305 = expr_B5:int
                goto(Label_0953)
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_3C4:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0150)
        }
        
        if (cmpne:boolean(and:int(var_0_3C4:int, ldc:int(65536)), ldc:int(0))) {
            var_0_3C4 = and:int(var_0_3C4:int, ldc:int(-106103536))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_EA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16397), ldc:int(13343)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24660), ldc:int(24665)))
        storeelement:String(expr_F4:String[], and:int(ldc:int(-19613), ldc:int(19612)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-21525), ldc:int(21524)), and:int(ldc:int(24767), ldc:int(5974))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(12289), ldc:int(1355)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(4191), ldc:int(11798)), and:int(ldc:int(1279), ldc:int(43))))
        storeelement:String(expr_EA:String[], xor:int(ldc:int(264), ldc:int(266)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(1067), ldc:int(23211)), xor:int(ldc:int(-28610), ldc:int(-28546))))
        storeelement:String(expr_EA:String[], xor:int(ldc:int(-24318), ldc:int(-24319)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(8768), ldc:int(4569)), and:int(ldc:int(2132), ldc:int(17151))))
        storeelement:String(expr_EA:String[], xor:int(ldc:int(2116), ldc:int(2112)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(18451), ldc:int(18503)), xor:int(ldc:int(18014), ldc:int(17974))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(21765), ldc:int(2055)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-15842), ldc:int(-15754)), and:int(ldc:int(2687), ldc:int(12671))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(3238), ldc:int(16391)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(127), ldc:int(16767)), and:int(ldc:int(2974), ldc:int(246))))
        storeelement:String(expr_EA:String[], xor:int(ldc:int(1155), ldc:int(1156)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(4255), ldc:int(18070)), xor:int(ldc:int(17972), ldc:int(18079))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(12), ldc:int(13995)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(18155), ldc:int(8619)), and:int(ldc:int(17643), ldc:int(2500))))
        storeelement:String(expr_EA:String[], xor:int(ldc:int(9768), ldc:int(9761)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(1979), ldc:int(1915)), xor:int(ldc:int(18520), ldc:int(18570))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(27247), ldc:int(4490)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-32760), ldc:int(-32550)), xor:int(ldc:int(4558), ldc:int(4394))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(1163), ldc:int(24587)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(18898), ldc:int(18742)), xor:int(ldc:int(4377), ldc:int(4576))))
        storeelement:String(expr_EA:String[], and:int(ldc:int(12), ldc:int(6028)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(507), ldc:int(17657)), and:int(ldc:int(1310), ldc:int(17167))))
        putstatic:String[](\ud36e\uc229\u0c95\u0800\ua6bd\u0c95::\u3d64\u62da\u67d0\u4cd9\u9937\u99f7, expr_F4:String[])
        var_3_271 = expr_EA:String[]
        putstatic:Map<String, String>(\ud36e\uc229\u0c95\u0800\ua6bd\u0c95::\ud12e\u59ec\u6435\uafe7\u6cfe\ub6ab, invokevirtual:ImmutableMap(ImmutableMap$Builder::build, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokestatic:ImmutableMap$Builder(ImmutableMap::builder), loadelement:String(var_3_271:String[], xor:int(ldc:int(10240), ldc:int(10241))), loadelement:String(var_3_271:String[], xor:int(ldc:int(-24061), ldc:int(-24063)))), loadelement:String(var_3_271:String[], and:int(ldc:int(8195), ldc:int(1295))), loadelement:String(var_3_271:String[], xor:int(ldc:int(16641), ldc:int(16645)))), loadelement:String(var_3_271:String[], xor:int(ldc:int(-32704), ldc:int(-32699))), loadelement:String(var_3_271:String[], and:int(ldc:int(17686), ldc:int(2254)))), loadelement:String(var_3_271:String[], xor:int(ldc:int(481), ldc:int(486))), loadelement:String(var_3_271:String[], and:int(ldc:int(536), ldc:int(4367)))), loadelement:String(var_3_271:String[], xor:int(ldc:int(-31212), ldc:int(-31203))), loadelement:String(var_3_271:String[], xor:int(ldc:int(533), ldc:int(543)))), loadelement:String(var_3_271:String[], xor:int(ldc:int(55), ldc:int(60))), loadelement:String(var_3_271:String[], and:int(ldc:int(1486), ldc:int(2092))))))
    }
    
    public void \u8308\u8258\u7006\ub32d\u446c\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_611 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_61C : int
        
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
        var_3_611 = and:int(ldc:int(-165823282), ldc:int(-1025533457))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud36e\uc229\u0c95\u0800\ua6bd\u0c95[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_611 = and:int(var_3_611:int, ldc:int(-334868114))
        }
        else {
            var_3_611 = and:int(var_3_611:int, ldc:int(-163604278))
            var_5_85 = and:int(ldc:int(-14454), ldc:int(14453))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5790), ldc:int(-32671)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_611:int, ldc:int(-299976342))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(4100), ldc:int(4101)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(18583), ldc:int(5153)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_611 = and:int(var_3_DA:int, ldc:int(-293807650))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(69), ldc:int(17153)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(256)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-936836053))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-769477656))
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(1)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(934950955))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1853723260))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1033896098))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-519242174))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-804068453))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(1707996418))
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-899696546))
                        var_11_EB = and:int(ldc:int(-16310), ldc:int(16053))
                        goto(Label_1447)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1371100275))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1838446854))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-495781944))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-960512290))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1029338530))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1645312915))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(1)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(241853392))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1242062632))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(2114885463))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-1133353499))
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-698443185))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1023671753))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(693756369))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(1488870818))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-1165888672))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-272897167))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(728133458))
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-201539989))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(5633), ldc:int(18819))
                                goto(Label_1049)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(847545915))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1306452239))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(1122353283))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-10708865))
                        var_11_EB = and:int(ldc:int(10722), ldc:int(-11772))
                    }
                    
                    Label_1049:
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-879547786))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(1959350012))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(512)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(2099181887))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-973211314))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_611 = and:int(var_3_611:int, ldc:int(-558040198))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1301)
                            }
                        }
                    }
                    
                    Label_1165:
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1643257670))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1697789968))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1049)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-1349581649))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(1875806098))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-1551695314))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_611 = and:int(var_3_611:int, ldc:int(-18949638))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1301:
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1838364869))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(2021214542))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(64)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(799842437))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(357664426))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-1809052493))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-572709300))
                        loopcontinue()
                    }
                    
                    var_3_611 = and:int(var_3_611:int, ldc:int(-1023476997))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-380896238))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_611:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(1847216395))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_611:int, ldc:int(2)), ldc:int(0))) {
                        var_3_611 = and:int(var_3_611:int, ldc:int(-769812386))
                        var_17_61C = add:int(var_16_119:int, and:int(ldc:int(16393), ldc:int(3361)))
                        looporswitchbreak()
                    }
                    
                    var_3_611 = and:int(var_3_611:int, ldc:int(-829869558))
                }
                
                var_3_611 = and:int(var_3_611:int, ldc:int(-423650818))
                
                if (cmple:boolean(var_5_85 = var_17_61C:int, sub:int(var_6_8C:int, xor:int(ldc:int(2578), ldc:int(2579))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_611:int, ldc:int(512)), ldc:int(0))) {
            var_3_611 = and:int(var_3_611:int, ldc:int(-1421162302))
            goto(Label_0106)
        }
    }
}
