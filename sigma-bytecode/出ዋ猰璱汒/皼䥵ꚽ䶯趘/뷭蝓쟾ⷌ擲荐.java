public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ubded\u8753\uc7fe\u2dcc\u64f2\u8350 {
    public void \ubded\u8753\uc7fe\u2dcc\u64f2\u8350() {
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
            invokespecial:\u76bc\uc910\u3dd3\uae5d\uc910\ub113(\u76bc\uc910\u3dd3\uae5d\uc910\ub113::<init>, this:\ubded\u8753\uc7fe\u2dcc\u64f2\u8350, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5db4\u9937\u3d64\u2dcc\u40a9::\ud12e\u51fa\u4cd9\u56bd\ub171\u7043))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b \uc31c\u0800\u62da\u7d52\ud7e8\u67e9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
        var_2_64 : int
        var_4_68 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1
        var_2_6E : int
        var_5_77 : \u74b1\u59ec\u2dcc\u8413\u8c8a
        var_6_84 : InputStream
        var_7_87 : Throwable
        var_8_DE : Throwable
        var_11_103 : Throwable
        var_6_11F : IOException
        
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
        var_2_64 = and:int(and:int(ldc:int(2010400868), ldc:int(-2015823379)), ldc:int(-1513824267))
        var_4_68 = invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)
        var_2_6E = and:int(var_2_64:int, ldc:int(375352438))
        var_5_77 = invokevirtual:\u74b1\u59ec\u2dcc\u8413\u8c8a(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u759a\u97b7\u4c04\u5140\ub6ab\u8cae, invokevirtual:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ua6bd\u183a\u983f\u5bc4\ud523\u5140, var_4_68:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        
        try {
            var_2_6E = and:int(var_2_6E:int, ldc:int(-598062211))
            var_6_84 = invokestatic:InputStream(\ubded\u8753\uc7fe\u2dcc\u64f2\u8350::\u5140\u3e75\u3c25\u97e6\u647c\ub7dc, p0:\u6c52\u52d3\u516c\uae87\uae5d, var_5_77:\u74b1\u59ec\u2dcc\u8413\u8c8a)
            var_7_87 = aconstnull:Throwable()
            
            try {
                return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(initobject:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\ud12e\u97b7\u760c\u76bc\u1187\ubb2b::<init>, initobject:\uceb8\u960f\u9937\u494c\uf94d\ufcaf(\uceb8\u960f\u9937\u494c\uf94d\ufcaf::<init>, xor:int[expected:boolean](ldc:int(-24536), ldc:int(-24535)), and:int[expected:boolean](ldc:int(19521), ldc:int(563))), invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u3c25\u647c\u7006\u4e72\u9937\u385b, var_6_84:InputStream)))
            }
            catch (java.lang.Throwable var_8_DE) {
                var_7_87 = var_8_DE:Throwable
                athrow(var_8_DE:Throwable)
            }
            finally {
                if (cmpne:boolean(var_6_84:InputStream, aconstnull:InputStream())) {
                    if (cmpne:boolean(var_7_87:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(InputStream::close, var_6_84:InputStream)
                        }
                        catch (java.lang.Throwable var_11_103) {
                            invokevirtual:void(Throwable::addSuppressed, var_7_87:Throwable, var_11_103:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(InputStream::close, var_6_84:InputStream)
                    }
                }
            }
        }
        catch (java.io.IOException var_6_11F) {
            return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(initobject:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\ud12e\u97b7\u760c\u76bc\u1187\ubb2b::<init>, var_6_11F:IOException))
        }
    }
    
    private static java.io.InputStream \u5140\u3e75\u3c25\u97e6\u647c\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a p1) {
        var_2_5F : int
        stack_95_0 : InputStream [generated]
        
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
            var_2_5F = and:int(ldc:int(-1618781492), ldc:int(-1108453490))
            
            if (logicalnot:boolean(invokeinterface:boolean(\u6c52\u52d3\u516c\uae87\uae5d::\u3a62\u47c2\ua3b4\ub83f\ud523\u7049, p0:\u6c52\u52d3\u516c\uae87\uae5d, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5db4\u9937\u3d64\u2dcc\u40a9::\ud12e\u51fa\u4cd9\u56bd\ub171\u7043)))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1922374114))
                stack_95_0 = invokevirtual:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc4d2\ubb2b\ufe34\u960f\u6435\u600f, p1:\u74b1\u59ec\u2dcc\u8413\u8c8a, getstatic:\u983f\u6c56\u6bb9\u927d\u965f(\u983f\u6c56\u6bb9\u927d\u965f::\u071d\ud12e\u8d98\u8308\u5d20\u7e3f), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5db4\u9937\u3d64\u2dcc\u40a9::\ud12e\u51fa\u4cd9\u56bd\ub171\u7043))
            }
            else {
                stack_95_0 = invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, p0:\u6c52\u52d3\u516c\uae87\uae5d, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u5db4\u9937\u3d64\u2dcc\u40a9::\ud12e\u51fa\u4cd9\u56bd\ub171\u7043)))
            }
            
            return:InputStream(stack_95_0:InputStream)
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u6d99\u7043\u93a2\u416d\u9af2\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EA : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5F5 : int
        
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
        var_3_5EA = and:int(ldc:int(150701807), ldc:int(1060894395))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u8753\uc7fe\u2dcc\u64f2\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(128)), ldc:int(0))) {
            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1440666136))
        }
        else {
            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1536569011))
            var_5_85 = and:int(ldc:int(17688), ldc:int(-17689))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3914), ldc:int(-8043)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5EA:int, ldc:int(-1963041113))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(403), ldc:int(37)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2055), ldc:int(5217)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5EA = and:int(var_3_DA:int, ldc:int(-1722374157))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-31984), ldc:int(-31983)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-254875962))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1295880244))
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1131180369))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1878702225))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(366343846))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(983768871))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1045121476))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-69314589))
                            var_11_EB = and:int(ldc:int(-26870), ldc:int(26864))
                            goto(Label_1408)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(830632894))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1353139633))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(597977833))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-336601819))
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1443386813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-919956852))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(981787642))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1595293363))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1927744115))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(518942432))
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-273870561))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-818830490))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1458163585))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-399253845))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1264171213))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1616866334))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(629369740))
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1867287083))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(318316152))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1021306559))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(16386), ldc:int(16387))
                                goto(Label_1054)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(809628089))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1261098175))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-273594735))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1765461747))
                        var_11_EB = and:int(ldc:int(-24877), ldc:int(24876))
                    }
                    
                    Label_1054:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1695473294))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(1759451699))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-324918714))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(388043114))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1605791671))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1298)
                            }
                        }
                    }
                    
                    Label_1171:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1543258409))
                            goto(Label_1054)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(211980861))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1083506393))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EA = and:int(var_3_5EA:int, ldc:int(142514805))
                            loopcontinue()
                        }
                        
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1682016285))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1408)
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1003787393))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(35939147))
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5EA = and:int(var_3_5EA:int, ldc:int(-1093439517))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1408:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F5 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1419:
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-2094791615))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(2014962665))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(-690056079))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EA = and:int(var_3_5EA:int, ldc:int(1335049903))
                        var_17_5F5 = add:int(var_16_119:int, and:int(ldc:int(513), ldc:int(5285)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5EA = and:int(var_3_5EA:int, ldc:int(1751003047))
                
                if (cmple:boolean(var_5_85 = var_17_5F5:int, sub:int(var_6_8C:int, and:int(ldc:int(67), ldc:int(2313))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5EA:int, ldc:int(512)), ldc:int(0))) {
            var_3_5EA = and:int(var_3_5EA:int, ldc:int(243350135))
            goto(Label_0106)
        }
    }
}
