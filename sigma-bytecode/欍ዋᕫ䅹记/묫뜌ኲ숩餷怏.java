public final class \u6b0d\u12cb\u156b\u4179\u8bb0.\ubb2b\ub70c\u12b2\uc229\u9937\u600f {
    public void \ubb2b\ub70c\u12b2\uc229\u9937\u600f() {
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
            invokespecial:Object(Object::<init>, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u3bc9\u9255\u8709\u3711\u5db4\uc7fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p2) {
        var_6_7A : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_96 : double
        
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
        var_6_7A = ternaryop:\u7d52\u718f\u3776\u6fb0\ub83f(cmpeq:boolean(p2:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua6bd\ub6ab\uae5d\u9a18\u6d69\u4e72, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), p2:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
        
        if (cmpeq:boolean(var_6_7A:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
            return:float(ldc:float(0.0f))
        }
        
        if (cmpeq:boolean(p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
            if (instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_6_7A:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                p1 = checkcast:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_6_7A:\u7d52\u718f\u3776\u6fb0\ub83f))
            }
        }
        
        if (cmpne:boolean(p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
            if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u446c\u8350\ub171\u5245\u59ec\ua562, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))) {
                var_7_96 = invokestatic:double(Math::random)
            }
            else {
                var_7_96 = f2d:double(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85], ldc:float(1.0f)))
            }
            
            return:float(d2f:float(invokespecial:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u16f6\u4c2b\u6d69\u8258\ufe34\u9af2, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f, p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_7_96:double)))
        }
        
        return:float(ldc:float(0.0f))
    }
    
    private double \u16f6\u4c2b\u6d69\u8258\ufe34\u9af2(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, double p1) {
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
            
            if (cmpne:boolean(invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), getfield:long(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u0800\ud36e\u385b\u93a2\u8bb0\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f))) {
                putfield:long(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u0800\ud36e\u385b\u93a2\u8bb0\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f, invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))
                putfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u7043\u839e\u47c2\u4bc8\u7006\u494c, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f, add:double(getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u7043\u839e\u47c2\u4bc8\u7006\u494c, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f), mul:double(sub:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u92ee\u9937\ub1b9\uc229\uc9f6\ud523, add:double(sub:double(p1:double, getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\uf995\u4e72\ud4fe\u839e\u9033\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f)), ldc:double(0.5)), ldc:double(1.0)), ldc:double(0.5)), ldc:double(0.1))))
                putfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u7043\u839e\u47c2\u4bc8\u7006\u494c, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f, mul:double(getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u7043\u839e\u47c2\u4bc8\u7006\u494c, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f), ldc:double(0.9)))
                putfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\uf995\u4e72\ud4fe\u839e\u9033\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u92ee\u9937\ub1b9\uc229\uc9f6\ud523, add:double(getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\uf995\u4e72\ud4fe\u839e\u9033\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f), getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\u7043\u839e\u47c2\u4bc8\u7006\u494c, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f)), ldc:double(1.0)))
            }
            
            return:double(getfield:double(\ubb2b\ub70c\u12b2\uc229\u9937\u600f::\uf995\u4e72\ud4fe\u839e\u9033\u9033, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f))
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
    
    public void \u59ec\u494c\uc246\u8d90\u759a\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(264235835), ldc:int(-742695105))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\ub70c\u12b2\uc229\u9937\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(529859028))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(868187443))
            var_5_85 = and:int(ldc:int(-31371), ldc:int(30850))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13315), ldc:int(-15368)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(-1682245445))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(17), ldc:int(4391)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16417), ldc:int(5127)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(603642935))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1809), ldc:int(20675)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1085193678))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(354377993))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(269223060))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1275175301))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1525502829))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-619525645))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1562766220))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-992075075))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1488125567))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1661076814))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-278391190))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1673194291))
                        var_11_E3 = and:int(ldc:int(6405), ldc:int(-6406))
                        goto(Label_1439)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-825302330))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-552732090))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1995605882))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(259566519))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-756823521))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(202548442))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1682248393))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-906559918))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-73956879))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(134105403))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1501834622))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1176917293))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(871073511))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(2121045180))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2084872517))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(11266), ldc:int(11267))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(946989257))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1802493917))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-276353914))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-176545821))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-675781407))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1476324415))
                        var_11_E3 = and:int(ldc:int(4736), ldc:int(-4737))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1378691550))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1996999942))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-171105096))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1590786827))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1946232577))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1354312964))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1231300302))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-646876680))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1505078422))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-172645410))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2012999167))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1439)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-331144704))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-110586117))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-215025106))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(537344909))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1953300805))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(359843426))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(335506043))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1929824395))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1272672595))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(413136224))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1271404128))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1691250663))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1274998207))
                        var_17_628 = add:int(var_16_111:int, xor:int(ldc:int(16386), ldc:int(16387)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-1006998597))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, and:int(ldc:int(24977), ldc:int(4137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
