public final class \u927d\u92ff\u71ae\uafe7\u6bb9.\u494c\u6b0d\u494c\u4975\u8753\u8709 {
    public void \u494c\u6b0d\u494c\u4975\u8753\u8709(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52 p0) {
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
            invokespecial:Object(Object::<init>, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)
            putfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, p0:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \ua068\u873d\ucef1\u3e2a\u446c\u74b1(\u3d64\u7af6\uae87\uc238\u7d52.\u3711\u34df\ubded\u3d64\u494c\u6198 p0, long p1) {
        var_4_61 : int
        var_6_A5 : long
        
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
        var_4_61 = and:int(ldc:int(-2127836822), ldc:int(1669548506))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1713397932))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1447179612))
                
                if (cmpeq:boolean(getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\u5bc4\uc246\u59ec\u494c\uc7fe, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), ldc:int(0))) {
                    invokeinterface:void(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u516c\u16f6\uff55\u56bd\u6cfe\u67e9, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), i2l:long(getfield:short[expected:int](\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\uf94d\u624e\u600f\u7bad\u3a62, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)))
                    putfield:short(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\uf94d\u624e\u600f\u7bad\u3a62, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, and:int[expected:short](ldc:int(-1993), ldc:int(1864)))
                    
                    if (cmpeq:boolean(and:int(getfield:byte[expected:int](\u494c\u6b0d\u494c\u4975\u8753\u8709::\u9033\u6cfe\u2dcc\u3504\u8d98\u98a4, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), and:int(ldc:int(12326), ldc:int(2068))), ldc:int(0))) {
                        var_4_61 = and:int(var_4_61:int, ldc:int(1732632548))
                        invokespecial:void(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u9255\u6d99\u1833\u51b2\u9af2\ub171, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)
                        loopcontinue()
                    }
                    
                    return:long(ldc:long(-1L))
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                var_6_A5 = invokeinterface:long(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\ua068\u873d\ucef1\u3e2a\u446c\u74b1, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52[expected:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1](\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), p0:\u3711\u34df\ubded\u3d64\u494c\u6198, invokestatic:long(Math::min, p1:long, i2l:long(getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\u5bc4\uc246\u59ec\u494c\uc7fe, this:\u494c\u6b0d\u494c\u4975\u8753\u8709))))
                
                if (cmpne:boolean(var_6_A5:long, ldc:long(-1L))) {
                    putfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\u5bc4\uc246\u59ec\u494c\uc7fe, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, l2i:int(sub:long(i2l:long(getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\u5bc4\uc246\u59ec\u494c\uc7fe, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)), var_6_A5:long)))
                    return:long(var_6_A5:long)
                }
                
                return:long(ldc:long(-1L))
            }
        }
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
            return:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(invokeinterface:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1::\u3e2a\ub32d\uc29a\ub83f\u9937\u927d, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52[expected:\ua068\u5d20\ubf56\ubcb0\u4f52\u72f1](\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9255\u6d99\u1833\u51b2\u9af2\ub171() {
        var_1_B6 : int
        var_3_64 : int
        expr_6B : int [generated]
        var_4_87 : byte
        stack_13C_0 : String [generated]
        expr_12B : Object[] [generated]
        
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
        var_1_B6 = and:int(ldc:int(1520366645), ldc:int(982378377))
        var_3_64 = getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8389\ud217\u36d3\uc9f6\u8258\u51b2, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)
        expr_6B = invokestatic:int(\u7043\ubf56\ubded\ufcaf\ud158\u3711::\u4e72\u71f1\u8c8a\u4179\u7c6b\ube23, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709))
        putfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u72f1\u5bc4\uc246\u59ec\u494c\uc7fe, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, expr_6B:int)
        putfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\ub19c\u5654\u59ec\u8308\uceb8\u34df, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, expr_6B:int)
        var_4_87 = i2b:byte(and:int(invokeinterface:byte[expected:int](\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u8258\u92ff\u36d3\u8709\u836c\ube23, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)), and:int(ldc:int(5375), ldc:int(255))))
        putfield:byte(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u9033\u6cfe\u2dcc\u3504\u8d98\u98a4, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, i2b:byte(and:int(invokeinterface:byte[expected:int](\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\u8258\u92ff\u36d3\u8709\u836c\ube23, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)), xor:int(ldc:int(4529), ldc:int(4430)))))
        
        if (invokevirtual:boolean(Logger::isLoggable, getstatic:Logger(\u7043\ubf56\ubded\ufcaf\ud158\u3711::\u47c2\u6198\ufcaf\ub70c\u8413\uc2bd), getstatic:Level(Level::FINE))) {
            invokevirtual:void(Logger::fine, getstatic:Logger(\u7043\ubf56\ubded\ufcaf\ud158\u3711::\u47c2\u6198\ufcaf\ub70c\u8413\uc2bd), invokestatic:String(\ub32d\ua068\u4daf\u4975\ufe34\ub1b9::\u6cfe\ubb2b\u416d\u446c\u3d64\ub18d, and:int[expected:boolean](ldc:int(4617), ldc:int(8225)), getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8389\ud217\u36d3\uc9f6\u8258\u51b2, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\ub19c\u5654\u59ec\u8308\uceb8\u34df, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), var_4_87:byte, getfield:byte(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u9033\u6cfe\u2dcc\u3504\u8d98\u98a4, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_B6:int, ldc:int(524288)), ldc:int(0))) {
                var_1_B6 = and:int(var_1_B6:int, ldc:int(512601345))
                putfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8389\ud217\u36d3\uc9f6\u8258\u51b2, this:\u494c\u6b0d\u494c\u4975\u8753\u8709, and:int(invokeinterface:int(\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52::\uc7fe\ucfaf\u983f\u2dcc\u61a4\uc7fe, getfield:\u6b5f\uc2bd\ud171\u3bd6\ub70c\u4f52(\u494c\u6b0d\u494c\u4975\u8753\u8709::\uc3e3\u92ff\u34df\u3c25\u8c8a\u16f6, this:\u494c\u6b0d\u494c\u4975\u8753\u8709)), ldc:int(2147483647)))
                
                if (cmpne:boolean(var_4_87:byte, ldc:byte(9))) {
                    stack_13C_0 = loadelement:String(getstatic:String[](\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8d98\u0b8e\u718f\u5d20\u12cb\ud523), and:int(ldc:int(-24037), ldc:int(21732)))
                    expr_12B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2109), ldc:int(13123)))
                    storeelement:Object(expr_12B:Object[], and:int(ldc:int(-25840), ldc:int(1263)), invokestatic:Byte[expected:Object](Byte::valueOf, var_4_87:byte))
                    athrow(invokestatic:IOException(\ub32d\ua068\u4daf\u4975\ufe34\ub1b9::\uae87\ufe34\uf9c5\u4d85\u36d3\ubb2b, stack_13C_0:String, expr_12B:Object[]))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_B6:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_B6 = and:int(var_1_B6:int, ldc:int(106929998))
            }
            else {
                if (cmpeq:boolean(getfield:int(\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8389\ud217\u36d3\uc9f6\u8258\u51b2, this:\u494c\u6b0d\u494c\u4975\u8753\u8709), var_3_64:int)) {
                    return:void()
                }
                
                athrow(invokestatic:IOException(\ub32d\ua068\u4daf\u4975\ufe34\ub1b9::\uae87\ufe34\uf9c5\u4d85\u36d3\ubb2b, loadelement:String(getstatic:String[](\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8d98\u0b8e\u718f\u5d20\u12cb\ud523), and:int(ldc:int(291), ldc:int(9305))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-13634), ldc:int(13633)))))
            }
        }
    }
    
    static {
        var_0_1D8 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_19B_0 : byte[] [generated]
        stack_1F1_0 : byte[] [generated]
        stack_287_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_209 : int
        expr_1F1 : byte [generated]
        stack_235_2 : byte [generated]
        stack_20C_0 : byte [generated]
        expr_287 : byte [generated]
        expr_8E : int [generated]
        expr_C1 : int [generated]
        var_2_E2 : byte[]
        expr_E6 : int [generated]
        var_3_2C6 : byte[]
        var_5_2C7 : int
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
        var_0_1D8 = and:int(ldc:int(-1189206849), ldc:int(995040319))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_19B_0 = stack_1F1_0 = stack_287_0 = stack_2D7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("1MYkbErIihRAZE56enAWJIRAiigkdnB2FEBkTnp6cBYkhECKKCR20A54fEZ4ejpa+KqIFIwkfCZgJQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0461)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1502588543))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, xor:byte(add:byte(loadelement:byte(stack_19B_0:byte[], var_5_17D:int), ldc:byte(48)), ldc:byte(82)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_19B_0 = stack_1F1_0 = stack_287_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0603)
        Label_0461:
        
        while (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            var_0_209 = and:int(var_0_1D8:int, ldc:int(998121471))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_1F1 = stack_235_2 = loadelement(stack_1F1_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(1)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_235_2 = stack_20C_0 = add:byte(expr_1F1:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(1))))
                goto(Label_0540)
            }
            
            Label_0510:
            
            if (cmpne:boolean(and:int(var_0_209:int, ldc:int(1024)), ldc:int(0))) {
                var_0_209 = and:int(var_0_209:int, ldc:int(2032059487))
                stack_235_2 = stack_20C_0 = add:byte(expr_1F1:byte, ldc:byte(1))
            }
            
            Label_0540:
            
            if (cmpeq:boolean(and:int(var_0_209:int, ldc:int(16)), ldc:int(0))) {
                var_0_209 = and:int(var_0_209:int, ldc:int(-772434862))
                goto(Label_0510)
            }
            
            var_0_1D8 = and:int(var_0_209:int, ldc:int(-541188161))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_235_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_19B_0 = stack_1F1_0 = stack_287_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0147)
        }
        
        var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-2119807172))
        Label_0603:
        
        while (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(524288)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1450739423))
                goto(Label_0383)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-109163457))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_287 = loadelement:byte(stack_287_0:byte[], var_5_17D:int)
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, or:int(and:int(shl:int(expr_287:byte, xor:int(ldc:int(24640), ldc:int(24644))), ldc:int(-16)), and:int(shr:int(expr_287:byte[expected:int], and:int(ldc:int(10628), ldc:int(1061))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_19B_0 = stack_1F1_0 = stack_287_0 = stack_2D7_0 = var_3_17C:byte[]
            goto(Label_0198)
        }
        
        var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1267262809))
        goto(Label_0461)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(16)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-547445441))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_177 = expr_8E:int
                var_3_17C = newarray:byte[](byte.class, expr_8E:int)
                var_5_17D = expr_8E:int
                goto(Label_0461)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1458296885))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1741275466))
                goto(Label_0112)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1006529919))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_177 = expr_C1:int
                var_3_17C = newarray:byte[](byte.class, expr_C1:int)
                var_5_17D = expr_C1:int
                goto(Label_0603)
            }
        }
        
        Label_0198:
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1028537855))
            var_2_E2 = stack_E2_0:byte[]
            expr_E6 = add:int(arraylength:int(stack_E4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_2C6 = newarray:byte[](byte.class, expr_E6:int)
                var_5_2C7 = expr_E6:int
                
                loop {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(522128671))
                    var_5_2C7 = add:int(var_5_2C7:int, ldc:int(-1))
                    storeelement:byte(var_3_2C6:byte[], var_5_2C7:int, add:int(shl:int(loadelement:byte(stack_2D7_0:byte[], var_5_2C7:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_E2:byte[], add:int(var_5_2C7:int, xor:int(ldc:int(-27136), ldc:int(-27135)))), ldc:int(5)), xor:int(ldc:int(3078), ldc:int(3073)))))
                    
                    if (cmpne:boolean(var_5_2C7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_116_0 = stack_19B_0 = stack_1F1_0 = stack_287_0 = stack_2D7_0 = var_3_2C6:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1021793617))
            goto(Label_0147)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(4)), ldc:int(0))) {
            var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1592204413))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_170_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8201), ldc:int(8203)))
        expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32763), ldc:int(-32761)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-22355), ldc:int(22288)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-25853), ldc:int(24692)), and:int(ldc:int(23), ldc:int(7575))))
        storeelement:String(expr_134:String[], xor:int(ldc:int(8320), ldc:int(8321)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(16663), ldc:int(151)), xor:int(ldc:int(785), ldc:int(808))))
        putstatic:String[](\u494c\u6b0d\u494c\u4975\u8753\u8709::\u8d98\u0b8e\u718f\u5d20\u12cb\ud523, expr_134:String[])
    }
    
    public void \u72f1\u7af6\ua61f\u416d\u6d69\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CB : double
        var_3_DD : int
        var_11_EE : int
        var_14_118 : double
        var_16_11C : int
        var_12_114 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(-2044665427), ldc:int(-142683185))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\u6b0d\u494c\u4975\u8753\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(2098714450))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(1680930765))
            var_5_85 = and:int(ldc:int(8261), ldc:int(-8262))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13353), ldc:int(-13354)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DD = and:int(var_3_654:int, ldc:int(-1623996531))
                    var_9_CB = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EE = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EE:int, sub:int(var_6_8C:int, and:int(ldc:int(28825), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EE:int, xor:int(ldc:int(2464), ldc:int(2465)))), var_7_9B:double))) {
                        inc:int(var_11_EE, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_DD:int, ldc:int(-1110002242))
                    var_14_118 = var_7_9B:double
                    var_16_11C = var_11_EE:int
                }
                else {
                    var_11_EE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(12291), ldc:int(12290)))
                    var_12_114 = var_14_118 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11C = var_11_EE:int, var_6_8C:int)) {
                        var_9_CB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EE:int)
                        var_16_11C = var_11_EE:int
                        var_14_118 = var_12_114:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1388880260))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-837892663))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(161488012))
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(591920540))
                        
                        if (cmplt:boolean(var_16_11C:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0539)
                            }
                            
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-182029199))
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1395814630))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1399879762))
                            var_11_EE = and:int(ldc:int(17500), ldc:int(-21598))
                            goto(Label_1511)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0539:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(2037435628))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(181786237))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1278970477))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1990950919))
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-859620025))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1140506031))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_118 = var_9_CB:double
                            goto(Label_0798)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-471408516))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1479938921))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(59454450))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2038879219))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(323263374))
                        var_14_118 = mul:double(ldc:double(0.5), add:double(var_9_CB:double, var_14_118:double))
                    }
                    
                    Label_0798:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-531749753))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1604861674))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-638023789))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-347694062))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(400920988))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EE = and:int(ldc:int(17239), ldc:int(2049))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0917:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(603536608))
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(621820803))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1952210380))
                            goto(Label_0798)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1316501483))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1286148800))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1866867780))
                        var_11_EE = and:int(ldc:int(-29747), ldc:int(29746))
                    }
                    
                    Label_1080:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1833831886))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-860484468))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(77310374))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-145334002))
                            goto(Label_0917)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1534982434))
                            goto(Label_0798)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-713384289))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(859210842))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2128573956))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                                goto(Label_1379)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2145078902))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1080)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1795547061))
                            goto(Label_0917)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-794717503))
                            goto(Label_0798)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1440745687))
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(122448738))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1872256970))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-407264275))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_118:double, var_5_85:int, var_16_11C:int)
                        goto(Label_1511)
                    }
                    
                    Label_1379:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(54833546))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1485351566))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1268683))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(871225333))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-1941910019))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_118:double, ldc:double(0.0))
                    Label_1511:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1522:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-662737805))
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-621270409))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0798)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1756581441))
                        var_17_65F = add:int(var_16_11C:int, xor:int(ldc:int(68), ldc:int(69)))
                        looporswitchbreak()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-18255280))
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-1317929523))
                
                if (cmple:boolean(var_5_85 = var_17_65F:int, sub:int(var_6_8C:int, xor:int(ldc:int(10240), ldc:int(10241))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(492635999))
            goto(Label_0106)
        }
    }
}
