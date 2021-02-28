public class \u3504\ufe34\u600f\u6b0d\u69d9.\u839e\ub1b9\u960f\u5db4\ub171 {
    public void \u839e\ub1b9\u960f\u5db4\ub171() {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u839e\ub1b9\u960f\u5db4\ub171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3504\ufe34\u600f\u6b0d\u69d9.\u839e\ub1b9\u960f\u5db4\ub171 \ud158\u88c5\ud51e\ub1b9\u69d9\ubcb0(java.lang.String p0) {
        var_1_64 : int
        var_3_6C : JsonParser
        var_1_71 : int
        var_4_79 : \u839e\ub1b9\u960f\u5db4\ub171
        var_5_88 : JsonObject
        var_5_17C : Exception
        
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
            var_1_64 = and:int(and:int(ldc:int(1008065864), ldc:int(-551682054)), ldc:int(-1210714677))
            var_3_6C = initobject:JsonParser(JsonParser::<init>)
            var_1_71 = and:int(var_1_64:int, ldc:int(-1632241921))
            var_4_79 = initobject:\u839e\ub1b9\u960f\u5db4\ub171(\u839e\ub1b9\u960f\u5db4\ub171::<init>)
            
            try {
                var_1_71 = and:int(var_1_71:int, ldc:int(-1693068086))
                var_5_88 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, invokevirtual:JsonElement(JsonParser::parse, var_3_6C:JsonParser, p0:String))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(1393820515))
                        goto(Label_0339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_71:int, ldc:int(128)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-1127715179))
                    }
                    else {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-1612712724))
                        putfield:String(\u839e\ub1b9\u960f\u5db4\ub171::\ud7e8\u6435\u3a62\ufe34\ud7e8\u7bad, var_4_79:\u839e\ub1b9\u960f\u5db4\ub171, invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u839e\ub1b9\u960f\u5db4\ub171::\u3d4b\ud217\u839e\u624e\u6cfe\u3c25), and:int(ldc:int(-13664), ldc:int(12366))), var_5_88:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String())))
                    }
                    
                    Label_0205:
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(64)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-642567418))
                        goto(Label_0339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-2006169165))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-2136735506))
                            loopcontinue()
                        }
                        
                        var_1_71 = and:int(var_1_71:int, ldc:int(1056300137))
                        putfield:String(\u839e\ub1b9\u960f\u5db4\ub171::\u927d\u16f6\u9af2\ud158\u624e\uc3e3, var_4_79:\u839e\ub1b9\u960f\u5db4\ub171, invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u839e\ub1b9\u960f\u5db4\ub171::\u3d4b\ud217\u839e\u624e\u6cfe\u3c25), xor:int(ldc:int(8528), ldc:int(8529))), var_5_88:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String())))
                    }
                    
                    Label_0280:
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-355306071))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0205)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_71 = and:int(var_1_71:int, ldc:int(-587204899))
                        putfield:String(\u839e\ub1b9\u960f\u5db4\ub171::\ud7e8\ubcb0\u8c8a\u98a4\u8413\u51b2, var_4_79:\u839e\ub1b9\u960f\u5db4\ub171, invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u839e\ub1b9\u960f\u5db4\ub171::\u3d4b\ud217\u839e\u624e\u6cfe\u3c25), xor:int(ldc:int(7297), ldc:int(7299))), var_5_88:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String())))
                    }
                    
                    Label_0339:
                    
                    if (cmpne:boolean(and:int(var_1_71:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-1635721942))
                        goto(Label_0205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_71 = and:int(var_1_71:int, ldc:int(-1832919079))
            }
            catch (java.lang.Exception var_5_17C) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u839e\ub1b9\u960f\u5db4\ub171::\u494c\u5d20\u759a\ua61f\u7006\u7049), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\ub1b9\u960f\u5db4\ub171::\u3d4b\ud217\u839e\u624e\u6cfe\u3c25), and:int(ldc:int(3175), ldc:int(12803)))), invokevirtual:String(Throwable::getMessage, var_5_17C:Exception[expected:Throwable]))))
            }
            
            return:\u839e\ub1b9\u960f\u5db4\ub171(var_4_79:\u839e\ub1b9\u960f\u5db4\ub171)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E6 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_207_0 : byte[] [generated]
        stack_270_0 : byte[] [generated]
        stack_2FE_0 : byte[] [generated]
        stack_33B_0 : byte[] [generated]
        var_4_1D3 : int
        var_3_1D8 : byte[]
        var_5_1D9 : int
        expr_207 : byte [generated]
        var_0_288 : int
        expr_270 : byte [generated]
        stack_2B4_2 : byte [generated]
        stack_28B_0 : byte [generated]
        expr_9E : int [generated]
        expr_D9 : int [generated]
        var_2_10A : byte[]
        expr_10E : int [generated]
        var_3_32A : byte[]
        var_5_32B : int
        var_3_142 : String
        stack_1C6_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_1E6 = and:int(ldc:int(-445059283), ldc:int(-403345977))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_207_0 = stack_270_0 = stack_2FE_0 = stack_33B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("shGmDvxplPshZQwGrEMGitr84DsdAMYOAG8GJawC6g5apimzjugC6g7qKQwQ4gAVJ08EBNQ2BvPA4CH7FuIAFSdPBATUJugGr+nfBw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D3 = expr_6B:int
        var_3_1D8 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D9 = expr_6B:int
        Label_0475:
        
        while (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(4096)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-244500107))
                goto(Label_0588)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-436379723))
            var_5_1D9 = add:int(var_5_1D9:int, ldc:int(-1))
            expr_207 = loadelement:byte(stack_207_0:byte[], var_5_1D9:int)
            storeelement:byte(var_3_1D8:byte[], var_5_1D9:int, or:int(and:int(shl:int(expr_207:byte, xor:int(ldc:int(16523), ldc:int(16527))), ldc:int(-16)), and:int(shr:int(expr_207:byte[expected:int], and:int(ldc:int(20492), ldc:int(10356))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_207_0 = stack_270_0 = stack_2FE_0 = stack_33B_0 = var_3_1D8:byte[]
            goto(Label_0112)
        }
        
        var_0_1E6 = and:int(var_0_1E6:int, ldc:int(462807827))
        goto(Label_0730)
        Label_0588:
        
        while (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(2)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-972397695))
                goto(Label_0475)
            }
            
            var_0_288 = and:int(var_0_1E6:int, ldc:int(-445186595))
            var_5_1D9 = add:int(var_5_1D9:int, ldc:int(-1))
            expr_270 = stack_2B4_2 = loadelement(stack_270_0, var_5_1D9)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D9:int, ldc:int(3)), neg:int(var_4_1D3:int)), ldc:int(0))) {
                stack_2B4_2 = stack_28B_0 = add:byte(expr_270:byte, loadelement:byte(var_3_1D8:byte[], add:int(var_5_1D9:int, ldc:int(3))))
                goto(Label_0667)
            }
            
            Label_0637:
            
            if (cmpeq:boolean(and:int(var_0_288:int, ldc:int(128)), ldc:int(0))) {
                var_0_288 = and:int(var_0_288:int, ldc:int(-9376289))
                stack_2B4_2 = stack_28B_0 = add:byte(expr_270:byte, ldc:byte(3))
            }
            
            Label_0667:
            
            if (cmpne:boolean(and:int(var_0_288:int, ldc:int(2)), ldc:int(0))) {
                var_0_288 = and:int(var_0_288:int, ldc:int(-917270571))
                goto(Label_0637)
            }
            
            var_0_1E6 = and:int(var_0_288:int, ldc:int(-269095537))
            storeelement:byte(var_3_1D8:byte[], var_5_1D9:int, stack_2B4_2:byte)
            
            if (cmpne:boolean(var_5_1D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_207_0 = stack_270_0 = stack_2FE_0 = stack_33B_0 = var_3_1D8:byte[]
            goto(Label_0163)
        }
        
        Label_0730:
        
        while (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0475)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-402883147))
            var_5_1D9 = add:int(var_5_1D9:int, ldc:int(-1))
            storeelement:byte(var_3_1D8:byte[], var_5_1D9:int, add:byte(xor:byte(loadelement:byte(stack_2FE_0:byte[], var_5_1D9:int), ldc:byte(40)), ldc:byte(37)))
            
            if (cmpne:boolean(var_5_1D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_207_0 = stack_270_0 = stack_2FE_0 = stack_33B_0 = var_3_1D8:byte[]
            goto(Label_0222)
        }
        
        var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-12831562))
        goto(Label_0588)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-2146826424))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(2086435830))
        }
        else {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-42369689))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1D3 = expr_9E:int
                var_3_1D8 = newarray:byte[](byte.class, expr_9E:int)
                var_5_1D9 = expr_9E:int
                goto(Label_0588)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-251001810))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(910153269))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-290008868))
                goto(Label_0112)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-302908035))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1D3 = expr_D9:int
                var_3_1D8 = newarray:byte[](byte.class, expr_D9:int)
                var_5_1D9 = expr_D9:int
                goto(Label_0730)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-2045354184))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(721777662))
                goto(Label_0112)
            }
            
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-697019))
            var_2_10A = stack_10A_0:byte[]
            expr_10E = add:int(arraylength:int(stack_10C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_32A = newarray:byte[](byte.class, expr_10E:int)
                var_5_32B = expr_10E:int
                
                loop {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-142999577))
                    var_5_32B = add:int(var_5_32B:int, ldc:int(-1))
                    storeelement:byte(var_3_32A:byte[], var_5_32B:int, add:int(shl:int(loadelement:byte(stack_33B_0:byte[], var_5_32B:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_10A:byte[], add:int(var_5_32B:int, and:int(ldc:int(8705), ldc:int(3151)))), ldc:int(5)), and:int(ldc:int(839), ldc:int(26639)))))
                    
                    if (cmpne:boolean(var_5_32B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D7_0 = stack_D9_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_207_0 = stack_270_0 = stack_2FE_0 = stack_33B_0 = var_3_32A:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(301193766))
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(1024)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C6_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(550), ldc:int(14596)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10327), ldc:int(4)))
            storeelement:String(expr_154:String[], and:int(ldc:int(39), ldc:int(16515)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-27100), ldc:int(26835)), and:int(ldc:int(12653), ldc:int(16933))))
            storeelement:String(expr_154:String[], and:int(ldc:int(-22207), ldc:int(5774)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1092), ldc:int(1121)), and:int(ldc:int(2605), ldc:int(4332))))
            storeelement:String(expr_154:String[], and:int(ldc:int(2482), ldc:int(29699)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1260), ldc:int(11053)), and:int(ldc:int(2108), ldc:int(12606))))
            storeelement:String(expr_154:String[], and:int(ldc:int(2305), ldc:int(517)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(20799), ldc:int(9340)), and:int(ldc:int(16491), ldc:int(4687))))
            putstatic:String[](\u839e\ub1b9\u960f\u5db4\ub171::\u3d4b\ud217\u839e\u624e\u6cfe\u3c25, expr_154:String[])
            putstatic:Logger(\u839e\ub1b9\u960f\u5db4\ub171::\u494c\u5d20\u759a\ua61f\u7006\u7049, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_656 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_661 : int
        
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
        var_3_656 = and:int(ldc:int(2075988776), ldc:int(-71739606))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\ub1b9\u960f\u5db4\ub171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
            var_3_656 = and:int(var_3_656:int, ldc:int(-607888956))
        }
        else {
            var_3_656 = and:int(var_3_656:int, ldc:int(-1617036952))
            var_5_85 = and:int(ldc:int(-23422), ldc:int(23140))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7664), ldc:int(5423)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_656:int, ldc:int(802799452))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-30460), ldc:int(-30459)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4644), ldc:int(4645)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_656 = and:int(var_3_D2:int, ldc:int(1071436552))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(9219), ldc:int(2329)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1805031410))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(85899239))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(159796605))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(58025184))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(12724065))
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-688022959))
                        goto(Label_0591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1388909999))
                    }
                    else {
                        var_3_656 = and:int(var_3_656:int, ldc:int(196858315))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0591)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(749902341))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(2012568867))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1317303695))
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(30395995))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1359474125))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-335916212))
                        var_11_E3 = and:int(ldc:int(-21126), ldc:int(21125))
                        goto(Label_1497)
                    }
                    
                    Label_0591:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1419665774))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-903966275))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1425708682))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1548946045))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(114025075))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-268281394))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1080183313))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1750559308))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0951)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-776635706))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(536722876))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-357477846))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-43411767))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1609780344))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1447490591))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(1541037903))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(320), ldc:int(321))
                                goto(Label_1106)
                            }
                        }
                    }
                    
                    Label_0951:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1875178661))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1914517047))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-533608423))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-47822179))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1348937219))
                        var_11_E3 = and:int(ldc:int(25987), ldc:int(-26076))
                    }
                    
                    Label_1106:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(767640075))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1212125699))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1852041948))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0951)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-267641758))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1081155755))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-878895172))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1902592339))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1106)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1933084974))
                            goto(Label_0951)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1213667238))
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1093569960))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-876782817))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1359:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1094255583))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1661545765))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-346522726))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2096559378))
                        goto(Label_0591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(888794097))
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(536861548))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1497:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_661 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1508:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-278141894))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(149604538))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2003629076))
                        goto(Label_0951)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-446428482))
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(463008190))
                        var_17_661 = add:int(var_16_111:int, and:int(ldc:int(2569), ldc:int(24693)))
                        looporswitchbreak()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(1708721547))
                }
                
                var_3_656 = and:int(var_3_656:int, ldc:int(-340255348))
                
                if (cmple:boolean(var_5_85 = var_17_661:int, sub:int(var_6_8C:int, xor:int(ldc:int(1037), ldc:int(1036))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
