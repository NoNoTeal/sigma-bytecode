public interface \u12b2\u7049\u8df4\uc9f6\uae87.\u92ee\u8640\u7330\ud158\u52d3 {
    int \uc229\u5d20\u67e9\u718f\uc238\u4e72();
    
    boolean \u7873\uc4d2\u6b5f\u1187\u4cd9\u99f7(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_5F : int
        var_4_68 : float
        var_5_78 : float
        var_6_B2 : boolean
        
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
            var_2_5F = and:int(ldc:int(-1921188627), ldc:int(-1350708755))
            var_4_68 = d2f:float(invokevirtual:double(\ube23\u67d0\u64f2\u839e\u76bc::\ucb79\ud171\u8640\ub8be\u92ee\u7330, p0:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\u839e\u62da\u51fa\u071d\u1833\u7006)))
            
            if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u527a\u34df\u4bc8\ub8be\u965f\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc)), cmpgt:boolean(f2i:int(var_4_68:float), ldc:int(0)))) {
                var_5_78 = add:float(div:float(var_4_68:float, ldc:float(2.0f)), i2f:float(invokevirtual:int(Random::nextInt, getfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc)), f2i:int(var_4_68:float))))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1880162914))
                var_5_78 = var_4_68:float
            }
            
            var_6_B2 = invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u3504\u52d3\u5fe1\uf995\u3e75\u4492, p1:\ube23\u67d0\u64f2\u839e\u76bc, invokestatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8709\u2dcc\u8d90\u392e\u9033\u6ec6, p0:\ube23\u67d0\u64f2\u839e\u76bc), var_5_78:float)
            
            if (var_6_B2:boolean) {
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ucfaf\u3c25\u3d4b\u983f\u9af2\uc4d2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                
                if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u527a\u34df\u4bc8\ub8be\u965f\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                    invokestatic:void(\u92ee\u8640\u7330\ud158\u52d3::\u4179\uc84e\u6b0d\u98a4\ub171\u52d3, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc)
                }
            }
            
            return:boolean(var_6_B2:boolean)
        }
        
        goto(Label_0006)
    }
    
    void \u4179\uc84e\u6b0d\u98a4\ub171\u52d3(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_8_77 : double
        var_17_E1 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        
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
            var_8_77 = sub:double(invokevirtual:double(\ube23\u67d0\u64f2\u839e\u76bc::\ucb79\ud171\u8640\ub8be\u92ee\u7330, p0:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\u7e3f\u0c95\ub171\u836c\ua61f\u183a)), invokevirtual:double(\ube23\u67d0\u64f2\u839e\u76bc::\ucb79\ud171\u8640\ub8be\u92ee\u7330, p1:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\uc910\ud523\u3a62\u6b0d\ud171\u6fb0)))
            
            if (cmpgt:boolean(var_8_77:double, ldc:double(0.0))) {
                var_17_E1 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6ec6\u4daf\ub19c\u3bd6\u6c52\u3711, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), ldc:double(0.0), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))), mul:double(var_8_77:double, f2d:double(add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc))), ldc:float(0.5f)), ldc:float(0.2f))))), i2f:float(sub:int(invokevirtual:int(Random::nextInt, getfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc)), ldc:int(21)), ldc:int(10))))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\ucef1\u88c5\ud158\u4f52\u36d3, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_17_E1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(mul:double(var_8_77:double, f2d:double(invokevirtual:float(Random::nextFloat, getfield:Random(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc))))), ldc:double(0.5)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_17_E1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
                putfield:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ufe34\u8350\ud12e\ub102\u92ff\u1187, p1:\ube23\u67d0\u64f2\u839e\u76bc, xor:int[expected:boolean](ldc:int(-32757), ldc:int(-32758)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
