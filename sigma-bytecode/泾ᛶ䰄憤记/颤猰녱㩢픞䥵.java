public final class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u98a4\u7330\ub171\u3a62\ud51e\u4975 {
    public void \u98a4\u7330\ub171\u3a62\ud51e\u4975(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52 p0, java.nio.charset.Charset p1) {
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
            invokespecial:Reader(Reader::<init>, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975)
            putfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ufe34\u5d20\ua068\u7e3f\u76bc\ua068, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975, p0:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52)
            putfield:Charset(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\u7d52\u56bd\uae87\u3e2a\u5d20\u7ce1, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975, p1:Charset)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int read(char[] p0, int p1, int p2) {
        var_6_75 : Reader
        expr_B1 : InputStreamReader [generated]
        
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
        
        if (logicalnot:boolean(getfield:boolean(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubefe\u3776\u99f7\u8308\ubff1\u7043, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975))) {
            var_6_75 = getfield:Reader(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubf56\u6bb9\ubb2b\u3c25\u7c6b\ud12e, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975)
            
            if (cmpeq:boolean(var_6_75:Reader, aconstnull:Reader())) {
                expr_B1 = initobject:InputStreamReader(InputStreamReader::<init>, invokeinterface:InputStream(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u9255\u7af6\u3d64\u6435\u8258\ua6bd, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ufe34\u5d20\ua068\u7e3f\u76bc\ua068, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975)), invokestatic:Charset(\ubcb0\u4c04\u4ab3\ub1b9\u8cae\u8389::\ud36e\u5654\u527a\u873d\ubf56\ubb2b, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ufe34\u5d20\ua068\u7e3f\u76bc\ua068, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975), getfield:Charset(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\u7d52\u56bd\uae87\u3e2a\u5d20\u7ce1, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975)))
                putfield:Reader(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubf56\u6bb9\ubb2b\u3c25\u7c6b\ud12e, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975, expr_B1:InputStreamReader[expected:Reader])
                var_6_75 = expr_B1:InputStreamReader[expected:Reader]
            }
            
            return:int(invokevirtual:int(Reader::read, var_6_75:Reader, p0:char[], p1:int, p2:int))
        }
        
        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u98a4\u7330\ub171\u3a62\ud51e\u4975::\u3dd3\u98a4\u7873\u7e3f\ubb2b\u3bd6), and:int(ldc:int(29201), ldc:int(-29244)))))
    }
    
    public void close() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-142173876), ldc:int(-550200500))
            putfield:boolean(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubefe\u3776\u99f7\u8308\ubff1\u7043, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975, xor:int[expected:boolean](ldc:int(-32176), ldc:int(-32175)))
            
            if (cmpeq:boolean(getfield:Reader(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubf56\u6bb9\ubb2b\u3c25\u7c6b\ud12e, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975), aconstnull:Reader())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-139468995))
                invokeinterface:void(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::close, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52[expected:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1](\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ufe34\u5d20\ua068\u7e3f\u76bc\ua068, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975))
            }
            else {
                invokevirtual:void(Reader::close, getfield:Reader(\u98a4\u7330\ub171\u3a62\ud51e\u4975::\ubf56\u6bb9\ubb2b\u3c25\u7c6b\ud12e, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_167 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_179_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_242_0 : byte[] [generated]
        stack_297_0 : byte[] [generated]
        var_4_154 : int
        var_3_159 : byte[]
        var_5_15A : int
        var_0_191 : int
        expr_179 : byte [generated]
        stack_1C5_2 : byte [generated]
        stack_19C_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_231 : byte[]
        var_5_232 : int
        expr_E6 : int [generated]
        var_3_286 : byte[]
        var_5_287 : int
        expr_29A : byte [generated]
        var_3_11A : String
        stack_14D_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_167 = and:int(ldc:int(619154026), ldc:int(-13576357))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("+sT+6OgWfmr+GBzeClg=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_154 = expr_6B:int
        var_3_159 = newarray:byte[](byte.class, expr_6B:int)
        var_5_15A = expr_6B:int
        Label_0348:
        
        while (cmpeq:boolean(and:int(var_0_167:int, ldc:int(4)), ldc:int(0))) {
            var_0_191 = and:int(var_0_167:int, ldc:int(-1501824007))
            var_5_15A = add:int(var_5_15A:int, ldc:int(-1))
            expr_179 = stack_1C5_2 = loadelement(stack_179_0, var_5_15A)
            
            if (cmplt:boolean(add:int(add:int(var_5_15A:int, ldc:int(1)), neg:int(var_4_154:int)), ldc:int(0))) {
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, loadelement:byte(var_3_159:byte[], add:int(var_5_15A:int, ldc:int(1))))
                goto(Label_0428)
            }
            
            Label_0390:
            
            if (cmpne:boolean(and:int(var_0_191:int, ldc:int(524288)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(1831859713))
            }
            else {
                var_0_191 = and:int(var_0_191:int, ldc:int(-2043498516))
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, ldc:byte(1))
            }
            
            Label_0428:
            
            if (cmpeq:boolean(and:int(var_0_191:int, ldc:int(64)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(-52339957))
                goto(Label_0390)
            }
            
            var_0_167 = and:int(var_0_191:int, ldc:int(624597866))
            storeelement:byte(var_3_159:byte[], var_5_15A:int, stack_1C5_2:byte)
            
            if (cmpne:boolean(var_5_15A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_159:byte[]
            goto(Label_0112)
        }
        
        var_0_167 = and:int(var_0_167:int, ldc:int(-74919142))
        Label_0491:
        
        while (cmpne:boolean(and:int(var_0_167:int, ldc:int(512)), ldc:int(0))) {
            var_0_167 = and:int(var_0_167:int, ldc:int(-1653242168))
            var_5_15A = add:int(var_5_15A:int, ldc:int(-1))
            storeelement:byte(var_3_159:byte[], var_5_15A:int, add:byte(loadelement:byte(stack_208_0:byte[], var_5_15A:int), ldc:byte(7)))
            
            if (cmpne:boolean(var_5_15A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_159:byte[]
            goto(Label_0155)
        }
        
        var_0_167 = and:int(var_0_167:int, ldc:int(-1437149862))
        goto(Label_0348)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_167:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_167:int, ldc:int(4)), ldc:int(0))) {
            var_0_167 = and:int(var_0_167:int, ldc:int(-837370199))
        }
        else {
            var_0_167 = and:int(var_0_167:int, ldc:int(-315033635))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_154 = expr_96:int
                var_3_159 = newarray:byte[](byte.class, expr_96:int)
                var_5_15A = expr_96:int
                goto(Label_0491)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(512)), ldc:int(0))) {
            var_0_167 = and:int(var_0_167:int, ldc:int(491579454))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_167 = and:int(var_0_167:int, ldc:int(-964764932))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_231 = newarray:byte[](byte.class, expr_C3:int)
                var_5_232 = expr_C3:int
                
                loop {
                    var_0_167 = and:int(var_0_167:int, ldc:int(-143747330))
                    var_5_232 = add:int(var_5_232:int, ldc:int(-1))
                    storeelement:byte(var_3_231:byte[], var_5_232:int, add:int(shl:int(loadelement:byte(stack_242_0:byte[], var_5_232:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_232:int, xor:int(ldc:int(4233), ldc:int(4232)))), ldc:int(5)), and:int(ldc:int(20551), ldc:int(23)))))
                    
                    if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_231:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_167:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_167:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_167 = and:int(var_0_167:int, ldc:int(-34300323))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_286 = newarray:byte[](byte.class, expr_E6:int)
                var_5_287 = expr_E6:int
                
                loop {
                    var_0_167 = and:int(var_0_167:int, ldc:int(259637834))
                    var_5_287 = add:int(var_5_287:int, ldc:int(-1))
                    expr_29A = xor:byte(loadelement:byte(stack_297_0:byte[], var_5_287:int), ldc:byte(21))
                    storeelement:byte(var_3_286:byte[], var_5_287:int, or:int(and:int(shl:int(expr_29A:byte, xor:int(ldc:int(642), ldc:int(646))), ldc:int(-16)), and:int(shr:int(expr_29A:byte[expected:int], xor:int(ldc:int(-32544), ldc:int(-32540))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_286:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_167:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_167:int, ldc:int(64)), ldc:int(0))) {
            var_0_167 = and:int(var_0_167:int, ldc:int(1604034608))
            goto(Label_0112)
        }
        
        var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_14D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(265), ldc:int(20579)))
        expr_12C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(305), ldc:int(519)))
        storeelement:String(expr_12C:String[], and:int(ldc:int(-6046), ldc:int(6041)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(12364), ldc:int(-29005)), and:int(ldc:int(13), ldc:int(333))))
        putstatic:String[](\u98a4\u7330\ub171\u3a62\ud51e\u4975::\u3dd3\u98a4\u7873\u7e3f\ubb2b\u3bd6, expr_12C:String[])
    }
    
    public void \u6198\ub171\u9af2\ubded\u59ec\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(1565244437), ldc:int(1558044340))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u98a4\u7330\ub171\u3a62\ud51e\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(1819323774))
            var_5_7D = and:int(ldc:int(20114), ldc:int(-20115))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3034), ldc:int(3032)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_636:int, ldc:int(2103757983))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4867), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(16451), ldc:int(16450)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_CA:int, ldc:int(-821174954))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8738), ldc:int(8739)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2044766908))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-588786697))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1340148519))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(478752846))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1132548533))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(2027503328))
                    }
                    else {
                        var_3_636 = and:int(var_3_636:int, ldc:int(2103967358))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1460952007))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1921866))
                            var_11_DB = and:int(ldc:int(-25999), ldc:int(25990))
                            goto(Label_1457)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1109850266))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1944366433))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1549921847))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1458419))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(969306045))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-916822492))
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2023075499))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(2015552809))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(554106228))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1843715415))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(879358305))
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-165628967))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-295349166))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-2094849721))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-957757333))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1882742528))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1554173790))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(1056), ldc:int(1057))
                                goto(Label_1076)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1840721430))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(920086976))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(654102384))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-907908316))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1447394495))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1058607584))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1977655390))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1284000530))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-331621217))
                        var_11_DB = and:int(ldc:int(-27063), ldc:int(27026))
                    }
                    
                    Label_1076:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(399425770))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1282663808))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1937802589))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-559940728))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-320095148))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1337)
                            }
                        }
                    }
                    
                    Label_1192:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1679617016))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-910148110))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1121978205))
                            goto(Label_1076)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1198969573))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1262843008))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-2077647241))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-823722761))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1457)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1337:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(640768133))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2124467134))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(610684965))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(1833143734))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1457:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1468:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-87839436))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1605808344))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-891547540))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1900423761))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(590953730))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1878510934))
                        var_17_641 = add:int(var_16_109:int, and:int(ldc:int(18561), ldc:int(9553)))
                        looporswitchbreak()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(2082286346))
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(1828764916))
                
                if (cmple:boolean(var_5_7D = var_17_641:int, sub:int(var_6_84:int, and:int(ldc:int(4617), ldc:int(10515))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
