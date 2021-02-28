public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0 {
    public void \u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0() {
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
            invokespecial:Object(Object::<init>, this:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0)
            putfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u92ee\uceb8\u4e72\u5140\u12b2\ub8be, this:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, multianewarray:float[][](float[][].class, xor:int(ldc:int(-31212), ldc:int(-31215)), ldc:int(49)))
            putfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u6198\u8df4\u72f1\u3d64\u51fa\u4c2b, this:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, multianewarray:float[][](float[][].class, and:int(ldc:int(8229), ldc:int(583)), ldc:int(49)))
            putfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, this:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, multianewarray:float[][](float[][].class, and:int(ldc:int(2325), ldc:int(25167)), ldc:int(49)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u839e\u4975\u946b\uc7fe\uc4d2\u516c(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, float[][][] p1, int p2) {
        var_3_5F : int
        var_5_67 : \u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0
        
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
        var_3_5F = and:int(ldc:int(-503473730), ldc:int(-1459941858))
        var_5_67 = initobject:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::<init>)
        
        if (cmpeq:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u0b8e\u8258\u8753\ub102\u40a9\ua6bd, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), ldc:int(0))) {
            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int, ldc:int(-1))
            goto(Label_0440)
        }
        
        Label_0123:
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0440)
        }
        
        if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-1741959417))
            goto(Label_0351)
        }
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-2124477443))
            goto(Label_0254)
        }
        
        if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
            var_3_5F = and:int(var_3_5F:int, ldc:int(730771861))
        }
        else {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-1946157670))
            
            if (cmpeq:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u0b8e\u8258\u8753\ub102\u40a9\ua6bd, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), xor:int(ldc:int(-32444), ldc:int(-32442)))) {
                if (cmple:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ud158\u759a\ub113\u4ab3\u927d\u8308, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), xor:int(ldc:int(-32216), ldc:int(-32215)))) {
                    goto(Label_0351)
                }
                
                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int, sub:int(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ud158\u759a\ub113\u4ab3\u927d\u8308, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), and:int(ldc:int(625), ldc:int(17669))))
                goto(Label_0440)
            }
        }
        
        Label_0196:
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0440)
        }
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
            var_3_5F = and:int(var_3_5F:int, ldc:int(1194070628))
            goto(Label_0351)
        }
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(698352917))
                goto(Label_0123)
            }
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(-1789014434))
            
            if (cmpeq:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ud158\u759a\ub113\u4ab3\u927d\u8308, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), ldc:int(0))) {
                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int, ldc:int(-1))
                goto(Label_0440)
            }
        }
        
        Label_0254:
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0440)
        }
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0196)
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1629664710))
                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int, sub:int(add:int(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), and:int(ldc:int(2049), ldc:int(643))), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ud158\u759a\ub113\u4ab3\u927d\u8308, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int)))
                goto(Label_0440)
            }
            
            goto(Label_0123)
        }
        
        Label_0351:
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0196)
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1179847304))
                goto(Label_0123)
            }
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(-1570791877))
            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int, ldc:int(-1))
        }
        
        Label_0440:
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0351)
        }
        
        if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0254)
        }
        
        if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0196)
        }
        
        if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0123)
        }
        
        if (cmple:boolean(invokestatic:int(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u16f6\ucb79\u8d90\u76bc\u7e3f\u4e72, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, var_5_67:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, p1:float[][][], p2:int), ldc:int(0))) {
            invokestatic:void(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u516c\u7af6\u6fb0\u6435\u4179\ucfaf, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, var_5_67:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, p2:int)
            invokestatic:void(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ub18d\u5f50\u3bc9\u16f6\u99f7\u4cd9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, var_5_67:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0, p1:float[][][], p2:int)
            return:int(and:int(ldc:int(-6137), ldc:int(2016)))
        }
        
        return:int(and:int(ldc:int(10247), ldc:int(4161)))
    }
    
    private static int \ua562\u93a2\u3d4b\u1187\u8709\u8bb0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, int p1, int p2, int p3) {
        var_4_1ED : int
        var_4_94 : int
        stack_158_0 : int [generated]
        stack_158_1 : int [generated]
        var_4_156 : int
        var_6_159 : int
        stack_19E_0 : int [generated]
        stack_19E_1 : int [generated]
        var_4_19C : int
        var_7_19F : int
        var_8_1A3 : int
        
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
        var_4_1ED = and:int(ldc:int(510924551), ldc:int(-687861))
        
        if (cmpeq:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int), p2:int), xor:int(ldc:int(-16367), ldc:int(-16368)))) {
            if (cmpge:boolean(p2:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int))) {
                goto(Label_0205)
            }
            
            if (cmpeq:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u51fa\u76bc\u67e9\u983f\u8640\u927d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int), p3:int), ldc:int(0))) {
                goto(Label_0252)
            }
            
            if (logicalnot:boolean(loadelement:boolean(getfield:boolean[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u98a4\ub70c\ub18d\u7bad\u8258\ud51e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int))) {
                goto(Label_0252)
            }
            
            goto(Label_0205)
        }
        
        Label_0117:
        
        if (cmpeq:boolean(and:int(var_4_1ED:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0252)
        }
        
        if (cmpne:boolean(and:int(var_4_1ED:int, ldc:int(2048)), ldc:int(0))) {
            var_4_1ED = and:int(var_4_1ED:int, ldc:int(-1885540824))
        }
        else {
            var_4_94 = and:int(var_4_1ED:int, ldc:int(1574868903))
            stack_158_0 = mul:int(xor:int(ldc:int(20521), ldc:int(20523)), p3:int)
            
            if (cmpeq:boolean(and:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), and:int(ldc:int(9601), ldc:int(2145))), ldc:int(0))) {
                var_4_94 = and:int(var_4_94:int, ldc:int(-539643049))
                stack_158_1 = and:int(ldc:int(2876), ldc:int(-2878))
            }
            else {
                stack_158_1 = xor:int(ldc:int(10280), ldc:int(10281))
            }
            
            var_4_156 = and:int(var_4_94:int, ldc:int(528243971))
            var_6_159 = sub:int(stack_158_0:int, stack_158_1:int)
            stack_19E_0 = mul:int(and:int(ldc:int(1098), ldc:int(23078)), add:int(p3:int, and:int(ldc:int(2809), ldc:int(16641))))
            
            if (cmpeq:boolean(and:int(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc229\u40a9\u4c04\u51fa\u3a62\ub70c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(16640), ldc:int(16641))), ldc:int(0))) {
                var_4_156 = and:int(var_4_156:int, ldc:int(1022625071))
                stack_19E_1 = and:int(ldc:int(8297), ldc:int(-8302))
            }
            else {
                stack_19E_1 = xor:int(ldc:int(66), ldc:int(67))
            }
            
            var_4_19C = and:int(var_4_156:int, ldc:int(-17311921))
            var_7_19F = sub:int(stack_19E_0:int, stack_19E_1:int)
            var_8_1A3 = var_6_159:int
            
            loop {
                if (cmpne:boolean(and:int(var_4_19C:int, ldc:int(64)), ldc:int(0))) {
                    var_4_1ED = and:int(var_4_19C:int, ldc:int(1172794692))
                }
                else {
                    var_4_1ED = and:int(var_4_19C:int, ldc:int(-1118559813))
                    
                    if (cmpge:boolean(var_8_1A3:int, var_7_19F:int)) {
                        goto(Label_0252)
                    }
                    
                    if (cmplt:boolean(p2:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int))) {
                        if (cmpeq:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u51fa\u76bc\u67e9\u983f\u8640\u927d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int), var_8_1A3:int), ldc:int(0))) {
                            goto(Label_0514)
                        }
                        
                        if (logicalnot:boolean(loadelement:boolean(getfield:boolean[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u98a4\ub70c\ub18d\u7bad\u8258\ud51e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int))) {
                            goto(Label_0514)
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_19C = and:int(var_4_1ED:int, ldc:int(1285402805))
                    loopcontinue()
                }
                
                var_4_1ED = and:int(var_4_1ED:int, ldc:int(2147454215))
                
                if (cmpeq:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u64f2\ud51e\u839e\u88c5\u4c04\u8d90, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int), var_8_1A3:int), and:int(ldc:int(8409), ldc:int(1281)))) {
                    return:int(and:int(ldc:int(6405), ldc:int(1073)))
                }
                
                Label_0514:
                var_4_19C = and:int(var_4_1ED:int, ldc:int(-35773065))
                inc:int(var_8_1A3, ldc:int(1))
            }
        }
        
        Label_0205:
        
        if (cmpeq:boolean(and:int(var_4_1ED:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_1ED:int, ldc:int(16384)), ldc:int(0))) {
                return:int(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u64f2\ud51e\u839e\u88c5\u4c04\u8d90, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p1:int), p3:int))
            }
            
            goto(Label_0117)
        }
        
        Label_0252:
        
        if (cmpne:boolean(and:int(var_4_1ED:int, ldc:int(2048)), ldc:int(0))) {
            var_4_1ED = and:int(var_4_1ED:int, ldc:int(774219085))
            goto(Label_0205)
        }
        
        if (cmpne:boolean(and:int(var_4_1ED:int, ldc:int(8192)), ldc:int(0))) {
            var_4_1ED = and:int(var_4_1ED:int, ldc:int(1882354398))
            goto(Label_0117)
        }
        
        return:int(and:int(ldc:int(-29022), ldc:int(12620)))
    }
    
    private static int \u16f6\ucb79\u8d90\u76bc\u7e3f\u4e72(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0 p1, float[][][] p2, int p3) {
        var_4_238 : int
        var_6_78 : int
        var_13_1FD : int
        var_4_28D : int
        var_14_25F : int
        var_15_27A : int
        var_16_27E : int
        var_11_2B0 : float
        var_7_2BB : int
        var_8_2CE : int
        var_9_2DC : float
        var_4_342 : int
        var_12_2F3 : int
        var_17_33B : int
        var_7_C8 : int
        var_8_DB : int
        var_9_E3 : float
        var_4_140 : int
        var_10_FA : int
        var_11_128 : float
        var_12_131 : int
        
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
        var_4_238 = and:int(ldc:int(1690492783), ldc:int(2145449673))
        
        if (logicalnot:boolean(getfield:boolean(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubcb0\u8258\u385b\uf9c5\u8cae\u8aa5, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
            var_4_238 = and:int(var_4_238:int, ldc:int(2091933497))
            var_6_78 = and:int(ldc:int(3012), ldc:int(-4047))
            
            while (cmplt:boolean(var_6_78:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int))) {
                var_13_1FD = and:int(ldc:int(-32438), ldc:int(18997))
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_238:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_4_28D = and:int(var_4_238:int, ldc:int(-992246077))
                    }
                    else {
                        var_4_28D = and:int(var_4_238:int, ldc:int(1827823369))
                        
                        if (cmplt:boolean(var_13_1FD:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ua068\u9033\u52d3\uf94d\u56bd\u0b8e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_6_78:int)))) {
                            var_14_25F = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_6_78:int)), var_13_1FD:int)
                            var_15_27A = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_6_78:int)), add:int(var_13_1FD:int, xor:int(ldc:int(528), ldc:int(529))))
                            var_16_27E = var_14_25F:int
                            
                            loop {
                                if (cmpne:boolean(and:int(var_4_28D:int, ldc:int(4096)), ldc:int(0))) {
                                    var_4_28D = and:int(var_4_28D:int, ldc:int(1817370429))
                                    
                                    if (cmplt:boolean(var_16_27E:int, var_15_27A:int)) {
                                        var_11_2B0 = ldc:float(0.0f)
                                        var_7_2BB = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_6_78:int)
                                        var_8_2CE = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), add:int(var_6_78:int, and:int(ldc:int(5377), ldc:int(129))))
                                        var_9_2DC = i2f:float(mul:int(sub:int(var_8_2CE:int, var_7_2BB:int), sub:int(var_15_27A:int, var_14_25F:int)))
                                        
                                        if (cmpeq:boolean(var_9_2DC:float, ldc:float(0.0f))) {
                                            var_9_2DC = ldc:float(1.0f)
                                        }
                                        
                                        var_4_342 = and:int(var_4_28D:int, ldc:int(-21463073))
                                        var_12_2F3 = add:int(var_7_2BB:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                                        
                                        while (cmplt:boolean(var_12_2F3:int, add:int(var_8_2CE:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))) {
                                            var_17_33B = var_14_25F:int
                                            
                                            loop {
                                                var_4_342 = and:int(var_4_342:int, ldc:int(2012315417))
                                                
                                                if (cmpge:boolean(var_17_33B:int, var_15_27A:int)) {
                                                    looporswitchbreak()
                                                }
                                                
                                                var_11_2B0 = add:float(var_11_2B0:float, add:float(mul:float(loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_2F3:int), var_17_33B:int), and:int(ldc:int(5880), ldc:int(-5881))), loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_2F3:int), var_17_33B:int), and:int(ldc:int(8890), ldc:int(-8891)))), mul:float(loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_2F3:int), var_17_33B:int), and:int(ldc:int(259), ldc:int(8193))), loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_2F3:int), var_17_33B:int), xor:int(ldc:int(195), ldc:int(194))))))
                                                inc:int(var_17_33B, ldc:int(1))
                                            }
                                            
                                            var_4_342 = and:int(var_4_342:int, ldc:int(1717296843))
                                            inc:int(var_12_2F3, ldc:int(1))
                                        }
                                        
                                        var_4_28D = and:int(var_4_342:int, ldc:int(1822318347))
                                        storeelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uceb8\u74b1\u6198\uceb8\u9a18\u69d9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), sub:int(var_16_27E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), var_6_78:int, div:float(var_11_2B0:float, var_9_2DC:float))
                                        inc:int(var_16_27E, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_28D:int, ldc:int(134217728)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_4_238 = and:int(var_4_28D:int, ldc:int(1678860189))
                            inc:int(var_13_1FD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_28D:int, ldc:int(262144)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_4_238 = and:int(var_4_28D:int, ldc:int(-1574802809))
                }
                
                var_4_238 = and:int(var_4_28D:int, ldc:int(2139094975))
                inc:int(var_6_78, ldc:int(1))
            }
            
            goto(Label_0164)
        }
        
        var_6_78 = and:int(ldc:int(-26645), ldc:int(26644))
        Label_0138:
        
        while (cmpne:boolean(and:int(var_4_238:int, ldc:int(1024)), ldc:int(0))) {
            var_4_238 = and:int(var_4_238:int, ldc:int(1718441855))
            
            if (cmpge:boolean(var_6_78:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int))) {
                looporswitchbreak()
            }
            
            var_7_C8 = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_6_78:int)
            var_8_DB = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), add:int(var_6_78:int, and:int(ldc:int(5121), ldc:int(18597))))
            var_9_E3 = i2f:float(sub:int(var_8_DB:int, var_7_C8:int))
            
            if (cmpeq:boolean(var_9_E3:float, ldc:float(0.0f))) {
                var_9_E3 = ldc:float(1.0f)
            }
            
            var_4_140 = and:int(var_4_238:int, ldc:int(-323854615))
            var_10_FA = and:int(ldc:int(3850), ldc:int(-3851))
            
            while (cmplt:boolean(var_10_FA:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                var_11_128 = ldc:float(0.0f)
                var_12_131 = add:int(var_7_C8:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_140:int, ldc:int(134217728)), ldc:int(0))) {
                        var_4_140 = and:int(var_4_140:int, ldc:int(-289374311))
                        
                        if (cmplt:boolean(var_12_131:int, add:int(var_8_DB:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))) {
                            var_11_128 = add:float(var_11_128:float, add:float(mul:float(loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_131:int), add:int(var_10_FA:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(28416), ldc:int(-28425))), loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_131:int), add:int(var_10_FA:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(-20554), ldc:int(20553)))), mul:float(loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_131:int), add:int(var_10_FA:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(2241), ldc:int(20743))), loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], var_12_131:int), add:int(var_10_FA:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), xor:int(ldc:int(4241), ldc:int(4240))))))
                            inc:int(var_12_131, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_140:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_4_140 = and:int(var_4_140:int, ldc:int(-891256091))
                }
                
                var_4_140 = and:int(var_4_140:int, ldc:int(-439198083))
                storeelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uceb8\u74b1\u6198\uceb8\u9a18\u69d9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_10_FA:int), var_6_78:int, div:float(var_11_128:float, var_9_E3:float))
                inc:int(var_10_FA, ldc:int(1))
            }
            
            var_4_238 = and:int(var_4_140:int, ldc:int(-298158179))
            inc:int(var_6_78, ldc:int(1))
        }
        
        Label_0164:
        
        if (cmpne:boolean(and:int(var_4_238:int, ldc:int(1024)), ldc:int(0))) {
            return:int(and:int(ldc:int(-26858), ldc:int(10472)))
        }
        
        goto(Label_0138)
    }
    
    private static void \ub18d\u5f50\u3bc9\u16f6\u99f7\u4cd9(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0 p1, float[][][] p2, int p3) {
        var_4_92 : int
        var_6_6A : int
        var_8_7C : int
        var_4_CC : int
        var_7_D4 : int
        var_9_DD : int
        var_4_EC : int
        var_4_230 : int
        stack_222_0 : int [generated]
        var_10_222 : int
        stack_24E_0 : int [generated]
        var_4_2C7 : int
        var_11_24E : int
        stack_287_0 : int [generated]
        var_13_2B7 : int
        var_4_778 : int
        var_12_2A7 : int
        var_14_3D7 : int
        var_15_488 : float[]
        var_16_4E3 : float
        var_17_4F5 : float
        var_18_504 : int
        var_13_50D : int
        var_19_548 : float
        stack_645_0 : float [generated]
        stack_7C4_0 : int [generated]
        var_18_7C4 : int
        expr_7F2 : float[] [generated]
        expr_7F9 : int [generated]
        expr_838 : float[] [generated]
        expr_83F : int [generated]
        expr_427 : int[] [generated]
        
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
        var_4_92 = and:int(ldc:int(-717953367), ldc:int(-104962199))
        var_6_6A = and:int(ldc:int(393), ldc:int(-394))
        var_8_7C = and:int(ldc:int(-30901), ldc:int(22708))
        
        if (getfield:boolean(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6fb0\u8709\u6bb9\uc7fe\u4ab3\ud171, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)) {
            var_8_7C = xor:int(ldc:int(-16288), ldc:int(-16287))
            var_6_6A = and:int(ldc:int(-18728), ldc:int(18723))
            goto(Label_0181)
        }
        
        Label_0133:
        
        if (cmpeq:boolean(and:int(var_4_92:int, ldc:int(2)), ldc:int(0))) {
            var_4_92 = and:int(var_4_92:int, ldc:int(-1833670945))
            var_6_6A = loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubcb0\u873d\u8d90\ud7e8\ub19c\u47c2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_4_92:int, ldc:int(1024)), ldc:int(0))) {
            var_4_92 = and:int(var_4_92:int, ldc:int(-2112957817))
            goto(Label_0133)
        }
        
        var_4_CC = and:int(var_4_92:int, ldc:int(-8427675))
        var_7_D4 = loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u0800\ub83f\u0c95\uf9c5\u960f\ucef1, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)
        var_9_DD = and:int(ldc:int(-21475), ldc:int(21346))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_CC:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_EC = and:int(var_4_CC:int, ldc:int(-656866210))
                goto(Label_0464)
            }
            
            if (cmpne:boolean(and:int(var_4_CC:int, ldc:int(4)), ldc:int(0))) {
                var_4_EC = and:int(var_4_CC:int, ldc:int(-1246418325))
                goto(Label_0388)
            }
            
            if (cmpne:boolean(and:int(var_4_CC:int, ldc:int(2)), ldc:int(0))) {
                var_4_EC = and:int(var_4_CC:int, ldc:int(1353074776))
            }
            else {
                var_4_EC = and:int(var_4_CC:int, ldc:int(-1145606341))
                
                if (cmplt:boolean(var_9_DD:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int))) {
                    if (cmpeq:boolean(var_9_DD:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(var_9_DD:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u760c\u6b5f\uceb8\u836c\u71ae\u4d85, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int))) {
                        goto(Label_0464)
                    }
                    
                    goto(Label_0388)
                }
            }
            
            Label_0295:
            
            if (cmpeq:boolean(and:int(var_4_EC:int, ldc:int(262144)), ldc:int(0))) {
                var_4_EC = and:int(var_4_EC:int, ldc:int(257069828))
                goto(Label_0464)
            }
            
            if (cmpne:boolean(and:int(var_4_EC:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_EC = and:int(var_4_EC:int, ldc:int(1443029050))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_EC:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_CC = and:int(var_4_EC:int, ldc:int(400843911))
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            Label_0388:
            
            if (cmpeq:boolean(and:int(var_4_EC:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_EC = and:int(var_4_EC:int, ldc:int(-1445088182))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_EC:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0295)
                }
                
                if (cmpne:boolean(and:int(var_4_EC:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_CC = and:int(var_4_EC:int, ldc:int(146751231))
                    loopcontinue()
                }
                
                var_4_230 = and:int(var_4_EC:int, ldc:int(-683841633))
                stack_222_0 = and:int(ldc:int(2227), ldc:int(1))
                goto(Label_0546)
            }
            
            Label_0464:
            
            if (cmpne:boolean(and:int(var_4_EC:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_EC = and:int(var_4_EC:int, ldc:int(-2097066142))
                goto(Label_0388)
            }
            
            if (cmpne:boolean(and:int(var_4_EC:int, ldc:int(2)), ldc:int(0))) {
                var_4_EC = and:int(var_4_EC:int, ldc:int(-1120200966))
                goto(Label_0295)
            }
            
            if (cmpeq:boolean(and:int(var_4_EC:int, ldc:int(1)), ldc:int(0))) {
                var_4_CC = and:int(var_4_EC:int, ldc:int(1590718102))
                loopcontinue()
            }
            
            var_4_230 = and:int(var_4_EC:int, ldc:int(-180568195))
            stack_222_0 = and:int(ldc:int(316), ldc:int(-8509))
            Label_0546:
            var_10_222 = stack_222_0:int
            
            if (logicalnot:boolean(getfield:boolean(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ub8be\ucfaf\ub32d\u836c\ud4fe\u120d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                var_4_230 = and:int(var_4_230:int, ldc:int(-1875384733))
                stack_24E_0 = xor:int(ldc:int(2193), ldc:int(2197))
            }
            else {
                stack_24E_0 = and:int(ldc:int(5259), ldc:int(-5260))
            }
            
            var_4_2C7 = and:int(var_4_230:int, ldc:int(-105398423))
            var_11_24E = stack_24E_0:int
            
            if (cmpne:boolean(var_10_222:int, ldc:int(0))) {
                stack_287_0 = and:int(ldc:int(-18305), ldc:int(18304))
                goto(Label_0639)
            }
            
            Label_0597:
            
            if (cmpne:boolean(and:int(var_4_2C7:int, ldc:int(2)), ldc:int(0))) {
                var_4_2C7 = and:int(var_4_2C7:int, ldc:int(1553016638))
                goto(Label_0654)
            }
            
            var_4_2C7 = and:int(var_4_2C7:int, ldc:int(-641465))
            stack_287_0 = var_11_24E:int
            Label_0639:
            var_4_2C7 = and:int(var_4_2C7:int, ldc:int(-193040789))
            var_11_24E = stack_287_0:int
            
            if (cmpne:boolean(var_8_7C:int, ldc:int(0))) {
                var_13_2B7 = and:int(ldc:int(-28847), ldc:int(28840))
                
                loop {
                    if (cmpne:boolean(and:int(var_4_2C7:int, ldc:int(1)), ldc:int(0))) {
                        var_4_2C7 = and:int(var_4_2C7:int, ldc:int(-8405297))
                        
                        if (cmplt:boolean(var_13_2B7:int, and:int(ldc:int(21061), ldc:int(1028)))) {
                            invokestatic:void(System::arraycopy, loadelement:float[][expected:Object](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u92ee\uceb8\u4e72\u5140\u12b2\ub8be, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), and:int(ldc:int(20360), ldc:int(-28553)), loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3e75\uf9c5\u6435\ua562\uc2e8\u5f50, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_13_2B7:int), and:int(ldc:int(-7648), ldc:int(5570)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                            invokestatic:void(System::arraycopy, loadelement:float[][expected:Object](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u6198\u8df4\u72f1\u3d64\u51fa\u4c2b, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), and:int(ldc:int(-10462), ldc:int(10441)), loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6c56\ub171\u760c\uc246\uc4d2\u3e75, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_13_2B7:int), and:int(ldc:int(25176), ldc:int(-25177)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                            inc:int(var_13_2B7, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_2C7:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_4_2C7 = and:int(var_4_2C7:int, ldc:int(-1808341413))
                storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int, xor:int(ldc:int(-32760), ldc:int(-32756)))
                var_8_7C = and:int(ldc:int(18336), ldc:int(-18337))
            }
            
            Label_0654:
            
            if (cmpeq:boolean(and:int(var_4_2C7:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0597)
            }
            
            var_4_778 = and:int(var_4_2C7:int, ldc:int(-25919545))
            var_12_2A7 = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_9_DD:int)
            
            while (cmplt:boolean(var_12_2A7:int, loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), add:int(var_9_DD:int, xor:int(ldc:int(520), ldc:int(521)))))) {
                invokestatic:void(System::arraycopy, loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u92ee\uceb8\u4e72\u5140\u12b2\ub8be, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), and:int(ldc:int(-8471), ldc:int(8470)), loadelement:float[][expected:Object](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3e75\uf9c5\u6435\ua562\uc2e8\u5f50, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)), and:int(ldc:int(-21615), ldc:int(21582)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                invokestatic:void(System::arraycopy, loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u6198\u8df4\u72f1\u3d64\u51fa\u4c2b, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), and:int(ldc:int(16573), ldc:int(-24766)), loadelement:float[][expected:Object](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6c56\ub171\u760c\uc246\uc4d2\u3e75, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)), and:int(ldc:int(-14593), ldc:int(14592)), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
                var_14_3D7 = and:int(ldc:int(-24609), ldc:int(24608))
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_778:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_778 = and:int(var_4_778:int, ldc:int(-247470479))
                        
                        if (cmplt:boolean(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4975\u4bc8\u71ae\ucef1\u4492\u7043, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))) {
                            var_15_488 = newarray:float[](float.class, and:int(ldc:int(24578), ldc:int(666)))
                            var_16_4E3 = ldc:float(0.0f)
                            var_17_4F5 = ldc:float(0.0f)
                            
                            if (cmpne:boolean(var_11_24E:int, ldc:int(0))) {
                                var_18_504 = loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)
                                var_13_50D = and:int(ldc:int(-1369), ldc:int(1368))
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_4_778:int, ldc:int(1)), ldc:int(0))) {
                                        var_4_778 = and:int(var_4_778:int, ldc:int(-767606917))
                                        
                                        if (cmple:boolean(var_13_50D:int, xor:int(ldc:int(-31481), ldc:int(-31485)))) {
                                            var_19_548 = loadelement:float(getstatic:float[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u5f50\u3d4b\ub32d\u624e\uf9c5\u4c04), var_13_50D:int)
                                            
                                            if (cmpge:boolean(preincrement:int(1, var_18_504:int), xor:int(ldc:int(25098), ldc:int(25103)))) {
                                                inc:int(var_18_504, ldc:int(-5))
                                            }
                                            
                                            var_4_778 = and:int(var_4_778:int, ldc:int(-38291579))
                                            var_16_4E3 = add:float(var_16_4E3:float, mul:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3e75\uf9c5\u6435\ua562\uc2e8\u5f50, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_18_504:int), var_14_3D7:int), var_19_548:float))
                                            var_17_4F5 = add:float(var_17_4F5:float, mul:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6c56\ub171\u760c\uc246\uc4d2\u3e75, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), var_18_504:int), var_14_3D7:int), var_19_548:float))
                                            inc:int(var_13_50D, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(4194304)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                var_4_778 = and:int(var_4_778:int, ldc:int(-1854621861))
                                goto(Label_1437)
                            }
                            
                            Label_1173:
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1863)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(463309681))
                                goto(Label_1712)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1048576)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(-903148934))
                                goto(Label_1516)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_1452)
                            }
                            
                            var_4_778 = and:int(var_4_778:int, ldc:int(-1875462163))
                            var_16_4E3 = loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3e75\uf9c5\u6435\ua562\uc2e8\u5f50, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)), var_14_3D7:int)
                            var_17_4F5 = loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6c56\ub171\u760c\uc246\uc4d2\u3e75, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int)), var_14_3D7:int)
                            Label_1437:
                            
                            if (cmpeq:boolean(loadelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), var_14_3D7:int), ldc:float(0.0f))) {
                                if (cmpeq:boolean(var_10_222:int, ldc:int(0))) {
                                    goto(Label_1516)
                                }
                            }
                            
                            Label_1452:
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_1863)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_778:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_1712)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(-363034292))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_778:int, ldc:int(8192)), ldc:int(0))) {
                                    var_4_778 = and:int(var_4_778:int, ldc:int(-738892105))
                                    stack_645_0 = ldc:float(0.0f)
                                    goto(Label_1605)
                                }
                                
                                goto(Label_1173)
                            }
                            
                            Label_1516:
                            
                            if (cmpne:boolean(and:int(var_4_778:int, ldc:int(33554432)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(-1975994879))
                                goto(Label_1863)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1048576)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(-530341689))
                                goto(Label_1712)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1024)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(1442245681))
                                goto(Label_1452)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1173)
                            }
                            
                            var_4_778 = and:int(var_4_778:int, ldc:int(-583008729))
                            stack_645_0 = var_17_4F5:float
                            Label_1605:
                            var_17_4F5 = stack_645_0:float
                            var_6_6A = and:int(add:int(var_6_6A:int, and:int(ldc:int(1033), ldc:int(433))), xor:int(ldc:int(-24146), ldc:int(-24495)))
                            storeelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(-3276), ldc:int(3145)), add:float(mul:float(var_16_4E3:float, loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(-13049), ldc:int(8920)))), mul:float(var_17_4F5:float, loadelement:float(loadelement:float[](getstatic:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u5f50\uc29a\u647c\ub83f\u8bb0\u8640), var_6_6A:int), and:int(ldc:int(-31892), ldc:int(31891))))))
                            
                            if (cmpeq:boolean(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubb2b\u64ab\u3bc9\u0800\u600f\u7873, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(-12158), ldc:int(-12159)))) {
                                if (cmpeq:boolean(getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c2b\u5245\u97e6\u2dcc\u4e72\ud4fe, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), ldc:int(42))) {
                                    storeelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), and:int(ldc:int(-28310), ldc:int(27269)), ldc:float(1.642832E7f))
                                }
                            }
                            
                            Label_1712:
                            
                            if (cmpne:boolean(and:int(var_4_778:int, ldc:int(2)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(461510885))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_1516)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_778:int, ldc:int(2)), ldc:int(0))) {
                                    var_4_778 = and:int(var_4_778:int, ldc:int(-623253945))
                                    goto(Label_1452)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_778:int, ldc:int(4096)), ldc:int(0))) {
                                    goto(Label_1173)
                                }
                                
                                var_4_778 = and:int(var_4_778:int, ldc:int(-1233340439))
                                storeelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), xor:int(ldc:int(15), ldc:int(14)), add:float(mul:float(var_16_4E3:float, loadelement:float(loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), xor:int(ldc:int(4160), ldc:int(4161)))), mul:float(var_17_4F5:float, loadelement:float(loadelement:float[](getstatic:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u5f50\uc29a\u647c\ub83f\u8bb0\u8640), var_6_6A:int), and:int(ldc:int(16385), ldc:int(133))))))
                                
                                if (cmpne:boolean(and:int(add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), xor:int(ldc:int(66), ldc:int(67))), ldc:int(0))) {
                                    stack_7C4_0 = ldc:int(-1)
                                    goto(Label_1980)
                                }
                            }
                            
                            Label_1863:
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1712)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1516)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_1452)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_4_778 = and:int(var_4_778:int, ldc:int(-255392754))
                                goto(Label_1173)
                            }
                            
                            var_4_778 = and:int(var_4_778:int, ldc:int(-243417223))
                            stack_7C4_0 = xor:int(ldc:int(24708), ldc:int(24709))
                            Label_1980:
                            var_4_778 = and:int(var_4_778:int, ldc:int(-696354863))
                            var_18_7C4 = stack_7C4_0:int
                            storeelement:float(var_15_488:float[], and:int(ldc:int(-3535), ldc:int(1358)), mul:float(loadelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), var_14_3D7:int), i2f:float(loadelement:int(getstatic:int[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u4daf\u4d85\u7e3f\u4179\u8753\u5db4), var_7_D4:int))))
                            expr_7F2 = loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                            expr_7F9 = and:int(ldc:int(5804), ldc:int(-13997))
                            storeelement:float(expr_7F2:float[], expr_7F9:int, add:float(loadelement:float(expr_7F2:float[], expr_7F9:int), loadelement:float(var_15_488:float[], and:int(ldc:int(-4792), ldc:int(4279)))))
                            storeelement:float(var_15_488:float[], xor:int(ldc:int(2100), ldc:int(2101)), mul:float(mul:float(i2f:float(var_18_7C4:int), loadelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_DD:int), var_14_3D7:int)), i2f:float(loadelement:int(getstatic:int[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u8c8a\ud217\u93a2\u4d85\u76bc\u1187), var_7_D4:int))))
                            expr_838 = loadelement:float[](loadelement:float[][](p2:float[][][], add:int(var_12_2A7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u8308\u3d4b\u7bad\ufe34\u5d20\u40a9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), add:int(var_14_3D7:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))
                            expr_83F = and:int(ldc:int(649), ldc:int(1045))
                            storeelement:float(expr_838:float[], expr_83F:int, add:float(loadelement:float(expr_838:float[], expr_83F:int), loadelement:float(var_15_488:float[], xor:int(ldc:int(24593), ldc:int(24592)))))
                            inc:int(var_14_3D7, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    Label_1018:
                    
                    if (cmpne:boolean(and:int(var_4_778:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_4_778:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_4_778 = and:int(var_4_778:int, ldc:int(-713578591))
                        var_7_D4 = and:int(add:int(var_7_D4:int, xor:int(ldc:int(1097), ldc:int(1096))), and:int(ldc:int(19715), ldc:int(12959)))
                        expr_427 = getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)
                        storeelement:int(expr_427:int[], p3:int, add:int(loadelement:int(expr_427:int[], p3:int), and:int(ldc:int(581), ldc:int(17569))))
                        
                        if (cmpge:boolean(loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int), xor:int(ldc:int(-24447), ldc:int(-24444)))) {
                            storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4c04\u71f1\u5fe1\ucb79\u3504\ub102, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int, and:int(ldc:int(-27174), ldc:int(10788)))
                        }
                    }
                    
                    Label_1094:
                    
                    if (cmpeq:boolean(and:int(var_4_778:int, ldc:int(512)), ldc:int(0))) {
                        var_4_778 = and:int(var_4_778:int, ldc:int(626123314))
                        goto(Label_1018)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_778:int, ldc:int(1024)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_4_778 = and:int(var_4_778:int, ldc:int(-487037325))
                }
                
                var_4_778 = and:int(var_4_778:int, ldc:int(-1825196173))
                inc:int(var_12_2A7, ldc:int(1))
            }
            
            var_4_CC = and:int(var_4_778:int, ldc:int(-1845545419))
            inc:int(var_9_DD, ldc:int(1))
        }
        
        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubcb0\u873d\u8d90\ud7e8\ub19c\u47c2, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int, var_6_6A:int)
        storeelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u0800\ub83f\u0c95\uf9c5\u960f\ucef1, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p3:int, var_7_D4:int)
    }
    
    private static void \u516c\u7af6\u6fb0\u6435\u4179\ucfaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u156b\u8d90\u718f\uf9c5\ub171 p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0 p1, int p2) {
        var_3_114 : int
        var_5_69 : int
        var_6_6F : float[]
        var_7_75 : float[]
        var_8_7B : float[]
        var_9_84 : int
        var_10_C0 : int
        var_11_C9 : int
        var_12_D2 : int
        var_13_DB : int
        var_3_F4 : int
        stack_12D_0 : float [generated]
        var_14_12D : float
        var_15_138 : int
        var_3_222 : int
        var_16_16C : int
        var_17_19E : float
        var_18_1A1 : float
        var_19_1A4 : float
        var_21_1BB : int
        var_22_1D1 : int
        var_23_1D5 : int
        var_3_1E4 : int
        var_3_22B : int
        var_24_24A : float
        var_23_24E : int
        var_3_3F8 : int
        var_26_400 : int
        var_3_49F : int
        var_27_46D : float
        var_28_47B : float
        var_29_48C : float
        var_3_54E : int
        var_30_56A : float
        var_3_7A3 : int
        var_25_30E : float
        var_23_312 : int
        
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
            var_3_114 = and:int(ldc:int(-1262890544), ldc:int(637005208))
            var_5_69 = and:int(ldc:int(-1954), ldc:int(1952))
            var_6_6F = newarray:float[](float.class, ldc:int(49))
            var_7_75 = newarray:float[](float.class, ldc:int(49))
            var_8_7B = newarray:float[](float.class, ldc:int(49))
            var_9_84 = and:int(ldc:int(7217), ldc:int(-7742))
            
            loop {
                if (cmpne:boolean(and:int(var_3_114:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_114 = and:int(var_3_114:int, ldc:int(692852201))
                }
                else {
                    var_3_114 = and:int(var_3_114:int, ldc:int(1693827473))
                    
                    if (cmplt:boolean(var_9_84:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                        var_10_C0 = and:int(ldc:int(24627), ldc:int(-24820))
                        var_11_C9 = and:int(ldc:int(18757), ldc:int(-18774))
                        var_12_D2 = and:int(ldc:int(-19690), ldc:int(3297))
                        var_13_DB = and:int(ldc:int(-1197), ldc:int(1196))
                        
                        if (cmpne:boolean(var_9_84:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                            if (cmpne:boolean(var_9_84:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u760c\u6b5f\uceb8\u836c\u71ae\u4d85, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                                goto(Label_0264)
                            }
                        }
                        
                        Label_0232:
                        
                        if (cmpne:boolean(and:int(var_3_114:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_F4 = and:int(var_3_114:int, ldc:int(2147212673))
                            stack_12D_0 = ldc:float(0.0f)
                            goto(Label_0301)
                        }
                        
                        Label_0264:
                        
                        if (cmpne:boolean(and:int(var_3_114:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_114 = and:int(var_3_114:int, ldc:int(1570576154))
                            goto(Label_0232)
                        }
                        
                        var_3_F4 = and:int(var_3_114:int, ldc:int(1090514941))
                        stack_12D_0 = ldc:float(1.0f)
                        Label_0301:
                        var_14_12D = stack_12D_0:float
                        var_15_138 = invokestatic:int(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ua562\u93a2\u3d4b\u1187\u8709\u8bb0, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, p2:int, var_9_84:int, var_12_D2:int)
                        
                        if (cmpgt:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u7873\uae87\u4c04\u6fb0\ub6ab\ua068, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), add:int(var_9_84:int, xor:int(ldc:int(6273), ldc:int(6272)))), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ua61f\ubcb0\u3776\u3a62\u6bb9\ua562, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), add:int(var_5_69:int, xor:int(ldc:int(-24559), ldc:int(-24560)))))) {
                            inc:int(var_5_69, ldc:int(1))
                        }
                        
                        var_3_222 = and:int(var_3_F4:int, ldc:int(-873341490))
                        var_16_16C = and:int(ldc:int(-11962), ldc:int(9769))
                        
                        while (cmplt:boolean(var_16_16C:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\ubb2b\u16f6\u9a18\uc229\u7d52\ubded, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u446c\u4bc8\ubcb0\u0800\u3e75\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)))) {
                            var_17_19E = ldc:float(0.0f)
                            var_18_1A1 = ldc:float(0.0f)
                            var_19_1A4 = ldc:float(0.0f)
                            var_21_1BB = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6198\ud7e8\u647c\u836c\u385b\ud7e8, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u446c\u4bc8\ubcb0\u0800\u3e75\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), var_16_16C:int)
                            var_22_1D1 = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u6198\ud7e8\u647c\u836c\u385b\ud7e8, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u446c\u4bc8\ubcb0\u0800\u3e75\u6c52, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), add:int(var_16_16C:int, and:int(ldc:int(18631), ldc:int(4097))))
                            var_23_1D5 = var_21_1BB:int
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_3_222:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_1E4 = and:int(var_3_222:int, ldc:int(1604396287))
                                    goto(Label_0634)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_222:int, ldc:int(2048)), ldc:int(0))) {
                                    var_3_1E4 = and:int(var_3_222:int, ldc:int(-830299112))
                                }
                                else {
                                    var_3_1E4 = and:int(var_3_222:int, ldc:int(1505092569))
                                    
                                    if (cmplt:boolean(var_23_1D5:int, var_22_1D1:int)) {
                                        if (cmpne:boolean(add:int(var_23_1D5:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_9_84:int)), add:int(var_11_C9:int, and:int(ldc:int(8193), ldc:int(17127)))))) {
                                            goto(Label_0634)
                                        }
                                        
                                        inc:int(var_11_C9, ldc:int(1))
                                        goto(Label_0634)
                                    }
                                }
                                
                                Label_0517:
                                
                                if (cmpne:boolean(and:int(var_3_1E4:int, ldc:int(131072)), ldc:int(0))) {
                                    var_3_1E4 = and:int(var_3_1E4:int, ldc:int(784176628))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_3_1E4:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_3_222 = and:int(var_3_1E4:int, ldc:int(81480450))
                                        loopcontinue()
                                    }
                                    
                                    looporswitchbreak()
                                }
                                
                                Label_0634:
                                
                                if (cmpeq:boolean(and:int(var_3_1E4:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0517)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_1E4:int, ldc:int(2048)), ldc:int(0))) {
                                    var_3_222 = and:int(var_3_1E4:int, ldc:int(-260006502))
                                }
                                else {
                                    var_3_222 = and:int(var_3_1E4:int, ldc:int(666493844))
                                    var_18_1A1 = add:float(var_18_1A1:float, loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4d85\ubefe\u7043\u51fa\u5140\u5d20, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_11_C9:int), var_9_84:int))
                                    var_19_1A4 = add:float(var_19_1A4:float, loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uceb8\u74b1\u6198\uceb8\u9a18\u69d9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_23_1D5:int), var_9_84:int))
                                    inc:int(var_23_1D5, ldc:int(1))
                                }
                            }
                            
                            var_3_22B = and:int(var_3_1E4:int, ldc:int(1224079249))
                            var_24_24A = invokestatic:float(Math::min, mul:float(div:float(add:float(ldc:float(1.0E-12f), var_18_1A1:float), add:float(ldc:float(1.0E-12f), var_19_1A4:float)), loadelement:float(getstatic:float[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u8df4\uf995\ua3b4\ud523\u8d90\u6ec6), getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc246\u3711\u9af2\uc246\u6d99\ub171, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171))), ldc:float(1.0E10f))
                            var_23_24E = var_21_1BB:int
                            
                            loop {
                                if (cmplt:boolean(var_23_24E:int, var_22_1D1:int)) {
                                    if (cmpne:boolean(add:int(var_23_24E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\ufcaf\u6fb0\uc238\uc29a\u071d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), add:int(var_10_C0:int, xor:int(ldc:int(-28540), ldc:int(-28539)))))) {
                                        goto(Label_0820)
                                    }
                                    
                                    inc:int(var_10_C0, ldc:int(1))
                                    goto(Label_0820)
                                }
                                
                                Label_0724:
                                
                                if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_0972)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(-235200593))
                                    goto(Label_0903)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(8388608)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                Label_0820:
                                
                                if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(1074585028))
                                    goto(Label_0972)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(2012517007))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_0724)
                                    }
                                    
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(2029386662))
                                    
                                    if (cmpeq:boolean(add:int(var_23_24E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4daf\uafe7\ucb79\ub171\u446c\ubf56, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_9_84:int)), add:int(var_12_D2:int, and:int(ldc:int(8457), ldc:int(20567)))))) {
                                        inc:int(var_12_D2, ldc:int(1))
                                        var_15_138 = invokestatic:int(\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ua562\u93a2\u3d4b\u1187\u8709\u8bb0, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171, p2:int, var_9_84:int, var_12_D2:int)
                                    }
                                }
                                
                                Label_0903:
                                
                                if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(8388608)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0820)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(8192)), ldc:int(0))) {
                                        var_3_22B = and:int(var_3_22B:int, ldc:int(905626674))
                                        goto(Label_0724)
                                    }
                                    
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(649455587))
                                    
                                    if (cmpeq:boolean(add:int(var_23_24E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(16776), ldc:int(16777))), add:int(var_13_DB:int, xor:int(ldc:int(12312), ldc:int(12313)))))) {
                                        inc:int(var_13_DB, ldc:int(1))
                                    }
                                }
                                
                                Label_0972:
                                
                                if (cmpeq:boolean(and:int(var_3_22B:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(1809303927))
                                    goto(Label_0903)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(2048)), ldc:int(0))) {
                                    var_3_22B = and:int(var_3_22B:int, ldc:int(1753360384))
                                    goto(Label_0820)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_22B:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_0724)
                                }
                                
                                var_3_3F8 = and:int(var_3_22B:int, ldc:int(-1862797338))
                                var_26_400 = and:int(ldc:int(12579), ldc:int(-28964))
                                
                                if (cmplt:boolean(var_9_84:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                                    if (cmpeq:boolean(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u51fa\u76bc\u67e9\u983f\u8640\u927d, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_13_DB:int), ldc:int(0))) {
                                        goto(Label_1107)
                                    }
                                    
                                    if (logicalnot:boolean(loadelement:boolean(getfield:boolean[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u98a4\ub70c\ub18d\u7bad\u8258\ud51e, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                                        goto(Label_1107)
                                    }
                                }
                                
                                Label_1037:
                                
                                if (cmpne:boolean(and:int(var_3_3F8:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_3F8 = and:int(var_3_3F8:int, ldc:int(-704920087))
                                    
                                    if (cmpeq:boolean(add:int(var_23_24E:int, getfield:int(\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171)), shr:int(add:int(loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(24848), ldc:int(24849))), add:int(var_13_DB:int, and:int(ldc:int(16391), ldc:int(9585)))), loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u3776\u120d\uc910\u836c\u600f\uae87, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), xor:int(ldc:int(1032), ldc:int(1033))), var_13_DB:int)), xor:int(ldc:int(1061), ldc:int(1060))))) {
                                        var_26_400 = loadelement:int(loadelement:int[](getfield:int[][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u64f2\ud51e\u839e\u88c5\u4c04\u8d90, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_13_DB:int)
                                    }
                                }
                                
                                Label_1107:
                                
                                if (cmpne:boolean(and:int(var_3_3F8:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1037)
                                }
                                
                                var_3_49F = and:int(var_3_3F8:int, ldc:int(-1862795282))
                                var_27_46D = loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u5db4\u7c6b\u1833\uc910\u34df, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_10_C0:int), var_5_69:int)
                                var_28_47B = loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uc246\ud7e8\u34df\ua068\u47c2\u8d98, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_10_C0:int), var_5_69:int)
                                var_29_48C = mul:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4d85\ubefe\u7043\u51fa\u5140\u5d20, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_12_D2:int), var_9_84:int), var_28_47B:float)
                                
                                if (cmpeq:boolean(var_26_400:int, ldc:int(0))) {
                                    storeelement:float(var_8_7B:float[], var_23_24E:int, ldc:float(0.0f))
                                    goto(Label_1337)
                                }
                                
                                Label_1171:
                                
                                if (cmpeq:boolean(and:int(var_3_49F:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_49F = and:int(var_3_49F:int, ldc:int(746038715))
                                }
                                else {
                                    var_3_49F = and:int(var_3_49F:int, ldc:int(263703518))
                                    storeelement:float(var_8_7B:float[], var_23_24E:int, mul:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4d85\ubefe\u7043\u51fa\u5140\u5d20, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_12_D2:int), var_9_84:int), var_27_46D:float))
                                    var_17_19E = add:float(var_17_19E:float, loadelement:float(var_8_7B:float[], var_23_24E:int))
                                }
                                
                                Label_1337:
                                
                                if (cmpeq:boolean(and:int(var_3_49F:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_49F = and:int(var_3_49F:int, ldc:int(-661174798))
                                    goto(Label_1171)
                                }
                                
                                var_3_54E = and:int(var_3_49F:int, ldc:int(-34474555))
                                var_30_56A = div:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u4d85\ubefe\u7043\u51fa\u5140\u5d20, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_12_D2:int), var_9_84:int), add:float(ldc:float(1.0f), loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uceb8\u74b1\u6198\uceb8\u9a18\u69d9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_23_24E:int), var_9_84:int)))
                                
                                if (cmpeq:boolean(var_15_138:int, ldc:int(0))) {
                                    if (cmpeq:boolean(var_14_12D:float, ldc:float(1.0f))) {
                                        var_30_56A = mul:float(var_30_56A:float, var_27_46D:float)
                                        goto(Label_1449)
                                    }
                                }
                                
                                Label_1393:
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_1738)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1647)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_1510)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(8192)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(1723272230))
                                }
                                else {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(1673259972))
                                    
                                    if (cmpeq:boolean(var_15_138:int, and:int(ldc:int(259), ldc:int(61)))) {
                                        var_30_56A = mul:float(var_30_56A:float, var_28_47B:float)
                                    }
                                }
                                
                                Label_1449:
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(536475863))
                                    goto(Label_1738)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1647)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(1048576)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_3_54E = and:int(var_3_54E:int, ldc:int(-2079361746))
                                        goto(Label_1393)
                                    }
                                    
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(-101192219))
                                    
                                    if (cmpgt:boolean(var_24_24A:float, var_30_56A:float)) {
                                        storeelement:float(var_6_6F:float[], var_23_24E:int, var_29_48C:float)
                                        storeelement:float(var_7_75:float[], var_23_24E:int, var_30_56A:float)
                                        goto(Label_1647)
                                    }
                                }
                                
                                Label_1510:
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(-1217204030))
                                    goto(Label_1738)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(256)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(2048)), ldc:int(0))) {
                                        var_3_54E = and:int(var_3_54E:int, ldc:int(-1165001382))
                                        goto(Label_1449)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(1048576)), ldc:int(0))) {
                                        goto(Label_1393)
                                    }
                                    
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(1136656364))
                                    storeelement:float(var_6_6F:float[], var_23_24E:int, div:float(mul:float(var_29_48C:float, var_24_24A:float), var_30_56A:float))
                                    storeelement:float(var_7_75:float[], var_23_24E:int, var_24_24A:float)
                                }
                                
                                Label_1647:
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(128)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(-1977222648))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_3_54E = and:int(var_3_54E:int, ldc:int(-222391058))
                                        goto(Label_1510)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_1449)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(65536)), ldc:int(0))) {
                                        var_3_54E = and:int(var_3_54E:int, ldc:int(323150017))
                                        goto(Label_1393)
                                    }
                                    
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(570410995))
                                    var_17_19E = add:float(var_17_19E:float, mul:float(loadelement:float(loadelement:float[](loadelement:float[][](getfield:float[][][](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\uceb8\u74b1\u6198\uceb8\u9a18\u69d9, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int), var_23_24E:int), var_9_84:int), loadelement:float(var_7_75:float[], var_23_24E:int)))
                                    
                                    if (cmpeq:boolean(var_26_400:int, ldc:int(0))) {
                                        if (cmpne:boolean(var_9_84:int, loadelement:int(getfield:int[](\u8d90\u156b\u8d90\u718f\uf9c5\ub171::\u76bc\u516c\u0c95\u960f\u4492\u760c, p0:\u8d90\u156b\u8d90\u718f\uf9c5\ub171), p2:int))) {
                                            var_17_19E = add:float(var_17_19E:float, loadelement:float(var_6_6F:float[], var_23_24E:int))
                                        }
                                    }
                                }
                                
                                Label_1738:
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(128)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(438421258))
                                    goto(Label_1647)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(1109438259))
                                    goto(Label_1510)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_54E:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_54E = and:int(var_3_54E:int, ldc:int(-409531013))
                                    goto(Label_1449)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_54E:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1393)
                                }
                                
                                var_3_22B = and:int(var_3_54E:int, ldc:int(2125972979))
                                inc:int(var_23_24E, ldc:int(1))
                            }
                            
                            var_3_7A3 = and:int(var_3_22B:int, ldc:int(1102307729))
                            var_25_30E = invokestatic:float(Math::min, div:float(add:float(var_18_1A1:float, ldc:float(1.0E-12f)), add:float(var_17_19E:float, ldc:float(1.0E-12f))), ldc:float(2.5118864f))
                            var_23_312 = var_21_1BB:int
                            
                            loop {
                                if (cmplt:boolean(var_23_312:int, var_22_1D1:int)) {
                                    storeelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u92ee\uceb8\u4e72\u5140\u12b2\ub8be, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_84:int), var_23_312:int, d2f:float(invokestatic:double(Math::sqrt, f2d:double(mul:float(loadelement:float(var_7_75:float[], var_23_312:int), var_25_30E:float)))))
                                    storeelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u6198\u8df4\u72f1\u3d64\u51fa\u4c2b, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_84:int), var_23_312:int, d2f:float(invokestatic:double(Math::sqrt, f2d:double(mul:float(loadelement:float(var_6_6F:float[], var_23_312:int), var_25_30E:float)))))
                                    
                                    if (cmpeq:boolean(loadelement:float(var_8_7B:float[], var_23_312:int), ldc:float(0.0f))) {
                                        goto(Label_1933)
                                    }
                                    
                                    storeelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_84:int), var_23_312:int, d2f:float(invokestatic:double(Math::sqrt, f2d:double(mul:float(loadelement:float(var_8_7B:float[], var_23_312:int), var_25_30E:float)))))
                                    goto(Label_1997)
                                }
                                
                                Label_1854:
                                
                                if (cmpne:boolean(and:int(var_3_7A3:int, ldc:int(1048576)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                Label_1933:
                                
                                if (cmpeq:boolean(and:int(var_3_7A3:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_7A3 = and:int(var_3_7A3:int, ldc:int(1017816562))
                                    goto(Label_1854)
                                }
                                
                                var_3_7A3 = and:int(var_3_7A3:int, ldc:int(503046064))
                                storeelement:float(loadelement:float[](getfield:float[][](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\ucfaf\ucfaf\uc84e\u7d52\ufe34\u5db4, p1:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0), var_9_84:int), var_23_312:int, ldc:float(0.0f))
                                Label_1997:
                                var_3_7A3 = and:int(var_3_7A3:int, ldc:int(-1509954571))
                                inc:int(var_23_312, ldc:int(1))
                            }
                            
                            var_3_222 = and:int(var_3_7A3:int, ldc:int(-893529106))
                            inc:int(var_16_16C, ldc:int(1))
                        }
                        
                        var_3_114 = and:int(var_3_222:int, ldc:int(2113657819))
                        inc:int(var_9_84, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_114:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_69 : float[] [generated]
        expr_B1 : int[] [generated]
        expr_F7 : int[] [generated]
        expr_13D : float[] [generated]
        
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
            expr_69 = newarray:float[](float.class, xor:int(ldc:int(9748), ldc:int(9745)))
            storeelement:float(expr_69:float[], and:int(ldc:int(-5150), ldc:int(1053)), ldc:float(0.0318305f))
            storeelement:float(expr_69:float[], and:int(ldc:int(311), ldc:int(8193)), ldc:float(0.11516383f))
            storeelement:float(expr_69:float[], xor:int(ldc:int(1220), ldc:int(1222)), ldc:float(0.2181695f))
            storeelement:float(expr_69:float[], and:int(ldc:int(16675), ldc:int(1539)), ldc:float(0.30150282f))
            storeelement:float(expr_69:float[], and:int(ldc:int(16452), ldc:int(7460)), ldc:float(0.33333334f))
            putstatic:float[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u5f50\u3d4b\ub32d\u624e\uf9c5\u4c04, expr_69:float[])
            expr_B1 = newarray:int[](int.class, xor:int(ldc:int(278), ldc:int(274)))
            storeelement:int(expr_B1:int[], and:int(ldc:int(-11662), ldc:int(2445)), and:int(ldc:int(5665), ldc:int(201)))
            storeelement:int(expr_B1:int[], xor:int(ldc:int(5153), ldc:int(5152)), and:int(ldc:int(17525), ldc:int(-19574)))
            storeelement:int(expr_B1:int[], xor:int(ldc:int(8704), ldc:int(8706)), ldc:int(-1))
            storeelement:int(expr_B1:int[], xor:int(ldc:int(772), ldc:int(775)), and:int(ldc:int(-2981), ldc:int(932)))
            putstatic:int[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u4daf\u4d85\u7e3f\u4179\u8753\u5db4, expr_B1:int[])
            expr_F7 = newarray:int[](int.class, xor:int(ldc:int(-24057), ldc:int(-24061)))
            storeelement:int(expr_F7:int[], and:int(ldc:int(-30664), ldc:int(30403)), and:int(ldc:int(-20153), ldc:int(19128)))
            storeelement:int(expr_F7:int[], and:int(ldc:int(26627), ldc:int(1)), and:int(ldc:int(27793), ldc:int(333)))
            storeelement:int(expr_F7:int[], and:int(ldc:int(9346), ldc:int(274)), and:int(ldc:int(20929), ldc:int(-32220)))
            storeelement:int(expr_F7:int[], xor:int(ldc:int(3328), ldc:int(3331)), ldc:int(-1))
            putstatic:int[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u8c8a\ud217\u93a2\u4d85\u76bc\u1187, expr_F7:int[])
            expr_13D = newarray:float[](float.class, and:int(ldc:int(2636), ldc:int(4245)))
            storeelement:float(expr_13D:float[], and:int(ldc:int(-30075), ldc:int(13370)), ldc:float(0.5f))
            storeelement:float(expr_13D:float[], xor:int(ldc:int(5120), ldc:int(5121)), ldc:float(1.0f))
            storeelement:float(expr_13D:float[], and:int(ldc:int(1219), ldc:int(21022)), ldc:float(2.0f))
            storeelement:float(expr_13D:float[], xor:int(ldc:int(24712), ldc:int(24715)), ldc:float(1.0E10f))
            putstatic:float[](\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0::\u8df4\uf995\ua3b4\ud523\u8d90\u6ec6, expr_13D:float[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97b7\u156b\u4f52\u416d\u92ee\u59ec(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(-19611249), ldc:int(-34219009))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-587793441))
            var_5_80 = and:int(ldc:int(-235), ldc:int(234))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4546), ldc:int(4545)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_64B:int, ldc:int(-69861522))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(8194), ldc:int(8195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(1), ldc:int(21)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_D8:int, ldc:int(-50534961))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(9345), ldc:int(4099)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1437605418))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(723239980))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-278561665))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(157811673))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-789125306))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2001154258))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1511457714))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-956702024))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-238907554))
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1424660483))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-741026841))
                            var_11_E9 = and:int(ldc:int(-9557), ldc:int(9556))
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1842734397))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-986512912))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2056260117))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-36379194))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0682:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(507892937))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(376990357))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1867623359))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-96562220))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1733411875))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1417557116))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-3315227))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-151595113))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-701161876))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(835246080))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-204675802))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-2045814020))
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1774874193))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(197226918))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-771891442))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(2053), ldc:int(67))
                                goto(Label_1122)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2075844314))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1239110948))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2104292875))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1588089197))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-52633297))
                        var_11_E9 = and:int(ldc:int(-5731), ldc:int(5730))
                    }
                    
                    Label_1122:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1645561837))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-323495130))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1397745598))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-723658465))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1801669170))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1069176454))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(409615328))
                            goto(Label_1122)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1104855900))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-611932762))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-252320913))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1494)
                    }
                    
                    Label_1371:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2856292))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1749263004))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-801807144))
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-723657306))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-802722670))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1162716819))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1387963396))
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1542142492))
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-555882089))
                        var_17_656 = add:int(var_16_117:int, and:int(ldc:int(5553), ldc:int(16387)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(-790629593))
                
                if (cmple:boolean(var_5_80 = var_17_656:int, sub:int(var_6_87:int, and:int(ldc:int(18471), ldc:int(833))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(508750648))
            goto(Label_0108)
        }
    }
}
