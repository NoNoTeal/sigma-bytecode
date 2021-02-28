public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u183a\u1187\u8bb0\u3e75\u9033\u4f4a {
    public void \u183a\u1187\u8bb0\u3e75\u9033\u4f4a(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u183a\u1187\u8bb0\u3e75\u9033\u4f4a, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
    
    private static com.mojang.datafixers.Typed lambda$\u927d\uc2e8\u3bd6\u8389\u9937\u6c56$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.datafixers.Typed lambda$\ud12e\u47c2\u8350\uc87f\u40a9\u12cb$0(com.mojang.datafixers.Typed p0) {
        var_1_5F : int
        var_3_6A : Dynamic
        var_4_88 : String
        var_5_A2 : String
        stack_DC_0 : Typed [generated]
        
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
            var_1_5F = and:int(ldc:int(-2142246466), ldc:int(-1666195458))
            var_3_6A = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
            var_4_88 = invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_3_6A:Dynamic, loadelement:String(getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), and:int(ldc:int(2050), ldc:int(274)))), loadelement:String(getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), and:int(ldc:int(571), ldc:int(13767))))
            var_5_A2 = checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::getOrDefault, getstatic:Map<String, String>(\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u8df4\u7043\u9255\u99f7\uff55\u99f7), var_4_88:String[expected:Object], loadelement:String(getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), xor:int(ldc:int(4114), ldc:int(4113)))))
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, var_4_88:String[expected:Object], var_5_A2:String[expected:Object]))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-855716662))
                stack_DC_0 = invokevirtual:Typed(Typed::set, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokevirtual:Dynamic[expected:Object](Dynamic::set, var_3_6A:Dynamic, loadelement:String(getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), and:int(ldc:int(22538), ldc:int(8338))), invokevirtual:Dynamic(Dynamic::createString, var_3_6A:Dynamic, var_5_A2:String)))
            }
            else {
                stack_DC_0 = p0:Typed
            }
            
            return:Typed(stack_DC_0:Typed)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_503 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_515_0 : byte[] [generated]
        stack_577_0 : byte[] [generated]
        stack_5EF_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_4A0 : byte[]
        var_4_4A1 : int
        expr_98 : int [generated]
        var_5_4F0 : int
        var_3_4F5 : byte[]
        var_4_4F6 : int
        expr_515 : byte [generated]
        var_0_58F : int
        expr_577 : byte [generated]
        stack_5BB_2 : byte [generated]
        stack_592_0 : byte [generated]
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_5DE : byte[]
        var_4_5DF : int
        var_3_12A : String
        expr_132 : String[] [generated]
        expr_13C : String[] [generated]
        var_3_3B8 : String[]
        
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
            var_0_503 = and:int(ldc:int(-801926241), ldc:int(-1819772341))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_515_0 = stack_577_0 = stack_5EF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Cu7+7TEewAwHARbq6VwLqvAG5jgewAwHBf7hHP/s9fz2DhYO7w0L7uYFDw0L5AYa6ucK/woK/PDwCfMXGfL08w8MBgDxAQbo+A749hQC8QEW9+oJFvfvBAoO/uICAQIP/Q31+xIU5usP/Qz96w/9BQD3/f0UGO/uJwrfDQvu5/39FBjv7icK3w0L5AYT5O0MFSAJ7u/1/uYGFB7v9fQGH/EB//oGAPUVFtzgBBAE5gcAFhr/8f/lDP8lMA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_4A0 = newarray:byte[](byte.class, expr_6D:int)
                var_4_4A1 = expr_6D:int
                
                loop {
                    var_0_503 = and:int(var_0_503:int, ldc:int(2022312659))
                    var_4_4A1 = add:int(var_4_4A1:int, ldc:int(-1))
                    storeelement:byte(var_3_4A0:byte[], var_4_4A1:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_4A1:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_4A1:int, and:int(ldc:int(135), ldc:int(1041)))), ldc:int(4)), and:int(ldc:int(24591), ldc:int(799)))))
                    
                    if (cmpne:boolean(var_4_4A1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_515_0 = stack_577_0 = stack_5EF_0 = var_3_4A0:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_503:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_503:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_503 = and:int(var_0_503:int, ldc:int(1600213314))
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_503:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_503 = and:int(var_0_503:int, ldc:int(-541460781))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_4F0 = expr_98:int
                var_3_4F5 = newarray:byte[](byte.class, expr_98:int)
                var_4_4F6 = expr_98:int
                Label_1272:
                
                while (cmpeq:boolean(and:int(var_0_503:int, ldc:int(64)), ldc:int(0))) {
                    var_0_503 = and:int(var_0_503:int, ldc:int(-693179689))
                    var_4_4F6 = add:int(var_4_4F6:int, ldc:int(-1))
                    expr_515 = loadelement:byte(stack_515_0:byte[], var_4_4F6:int)
                    storeelement:byte(var_3_4F5:byte[], var_4_4F6:int, or:int(and:int(shl:int(expr_515:byte, and:int(ldc:int(1029), ldc:int(16534))), ldc:int(-16)), and:int(shr:int(expr_515:byte[expected:int], and:int(ldc:int(10244), ldc:int(4172))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_4F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_515_0 = stack_577_0 = stack_5EF_0 = var_3_4F5:byte[]
                    goto(Label_0157)
                }
                
                var_0_503 = and:int(var_0_503:int, ldc:int(-1005536871))
                Label_1370:
                
                while (cmpne:boolean(and:int(var_0_503:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_58F = and:int(var_0_503:int, ldc:int(2120099823))
                    var_4_4F6 = add:int(var_4_4F6:int, ldc:int(-1))
                    expr_577 = stack_5BB_2 = loadelement(stack_577_0, var_4_4F6)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_4F6:int, ldc:int(2)), neg:int(var_5_4F0:int)), ldc:int(0))) {
                        stack_5BB_2 = stack_592_0 = add:byte(expr_577:byte, loadelement:byte(var_3_4F5:byte[], add:int(var_4_4F6:int, ldc:int(2))))
                        goto(Label_1442)
                    }
                    
                    Label_1412:
                    
                    if (cmpeq:boolean(and:int(var_0_58F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_58F = and:int(var_0_58F:int, ldc:int(1531489015))
                        stack_5BB_2 = stack_592_0 = add:byte(expr_577:byte, ldc:byte(2))
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_0_58F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_58F = and:int(var_0_58F:int, ldc:int(2078552175))
                        goto(Label_1412)
                    }
                    
                    var_0_503 = and:int(var_0_58F:int, ldc:int(-1176274293))
                    storeelement:byte(var_3_4F5:byte[], var_4_4F6:int, stack_5BB_2:byte)
                    
                    if (cmpne:boolean(var_4_4F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_515_0 = stack_577_0 = stack_5EF_0 = var_3_4F5:byte[]
                    goto(Label_0208)
                }
                
                var_0_503 = and:int(var_0_503:int, ldc:int(1053399747))
                goto(Label_1272)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_503:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_503 = and:int(var_0_503:int, ldc:int(-513510257))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_503:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_503 = and:int(var_0_503:int, ldc:int(567818771))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_503:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_503 = and:int(var_0_503:int, ldc:int(1385247355))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_4F0 = expr_CB:int
                        var_3_4F5 = newarray:byte[](byte.class, expr_CB:int)
                        var_4_4F6 = expr_CB:int
                        goto(Label_1370)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_503:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_503:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_503 = and:int(var_0_503:int, ldc:int(-1695371212))
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_503:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_503 = and:int(var_0_503:int, ldc:int(-612176041))
                    expr_F6 = arraylength:int(stack_F6_0:byte[])
                    
                    if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                        var_3_5DE = newarray:byte[](byte.class, expr_F6:int)
                        var_4_5DF = expr_F6:int
                        
                        loop {
                            var_0_503 = and:int(var_0_503:int, ldc:int(-1661636621))
                            var_4_5DF = add:int(var_4_5DF:int, ldc:int(-1))
                            storeelement:byte(var_3_5DE:byte[], var_4_5DF:int, xor:byte(add:byte(loadelement:byte(stack_5EF_0:byte[], var_4_5DF:int), ldc:byte(63)), ldc:byte(19)))
                            
                            if (cmpne:boolean(var_4_5DF:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_515_0 = stack_577_0 = stack_5EF_0 = var_3_5DE:byte[]
                    }
                }
                
                Label_0251:
                
                if (cmpeq:boolean(and:int(var_0_503:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_503 = and:int(var_0_503:int, ldc:int(1172247225))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_503:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_503:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_132 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16406), ldc:int(7382)))
            expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32745), ldc:int(-32767)))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(16832), ldc:int(16833)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-15667), ldc:int(5426)), xor:int(ldc:int(138), ldc:int(133))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-3298), ldc:int(2273)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(2370), ldc:int(2381)), xor:int(ldc:int(131), ldc:int(151))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(2576), ldc:int(2578)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(624), ldc:int(612)), and:int(ldc:int(3134), ldc:int(21083))))
            storeelement:String(expr_132:String[], and:int(ldc:int(70), ldc:int(18742)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(2561), ldc:int(2587)), xor:int(ldc:int(20993), ldc:int(21023))))
            storeelement:String(expr_132:String[], and:int(ldc:int(1157), ldc:int(15127)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-30461), ldc:int(-30435)), and:int(ldc:int(2221), ldc:int(9252))))
            storeelement:String(expr_132:String[], and:int(ldc:int(141), ldc:int(25866)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(5164), ldc:int(19110)), xor:int(ldc:int(10011), ldc:int(10033))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(17674), ldc:int(17667)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(677), ldc:int(655)), and:int(ldc:int(7345), ldc:int(561))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(-28666), ldc:int(-28662)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(22321), ldc:int(8377)), xor:int(ldc:int(20493), ldc:int(20535))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(8195), ldc:int(20911)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(18490), ldc:int(58)), xor:int(ldc:int(-24448), ldc:int(-24385))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(-24501), ldc:int(-24506)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(639), ldc:int(16703)), xor:int(ldc:int(1047), ldc:int(1104))))
            storeelement:String(expr_132:String[], and:int(ldc:int(10422), ldc:int(787)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(311), ldc:int(368)), and:int(ldc:int(20569), ldc:int(12016))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(16704), ldc:int(16725)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(3093), ldc:int(3141)), and:int(ldc:int(25821), ldc:int(340))))
            storeelement:String(expr_132:String[], and:int(ldc:int(2077), ldc:int(21012)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-30531), ldc:int(-30487)), and:int(ldc:int(5213), ldc:int(8285))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(589), ldc:int(606)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-14814), ldc:int(-14721)), and:int(ldc:int(103), ldc:int(887))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(263), ldc:int(264)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-32573), ldc:int(-32604)), xor:int(ldc:int(74), ldc:int(38))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(4416), ldc:int(4430)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-30622), ldc:int(-30706)), and:int(ldc:int(4211), ldc:int(18547))))
            storeelement:String(expr_132:String[], and:int(ldc:int(17482), ldc:int(14)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(371), ldc:int(24691)), xor:int(ldc:int(-26623), ldc:int(-26495))))
            storeelement:String(expr_132:String[], and:int(ldc:int(2203), ldc:int(24619)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(16591), ldc:int(656)), and:int(ldc:int(2190), ldc:int(942))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(2258), ldc:int(2242)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(398), ldc:int(4783)), xor:int(ldc:int(118), ldc:int(236))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(74), ldc:int(91)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(16538), ldc:int(990)), xor:int(ldc:int(4175), ldc:int(4304))))
            storeelement:String(expr_132:String[], and:int(ldc:int(16572), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(8159), ldc:int(191)), xor:int(ldc:int(20602), ldc:int(20681))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(1), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(4354), ldc:int(4529)), and:int(ldc:int(10430), ldc:int(4539))))
            putstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1, expr_13C:String[])
            var_3_3B8 = expr_132:String[]
            putstatic:Map<String, String>(\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u8df4\u7043\u9255\u99f7\uff55\u99f7, invokevirtual:ImmutableMap(ImmutableMap$Builder::build, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, invokestatic:ImmutableMap$Builder(ImmutableMap::builder), loadelement:String(var_3_3B8:String[], and:int(ldc:int(16700), ldc:int(10245))), loadelement:String[expected:Object](getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), and:int(ldc:int(20487), ldc:int(8307)))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(23557), ldc:int(8381))), loadelement:String[expected:Object](getstatic:String[](\u183a\u1187\u8bb0\u3e75\u9033\u4f4a::\u9255\u718f\u62da\u836c\u6435\u5fe1), xor:int(ldc:int(4197), ldc:int(4198)))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(560), ldc:int(566))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(3594), ldc:int(3597)))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(2568), ldc:int(4216))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(1025), ldc:int(1032)))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(24), ldc:int(18))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(2091), ldc:int(26447)))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(-32246), ldc:int(-32250))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(-20473), ldc:int(-20470)))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(16398), ldc:int(558))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(-30585), ldc:int(-30584)))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(560), ldc:int(464))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(1587), ldc:int(17)))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(16976), ldc:int(16962))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(6662), ldc:int(6677)))), loadelement:String(var_3_3B8:String[], xor:int(ldc:int(4618), ldc:int(4638))), loadelement:String(var_3_3B8:String[], and:int(ldc:int(1365), ldc:int(8757))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc4d2\u6ec6\u62da\ub102\u8aa5\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64F : int
        var_5_87 : int
        var_6_8E : int
        var_7_9D : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_65A : int
        
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
        var_3_64F = and:int(ldc:int(631515832), ldc:int(1976379327))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u183a\u1187\u8bb0\u3e75\u9033\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0177)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(512)), ldc:int(0))) {
            var_3_64F = and:int(var_3_64F:int, ldc:int(1164254116))
        }
        else {
            var_3_64F = and:int(var_3_64F:int, ldc:int(97510132))
            var_5_87 = and:int(ldc:int(21517), ldc:int(-23598))
            var_6_8E = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9D = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1369), ldc:int(-1370)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_64F:int, ldc:int(365814527))
                    var_9_C5 = sub:double(var_7_9D:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_87:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_8E:int, and:int(ldc:int(5189), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, xor:int(ldc:int(24), ldc:int(25)))), var_7_9D:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_64F = and:int(var_3_D7:int, ldc:int(-1914740033))
                    var_14_112 = var_7_9D:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_87:int), and:int(ldc:int(673), ldc:int(83)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_8E:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1663586835))
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-773583878))
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1130149699))
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(230270987))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1242598197))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1873636279))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_8E:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(245052840))
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(722864486))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1304280759))
                            var_11_E8 = and:int(ldc:int(-23988), ldc:int(7330))
                            goto(Label_1493)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1848127099))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1107363966))
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(455238929))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(900049591))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-351638130))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1705314963))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-730559115))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1772456012))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1113824603))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0795:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1270631125))
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(105086745))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1376252716))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1686898699))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-634846516))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(401864106))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-274292039))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87:int), var_7_9D:double)) {
                                var_11_E8 = and:int(ldc:int(1547), ldc:int(10389))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-925410999))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-733131471))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(1525452430))
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1736860456))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1328306226))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1348060179))
                        var_11_E8 = and:int(ldc:int(-31922), ldc:int(6320))
                    }
                    
                    Label_1104:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1663633174))
                        goto(Label_1331)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-576556999))
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1080100958))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1331)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1359100236))
                        goto(Label_1504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1104)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(-1158768340))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64F = and:int(var_3_64F:int, ldc:int(960782445))
                            loopcontinue()
                        }
                        
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-843727129))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_87:int, var_16_116:int)
                        goto(Label_1493)
                    }
                    
                    Label_1331:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(858465250))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-191946094))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-908515134))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-1177789705))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(289618000))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(862240889))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-2021478661))
                        loopcontinue()
                    }
                    
                    var_3_64F = and:int(var_3_64F:int, ldc:int(-707510362))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1493:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65A = var_5_87:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1504:
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1331)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(1206315308))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(332807887))
                        goto(Label_0795)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(997765862))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(-87913821))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64F = and:int(var_3_64F:int, ldc:int(365837035))
                        var_17_65A = add:int(var_16_116:int, xor:int(ldc:int(130), ldc:int(131)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64F = and:int(var_3_64F:int, ldc:int(-1512215644))
                
                if (cmple:boolean(var_5_87 = var_17_65A:int, sub:int(var_6_8E:int, xor:int(ldc:int(8453), ldc:int(8452))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0177:
        
        if (cmpne:boolean(and:int(var_3_64F:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
