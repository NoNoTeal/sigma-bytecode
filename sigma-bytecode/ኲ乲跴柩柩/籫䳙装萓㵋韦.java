public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6 {
    public void \u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\uc2e8\u8640\ub171\u93a2\u6fb0\u3711$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
        var_6_68 : Optional
        var_7_A7 : Optional
        var_8_C0 : Typed
        var_9_C8 : Optional
        var_10_E1 : Typed
        var_11_EE : Dynamic
        var_12_10A : int
        
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
            var_6_68 = invokevirtual:Optional(Typed::getOptional, p3:Typed, p0:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_6_68:Optional)) {
                if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_6_68:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u8640\u4492\ubded\u64ab\uc246\u7c6b), and:int(ldc:int(16405), ldc:int(140))))) {
                    var_7_A7 = invokevirtual:Optional(Typed::getOptionalTyped, p3:Typed, p1:OpticFinder)
                    
                    if (invokevirtual:boolean(Optional::isPresent, var_7_A7:Optional)) {
                        var_8_C0 = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_7_A7:Optional<Typed>))
                        var_9_C8 = invokevirtual:Optional(Typed::getOptionalTyped, var_8_C0:Typed, p2:OpticFinder)
                        
                        if (invokevirtual:boolean(Optional::isPresent, var_9_C8:Optional)) {
                            var_10_E1 = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_9_C8:Optional<Typed>))
                            var_11_EE = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, var_10_E1:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                            var_12_10A = invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_11_EE:Dynamic, loadelement:String(getstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u8640\u4492\ubded\u64ab\uc246\u7c6b), and:int(ldc:int(8197), ldc:int(16501)))), and:int(ldc:int(-15132), ldc:int(14859)))
                            invokevirtual:Dynamic(Dynamic::remove, var_11_EE:Dynamic, loadelement:String(getstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u8640\u4492\ubded\u64ab\uc246\u7c6b), and:int(ldc:int(8485), ldc:int(1549))))
                            return:Typed(invokevirtual:Typed(Typed::set, invokevirtual:Typed(Typed::set, p3:Typed, p1:OpticFinder, invokevirtual:Typed(Typed::set, var_8_C0:Typed, p2:OpticFinder, invokevirtual:Typed(Typed::set, var_10_E1:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_11_EE:Dynamic[expected:Object]))), p0:OpticFinder, invokestatic:Pair(Pair::of, invokeinterface:String[expected:Object](DSL$TypeReference::typeName, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab)), loadelement:String(getstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u3dd3\u3e2a\ud158\u3711\u12b2\u4f4a), rem:int(var_12_10A:int, ldc:int(16))))))
                        }
                    }
                }
            }
            
            return:Typed(p3:Typed)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_57E : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_4D5_0 : byte[] [generated]
        stack_525_0 : byte[] [generated]
        stack_590_0 : byte[] [generated]
        stack_5DE_0 : byte[] [generated]
        var_4_4B1 : int
        var_3_4B6 : byte[]
        var_5_4B7 : int
        expr_4D5 : byte [generated]
        var_0_5D4 : int
        expr_5DE : byte [generated]
        stack_60D_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_514 : byte[]
        var_5_515 : int
        expr_BB : int [generated]
        expr_EE : int [generated]
        var_3_12A : String
        expr_132 : String[] [generated]
        expr_13C : String[] [generated]
        var_3_3B4 : String[]
        expr_3B7 : String[] [generated]
        
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
        var_0_57E = and:int(ldc:int(-1323262507), ldc:int(824262361))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_4D5_0 = stack_525_0 = stack_590_0 = stack_5DE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ow/CN2avO/4rM2pTO26nFwsDcqPCO7Z/W/oT4l9a1ysqoxcLA0KHU8LqI+o3+hNf0jNbPr8n/gs/xkf2W/oT4l/aC1Mr+uo3+hNf0jNbPr8nL9rmT/Zb+hPiX9oLUyv66jf6E1/SM1s+v1cXO/bCS/Zb+hPiX9oLUyv66jf6E1/SM1s+r3u+V8pL9lv6E+Jf2gtTK/rqN/oTX9IzWz7fK9Jztk/2W/oT4l/aC1Mr+uo3+hNf0jNbPt8rwhMnykv2W/oT4l/aC1Mr+uo3+hNf0jNbPs8fGw8rpgMjL9rmT/Zb+hPiX9oLUyv66jf6E1/SM1s+zx8L9uZP9lv6E+Jf2gtTK/rqN/oTX9IzWz7PwjcfLzveG0/2W/oT4l/aC1Mr+uo3+hNf0jNbPv8L0lPqG+5P9lv6E+Jf2gtTK/rqN/oTX9IzWz7/7jsbykf2W/oT4l/aC1Mr+uo3+hNf0jNbPv8/Gxvu5upP9lv6E+Jf2gtTK/rqN/oTX9IzWz7/xhPiQ/Zb+hPiX9oLUyv66jf6E1/SM1s+7/pb+hPiX9oLUyv66jf6E1/SM1s+7/oPI95T2kv2W/oT4l/aC1Mr+uo3+hNf0jNbPhzKCyvC6k/2W/oT4l/aC1Mr+uo3+hNf0jNbPhyiNxMHM7ZH9lv6E+Jf2gtTK+rWO20M")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_4B1 = expr_6B:int
        var_3_4B6 = newarray:byte[](byte.class, expr_6B:int)
        var_5_4B7 = expr_6B:int
        Label_1209:
        
        while (cmpne:boolean(and:int(var_0_57E:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_57E:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1388)
            }
            
            var_0_57E = and:int(var_0_57E:int, ldc:int(-172024073))
            var_5_4B7 = add:int(var_5_4B7:int, ldc:int(-1))
            expr_4D5 = loadelement:byte(stack_4D5_0:byte[], var_5_4B7:int)
            storeelement:byte(var_3_4B6:byte[], var_5_4B7:int, or:int(and:int(shl:int(expr_4D5:byte, and:int(ldc:int(6214), ldc:int(17684))), ldc:int(-16)), and:int(shr:int(expr_4D5:byte[expected:int], xor:int(ldc:int(526), ldc:int(522))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_4B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_4D5_0 = stack_525_0 = stack_590_0 = stack_5DE_0 = var_3_4B6:byte[]
            goto(Label_0112)
        }
        
        goto(Label_1474)
        Label_1388:
        
        while (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(1)), ldc:int(0))) {
                var_0_57E = and:int(var_0_57E:int, ldc:int(-88901794))
                goto(Label_1209)
            }
            
            var_0_57E = and:int(var_0_57E:int, ldc:int(-1246401421))
            var_5_4B7 = add:int(var_5_4B7:int, ldc:int(-1))
            storeelement:byte(var_3_4B6:byte[], var_5_4B7:int, add:byte(xor:byte(loadelement:byte(stack_590_0:byte[], var_5_4B7:int), ldc:byte(121)), ldc:byte(68)))
            
            if (cmpne:boolean(var_5_4B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_4D5_0 = stack_525_0 = stack_590_0 = stack_5DE_0 = var_3_4B6:byte[]
            goto(Label_0192)
        }
        
        Label_1474:
        
        while (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_57E:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1209)
            }
            
            var_0_5D4 = and:int(var_0_57E:int, ldc:int(-1218380175))
            var_5_4B7 = add:int(var_5_4B7:int, ldc:int(-1))
            expr_5DE = loadelement:byte(stack_5DE_0:byte[], var_5_4B7:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_4B7:int, ldc:int(1)), neg:int(var_4_4B1:int)), ldc:int(0))) {
                var_0_5D4 = and:int(var_0_5D4:int, ldc:int(2100805369))
                stack_60D_2 = add:byte(expr_5DE:byte, ldc:byte(1))
            }
            else {
                stack_60D_2 = add:byte(expr_5DE:byte, loadelement:byte(var_3_4B6:byte[], add:int(var_5_4B7:int, ldc:int(1))))
            }
            
            var_0_57E = and:int(var_0_5D4:int, ldc:int(-240964005))
            storeelement:byte(var_3_4B6:byte[], var_5_4B7:int, stack_60D_2:byte)
            
            if (cmpne:boolean(var_5_4B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_4D5_0 = stack_525_0 = stack_590_0 = stack_5DE_0 = var_3_4B6:byte[]
            goto(Label_0243)
        }
        
        goto(Label_1388)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_57E:int, ldc:int(16)), ldc:int(0))) {
            var_0_57E = and:int(var_0_57E:int, ldc:int(-106914055))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_514 = newarray:byte[](byte.class, expr_90:int)
                var_5_515 = expr_90:int
                
                loop {
                    var_0_57E = and:int(var_0_57E:int, ldc:int(967110487))
                    var_5_515 = add:int(var_5_515:int, ldc:int(-1))
                    storeelement:byte(var_3_514:byte[], var_5_515:int, add:int(shl:int(loadelement:byte(stack_525_0:byte[], var_5_515:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_515:int, and:int(ldc:int(515), ldc:int(13569)))), ldc:int(6)), and:int(ldc:int(8323), ldc:int(18443)))))
                    
                    if (cmpne:boolean(var_5_515:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_4D5_0 = stack_525_0 = stack_590_0 = stack_5DE_0 = var_3_514:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_57E:int, ldc:int(8192)), ldc:int(0))) {
            var_0_57E = and:int(var_0_57E:int, ldc:int(-936057126))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_57E = and:int(var_0_57E:int, ldc:int(905915869))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_4B1 = expr_BB:int
                var_3_4B6 = newarray:byte[](byte.class, expr_BB:int)
                var_5_4B7 = expr_BB:int
                goto(Label_1388)
            }
        }
        
        Label_0192:
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_57E = and:int(var_0_57E:int, ldc:int(-1041999590))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_57E = and:int(var_0_57E:int, ldc:int(-1299176319))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_57E:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_57E = and:int(var_0_57E:int, ldc:int(-172691757))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_4B1 = expr_EE:int
                var_3_4B6 = newarray:byte[](byte.class, expr_EE:int)
                var_5_4B7 = expr_EE:int
                goto(Label_1474)
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_57E = and:int(var_0_57E:int, ldc:int(2054066701))
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_57E:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_57E = and:int(var_0_57E:int, ldc:int(-1098872222))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_132 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(112), ldc:int(102)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20993), ldc:int(21015)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(21638), ldc:int(2898)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-9988), ldc:int(1795)), and:int(ldc:int(702), ldc:int(14415))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(4678), ldc:int(4675)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(74), ldc:int(68)), and:int(ldc:int(3611), ldc:int(16503))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(12553), ldc:int(12554)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(1180), ldc:int(1167)), xor:int(ldc:int(528), ldc:int(569))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(5388), ldc:int(-5391)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(3625), ldc:int(105)), and:int(ldc:int(4139), ldc:int(25195))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(-31418), ldc:int(-31405)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(10251), ldc:int(10272)), and:int(ldc:int(2135), ldc:int(29158))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(26660), ldc:int(26677)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(4139), ldc:int(4205)), and:int(ldc:int(8305), ldc:int(16872))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(4432), ldc:int(4418)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(18787), ldc:int(112)), xor:int(ldc:int(10343), ldc:int(10268))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(-23515), ldc:int(-23510)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(2171), ldc:int(28795)), and:int(ldc:int(17557), ldc:int(157))))
        storeelement:String(expr_132:String[], and:int(ldc:int(1311), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(17815), ldc:int(2229)), and:int(ldc:int(431), ldc:int(2223))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(4868), ldc:int(4887)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(1027), ldc:int(1196)), xor:int(ldc:int(175), ldc:int(101))))
        storeelement:String(expr_132:String[], and:int(ldc:int(6665), ldc:int(8269)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-28443), ldc:int(-28625)), xor:int(ldc:int(257), ldc:int(491))))
        storeelement:String(expr_132:String[], and:int(ldc:int(10859), ldc:int(139)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(18876), ldc:int(18774)), and:int(ldc:int(260), ldc:int(1324))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(557), ldc:int(549)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(4419), ldc:int(4167)), xor:int(ldc:int(2170), ldc:int(2395))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(3654), ldc:int(3649)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(15), ldc:int(302)), xor:int(ldc:int(-31457), ldc:int(-31710))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(16451), ldc:int(16463)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(2088), ldc:int(2325)), and:int(ldc:int(4439), ldc:int(16855))))
        storeelement:String(expr_132:String[], and:int(ldc:int(16560), ldc:int(12376)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(2061), ldc:int(2394)), xor:int(ldc:int(1230), ldc:int(1469))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(1044), ldc:int(1024)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(9169), ldc:int(8866)), xor:int(ldc:int(20841), ldc:int(20709))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(-23423), ldc:int(-23419)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(17293), ldc:int(9612)), and:int(ldc:int(11179), ldc:int(4513))))
        storeelement:String(expr_132:String[], xor:int(ldc:int(10240), ldc:int(10254)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(5091), ldc:int(8613)), xor:int(ldc:int(6113), ldc:int(5724))))
        storeelement:String(expr_132:String[], and:int(ldc:int(22622), ldc:int(9094)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-7252), ldc:int(-7663)), xor:int(ldc:int(2296), ldc:int(2336))))
        storeelement:String(expr_132:String[], and:int(ldc:int(3722), ldc:int(126)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(3110), ldc:int(3582)), and:int(ldc:int(5108), ldc:int(502))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(2113), ldc:int(21035)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(3572), ldc:int(511)), xor:int(ldc:int(8784), ldc:int(9127))))
        putstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u8640\u4492\ubded\u64ab\uc246\u7c6b, expr_13C:String[])
        var_3_3B4 = expr_132:String[]
        expr_3B7 = newarray:String[](java.lang.String.class, ldc:int(16))
        storeelement:String(expr_3B7:String[], and:int(ldc:int(4689), ldc:int(-4690)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(19975), ldc:int(4206))))
        storeelement:String(expr_3B7:String[], xor:int(ldc:int(8220), ldc:int(8221)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(16407), ldc:int(3079))))
        storeelement:String(expr_3B7:String[], and:int(ldc:int(9474), ldc:int(31)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(2056), ldc:int(17354))))
        storeelement:String(expr_3B7:String[], and:int(ldc:int(14707), ldc:int(16391)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(525), ldc:int(20761))))
        storeelement:String(expr_3B7:String[], xor:int(ldc:int(1536), ldc:int(1540)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(2074), ldc:int(4202))))
        storeelement:String(expr_3B7:String[], xor:int(ldc:int(20480), ldc:int(20485)), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(3339), ldc:int(29199))))
        storeelement:String(expr_3B7:String[], ldc:int(6), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(2305), ldc:int(2317))))
        storeelement:String(expr_3B7:String[], ldc:int(7), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(44), ldc:int(33))))
        storeelement:String(expr_3B7:String[], ldc:int(8), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(1069), ldc:int(1059))))
        storeelement:String(expr_3B7:String[], ldc:int(9), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(-14324), ldc:int(-14333))))
        storeelement:String(expr_3B7:String[], ldc:int(10), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(17456), ldc:int(146))))
        storeelement:String(expr_3B7:String[], ldc:int(11), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(-31602), ldc:int(-31585))))
        storeelement:String(expr_3B7:String[], ldc:int(12), loadelement:String[expected:String](var_3_3B4:String[], and:int(ldc:int(1106), ldc:int(4543))))
        storeelement:String(expr_3B7:String[], ldc:int(13), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(-16248), ldc:int(-16229))))
        storeelement:String(expr_3B7:String[], ldc:int(14), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(-16379), ldc:int(-16367))))
        storeelement:String(expr_3B7:String[], ldc:int(15), loadelement:String[expected:String](var_3_3B4:String[], xor:int(ldc:int(-28134), ldc:int(-28145))))
        putstatic:String[](\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6::\u3dd3\u3e2a\ud158\u3711\u12b2\u4f4a, expr_3B7:String[])
    }
    
    public void \u47c2\u8413\u4daf\u92ff\u8350\u8bb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_670 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67B : int
        
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
        var_3_670 = and:int(ldc:int(-408452125), ldc:int(-671113233))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u4cd9\u88c5\u8413\u3d4b\u97e6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
            var_3_670 = and:int(var_3_670:int, ldc:int(-693662721))
            var_5_81 = and:int(ldc:int(-25617), ldc:int(25616))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9525), ldc:int(9524)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_670:int, ldc:int(-717237269))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-22400), ldc:int(-22399)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(8276), ldc:int(8277)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_670 = and:int(var_3_D1:int, ldc:int(-276855838))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(8201), ldc:int(2311)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-340008417))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1811154535))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1110173581))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-262706612))
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(2051548813))
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-803321280))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-697841933))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0892)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(766404484))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-297991683))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1627517206))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(64)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(925167270))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-220356167))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-197682454))
                        var_11_E2 = and:int(ldc:int(-11394), ldc:int(11393))
                        goto(Label_1528)
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1248234450))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1860948089))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(4)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1673497810))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1980827924))
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-677409509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-271505555))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(231285634))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-705722641))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0892)
                        }
                    }
                    
                    Label_0742:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1932139939))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(4)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-850024086))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1971924810))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1361857080))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(417233995))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-52133050))
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-446174486))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0892:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(2087561523))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-177756438))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(517), ldc:int(16417))
                                goto(Label_1127)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-181668581))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-775518636))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-64508166))
                        var_11_E2 = and:int(ldc:int(-2305), ldc:int(2304))
                    }
                    
                    Label_1127:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-170389779))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(177730008))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(64)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1398659960))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(1196678821))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(-855649282))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-840488120))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1658665572))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-811786575))
                            goto(Label_1127)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(2082334143))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-38305037))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1528)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1382:
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1377066707))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1878712610))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1226519311))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(407669941))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-1269326689))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_670 = and:int(var_3_670:int, ldc:int(-869823765))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1528:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1539:
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1662241741))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(1216087088))
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(128)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-138223167))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_670 = and:int(var_3_670:int, ldc:int(-537948162))
                        var_17_67B = add:int(var_16_110:int, and:int(ldc:int(257), ldc:int(2257)))
                        looporswitchbreak()
                    }
                    
                    var_3_670 = and:int(var_3_670:int, ldc:int(-1912603102))
                }
                
                var_3_670 = and:int(var_3_670:int, ldc:int(-962077701))
                
                if (cmple:boolean(var_5_81 = var_17_67B:int, sub:int(var_6_88:int, xor:int(ldc:int(2052), ldc:int(2053))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
