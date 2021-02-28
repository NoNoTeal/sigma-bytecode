public class \u3d64\u7af6\uae87\uc238\u7d52.\u7006\u72f1\ub102\u7873\uf9c5\u5bc4 {
    public void \u7006\u72f1\ub102\u7873\uf9c5\u5bc4(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::<init>, this:\u7006\u72f1\ub102\u7873\uf9c5\u5bc4, p0:Schema, p1:boolean, loadelement:String(getstatic:String[](\u7006\u72f1\ub102\u7873\uf9c5\u5bc4::\ubb2b\uc9f6\u47c2\u5654\uc9f6\u92ee), and:int(ldc:int(15264), ldc:int(-16354))), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), loadelement:String(getstatic:String[](\u7006\u72f1\ub102\u7873\uf9c5\u5bc4::\ubb2b\uc9f6\u47c2\u5654\uc9f6\u92ee), and:int(ldc:int(22849), ldc:int(5))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \u8413\u76bc\ud158\u76bc\ua61f\uc84e(com.mojang.serialization.Dynamic<?> p0) {
        var_2_5F : int
        stack_A7_0 : Dynamic [generated]
        
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
            var_2_5F = and:int(ldc:int(-1786573881), ldc:int(-139866217))
            
            if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::map, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u7006\u72f1\ub102\u7873\uf9c5\u5bc4::\ubb2b\uc9f6\u47c2\u5654\uc9f6\u92ee), xor:int(ldc:int(91), ldc:int(89)))), invokedynamic:Function<T, DataResult>(apply:()Ljava/util/function/Function;))))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1377887475))
                stack_A7_0 = p0:Dynamic<?>
            }
            else {
                stack_A7_0 = invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u7006\u72f1\ub102\u7873\uf9c5\u5bc4::\ubb2b\uc9f6\u47c2\u5654\uc9f6\u92ee), and:int(ldc:int(46), ldc:int(8962))), invokevirtual:Dynamic(Dynamic::createByte, p0:Dynamic<?>, ldc:byte(10)))
            }
            
            return:Dynamic<?>(stack_A7_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0) {
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
            return:Typed<?>(invokevirtual:Typed(Typed::update, p0:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u3d64\u7af6\uae87\uc238\u7d52/\u7006\u72f1\ub102\u7873\uf9c5\u5bc4;)Ljava/util/function/Function;, this:\u7006\u72f1\ub102\u7873\uf9c5\u5bc4)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_212 : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_17C_0 : byte[] [generated]
        stack_224_0 : byte[] [generated]
        stack_274_0 : byte[] [generated]
        stack_2DF_0 : byte[] [generated]
        stack_332_0 : byte[] [generated]
        stack_3A2_0 : byte[] [generated]
        var_4_1F8 : int
        var_3_1FD : byte[]
        var_5_1FE : int
        expr_224 : byte [generated]
        var_0_328 : int
        expr_332 : byte [generated]
        stack_36E_2 : byte [generated]
        stack_34D_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_263 : byte[]
        var_5_264 : int
        expr_D1 : int [generated]
        expr_10B : int [generated]
        expr_14D : int [generated]
        var_3_391 : byte[]
        var_5_392 : int
        var_3_188 : String
        stack_1F1_0 : String[] [generated]
        expr_19A : String[] [generated]
        
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
        var_0_212 = and:int(ldc:int(1307773909), ldc:int(-68800869))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("cG2JlOd4aWqaHBFl5JlvCmMcdG2JFGR6mxcSE2QZZekI5J5xleSZbzo+MYs=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F8 = expr_6B:int
        var_3_1FD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FE = expr_6B:int
        Label_0512:
        
        while (cmpne:boolean(and:int(var_0_212:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(1329518931))
                goto(Label_0699)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-101945636))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_224 = loadelement:byte(stack_224_0:byte[], var_5_1FE:int)
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, or:int(and:int(shl:int(expr_224:byte, xor:int(ldc:int(-22400), ldc:int(-22396))), ldc:int(-16)), and:int(shr:int(expr_224:byte[expected:int], xor:int(ldc:int(16512), ldc:int(16516))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0782)
        Label_0699:
        
        while (cmpne:boolean(and:int(var_0_212:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(-277624924))
                goto(Label_0512)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-1040418027))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, xor:byte(loadelement:byte(stack_2DF_0:byte[], var_5_1FE:int), ldc:byte(46)))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0214)
        }
        
        Label_0782:
        
        while (cmpne:boolean(and:int(var_0_212:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_212:int, ldc:int(262144)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(-1533969540))
                goto(Label_0512)
            }
            
            var_0_328 = and:int(var_0_212:int, ldc:int(1509059225))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_332 = stack_36E_2 = loadelement(stack_332_0, var_5_1FE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FE:int, ldc:int(3)), neg:int(var_4_1F8:int)), ldc:int(0))) {
                stack_36E_2 = stack_34D_0 = add:byte(expr_332:byte, loadelement:byte(var_3_1FD:byte[], add:int(var_5_1FE:int, ldc:int(3))))
                goto(Label_0861)
            }
            
            Label_0831:
            
            if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(262144)), ldc:int(0))) {
                var_0_328 = and:int(var_0_328:int, ldc:int(1576557468))
                stack_36E_2 = stack_34D_0 = add:byte(expr_332:byte, ldc:byte(3))
            }
            
            Label_0861:
            
            if (cmpeq:boolean(and:int(var_0_328:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0831)
            }
            
            var_0_212 = and:int(var_0_328:int, ldc:int(2012589021))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, stack_36E_2:byte)
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = var_3_1FD:byte[]
            goto(Label_0272)
        }
        
        goto(Label_0699)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(262144)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(406167303))
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0214)
        }
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-705082606))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_263 = newarray:byte[](byte.class, expr_9F:int)
                var_5_264 = expr_9F:int
                
                loop {
                    var_0_212 = and:int(var_0_212:int, ldc:int(1910954840))
                    var_5_264 = add:int(var_5_264:int, ldc:int(-1))
                    storeelement:byte(var_3_263:byte[], var_5_264:int, add:int(shl:int(loadelement:byte(stack_274_0:byte[], var_5_264:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_264:int, and:int(ldc:int(26177), ldc:int(4125)))), ldc:int(3)), xor:int(ldc:int(-32760), ldc:int(-32745)))))
                    
                    if (cmpne:boolean(var_5_264:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = var_3_263:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-98169378))
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-67563937))
            expr_D1 = arraylength:int(stack_D1_0:byte[])
            
            if (cmpne:boolean(expr_D1:int, ldc:int(0))) {
                var_4_1F8 = expr_D1:int
                var_3_1FD = newarray:byte[](byte.class, expr_D1:int)
                var_5_1FE = expr_D1:int
                goto(Label_0699)
            }
        }
        
        Label_0214:
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(262144)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(1789711970))
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_212:int, ldc:int(262144)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(-750980408))
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-772175276))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_1F8 = expr_10B:int
                var_3_1FD = newarray:byte[](byte.class, expr_10B:int)
                var_5_1FE = expr_10B:int
                goto(Label_0782)
            }
        }
        
        Label_0272:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2048)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(281947335))
        }
        else {
            if (cmpne:boolean(and:int(var_0_212:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(862841049))
                goto(Label_0214)
            }
            
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2048)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(2115327615))
                goto(Label_0112)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-201494626))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_391 = newarray:byte[](byte.class, expr_14D:int)
                var_5_392 = expr_14D:int
                
                loop {
                    var_0_212 = and:int(var_0_212:int, ldc:int(-639623203))
                    var_5_392 = add:int(var_5_392:int, ldc:int(-1))
                    storeelement:byte(var_3_391:byte[], var_5_392:int, add:byte(loadelement:byte(stack_3A2_0:byte[], var_5_392:int), ldc:byte(22)))
                    
                    if (cmpne:boolean(var_5_392:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_CF_0 = stack_D1_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_224_0 = stack_274_0 = stack_2DF_0 = stack_332_0 = stack_3A2_0 = var_3_391:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0214)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(4096)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-1494140170))
            goto(Label_0112)
        }
        
        var_3_188 = initobject:String(String::<init>, stack_17C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16915), ldc:int(6575)))
        expr_19A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16387), ldc:int(1027)))
        storeelement:String(expr_19A:String[], and:int(ldc:int(9394), ldc:int(70)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(-13919), ldc:int(9822)), and:int(ldc:int(53), ldc:int(26245))))
        storeelement:String(expr_19A:String[], and:int(ldc:int(21100), ldc:int(-21357)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(7173), ldc:int(135)), and:int(ldc:int(25626), ldc:int(4223))))
        storeelement:String(expr_19A:String[], xor:int(ldc:int(68), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(26), ldc:int(4442)), and:int(ldc:int(8811), ldc:int(2223))))
        putstatic:String[](\u7006\u72f1\ub102\u7873\uf9c5\u5bc4::\ubb2b\uc9f6\u47c2\u5654\uc9f6\u92ee, expr_19A:String[])
    }
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(555945264), ldc:int(-249426895))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u72f1\ub102\u7873\uf9c5\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(1813694812))
        }
        else {
            var_3_65A = and:int(var_3_65A:int, ldc:int(959556536))
            var_5_85 = and:int(ldc:int(-4235), ldc:int(4234))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5269), ldc:int(5268)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_65A:int, ldc:int(-172343630))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(33), ldc:int(10761)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4369), ldc:int(641)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_D2:int, ldc:int(733431990))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2752), ldc:int(2753)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1558896116))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1394911182))
                        goto(Label_0545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(54354481))
                    }
                    else {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1410651717))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0545)
                            }
                            
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(556339165))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-185789910))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1012293147))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1768541617))
                        var_11_E3 = and:int(ldc:int(-4166), ldc:int(4165))
                        goto(Label_1517)
                    }
                    
                    Label_0545:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-751417357))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(747622141))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1310455766))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-268042223))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1672912570))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0664:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2077394035))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1709019046))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-252989257))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(934064024))
                            goto(Label_0545)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(938212030))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0791:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(346065827))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1500435867))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-469634515))
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1854415221))
                            goto(Label_0545)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-130107933))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-739519599))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(694734705))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-32752), ldc:int(-32751))
                                goto(Label_1074)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(701210510))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(678745008))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0545)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(398146898))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(867580538))
                        var_11_E3 = and:int(ldc:int(-27719), ldc:int(27718))
                    }
                    
                    Label_1074:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1708619234))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1306280680))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1522167031))
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1323292612))
                            goto(Label_0545)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1797651459))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1966145333))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1201:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-719882375))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1100380062))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1074)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1851464389))
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1595770639))
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(344788015))
                            goto(Label_0664)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1244860383))
                            goto(Label_0545)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-303609714))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1735796788))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1358:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1960249714))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1624241615))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1546461956))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1592902816))
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-78768156))
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1432769097))
                        goto(Label_0545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1528956876))
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(2133732658))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2060913949))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(561180859))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-592564212))
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1869008634))
                        var_17_665 = add:int(var_16_111:int, and:int(ldc:int(9285), ldc:int(161)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(1776823346))
                
                if (cmple:boolean(var_5_85 = var_17_665:int, sub:int(var_6_8C:int, and:int(ldc:int(23297), ldc:int(8321))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
