public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u0c95\ub83f\u6cfe\u5140\u9a18 {
    public void \u0c95\ub83f\u6cfe\u5140\u9a18() {
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
            invokespecial:\ua068\u5d20\u7d52\uf9c5\uc229(\ua068\u5d20\u7d52\uf9c5\uc229::<init>, this:\u0c95\ub83f\u6cfe\u5140\u9a18)
            putfield:boolean(\u0c95\ub83f\u6cfe\u5140\u9a18::\u927d\ud217\u2dcc\ud171\ua6bd\ud36e, this:\u0c95\ub83f\u6cfe\u5140\u9a18, and:int[expected:boolean](ldc:int(33), ldc:int(1281)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\u0c95\ub83f\u6cfe\u5140\u9a18 \uff55\u965f\u873d\u6ec6\uafe7\u7043(java.net.URI p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u0c95\ub83f\u6cfe\u5140\u9a18 p1) {
        var_2_5F : int
        var_2_92 : int
        stack_F6_0 : \u0c95\ub83f\u6cfe\u5140\u9a18 [generated]
        stack_F6_1 : int [generated]
        var_4_105 : String
        
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
            var_2_5F = and:int(ldc:int(905880401), ldc:int(1266614133))
            
            if (cmpeq:boolean(p1:\u0c95\ub83f\u6cfe\u5140\u9a18, aconstnull:\u0c95\ub83f\u6cfe\u5140\u9a18())) {
                p1 = initobject:\u0c95\ub83f\u6cfe\u5140\u9a18(\u0c95\ub83f\u6cfe\u5140\u9a18::<init>)
            }
            
            var_2_92 = and:int(var_2_5F:int, ldc:int(-539093131))
            putfield:String(\u0c95\ub83f\u6cfe\u5140\u9a18::\u1187\u760c\ua562\u7006\ud158\ub6ab, p1:\u0c95\ub83f\u6cfe\u5140\u9a18, invokevirtual:String(URI::getHost, p0:URI))
            stack_F6_0 = p1:\u0c95\ub83f\u6cfe\u5140\u9a18
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u0c95\ub83f\u6cfe\u5140\u9a18::\u5140\u392e\ubcb0\u4ab3\u9255\ud217), and:int(ldc:int(-29511), ldc:int(29506))), invokevirtual:String[expected:Object](URI::getScheme, p0:URI)))) {
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u0c95\ub83f\u6cfe\u5140\u9a18::\u5140\u392e\ubcb0\u4ab3\u9255\ud217), xor:int(ldc:int(12356), ldc:int(12357))), invokevirtual:String[expected:Object](URI::getScheme, p0:URI)))) {
                    goto(Label_0205)
                }
            }
            
            Label_0135:
            
            if (cmpeq:boolean(and:int(var_2_92:int, ldc:int(16384)), ldc:int(0))) {
                stack_F6_1 = and:int[expected:boolean](ldc:int(771), ldc:int(1049))
                goto(Label_0246)
            }
            
            var_2_92 = and:int(var_2_92:int, ldc:int(1163686881))
            Label_0205:
            
            if (cmpne:boolean(and:int(var_2_92:int, ldc:int(2)), ldc:int(0))) {
                var_2_92 = and:int(var_2_92:int, ldc:int(-1286617017))
                goto(Label_0135)
            }
            
            stack_F6_1 = and:int[expected:boolean](ldc:int(488), ldc:int(-11261))
            Label_0246:
            putfield:boolean(\u0c95\ub83f\u6cfe\u5140\u9a18::\u12b2\u56bd\u52d3\ubf56\u983f\u600f, stack_F6_0:\u0c95\ub83f\u6cfe\u5140\u9a18, stack_F6_1:boolean)
            putfield:int(\u0c95\ub83f\u6cfe\u5140\u9a18::\u760c\u7330\u71f1\u4bc8\u392e\u4d85, p1:\u0c95\ub83f\u6cfe\u5140\u9a18, invokevirtual:int(URI::getPort, p0:URI))
            var_4_105 = invokevirtual:String(URI::getRawQuery, p0:URI)
            
            if (cmpne:boolean(var_4_105:String, aconstnull:String())) {
                putfield:String(\u0c95\ub83f\u6cfe\u5140\u9a18::\ua3b4\ubcb0\ub83f\u62da\ube23\u40a9, p1:\u0c95\ub83f\u6cfe\u5140\u9a18, var_4_105:String)
            }
            
            return:\u0c95\ub83f\u6cfe\u5140\u9a18(p1:\u0c95\ub83f\u6cfe\u5140\u9a18)
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\u0c95\ub83f\u6cfe\u5140\u9a18 \ucef1\u6d99\u67d0\ub70c\ucb79\u3bd6(java.net.URI p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u0c95\ub83f\u6cfe\u5140\u9a18 p1) {
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
            return:\u0c95\ub83f\u6cfe\u5140\u9a18(invokestatic:\u0c95\ub83f\u6cfe\u5140\u9a18(\u0c95\ub83f\u6cfe\u5140\u9a18::\uff55\u965f\u873d\u6ec6\uafe7\u7043, p0:URI, p1:\u0c95\ub83f\u6cfe\u5140\u9a18))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18A : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_19C_0 : byte[] [generated]
        stack_1E0_0 : byte[] [generated]
        stack_24D_0 : byte[] [generated]
        stack_2A2_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_1D6 : int
        expr_1E0 : byte [generated]
        stack_21C_2 : byte [generated]
        stack_1FB_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_23C : byte[]
        var_5_23D : int
        expr_EE : int [generated]
        var_3_291 : byte[]
        var_5_292 : int
        expr_2A2 : byte [generated]
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
        var_0_18A = and:int(ldc:int(767016040), ldc:int(-533751815))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1E0_0 = stack_24D_0 = stack_2A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("iooi4uoK6mho")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(1)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-968900999))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:byte(loadelement:byte(stack_19C_0:byte[], var_5_17D:int), ldc:byte(22)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1E0_0 = stack_24D_0 = stack_2A2_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        var_0_18A = and:int(var_0_18A:int, ldc:int(1276528994))
        Label_0459:
        
        while (cmpne:boolean(and:int(var_0_18A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1D6 = and:int(var_0_18A:int, ldc:int(-260661686))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_1E0 = stack_21C_2 = loadelement(stack_1E0_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(2)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_21C_2 = stack_1FB_0 = add:byte(expr_1E0:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(2))))
                goto(Label_0523)
            }
            
            Label_0493:
            
            if (cmpne:boolean(and:int(var_0_1D6:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1D6 = and:int(var_0_1D6:int, ldc:int(-295189286))
                stack_21C_2 = stack_1FB_0 = add:byte(expr_1E0:byte, ldc:byte(2))
            }
            
            Label_0523:
            
            if (cmpne:boolean(and:int(var_0_1D6:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0493)
            }
            
            var_0_18A = and:int(var_0_1D6:int, ldc:int(1421253854))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_21C_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1E0_0 = stack_24D_0 = stack_2A2_0 = var_3_17C:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0383)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-1605122462))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(1902553068))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_177 = expr_96:int
                var_3_17C = newarray:byte[](byte.class, expr_96:int)
                var_5_17D = expr_96:int
                goto(Label_0459)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(128)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(625232623))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(262144)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-127954926))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-500376323))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_23C = newarray:byte[](byte.class, expr_CB:int)
                var_5_23D = expr_CB:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(1453690075))
                    var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
                    storeelement:byte(var_3_23C:byte[], var_5_23D:int, add:int(shl:int(loadelement:byte(stack_24D_0:byte[], var_5_23D:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_23D:int, xor:int(ldc:int(136), ldc:int(137)))), ldc:int(7)), and:int(ldc:int(8227), ldc:int(23305)))))
                    
                    if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1E0_0 = stack_24D_0 = stack_2A2_0 = var_3_23C:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_18A:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18A = and:int(var_0_18A:int, ldc:int(-1904432039))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_291 = newarray:byte[](byte.class, expr_EE:int)
                var_5_292 = expr_EE:int
                
                loop {
                    var_0_18A = and:int(var_0_18A:int, ldc:int(-747719329))
                    var_5_292 = add:int(var_5_292:int, ldc:int(-1))
                    expr_2A2 = loadelement:byte(stack_2A2_0:byte[], var_5_292:int)
                    storeelement:byte(var_3_291:byte[], var_5_292:int, xor:int(or:int(and:int(shl:int(expr_2A2:byte, xor:int(ldc:int(-28670), ldc:int(-28666))), ldc:int(-16)), and:int(shr:int(expr_2A2:byte[expected:int], and:int(ldc:int(4101), ldc:int(8500))), ldc:int(15))), ldc:int(99)))
                    
                    if (cmpne:boolean(var_5_292:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_19C_0 = stack_1E0_0 = stack_24D_0 = stack_2A2_0 = var_3_291:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(256)), ldc:int(0))) {
            var_0_18A = and:int(var_0_18A:int, ldc:int(-456431440))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_18A:int, ldc:int(32768)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_170_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(194), ldc:int(10242)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1155), ldc:int(4106)))
            storeelement:String(expr_134:String[], and:int(ldc:int(24668), ldc:int(-24669)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(19496), ldc:int(-19497)), and:int(ldc:int(16519), ldc:int(637))))
            storeelement:String(expr_134:String[], and:int(ldc:int(20629), ldc:int(10273)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(517), ldc:int(512)), xor:int(ldc:int(-27903), ldc:int(-27895))))
            putstatic:String[](\u0c95\ub83f\u6cfe\u5140\u9a18::\u5140\u392e\ubcb0\u4ab3\u9255\ud217, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u446c\u51fa\u0c95\ud36e\uc87f\u3711(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(-37240890), ldc:int(-577802392))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\ub83f\u6cfe\u5140\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(-577278087))
            var_5_7D = and:int(ldc:int(-29501), ldc:int(21296))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15234), ldc:int(-16263)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_633:int, ldc:int(-571478160))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(12361), ldc:int(3335)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4109), ldc:int(24611)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_D2:int, ldc:int(-573079718))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(6336), ldc:int(6337)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2020885853))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-237277981))
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(517717577))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-710805059))
                    }
                    else {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-6340667))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1762323183))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1015551912))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(768425857))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(833507419))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1745524669))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-173599924))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-3723298))
                        var_11_E3 = and:int(ldc:int(3618), ldc:int(-24107))
                        goto(Label_1460)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-901908451))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-981795040))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1973888013))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2035479402))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-537432088))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-934857491))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-962103573))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1957385262))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1264853389))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1782546745))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1689080860))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-573067291))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-54410481))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1941347459))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-878836983))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-537952441))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(24648), ldc:int(24649))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0916:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1430598525))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1010740839))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-909014445))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1637055350))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-543166475))
                        var_11_E3 = and:int(ldc:int(-5146), ldc:int(5145))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2079070823))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1096485063))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(351904804))
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-382274503))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-38277129))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1313)
                            }
                        }
                    }
                    
                    Label_1185:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1204199324))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1767430771))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1534621354))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-856584372))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-574115998))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1460)
                    }
                    
                    Label_1313:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1890017270))
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-143684840))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(437571928))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-491171155))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1524914665))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1929773701))
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-574656517))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1460:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1471:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1900899556))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1841378659))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2128822136))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(475188003))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-574116002))
                        var_17_63E = add:int(var_16_111:int, and:int(ldc:int(4809), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(1450722535))
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(-5804185))
                
                if (cmple:boolean(var_5_7D = var_17_63E:int, sub:int(var_6_84:int, and:int(ldc:int(69), ldc:int(3643))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(544521524))
            goto(Label_0106)
        }
    }
}
