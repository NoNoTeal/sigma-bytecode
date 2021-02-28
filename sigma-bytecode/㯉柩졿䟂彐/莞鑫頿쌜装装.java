public final class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u839e\u946b\u983f\uc31c\u88c5\u88c5 {
    public void \u839e\u946b\u983f\uc31c\u88c5\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1 p0) {
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
        invokespecial:Object(Object::<init>, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)
        putfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, and:int(ldc:int(20392), ldc:int(-20397)))
        putfield:CRC32(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u3bd6\ubf56\uc238\u4975\ucb79\u34df, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, initobject:CRC32(CRC32::<init>))
        
        if (cmpne:boolean(p0:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1, aconstnull:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1())) {
            putfield:Inflater(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u600f\ub1b9\u873d\ubff1\u9a18\u92ee, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, initobject:Inflater(Inflater::<init>, and:int[expected:boolean](ldc:int(2067), ldc:int(16901))))
            putfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokestatic:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\ubcb0\u12b2\u97e6\u3bd6\u9a18\u8cae::\u9af2\ud158\u3dd3\u759a\u8258\u4ab3, p0:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1))
            putfield:\uc84e\u1833\u74b1\u965f\u071d\ub32d(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u7043\u36d3\u8413\u494c\u6fb0\u93a2, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, initobject:\uc84e\u1833\u74b1\u965f\u071d\ub32d(\uc84e\u1833\u74b1\u965f\u071d\ub32d::<init>, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), getfield:Inflater(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u600f\ub1b9\u873d\ubff1\u9a18\u92ee, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(3210), ldc:int(-3227)))))
    }
    
    public long \ua068\u873d\ucef1\u3e2a\u446c\u74b1(\u3d64\u7af6\uae87\uc238\u7d52.\u3711\u34df\ubded\u3d64\u494c\u6198 p0, long p1) {
        var_4_61 : int
        var_4_A2 : int
        var_6_220 : long
        var_8_22B : long
        
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
        var_4_61 = and:int(ldc:int(-1696245192), ldc:int(1072809753))
        
        if (cmplt:boolean(p1:long, ldc:long(0L))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), xor:int(ldc:int(48), ldc:int(49)))), p1:long))))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1398043409))
                goto(Label_0412)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0339)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1988645158))
                goto(Label_0266)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_4_A2 = and:int(var_4_61:int, ldc:int(2085363219))
            }
            else {
                var_4_A2 = and:int(var_4_61:int, ldc:int(-1199224195))
                
                if (cmpeq:boolean(p1:long, ldc:long(0L))) {
                    return:long(ldc:long(0L))
                }
            }
            
            Label_0180:
            
            if (cmpeq:boolean(and:int(var_4_A2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_61 = and:int(var_4_A2:int, ldc:int(237110174))
                goto(Label_0412)
            }
            
            if (cmpeq:boolean(and:int(var_4_A2:int, ldc:int(65536)), ldc:int(0))) {
                var_4_61 = and:int(var_4_A2:int, ldc:int(-2085556296))
                goto(Label_0339)
            }
            
            if (cmpne:boolean(and:int(var_4_A2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_61 = and:int(var_4_A2:int, ldc:int(-1214323149))
            }
            else {
                if (cmpne:boolean(and:int(var_4_A2:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_A2:int, ldc:int(-1293078382))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_A2:int, ldc:int(-658393221))
                
                if (cmpeq:boolean(getfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), ldc:int(0))) {
                    invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ufcaf\u3d64\uf94d\ufcaf\u3bc9\ud12e, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)
                    putfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, xor:int(ldc:int(-24446), ldc:int(-24445)))
                }
            }
            
            Label_0266:
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0412)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                    var_4_A2 = and:int(var_4_61:int, ldc:int(-559755637))
                    goto(Label_0180)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(683782932))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(1571248698))
                
                if (cmpeq:boolean(getfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), and:int(ldc:int(16449), ldc:int(921)))) {
                    var_6_220 = getfield:long(\u3711\u34df\ubded\u3d64\u494c\u6198::\uae5d\ucb79\u64ab\u3e2a\u36d3\u8709, p0:\u3711\u34df\ubded\u3d64\u494c\u6198)
                    var_8_22B = invokevirtual:long(\uc84e\u1833\u74b1\u965f\u071d\ub32d::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\uc84e\u1833\u74b1\u965f\u071d\ub32d(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u7043\u36d3\u8413\u494c\u6fb0\u93a2, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), p0:\u3711\u34df\ubded\u3d64\u494c\u6198, p1:long)
                    
                    if (cmpne:boolean(var_8_22B:long, ldc:long(-1L))) {
                        invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, p0:\u3711\u34df\ubded\u3d64\u494c\u6198, var_6_220:long, var_8_22B:long)
                        return:long(var_8_22B:long)
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-39339429))
                    putfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, and:int(ldc:int(610), ldc:int(4358)))
                }
            }
            
            Label_0339:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-925674696))
                    goto(Label_0266)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_A2 = and:int(var_4_61:int, ldc:int(-1592047890))
                    goto(Label_0180)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(536870912)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-52439235))
                
                if (cmpeq:boolean(getfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), and:int(ldc:int(3139), ldc:int(8194)))) {
                    invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u12b2\u8bb0\u927d\u4e72\u3d4b\u983f, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)
                    putfield:int(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u97e6\ucb79\u624e\u7af6\uc3e3\ua562, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, and:int(ldc:int(295), ldc:int(2243)))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u61a4\u9255\ud36e\u3d4b\uc84e\u4e72, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))) {
                        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(18), ldc:int(1031)))))
                    }
                }
            }
            
            Label_0412:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0339)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_A2 = and:int(var_4_61:int, ldc:int(-1344831036))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                return:long(ldc:long(-1L))
            }
        }
    }
    
    private void \ufcaf\u3d64\uf94d\ufcaf\u3bc9\ud12e() {
        var_1_5F : int
        var_3_7B : byte
        stack_B6_0 : int [generated]
        var_1_B5 : int
        var_4_B6 : int
        var_1_2DF : int
        var_7_2C9 : long
        var_1_251 : int
        var_6_25E : short
        var_1_390 : int
        
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
        var_1_5F = and:int(ldc:int(-1986317924), ldc:int(-1623230641))
        invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u88c5\u8aa5\ube23\u34df\ub70c\u6435, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), ldc:long(10L))
        var_3_7B = invokevirtual:byte(\u3711\u34df\ubded\u3d64\u494c\u6198::\u97b7\u93a2\u7ce1\u6c56\u7043\u960f, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(3L))
        
        if (cmpne:boolean(and:int(shr:int(var_3_7B:byte[expected:int], and:int(ldc:int(4163), ldc:int(1297))), and:int(ldc:int(5377), ldc:int(2183))), and:int(ldc:int(2309), ldc:int(8721)))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-87344285))
            stack_B6_0 = and:int(ldc:int(-21584), ldc:int(20559))
        }
        else {
            stack_B6_0 = and:int(ldc:int(14209), ldc:int(41))
        }
        
        var_1_B5 = and:int(var_1_5F:int, ldc:int(-1902513073))
        var_4_B6 = stack_B6_0:int
        
        if (cmpne:boolean(var_4_B6:int, ldc:int(0))) {
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(0L), ldc:long(10L))
        }
        
        var_1_2DF = and:int(var_1_B5:int, ldc:int(-666931077))
        invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u960f\uc2bd\ub113\u983f\u183a\ub8be, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(4387), ldc:int(8203))), and:int(ldc:int(8143), ldc:int(8075)), invokeinterface:short[expected:int](\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u9255\u40a9\u3d64\u8aa5\u0a06\uc9f6, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))
        invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u516c\u16f6\uff55\u56bd\u6cfe\u67e9, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), ldc:long(8L))
        
        if (cmpeq:boolean(and:int(shr:int(var_3_7B:byte[expected:int], and:int(ldc:int(515), ldc:int(20522))), and:int(ldc:int(49), ldc:int(6401))), xor:boolean[expected:int](ldc:boolean(0), ldc:boolean(1)))) {
            invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u88c5\u8aa5\ube23\u34df\ub70c\u6435, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), ldc:long(2L))
            
            if (cmpeq:boolean(var_4_B6:int, ldc:int(0))) {
                goto(Label_0553)
            }
            
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(0L), ldc:long(2L))
            goto(Label_0553)
        }
        
        Label_0268:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0553)
        }
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-1245752402))
            goto(Label_0474)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0412)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(524288)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-93504618))
            
            if (cmpeq:boolean(and:int(shr:int(var_3_7B:byte[expected:int], and:int(ldc:int(7), ldc:int(4859))), and:int(ldc:int(6743), ldc:int(17417))), xor:int(ldc:int(640), ldc:int(641)))) {
                var_7_2C9 = invokeinterface:long(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u8cae\u7330\u494c\uceb8\u4492\uc238, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), and:int[expected:byte](ldc:int(-13953), ldc:int(13952)))
                
                if (cmpne:boolean(var_7_2C9:long, ldc:long(-1L))) {
                    goto(Label_0724)
                }
                
                athrow(initobject:EOFException(EOFException::<init>))
            }
        }
        
        Label_0336:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0553)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(1)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-927304393))
            goto(Label_0474)
        }
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(326653474))
        }
        else {
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0268)
            }
            
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-1984089007))
            
            if (cmpeq:boolean(and:int(shr:int(var_3_7B:byte[expected:int], and:int(ldc:int(2092), ldc:int(326))), xor:int(ldc:int(66), ldc:int(67))), xor:int(ldc:int(-32488), ldc:int(-32487)))) {
                var_7_2C9 = invokeinterface:long(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u8cae\u7330\u494c\uceb8\u4492\uc238, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), and:int[expected:byte](ldc:int(-491), ldc:int(490)))
                
                if (cmpne:boolean(var_7_2C9:long, ldc:long(-1L))) {
                    goto(Label_0886)
                }
                
                athrow(initobject:EOFException(EOFException::<init>))
            }
        }
        
        Label_0412:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(512)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(647197761))
            goto(Label_0553)
        }
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(65536)), ldc:int(0))) {
                var_1_2DF = and:int(var_1_2DF:int, ldc:int(1011123508))
                goto(Label_0336)
            }
            
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_2DF = and:int(var_1_2DF:int, ldc:int(1328628843))
                goto(Label_0268)
            }
            
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-896683320))
            
            if (cmpne:boolean(var_4_B6:int, ldc:int(0))) {
                invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u960f\uc2bd\ub113\u983f\u183a\ub8be, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(11780), ldc:int(70))), invokeinterface:short[expected:int](\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u7049\uc7fe\u4c04\u6b0d\u759a\u759a, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), i2s:short[expected:int](l2i:int(invokevirtual:long(CRC32::getValue, getfield:CRC32(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u3bd6\ubf56\uc238\u4975\ucb79\u34df, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))))
                invokevirtual:void(CRC32::reset, getfield:CRC32(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u3bd6\ubf56\uc238\u4975\ucb79\u34df, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5))
            }
        }
        
        Label_0474:
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0412)
            }
            
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0336)
            }
            
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(524288)), ldc:int(0))) {
                return:void()
            }
            
            goto(Label_0268)
        }
        
        Label_0553:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0474)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0412)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0336)
        }
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(65536)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-969922935))
            goto(Label_0268)
        }
        
        var_1_251 = and:int(var_1_2DF:int, ldc:int(-100959951))
        var_6_25E = invokevirtual:short(\u3711\u34df\ubded\u3d64\u494c\u6198::\u7049\uc7fe\u4c04\u6b0d\u759a\u759a, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))
        invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u88c5\u8aa5\ube23\u34df\ub70c\u6435, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), i2l:long(var_6_25E:short[expected:int]))
        
        if (cmpne:boolean(var_4_B6:int, ldc:int(0))) {
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(0L), i2l:long(var_6_25E:short[expected:int]))
        }
        
        var_1_2DF = and:int(var_1_251:int, ldc:int(-819350418))
        invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u516c\u16f6\uff55\u56bd\u6cfe\u67e9, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), i2l:long(var_6_25E:short[expected:int]))
        goto(Label_0268)
        Label_0724:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(2)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(1554781820))
            goto(Label_0886)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(32)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(568541366))
        }
        else {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-1361349020))
            
            if (cmpne:boolean(var_4_B6:int, ldc:int(0))) {
                invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(0L), add:long(var_7_2C9:long, ldc:long(1L)))
            }
        }
        
        Label_0764:
        
        if (cmpeq:boolean(and:int(var_1_2DF:int, ldc:int(65536)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-350371523))
        }
        else {
            if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_2DF = and:int(var_1_2DF:int, ldc:int(746039966))
                goto(Label_0724)
            }
            
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(-1736442757))
            invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u516c\u16f6\uff55\u56bd\u6cfe\u67e9, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), add:long(var_7_2C9:long, ldc:long(1L)))
            goto(Label_0336)
        }
        
        Label_0886:
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0764)
        }
        
        if (cmpne:boolean(and:int(var_1_2DF:int, ldc:int(33554432)), ldc:int(0))) {
            var_1_2DF = and:int(var_1_2DF:int, ldc:int(546792953))
            goto(Label_0724)
        }
        
        var_1_390 = and:int(var_1_2DF:int, ldc:int(-1445203593))
        
        if (cmpne:boolean(var_4_B6:int, ldc:int(0))) {
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, invokeinterface:\u3711\u34df\ubded\u3d64\u494c\u6198(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uf995\u6c56\u93a2\u88c5\u6cfe\u88c5, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), ldc:long(0L), add:long(var_7_2C9:long, ldc:long(1L)))
        }
        
        var_1_2DF = and:int(var_1_390:int, ldc:int(-579915239))
        invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u516c\u16f6\uff55\u56bd\u6cfe\u67e9, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), add:long(var_7_2C9:long, ldc:long(1L)))
        goto(Label_0412)
    }
    
    private void \u12b2\u8bb0\u927d\u4e72\u3d4b\u983f() {
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
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u960f\uc2bd\ub113\u983f\u183a\ub8be, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), xor:int(ldc:int(2120), ldc:int(2125))), invokeinterface:int(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u718f\u6198\u416d\u718f\u61a4\u946b, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), l2i:int(invokevirtual:long(CRC32::getValue, getfield:CRC32(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u3bd6\ubf56\uc238\u4975\ucb79\u34df, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5))))
            invokespecial:void(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u960f\uc2bd\ub113\u983f\u183a\ub8be, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5, loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(8231), ldc:int(662))), invokeinterface:int(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u718f\u6198\u416d\u718f\u61a4\u946b, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)), l2i:int(invokevirtual:long(Inflater::getBytesWritten, getfield:Inflater(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u600f\ub1b9\u873d\ubff1\u9a18\u92ee, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe \u3e2a\ub32d\uc29a\ub83f\u9937\u927d() {
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
            return:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(invokeinterface:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\u3e2a\ub32d\uc29a\ub83f\u9937\u927d, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52[expected:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\uc9f6\uc29a\u7d52\u8258\u59ec\uc31c, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5)))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokevirtual:void(\uc84e\u1833\u74b1\u965f\u071d\ub32d::close, getfield:\uc84e\u1833\u74b1\u965f\u071d\ub32d(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u7043\u36d3\u8413\u494c\u6fb0\u93a2, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc9f6\u0b8e\uc3e3\uff55\u5245\u40a9(\u3d64\u7af6\uae87\uc238\u7d52.\u3711\u34df\ubded\u3d64\u494c\u6198 p0, long p1, long p2) {
        var_6_63 : int
        var_8_69 : \uae87\uceb8\ubf56\u6ec6\u59ec\u36d3
        var_9_E2 : int
        var_10_F3 : int
        
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
            var_6_63 = and:int(ldc:int(-371075822), ldc:int(-33983498))
            var_8_69 = getfield:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3(\u3711\u34df\ubded\u3d64\u494c\u6198::\uae5d\u93a2\u9a18\ub113\ub102\uc238, p0:\u3711\u34df\ubded\u3d64\u494c\u6198)
            
            loop {
                if (cmpne:boolean(and:int(var_6_63:int, ldc:int(1048576)), ldc:int(0))) {
                    var_6_63 = and:int(var_6_63:int, ldc:int(1740309995))
                }
                else {
                    var_6_63 = and:int(var_6_63:int, ldc:int(-310509765))
                    
                    if (cmpge:boolean(p1:long, i2l:long(sub:int(getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u6d69\u3bd6\u67d0\ub70c\ud4fe\u071d, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3), getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u7bad\u62da\u6435\ucb79\u67d0\ub19c, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3))))) {
                        p1 = sub:long(p1:long, i2l:long(sub:int(getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u6d69\u3bd6\u67d0\ub70c\ud4fe\u071d, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3), getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u7bad\u62da\u6435\ucb79\u67d0\ub19c, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3))))
                        var_8_69 = getfield:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\ubded\ub8be\u446c\u5245\ube23\uf995, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3)
                        loopcontinue()
                    }
                }
                
                while (cmpne:boolean(and:int(var_6_63:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_63 = and:int(var_6_63:int, ldc:int(-68592198))
                    
                    if (cmple:boolean(p2:long, ldc:long(0L))) {
                        looporswitchbreak(Block_5)
                    }
                    
                    var_9_E2 = l2i:int(add:long(i2l:long(getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u7bad\u62da\u6435\ucb79\u67d0\ub19c, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3)), p1:long))
                    var_10_F3 = l2i:int(invokestatic:long(Math::min, i2l:long(sub:int(getfield:int(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u6d69\u3bd6\u67d0\ub70c\ud4fe\u071d, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3), var_9_E2:int)), p2:long))
                    invokevirtual:void(CRC32::update, getfield:CRC32(\u839e\u946b\u983f\uc31c\u88c5\u88c5::\u3bd6\ubf56\uc238\u4975\ucb79\u34df, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5), getfield:byte[](\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\u8c8a\uc2e8\u74b1\u8bb0\ucb79\ub102, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3), var_9_E2:int, var_10_F3:int)
                    p2 = sub:long(p2:long, i2l:long(var_10_F3:int))
                    p1 = ldc:long(0L)
                    var_8_69 = getfield:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3(\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3::\ubded\ub8be\u446c\u5245\ube23\uf995, var_8_69:\uae87\uceb8\ubf56\u6ec6\u59ec\u36d3)
                }
            }
            
            Block_5:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u960f\uc2bd\ub113\u983f\u183a\ub8be(java.lang.String p0, int p1, int p2) {
        stack_B4_0 : String [generated]
        expr_8D : Object[] [generated]
        
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
        
        if (cmpeq:boolean(p2:int, p1:int)) {
            return:void()
        }
        
        stack_B4_0 = loadelement:String(getstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe), and:int(ldc:int(17943), ldc:int(8391)))
        expr_8D = newarray:Object[](java.lang.Object.class, and:int(ldc:int(12331), ldc:int(131)))
        storeelement:Object(expr_8D:Object[], and:int(ldc:int(25281), ldc:int(-30406)), p0:String[expected:Object])
        storeelement:Object(expr_8D:Object[], and:int(ldc:int(16725), ldc:int(1577)), invokestatic:Integer[expected:Object](Integer::valueOf, p2:int))
        storeelement:Object(expr_8D:Object[], xor:int(ldc:int(1), ldc:int(3)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
        athrow(initobject:IOException(IOException::<init>, invokestatic:String(String::format, stack_B4_0:String, expr_8D:Object[])))
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_1FC_0 : byte[] [generated]
        stack_27F_0 : byte[] [generated]
        stack_2D6_0 : byte[] [generated]
        var_4_1DE : int
        var_3_1E3 : byte[]
        var_5_1E4 : int
        var_0_215 : int
        expr_1FC : byte [generated]
        stack_243_2 : byte [generated]
        stack_218_0 : byte [generated]
        expr_27F : byte [generated]
        expr_96 : int [generated]
        var_2_BC : byte[]
        expr_C0 : int [generated]
        var_3_2C4 : byte[]
        var_5_2C5 : int
        var_3_E7 : String
        stack_1D7_0 : String[] [generated]
        expr_F9 : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(1261839737), ldc:int(766929209))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BC_0 = stack_BE_0 = stack_DB_0 = stack_1FC_0 = stack_27F_0 = stack_2D6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GP0ckTcAIvm9pk70AgC9TDMaU8bLQ4ABT7At/aNA9AIQiJvFhD88xEFAMLV/sYwGhU8KAcT8dgg4fkAxLDyyfP12F9KV3OQ+CQCQQjXAz7FJtP8EAv718P6PvxtA9MH1Aj37CXVAhXcMj4A9dDQMf7myZs2EDszl+zh6ig==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1DE = expr_6E:int
        var_3_1E3 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1E4 = expr_6E:int
        Label_0486:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
            var_0_215 = and:int(var_0_61:int, ldc:int(1572238175))
            var_5_1E4 = add:int(var_5_1E4:int, ldc:int(-1))
            expr_1FC = stack_243_2 = loadelement(stack_1FC_0, var_5_1E4)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E4:int, ldc:int(4)), neg:int(var_4_1DE:int)), ldc:int(0))) {
                stack_243_2 = stack_218_0 = add:byte(expr_1FC:byte, loadelement:byte(var_3_1E3:byte[], add:int(var_5_1E4:int, ldc:int(4))))
                goto(Label_0552)
            }
            
            Label_0521:
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(1610588573))
                stack_243_2 = stack_218_0 = add:byte(expr_1FC:byte, ldc:byte(4))
            }
            
            Label_0552:
            
            if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(16)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(-194090900))
                goto(Label_0521)
            }
            
            var_0_61 = and:int(var_0_215:int, ldc:int(1844906393))
            storeelement:byte(var_3_1E3:byte[], var_5_1E4:int, stack_243_2:byte)
            
            if (cmpne:boolean(var_5_1E4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_DB_0 = stack_1FC_0 = stack_27F_0 = stack_2D6_0 = var_3_1E3:byte[]
            goto(Label_0115)
        }
        
        Label_0617:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1581789729))
            var_5_1E4 = add:int(var_5_1E4:int, ldc:int(-1))
            expr_27F = loadelement:byte(stack_27F_0:byte[], var_5_1E4:int)
            storeelement:byte(var_3_1E3:byte[], var_5_1E4:int, add:int(xor:int(or:int(and:int(shl:int(expr_27F:byte, and:int(ldc:int(4252), ldc:int(18534))), ldc:int(-16)), and:int(shr:int(expr_27F:byte[expected:int], and:int(ldc:int(16902), ldc:int(1045))), ldc:int(15))), ldc:int(111)), ldc:int(41)))
            
            if (cmpne:boolean(var_5_1E4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_DB_0 = stack_1FC_0 = stack_27F_0 = stack_2D6_0 = var_3_1E3:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0486)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(552162168))
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(262144)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(863976281))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1DE = expr_96:int
                var_3_1E3 = newarray:byte[](byte.class, expr_96:int)
                var_5_1E4 = expr_96:int
                goto(Label_0617)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-47972292))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(230656475))
            var_2_BC = stack_BC_0:byte[]
            expr_C0 = add:int(arraylength:int(stack_BE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_3_2C4 = newarray:byte[](byte.class, expr_C0:int)
                var_5_2C5 = expr_C0:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-683764803))
                    var_5_2C5 = add:int(var_5_2C5:int, ldc:int(-1))
                    storeelement:byte(var_3_2C4:byte[], var_5_2C5:int, add:int(shl:int(loadelement:byte(stack_2D6_0:byte[], var_5_2C5:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_BC:byte[], add:int(var_5_2C5:int, and:int(ldc:int(22563), ldc:int(9729)))), ldc:int(2)), xor:int(ldc:int(-32130), ldc:int(-32191)))))
                    
                    if (cmpne:boolean(var_5_2C5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_DB_0 = stack_1FC_0 = stack_27F_0 = stack_2D6_0 = var_3_2C4:byte[]
            }
        }
        
        Label_0197:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_E7 = initobject:String(String::<init>, stack_DB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1D7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4265), ldc:int(4257)))
            expr_F9 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4744), ldc:int(16394)))
            storeelement:String(expr_F9:String[], and:int(ldc:int(12327), ldc:int(16927)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(14379), ldc:int(-14380)), and:int(ldc:int(20644), ldc:int(9271))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(4405), ldc:int(8269)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(8532), ldc:int(8560)), xor:int(ldc:int(4613), ldc:int(4642))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(116), ldc:int(23300)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(10243), ldc:int(10276)), xor:int(ldc:int(253), ldc:int(209))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(2083), ldc:int(8263)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(810), ldc:int(774)), and:int(ldc:int(4406), ldc:int(26811))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(1170), ldc:int(1172)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(16), ldc:int(34)), and:int(ldc:int(1079), ldc:int(25143))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(10761), ldc:int(5121)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(8567), ldc:int(1207)), xor:int(ldc:int(4720), ldc:int(4662))))
            storeelement:String(expr_F9:String[], xor:int(ldc:int(20480), ldc:int(20482)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(13382), ldc:int(2166)), xor:int(ldc:int(4101), ldc:int(4200))))
            storeelement:String(expr_F9:String[], and:int(ldc:int(13517), ldc:int(-13518)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(-32767), ldc:int(-32660)), and:int(ldc:int(2175), ldc:int(12923))))
            putstatic:String[](\u839e\u946b\u983f\uc31c\u88c5\u88c5::\ud51e\u8d98\u3dd3\u5654\u8709\ud4fe, expr_F9:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7bad\u64ab\u7049\u8d98\u5245\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_668 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_673 : int
        
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
        var_3_668 = and:int(ldc:int(-1430642029), ldc:int(-628150609))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\u946b\u983f\uc31c\u88c5\u88c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
            var_3_668 = and:int(var_3_668:int, ldc:int(-1426180189))
            var_5_81 = and:int(ldc:int(-27755), ldc:int(3178))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(183), ldc:int(-4352)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_668:int, ldc:int(-1430635553))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(1067), ldc:int(2193)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(1045), ldc:int(1044)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_668 = and:int(var_3_D1:int, ldc:int(-1684095201))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(344), ldc:int(345)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-128309817))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-203224612))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1052664618))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-177361348))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1630529083))
                    }
                    else {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-339758133))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1833461590))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(745174318))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1701030289))
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-969115637))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1095447560))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1897992541))
                            var_11_E2 = and:int(ldc:int(1338), ldc:int(-1467))
                            goto(Label_1523)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(245111365))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1676719553))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(677568162))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-557096025))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1803268746))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(376891509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1512604768))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-829496753))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0800:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1592644427))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(649227521))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-742929428))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1419425904))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1365025363))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-87136373))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(18561), ldc:int(3))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-353295958))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-968609743))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-970846556))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1944779298))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(334503353))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1319456228))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1144030437))
                        var_11_E2 = and:int(ldc:int(-23236), ldc:int(2755))
                    }
                    
                    Label_1098:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-569096570))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1607816704))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(416701671))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1866764276))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(538429364))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-340023741))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-414981289))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1829508471))
                            goto(Label_1098)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1925870786))
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-315471731))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1253366517))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1493098086))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1898284513))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1523)
                    }
                    
                    Label_1374:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1150860294))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-76865982))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1299851995))
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1138452935))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-355714190))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-617291858))
                        loopcontinue()
                    }
                    
                    var_3_668 = and:int(var_3_668:int, ldc:int(-823249141))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1523:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_673 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1534:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(950990312))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(598457039))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-2035531100))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(31673960))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(512)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-69553321))
                        var_17_673 = add:int(var_16_110:int, and:int(ldc:int(4689), ldc:int(8453)))
                        looporswitchbreak()
                    }
                }
                
                var_3_668 = and:int(var_3_668:int, ldc:int(-1147224237))
                
                if (cmple:boolean(var_5_81 = var_17_673:int, sub:int(var_6_88:int, xor:int(ldc:int(520), ldc:int(521))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
