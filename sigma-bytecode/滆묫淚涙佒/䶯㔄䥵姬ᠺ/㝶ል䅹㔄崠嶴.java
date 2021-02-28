public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u3776\u120d\u4179\u3504\u5d20\u5db4<E> {
    public void \u3776\u120d\u4179\u3504\u5d20\u5db4(E[] p0, E[] p1) {
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
            invokespecial:AbstractList(AbstractList::<init>, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>)
            putfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>, p0:E[][expected:Object[]])
            putfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\uc3e3\u3c25\u7ce1\ub19c\ub171\u9033, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>, p1:E[][expected:Object[]])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public E get(int p0) {
        var_4_C8 : Object
        
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
            
            if (cmpge:boolean(p0:int, arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>)))) {
                if (cmpge:boolean(sub:int(p0:int, arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>))), arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\uc3e3\u3c25\u7ce1\ub19c\ub171\u9033, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>)))) {
                    athrow(initobject:IndexOutOfBoundsException(IndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\u6fb0\uc2bd\u62da\u6fb0\ud523\u40a9), and:int(ldc:int(6185), ldc:int(-6314)))), p0:int), loadelement:String(getstatic:String[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\u6fb0\uc2bd\u62da\u6fb0\ud523\u40a9), and:int(ldc:int(8649), ldc:int(2069)))), invokevirtual:int(\u3776\u120d\u4179\u3504\u5d20\u5db4<E>::size, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>)))))
                }
                
                var_4_C8 = loadelement:Object(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\uc3e3\u3c25\u7ce1\ub19c\ub171\u9033, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>), sub:int(p0:int, arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>))))
            }
            else {
                var_4_C8 = loadelement:Object(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>), p0:int)
            }
            
            return:E(var_4_C8:Object)
        }
        
        goto(Label_0006)
    }
    
    public int size() {
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
            return:int(add:int(arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\ua3b4\u67d0\u3e2a\u76bc\u839e\u7330, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>)), arraylength:int(getfield:Object[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\uc3e3\u3c25\u7ce1\ub19c\ub171\u9033, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18A : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F2_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1AB_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_28C_0 : byte[] [generated]
        stack_2DF_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_20E : int
        expr_1F6 : byte [generated]
        stack_242_2 : byte [generated]
        stack_219_0 : byte [generated]
        expr_28C : byte [generated]
        expr_9E : int [generated]
        expr_C1 : int [generated]
        var_2_F2 : byte[]
        expr_F6 : int [generated]
        var_3_2CE : byte[]
        var_5_2CF : int
        var_3_122 : String
        stack_170_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_18A = and:int(ldc:int(330889971), ldc:int(-1080481794))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1AB_0 = stack_1F6_0 = stack_28C_0 = stack_2DF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Tcbj1mpaCfkbd9AmipEpoA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-1400278286))
                goto(Label_0474)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-283383822))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, xor:byte(loadelement:byte(stack_1AB_0:byte[], var_5_17D:int), ldc:byte(90)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1AB_0 = stack_1F6_0 = stack_28C_0 = stack_2DF_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(686845063))
        goto(Label_0616)
        Label_0474:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            var_0_20E = and:int(var_0_18A:int, ldc:int(1799270879))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_1F6 = stack_242_2 = loadelement(stack_1F6_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(5)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_242_2 = stack_219_0 = add:byte(expr_1F6:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(5))))
                goto(Label_0553)
            }
            
            Label_0515:
            
            if (cmpeq:boolean(and:int(var_0_20E:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_20E = and:int(var_0_20E:int, ldc:int(377148247))
            }
            else {
                var_0_20E = and:int(var_0_20E:int, ldc:int(-1688308778))
                stack_242_2 = stack_219_0 = add:byte(expr_1F6:byte, ldc:byte(5))
            }
            
            Label_0553:
            
            if (cmpeq:boolean(and:int(var_0_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_20E = and:int(var_0_20E:int, ldc:int(-2084276933))
                goto(Label_0515)
            }
            
            var_0_18A = and:int(var_0_20E:int, ldc:int(-67505161))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_242_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1AB_0 = stack_1F6_0 = stack_28C_0 = stack_2DF_0 = var_3_17C:byte[]
            goto(Label_0163)
        }
        
        Label_0616:
        
        while (cmpne:boolean(and:int(var_0_18A:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(64)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-861726475))
                goto(Label_0383)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(863973339))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_28C = loadelement:byte(stack_28C_0:byte[], var_5_17D:int)
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:int(or:int(and:int(shl:int(expr_28C:byte, xor:int(ldc:int(6467), ldc:int(6471))), ldc:int(-16)), and:int(shr:int(expr_28C:byte[expected:int], xor:int(ldc:int(20994), ldc:int(20998))), ldc:int(15))), ldc:int(1)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1AB_0 = stack_1F6_0 = stack_28C_0 = stack_2DF_0 = var_3_17C:byte[]
            goto(Label_0198)
        }
        
        goto(Label_0474)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(1399535843))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-1144031032))
        }
        else {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-1552354830))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_177 = expr_9E:int
                var_3_17C = newarray:byte[](byte.class, expr_9E:int)
                var_5_17D = expr_9E:int
                goto(Label_0474)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-144772898))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_177 = expr_C1:int
                var_3_17C = newarray:byte[](byte.class, expr_C1:int)
                var_5_17D = expr_C1:int
                goto(Label_0616)
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-1995049943))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_18A = and:int(var_0_18A:int, ldc:int(-1206204887))
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(1805185746))
            var_2_F2 = stack_F2_0:byte[]
            expr_F6 = add:int(arraylength:int(stack_F4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2CE = newarray:byte[](byte.class, expr_F6:int)
                var_5_2CF = expr_F6:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(-1814138117))
                    var_5_2CF = add:int(var_5_2CF:int, ldc:int(-1))
                    storeelement:byte(var_3_2CE:byte[], var_5_2CF:int, add:int(shl:int(loadelement:byte(stack_2DF_0:byte[], var_5_2CF:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_F2:byte[], add:int(var_5_2CF:int, and:int(ldc:int(4361), ldc:int(25329)))), ldc:int(6)), xor:int(ldc:int(1606), ldc:int(1605)))))
                    
                    if (cmpne:boolean(var_5_2CF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1AB_0 = stack_1F6_0 = stack_28C_0 = stack_2DF_0 = var_3_2CE:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(524288)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_170_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(134), ldc:int(258)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8679), ldc:int(4106)))
            storeelement:String(expr_134:String[], and:int(ldc:int(6339), ldc:int(1281)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(8593), ldc:int(-8594)), and:int(ldc:int(17628), ldc:int(4648))))
            storeelement:String(expr_134:String[], and:int(ldc:int(748), ldc:int(-766)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(26712), ldc:int(5000)), xor:int(ldc:int(8351), ldc:int(8336))))
            putstatic:String[](\u3776\u120d\u4179\u3504\u5d20\u5db4::\u6fb0\uc2bd\u62da\u6fb0\ud523\u40a9, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u3a62\u759a\u3e75\u624e\u6b5f\uf995(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F4 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FF : int
        
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
        var_3_5F4 = and:int(ldc:int(1518033889), ldc:int(1497259939))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3776\u120d\u4179\u3504\u5d20\u5db4<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-483325984))
        }
        else {
            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-880869383))
            var_5_85 = and:int(ldc:int(1821), ldc:int(-1824))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10184), ldc:int(-10185)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F4:int, ldc:int(1086045965))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(160), ldc:int(161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(3473), ldc:int(8265)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F4 = and:int(var_3_D2:int, ldc:int(1532673989))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16413), ldc:int(7459)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(2063494094))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1220021102))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(507645603))
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1276155403))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-585483371))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1028271250))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-426847999))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1041870234))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1974855649))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1321114403))
                            var_11_E3 = and:int(ldc:int(-12572), ldc:int(12569))
                            goto(Label_1427)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(991015485))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-950562080))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(58664965))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(353475849))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1665988083))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(10578509))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1111473111))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1108449554))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1702305349))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-2070758508))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(885918416))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1184178943))
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-299779759))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(15396082))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(443987260))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1310358453))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1672567972))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-331740615))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-467993259))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1832860577))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2052), ldc:int(2053))
                                goto(Label_1074)
                            }
                        }
                    }
                    
                    Label_0923:
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(464561224))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1188223367))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1235313899))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1875846895))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1595572067))
                        var_11_E3 = and:int(ldc:int(-4610), ldc:int(4609))
                    }
                    
                    Label_1074:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1404393700))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0923)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(165737448))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1820558723))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1677598705))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1181:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-1670811618))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1074)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0923)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1819719334))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-615382824))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F4 = and:int(var_3_5F4:int, ldc:int(856165538))
                            loopcontinue()
                        }
                        
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1503558531))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1427)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(632090257))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-482900742))
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-252932442))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-547423391))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FF = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-602326359))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-993321461))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F4 = and:int(var_3_5F4:int, ldc:int(1383750577))
                        var_17_5FF = add:int(var_16_111:int, and:int(ldc:int(7175), ldc:int(25425)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F4 = and:int(var_3_5F4:int, ldc:int(-597763123))
                
                if (cmple:boolean(var_5_85 = var_17_5FF:int, sub:int(var_6_8C:int, xor:int(ldc:int(20545), ldc:int(20544))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F4:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
