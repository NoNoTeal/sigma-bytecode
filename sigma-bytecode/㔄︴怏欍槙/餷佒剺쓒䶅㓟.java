public class \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4f52\u527a\uc4d2\u4d85\u34df {
    public void \u9937\u4f52\u527a\uc4d2\u4d85\u34df(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2 p7, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p8) {
        var_18_DC : int
        
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
            invokespecial:\u5f50\u6c52\u92ee\u62da\ubcb0\u8753(\u5f50\u6c52\u92ee\u62da\ubcb0\u8753::<init>, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            putfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, p4:double)
            putfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, p5:double)
            putfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, p6:double)
            putfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u64ab\u4bc8\ud12e\uae87\u5245\u76bc, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, p7:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2)
            putfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, ldc:int(8))
            
            if (cmpne:boolean(p8:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                putfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\uc31c\uc87f\uc246\u3776\ub7dc::\uff55\u40a9\u8753\u4975\u120d\u4daf, p8:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), and:int(ldc:int(-28060), ldc:int(27786))), ldc:int(10)))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ud158\u8308\u76bc\u0a06\ud36e::isEmpty, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)))) {
                    putfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, sub:int(mul:int(invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), and:int(ldc:int(2718), ldc:int(258))), and:int(ldc:int(27265), ldc:int(4097))))
                    var_18_DC = and:int(ldc:int(-30242), ldc:int(30241))
                    
                    while (cmplt:boolean(var_18_DC:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)))) {
                        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), var_18_DC:int), loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), and:int(ldc:int(22049), ldc:int(2305))))) {
                            putfield:boolean(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u6b5f\uff55\uc910\u4179\u7d52\u6c56, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, xor:int[expected:boolean](ldc:int(-31998), ldc:int(-31997)))
                            putfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, add:int(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:int(15)))
                            looporswitchbreak()
                        }
                        
                        inc:int(var_18_DC, ldc:int(1))
                    }
                }
                else {
                    putfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, aconstnull:\ud158\u8308\u76bc\u0a06\ud36e())
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_1887 : int
        var_1_179F : int
        var_3_332 : int
        var_1_685 : int
        var_4_36C : int
        var_5_463 : int
        var_6_4C3 : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_6FC_0 : \u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 [generated]
        stack_69F_0 : \u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 [generated]
        var_1_69E : int
        var_5_69F : \u6b0d\u3d64\u446c\u6cfe\u5f50\u9937
        var_1_ADB : int
        var_4_AE4 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_1_AEB : int
        var_5_AFF : \u8d98\u7330\u516c\u51fa\uc7fe\u839e
        var_1_B06 : int
        var_6_B17 : boolean
        var_1_B1E : int
        var_7_B2F : boolean
        var_1_B36 : int
        var_8_B47 : int[]
        var_1_B4E : int
        var_9_B5F : int[]
        expr_C8B : int[] [generated]
        expr_E1D : double [generated]
        expr_E22 : double[][] [generated]
        stack_E4A_1 : int [generated]
        expr_E34 : double[] [generated]
        stack_E74_1 : int [generated]
        expr_E5A : double[] [generated]
        stack_E9E_1 : int [generated]
        expr_E84 : double[] [generated]
        stack_EC8_1 : int [generated]
        expr_EAE : double[] [generated]
        stack_EF2_1 : int [generated]
        expr_ED8 : double[] [generated]
        stack_F1A_1 : int [generated]
        expr_F02 : double[] [generated]
        expr_FA0 : double [generated]
        expr_FA5 : double[][] [generated]
        stack_FCF_1 : int [generated]
        expr_FB7 : double[] [generated]
        stack_FF9_1 : int [generated]
        expr_FDF : double[] [generated]
        stack_1023_1 : int [generated]
        expr_1009 : double[] [generated]
        stack_104D_1 : int [generated]
        expr_1033 : double[] [generated]
        stack_1077_1 : int [generated]
        expr_105D : double[] [generated]
        stack_10A1_1 : int [generated]
        expr_1087 : double[] [generated]
        stack_10C4_1 : int [generated]
        expr_10AC : double[] [generated]
        stack_10E7_1 : int [generated]
        expr_10CF : double[] [generated]
        stack_110C_1 : int [generated]
        expr_10F2 : double[] [generated]
        stack_1131_1 : int [generated]
        expr_1117 : double[] [generated]
        stack_1156_1 : int [generated]
        expr_113C : double[] [generated]
        stack_1179_1 : int [generated]
        expr_1161 : double[] [generated]
        var_1_1259 : int
        var_10_1264 : int
        var_1_126B : int
        var_11_127A : float
        var_1_1281 : int
        var_12_1290 : float
        var_1_1297 : int
        var_13_12AF : float
        var_1_12B6 : int
        var_14_12D0 : \uff55\u97b7\u6fb0\u8308\u183a\u183a
        stack_17B3_0 : \u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 [generated]
        var_1_17B2 : int
        var_4_17B3 : \u6b0d\u3d64\u446c\u6cfe\u5f50\u9937
        
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
            var_1_1887 = and:int(ldc:int(689842733), ldc:int(1769913646))
            
            loop {
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-659603177))
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1780755214))
                    goto(Label_5420)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(576517021))
                    goto(Label_5025)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_2575)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(961998287))
                    goto(Label_2410)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_2042)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1844)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(70721926))
                    goto(Label_0442)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1025387451))
                    
                    if (cmpne:boolean(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:int(0))) {
                        goto(Label_1844)
                    }
                }
                
                Label_0253:
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1715840442))
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_5420)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(205156948))
                    goto(Label_5228)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1386861407))
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1392596645))
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(719331368))
                    goto(Label_2575)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1464333535))
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-578211104))
                    goto(Label_2042)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1844)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1496923113))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(313837668))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(668757439))
                    
                    if (cmpeq:boolean(getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), aconstnull:\ud158\u8308\u76bc\u0a06\ud36e())) {
                        goto(Label_1844)
                    }
                }
                
                Label_0442:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(520308043))
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-17700491))
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1697075698))
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1449846086))
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(525559227))
                    goto(Label_5025)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-905724861))
                    goto(Label_2575)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2410)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1901182760))
                    goto(Label_2223)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1147528997))
                    goto(Label_2042)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1507104831))
                    goto(Label_1844)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(30805993))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1048528326))
                        goto(Label_0253)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1954713993))
                }
                
                Label_0640:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(144662774))
                    goto(Label_5775)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-597732112))
                    goto(Label_5420)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2575)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-251610862))
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(25348831))
                    goto(Label_2042)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1788027465))
                    goto(Label_1844)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1390250522))
                    goto(Label_0442)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1453502392))
                    goto(Label_0253)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1664744154))
                    loopcontinue()
                }
                
                var_1_179F = and:int(var_1_1887:int, ldc:int(-585172893))
                var_3_332 = invokespecial:boolean[expected:int](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u8df4\u7e3f\u51fa\u5245\u4975\u6b5f, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)
                Label_0819:
                
                if (cmpeq:boolean(and:int(var_1_179F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_179F = and:int(var_1_179F:int, ldc:int(1041355386))
                    goto(Label_6021)
                }
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_179F = and:int(var_1_179F:int, ldc:int(-380225294))
                    goto(Label_5972)
                }
                
                if (cmpeq:boolean(and:int(var_1_179F:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_179F = and:int(var_1_179F:int, ldc:int(1907963397))
                    goto(Label_2744)
                }
                
                var_1_685 = and:int(var_1_179F:int, ldc:int(1532821108))
                var_4_36C = and:int(ldc:int(-9052), ldc:int(9050))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1094720838))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1021)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1864166588))
                        
                        if (cmplt:boolean(invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), xor:int(ldc:int(306), ldc:int(305)))) {
                            var_5_463 = and:int(ldc:int(-9902), ldc:int(9773))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_685 = and:int(var_1_685:int, ldc:int(108158451))
                                    goto(Label_1191)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_685:int, ldc:int(2048)), ldc:int(0))) {
                                    var_1_685 = and:int(var_1_685:int, ldc:int(-518096596))
                                    
                                    if (cmpge:boolean(var_5_463:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)))) {
                                        goto(Label_1424)
                                    }
                                }
                                
                                Label_1164:
                                
                                if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(32)), ldc:int(0))) {
                                        var_1_685 = and:int(var_1_685:int, ldc:int(-1884105303))
                                        loopcontinue()
                                    }
                                    
                                    var_1_685 = and:int(var_1_685:int, ldc:int(-908232259))
                                }
                                
                                Label_1191:
                                
                                if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_1164)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_685:int, ldc:int(1073741824)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_685 = and:int(var_1_685:int, ldc:int(-1852031876))
                                var_6_4C3 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), var_5_463:int)
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Label_1365)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_1306)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(2048)), ldc:int(0))) {
                                        var_1_685 = and:int(var_1_685:int, ldc:int(926805921))
                                        
                                        if (cmpne:boolean(invokestatic:\u8d98\u7330\u516c\u51fa\uc7fe\u839e(\u8d98\u7330\u516c\u51fa\uc7fe\u839e::\u5654\u8df4\u7330\uc3e3\u4c04\ua068, invokevirtual:byte(\uc31c\uc87f\uc246\u3776\ub7dc::\u74b1\u3d64\u7873\u6d69\ud12e\u99f7, var_6_4C3:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), xor:int(ldc:int(-24255), ldc:int(-24253))))), getstatic:\u8d98\u7330\u516c\u51fa\uc7fe\u839e(\u8d98\u7330\u516c\u51fa\uc7fe\u839e::\uae5d\ub18d\ua562\ubcb0\u3e75\uf995))) {
                                            inc:int(var_5_463, ldc:int(1))
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    Label_1272:
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_1365)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_1_685 = and:int(var_1_685:int, ldc:int(-1684258188))
                                            loopcontinue()
                                        }
                                        
                                        var_1_685 = and:int(var_1_685:int, ldc:int(-316920150))
                                    }
                                    
                                    Label_1306:
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_1_685 = and:int(var_1_685:int, ldc:int(881314033))
                                    }
                                    else {
                                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                                            var_1_685 = and:int(var_1_685:int, ldc:int(469440318))
                                            goto(Label_1272)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                                            var_1_685 = and:int(var_1_685:int, ldc:int(-1374918185))
                                            loopcontinue()
                                        }
                                        
                                        var_1_685 = and:int(var_1_685:int, ldc:int(-2055407001))
                                        var_4_36C = and:int(ldc:int(12289), ldc:int(417))
                                    }
                                    
                                    Label_1365:
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_1306)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_1_685 = and:int(var_1_685:int, ldc:int(927911956))
                                        goto(Label_1272)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_1_685 = and:int(var_1_685:int, ldc:int(-171970572))
                                        goto(Label_1424)
                                    }
                                    
                                    var_1_685 = and:int(var_1_685:int, ldc:int(1435657341))
                                }
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(32)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(743231336))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-833147043))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(769108875))
                            loopcontinue()
                        }
                        
                        var_1_685 = and:int(var_1_685:int, ldc:int(-1854063623))
                    }
                    
                    Label_1021:
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-856271148))
                        goto(Label_1708)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-71068444))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1627896342))
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-2061470055))
                        loopcontinue()
                    }
                    
                    var_1_685 = and:int(var_1_685:int, ldc:int(1266544611))
                    var_4_36C = xor:int(ldc:int(10560), ldc:int(10561))
                    Label_1424:
                    
                    if (cmpeq:boolean(var_4_36C:int, ldc:int(0))) {
                        if (cmpne:boolean(var_3_332:int, ldc:int(0))) {
                            goto(Label_1708)
                        }
                        
                        stack_6FC_0 = stack_69F_0 = getstatic(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6fb0\u4bc8\u3d64\u5140\u071d\uc229)
                        goto(Label_1776)
                    }
                    
                    Label_1429:
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-721238599))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1672486432))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(1861189552))
                            goto(Label_1021)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-1085980255))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_685 = and:int(var_1_685:int, ldc:int(492661103))
                    }
                    
                    Label_1508:
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1483474538))
                        goto(Label_1708)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1429)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(4096)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-1858909464))
                            goto(Label_1021)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(32)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-659098373))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(1630142375))
                            loopcontinue()
                        }
                        
                        var_1_685 = and:int(var_1_685:int, ldc:int(2136960572))
                        
                        if (cmpeq:boolean(var_3_332:int, ldc:int(0))) {
                            stack_6FC_0 = stack_69F_0 = getstatic(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc9f6\u51fa\uc3e3\ubb2b\u446c\u8c8a)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-1467314796))
                            goto(Label_1508)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(128)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-951360642))
                            goto(Label_1429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1021)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(1061518840))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_685 = and:int(var_1_685:int, ldc:int(-2083649993))
                            loopcontinue()
                        }
                        
                        var_1_685 = and:int(var_1_685:int, ldc:int(159268392))
                        stack_6FC_0 = stack_69F_0 = getstatic(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ud158\u5d20\u34df\u4c2b\u527a\ud12e)
                        looporswitchbreak()
                    }
                    
                    Label_1708:
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(-1327376630))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1021)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_685 = and:int(var_1_685:int, ldc:int(1300070321))
                        stack_6FC_0 = stack_69F_0 = getstatic(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u67e9\u97b7\uc9f6\u759a\ud158\u8bb0)
                        goto(Label_1776)
                    }
                }
                
                Label_1683:
                
                if (cmpne:boolean(and:int(var_1_685:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_69E = and:int(var_1_685:int, ldc:int(790396925))
                    var_5_69F = stack_69F_0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937
                    goto(Label_1790)
                }
                
                Label_1776:
                
                if (cmpeq:boolean(and:int(var_1_685:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1683)
                }
                
                var_1_69E = and:int(var_1_685:int, ldc:int(1092463022))
                var_5_69F = stack_6FC_0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937
                Label_1790:
                var_1_1887 = and:int(var_1_69E:int, ldc:int(935198008))
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), var_5_69F:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u0b8e\u8753\u8c8a\ud158\u4e72\u4f4a), ldc:float(20.0f), add:float(ldc:float(0.95f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:float(0.1f))), and:int[expected:boolean](ldc:int(1349), ldc:int(26627)))
                Label_1844:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1220645813))
                    goto(Label_5775)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(834406995))
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1420968709))
                    goto(Label_5025)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-905725101))
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2575)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(235134279))
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(817813501))
                    goto(Label_2223)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(645174833))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1076806888))
                        goto(Label_0442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(798763554))
                    
                    if (cmpne:boolean(rem:int(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), xor:int(ldc:int(-30192), ldc:int(-30190))), ldc:int(0))) {
                        goto(Label_4835)
                    }
                }
                
                Label_2042:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(2049046812))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(992722155))
                    goto(Label_4835)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2575)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-273358745))
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1973439185))
                        goto(Label_1844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1467370633))
                        goto(Label_0442)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1086463948))
                        goto(Label_0253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1841624156))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1161591153))
                    
                    if (cmpeq:boolean(getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), aconstnull:\ud158\u8308\u76bc\u0a06\ud36e())) {
                        goto(Label_4835)
                    }
                }
                
                Label_2223:
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1641836251))
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1007203806))
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_4835)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1162429902))
                    goto(Label_2575)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-44514107))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2042)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1844)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1952425595))
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0442)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1817836776))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(197097835))
                    
                    if (cmpge:boolean(div:int(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), and:int(ldc:int(514), ldc:int(20650))), invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)))) {
                        goto(Label_4835)
                    }
                }
                
                Label_2410:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(699218483))
                    goto(Label_5775)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(428477242))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-229034541))
                    goto(Label_4835)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(839625999))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_2042)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-652127897))
                        goto(Label_1844)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1993258259))
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-142824008))
                }
                
                Label_2575:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1260845549))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1436651117))
                    goto(Label_5228)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1694488355))
                    goto(Label_5025)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_4835)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_2042)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1844)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-511522164))
                    goto(Label_0442)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0253)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(142674755))
                    loopcontinue()
                }
                
                var_1_179F = and:int(var_1_1887:int, ldc:int(-2128744474))
                var_3_332 = div:int(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), xor:int(ldc:int(16418), ldc:int(16416)))
                Label_2744:
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_6021)
                }
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_179F = and:int(var_1_179F:int, ldc:int(964585768))
                    goto(Label_5972)
                }
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0819)
                }
                
                var_1_ADB = and:int(var_1_179F:int, ldc:int(-1960939863))
                var_4_AE4 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, getfield:\ud158\u8308\u76bc\u0a06\ud36e(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ua068\u9af2\ud7e8\ucb79\u62da\uff55, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), var_3_332:int)
                var_1_AEB = and:int(var_1_ADB:int, ldc:int(1744612593))
                var_5_AFF = invokestatic:\u8d98\u7330\u516c\u51fa\uc7fe\u839e(\u8d98\u7330\u516c\u51fa\uc7fe\u839e::\u5654\u8df4\u7330\uc3e3\u4c04\ua068, invokevirtual:byte[expected:int](\uc31c\uc87f\uc246\u3776\ub7dc::\u74b1\u3d64\u7873\u6d69\ud12e\u99f7, var_4_AE4:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), xor:int(ldc:int(2181), ldc:int(2183)))))
                var_1_B06 = and:int(var_1_AEB:int, ldc:int(-442501069))
                var_6_B17 = invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, var_4_AE4:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), xor:int(ldc:int(16483), ldc:int(16480))))
                var_1_B1E = and:int(var_1_B06:int, ldc:int(-14798987))
                var_7_B2F = invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, var_4_AE4:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), and:int(ldc:int(12803), ldc:int(1385))))
                var_1_B36 = and:int(var_1_B1E:int, ldc:int(222150317))
                var_8_B47 = invokevirtual:int[](\uc31c\uc87f\uc246\u3776\ub7dc::\u527a\ub18d\uc238\uf995\u7d52\uc7fe, var_4_AE4:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), and:int(ldc:int(4229), ldc:int(1046))))
                var_1_B4E = and:int(var_1_B36:int, ldc:int(89947064))
                var_9_B5F = invokevirtual:int[](\uc31c\uc87f\uc246\u3776\ub7dc::\u527a\ub18d\uc238\uf995\u7d52\uc7fe, var_4_AE4:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe), and:int(ldc:int(16389), ldc:int(8773))))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1746222894))
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_4492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(427857840))
                        goto(Label_3885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_3516)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1220862014))
                        goto(Label_3398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-834214264))
                        goto(Label_3230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1325128875))
                        goto(Label_3115)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(387738848))
                        
                        if (cmpne:boolean(arraylength:int(var_8_B47:int[]), ldc:int(0))) {
                            goto(Label_3230)
                        }
                    }
                    
                    Label_3026:
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(2059723878))
                        goto(Label_4492)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_3885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_3516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_3398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-987413695))
                        goto(Label_3230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(1609745114))
                            loopcontinue()
                        }
                        
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(2109566394))
                    }
                    
                    Label_3115:
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1892528533))
                        goto(Label_4492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_3885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1464981388))
                        goto(Label_3516)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-25061589))
                        goto(Label_3398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_3026)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1554121413))
                        expr_C8B = newarray:int[](int.class, xor:int(ldc:int(11008), ldc:int(11009)))
                        storeelement:int(expr_C8B:int[], and:int(ldc:int(1306), ldc:int(-1307)), invokevirtual:int(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\uc3e3\u983f\u4e72\u6fb0\u6c52\u4bc8, getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u965f\u7873\ub19c\u3d64\uc2bd\u99f7)))
                        var_8_B47 = expr_C8B:int[]
                    }
                    
                    Label_3230:
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_4609)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_4492)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-981578022))
                        goto(Label_3885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_3516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(32)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(985235445))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(2003702328))
                            goto(Label_3115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1330508751))
                            goto(Label_3026)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1994543698))
                        
                        switch (loadelement:int(getstatic:int[](\u62da\ub70c\u416d\u6435\uc31c\ub18d::\u6b0d\u3776\u5f50\uff55\u8bb0\u98a4), invokevirtual:int(Enum<E>::ordinal, var_5_AFF:\u8d98\u7330\u516c\u51fa\uc7fe\u839e[expected:Enum<\u8d98\u7330\u516c\u51fa\uc7fe\u839e>]))) {
                            default:
                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ubefe\u98a4\u8350\ube23\u7ce1\ucef1, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, ldc:double(0.25), and:int(ldc:int(14371), ldc:int(26)), var_8_B47:int[], var_9_B5F:int[], var_6_B17:boolean, var_7_B2F:boolean)
                                looporswitchbreak()
                            
                            case 2:
                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ubefe\u98a4\u8350\ube23\u7ce1\ucef1, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, ldc:double(0.5), xor:int(ldc:int(-16374), ldc:int(-16370)), var_8_B47:int[], var_9_B5F:int[], var_6_B17:boolean, var_7_B2F:boolean)
                                goto(Label_3516)
                            
                            case 3:
                                expr_E1D = ldc:double(0.5)
                                expr_E22 = newarray:double[][](double[].class, ldc:int(6))
                                stack_E4A_1 = and:int(ldc:int(-12443), ldc:int(8346))
                                expr_E34 = newarray:double[](double.class, xor:int(ldc:int(16528), ldc:int(16530)))
                                storeelement:double(expr_E34:double[], and:int(ldc:int(4142), ldc:int(-28719)), ldc:double(0.0))
                                storeelement:double(expr_E34:double[], xor:int(ldc:int(16592), ldc:int(16593)), ldc:double(1.0))
                                storeelement:double[](expr_E22:double[][], stack_E4A_1:int, expr_E34:double[])
                                stack_E74_1 = xor:int(ldc:int(1808), ldc:int(1809))
                                expr_E5A = newarray:double[](double.class, and:int(ldc:int(5410), ldc:int(6)))
                                storeelement:double(expr_E5A:double[], and:int(ldc:int(-28399), ldc:int(27878)), ldc:double(0.3455))
                                storeelement:double(expr_E5A:double[], xor:int(ldc:int(16397), ldc:int(16396)), ldc:double(0.309))
                                storeelement:double[](expr_E22:double[][], stack_E74_1:int, expr_E5A:double[])
                                stack_E9E_1 = xor:int(ldc:int(541), ldc:int(543))
                                expr_E84 = newarray:double[](double.class, xor:int(ldc:int(8705), ldc:int(8707)))
                                storeelement:double(expr_E84:double[], and:int(ldc:int(-11737), ldc:int(11736)), ldc:double(0.9511))
                                storeelement:double(expr_E84:double[], and:int(ldc:int(7909), ldc:int(265)), ldc:double(0.309))
                                storeelement:double[](expr_E22:double[][], stack_E9E_1:int, expr_E84:double[])
                                stack_EC8_1 = xor:int(ldc:int(64), ldc:int(67))
                                expr_EAE = newarray:double[](double.class, xor:int(ldc:int(161), ldc:int(163)))
                                storeelement:double(expr_EAE:double[], and:int(ldc:int(2363), ldc:int(-15740)), ldc:double(0.3795918367346939))
                                storeelement:double(expr_EAE:double[], and:int(ldc:int(5645), ldc:int(2337)), ldc:double(-0.12653061224489795))
                                storeelement:double[](expr_E22:double[][], stack_EC8_1:int, expr_EAE:double[])
                                stack_EF2_1 = and:int(ldc:int(8518), ldc:int(1045))
                                expr_ED8 = newarray:double[](double.class, xor:int(ldc:int(2464), ldc:int(2466)))
                                storeelement:double(expr_ED8:double[], and:int(ldc:int(17348), ldc:int(-19438)), ldc:double(0.6122448979591837))
                                storeelement:double(expr_ED8:double[], and:int(ldc:int(1), ldc:int(21607)), ldc:double(-0.8040816326530612))
                                storeelement:double[](expr_E22:double[][], stack_EF2_1:int, expr_ED8:double[])
                                stack_F1A_1 = and:int(ldc:int(8325), ldc:int(1045))
                                expr_F02 = newarray:double[](double.class, and:int(ldc:int(10242), ldc:int(1075)))
                                storeelement:double(expr_F02:double[], and:int(ldc:int(-10951), ldc:int(10950)), ldc:double(0.0))
                                storeelement:double(expr_F02:double[], xor:int(ldc:int(5504), ldc:int(5505)), ldc:double(-0.35918367346938773))
                                storeelement:double[](expr_E22:double[][], stack_F1A_1:int, expr_F02:double[])
                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u6cfe\u7006\u56bd\ub8be\u5f50\ub171, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, expr_E1D:double, expr_E22:double[][], var_8_B47:int[], var_9_B5F:int[], var_6_B17:boolean, var_7_B2F:boolean, and:int[expected:boolean](ldc:int(21040), ldc:int(-21041)))
                                goto(Label_3885)
                            
                            case 4:
                                expr_FA0 = ldc:double(0.5)
                                expr_FA5 = newarray:double[][](double[].class, ldc:int(12))
                                stack_FCF_1 = and:int(ldc:int(-30728), ldc:int(18439))
                                expr_FB7 = newarray:double[](double.class, xor:int(ldc:int(20499), ldc:int(20497)))
                                storeelement:double(expr_FB7:double[], and:int(ldc:int(12712), ldc:int(-13245)), ldc:double(0.0))
                                storeelement:double(expr_FB7:double[], and:int(ldc:int(3105), ldc:int(147)), ldc:double(0.2))
                                storeelement:double[](expr_FA5:double[][], stack_FCF_1:int, expr_FB7:double[])
                                stack_FF9_1 = and:int(ldc:int(4117), ldc:int(9505))
                                expr_FDF = newarray:double[](double.class, and:int(ldc:int(17507), ldc:int(394)))
                                storeelement:double(expr_FDF:double[], xor:int(ldc:int(10312), ldc:int(10313)), storeelement:double(expr_FDF:double[], and:int(ldc:int(10864), ldc:int(-27249)), ldc:double(0.2)))
                                storeelement:double[](expr_FA5:double[][], stack_FF9_1:int, expr_FDF:double[])
                                stack_1023_1 = xor:int(ldc:int(28675), ldc:int(28673))
                                expr_1009 = newarray:double[](double.class, and:int(ldc:int(19122), ldc:int(5134)))
                                storeelement:double(expr_1009:double[], and:int(ldc:int(8869), ldc:int(-8886)), ldc:double(0.2))
                                storeelement:double(expr_1009:double[], xor:int(ldc:int(4613), ldc:int(4612)), ldc:double(0.6))
                                storeelement:double[](expr_FA5:double[][], stack_1023_1:int, expr_1009:double[])
                                stack_104D_1 = and:int(ldc:int(1315), ldc:int(2639))
                                expr_1033 = newarray:double[](double.class, xor:int(ldc:int(3713), ldc:int(3715)))
                                storeelement:double(expr_1033:double[], and:int(ldc:int(13571), ldc:int(16929)), storeelement:double(expr_1033:double[], and:int(ldc:int(-15093), ldc:int(14964)), ldc:double(0.6)))
                                storeelement:double[](expr_FA5:double[][], stack_104D_1:int, expr_1033:double[])
                                stack_1077_1 = and:int(ldc:int(1670), ldc:int(30741))
                                expr_105D = newarray:double[](double.class, and:int(ldc:int(4099), ldc:int(18530)))
                                storeelement:double(expr_105D:double[], and:int(ldc:int(10020), ldc:int(-10022)), ldc:double(0.6))
                                storeelement:double(expr_105D:double[], xor:int(ldc:int(-31744), ldc:int(-31743)), ldc:double(0.2))
                                storeelement:double[](expr_FA5:double[][], stack_1077_1:int, expr_105D:double[])
                                stack_10A1_1 = and:int(ldc:int(8837), ldc:int(18479))
                                expr_1087 = newarray:double[](double.class, and:int(ldc:int(4359), ldc:int(10322)))
                                storeelement:double(expr_1087:double[], and:int(ldc:int(67), ldc:int(11453)), storeelement:double(expr_1087:double[], and:int(ldc:int(-24049), ldc:int(17888)), ldc:double(0.2)))
                                storeelement:double[](expr_FA5:double[][], stack_10A1_1:int, expr_1087:double[])
                                stack_10C4_1 = ldc:int(6)
                                expr_10AC = newarray:double[](double.class, and:int(ldc:int(16418), ldc:int(1862)))
                                storeelement:double(expr_10AC:double[], and:int(ldc:int(-18618), ldc:int(18616)), ldc:double(0.2))
                                storeelement:double(expr_10AC:double[], and:int(ldc:int(325), ldc:int(8195)), ldc:double(0.0))
                                storeelement:double[](expr_FA5:double[][], stack_10C4_1:int, expr_10AC:double[])
                                stack_10E7_1 = ldc:int(7)
                                expr_10CF = newarray:double[](double.class, and:int(ldc:int(86), ldc:int(4235)))
                                storeelement:double(expr_10CF:double[], and:int(ldc:int(-315), ldc:int(314)), ldc:double(0.4))
                                storeelement:double(expr_10CF:double[], xor:int(ldc:int(5633), ldc:int(5632)), ldc:double(0.0))
                                storeelement:double[](expr_FA5:double[][], stack_10E7_1:int, expr_10CF:double[])
                                stack_110C_1 = ldc:int(8)
                                expr_10F2 = newarray:double[](double.class, xor:int(ldc:int(0), ldc:int(2)))
                                storeelement:double(expr_10F2:double[], and:int(ldc:int(-12443), ldc:int(12442)), ldc:double(0.4))
                                storeelement:double(expr_10F2:double[], xor:int(ldc:int(-31612), ldc:int(-31611)), ldc:double(-0.6))
                                storeelement:double[](expr_FA5:double[][], stack_110C_1:int, expr_10F2:double[])
                                stack_1131_1 = ldc:int(9)
                                expr_1117 = newarray:double[](double.class, and:int(ldc:int(11), ldc:int(24770)))
                                storeelement:double(expr_1117:double[], and:int(ldc:int(-23214), ldc:int(23077)), ldc:double(0.2))
                                storeelement:double(expr_1117:double[], and:int(ldc:int(26721), ldc:int(1025)), ldc:double(-0.6))
                                storeelement:double[](expr_FA5:double[][], stack_1131_1:int, expr_1117:double[])
                                stack_1156_1 = ldc:int(10)
                                expr_113C = newarray:double[](double.class, xor:int(ldc:int(9252), ldc:int(9254)))
                                storeelement:double(expr_113C:double[], and:int(ldc:int(8305), ldc:int(-25202)), ldc:double(0.2))
                                storeelement:double(expr_113C:double[], xor:int(ldc:int(-32692), ldc:int(-32691)), ldc:double(-0.4))
                                storeelement:double[](expr_FA5:double[][], stack_1156_1:int, expr_113C:double[])
                                stack_1179_1 = ldc:int(11)
                                expr_1161 = newarray:double[](double.class, xor:int(ldc:int(18560), ldc:int(18562)))
                                storeelement:double(expr_1161:double[], and:int(ldc:int(12935), ldc:int(-13256)), ldc:double(0.0))
                                storeelement:double(expr_1161:double[], and:int(ldc:int(4517), ldc:int(2635)), ldc:double(-0.4))
                                storeelement:double[](expr_FA5:double[][], stack_1179_1:int, expr_1161:double[])
                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u6cfe\u7006\u56bd\ub8be\u5f50\ub171, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, expr_FA0:double, expr_FA5:double[][], var_8_B47:int[], var_9_B5F:int[], var_6_B17:boolean, var_7_B2F:boolean, and:int[expected:boolean](ldc:int(5537), ldc:int(8209)))
                                goto(Label_4492)
                            
                            case 5:
                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u1187\u62da\ub102\ucfaf\u67e9\u8bb0, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, var_8_B47:int[], var_9_B5F:int[], var_6_B17:boolean, var_7_B2F:boolean)
                                goto(Label_4609)
                        }
                    }
                    
                    Label_3398:
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1627941799))
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_4492)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_3885)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(128)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(477548924))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(1954346911))
                            goto(Label_3230)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_3115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_3026)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1625441474))
                            goto(Label_4609)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_3516:
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1676613810))
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1923524361))
                        goto(Label_4492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-687439309))
                            goto(Label_3398)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_3230)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_3115)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_3026)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-2095290311))
                            goto(Label_4609)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_3885:
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_4609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1843012503))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_3516)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(559635417))
                            goto(Label_3398)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_3230)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(722679125))
                            goto(Label_3115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(784757982))
                            goto(Label_3026)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(1271973830))
                            loopcontinue()
                        }
                        
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-277043093))
                        goto(Label_4609)
                    }
                    
                    Label_4492:
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(1812666562))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_3885)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(128)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1749292341))
                            goto(Label_3516)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_3398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_3230)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_3115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(-485504117))
                            goto(Label_3026)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_B4E = and:int(var_1_B4E:int, ldc:int(302685664))
                            loopcontinue()
                        }
                        
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-776147080))
                    }
                    
                    Label_4609:
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_4492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-658793837))
                        goto(Label_3885)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_3516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_B4E = and:int(var_1_B4E:int, ldc:int(-1110899273))
                        goto(Label_3398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_B4E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_3230)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_3115)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_3026)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_B4E:int, ldc:int(16777216)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_B4E = and:int(var_1_B4E:int, ldc:int(979909863))
                }
                
                var_1_1259 = and:int(var_1_B4E:int, ldc:int(-442618505))
                var_10_1264 = loadelement:int(var_8_B47:int[], and:int(ldc:int(18769), ldc:int(-18770)))
                var_1_126B = and:int(var_1_1259:int, ldc:int(1407151670))
                var_11_127A = div:float(i2f:float(shr:int(and:int(var_10_1264:int, ldc:int(16711680)), ldc:int(16))), ldc:float(255.0f))
                var_1_1281 = and:int(var_1_126B:int, ldc:int(870312884))
                var_12_1290 = div:float(i2f:float(shr:int(and:int(var_10_1264:int, ldc:int(65280)), ldc:int(8))), ldc:float(255.0f))
                var_1_1297 = and:int(var_1_1281:int, ldc:int(-71485132))
                var_13_12AF = div:float(i2f:float(shr:int(and:int(var_10_1264:int, xor:int(ldc:int(6477), ldc:int(6578))), and:int(ldc:int(21616), ldc:int(-21617)))), ldc:float(255.0f))
                var_1_12B6 = and:int(var_1_1297:int, ldc:int(729606199))
                var_14_12D0 = invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\uc2bd\ud217\u6198\u6d69\ub171\u760c, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u64ab\u4bc8\ud12e\uae87\u5245\u76bc, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\uc31c\u965f\u624e\u34df\u071d\uff55), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
                var_1_1887 = and:int(var_1_12B6:int, ldc:int(-1149486233))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, var_14_12D0:\uff55\u97b7\u6fb0\u8308\u183a\u183a, var_11_127A:float, var_12_1290:float, var_13_12AF:float)
                Label_4835:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-270758077))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-711571502))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_2575)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(377707135))
                        goto(Label_2410)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(228800957))
                        goto(Label_2223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1668210450))
                        goto(Label_2042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1424016294))
                        goto(Label_0253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1699957071))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1065172261))
                    putfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, add:int(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), and:int(ldc:int(4505), ldc:int(18433))))
                }
                
                Label_5025:
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(960774546))
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-415358720))
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-600011365))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_4835)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1973449772))
                        goto(Label_2575)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-648615042))
                        goto(Label_2410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1860385507))
                        goto(Label_2223)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_2042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-281703428))
                        goto(Label_1844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(19646786))
                        goto(Label_0442)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-112912576))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(467516641))
                    
                    if (cmple:boolean(getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u3504\u71f1\uae87\u8d98\u946b, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:int(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df))) {
                        looporswitchbreak()
                    }
                }
                
                Label_5228:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(18031523))
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-912631457))
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-268952090))
                    goto(Label_5601)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_5025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_4835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(242681864))
                        goto(Label_2575)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1450416524))
                        goto(Label_2410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_2223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-215560591))
                        goto(Label_1844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(816806303))
                        goto(Label_0640)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1320051059))
                        goto(Label_0442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1755927485))
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1409087786))
                }
                
                Label_5420:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-368893078))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1484440361))
                        goto(Label_5228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_5025)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(668547122))
                        goto(Label_4835)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(2035597127))
                        goto(Label_2575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1403993105))
                        goto(Label_2223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2042)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1144400704))
                        goto(Label_0442)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1451149439))
                        goto(Label_0253)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-371245380))
                    
                    if (logicalnot:boolean(getfield:boolean(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u6b5f\uff55\uc910\u4179\u7d52\u6c56, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df))) {
                        goto(Label_6124)
                    }
                }
                
                Label_5601:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1131571449))
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-863093087))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_5420)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(1727917535))
                        goto(Label_5228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_5025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_4835)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(979050550))
                        goto(Label_2575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1031713369))
                        goto(Label_2410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_2223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(2057672832))
                        goto(Label_2042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1844)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0640)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_1887 = and:int(var_1_1887:int, ldc:int(-1591945016))
                        goto(Label_0442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0253)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1654837573))
                }
                
                Label_5775:
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_6124)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1014750816))
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_5420)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-976442590))
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(544248366))
                    goto(Label_5025)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(108300446))
                    goto(Label_4835)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-185894998))
                    goto(Label_2575)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-442643199))
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(1413302556))
                    goto(Label_2042)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-434643164))
                    goto(Label_1844)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0442)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1479797189))
                    goto(Label_0253)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_179F = and:int(var_1_1887:int, ldc:int(-2093073798))
                var_3_332 = invokespecial:boolean[expected:int](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u8df4\u7e3f\u51fa\u5245\u4975\u6b5f, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)
                Label_5972:
                
                if (cmpeq:boolean(and:int(var_1_179F:int, ldc:int(32)), ldc:int(0))) {
                    var_1_179F = and:int(var_1_179F:int, ldc:int(2110648145))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_2744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_179F:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_179F = and:int(var_1_179F:int, ldc:int(798945477))
                        goto(Label_0819)
                    }
                    
                    var_1_179F = and:int(var_1_179F:int, ldc:int(662501880))
                    
                    if (cmpeq:boolean(var_3_332:int, ldc:int(0))) {
                        stack_17B3_0 = getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ub19c\u61a4\u385b\uc3e3\u6198\ufe34)
                        goto(Label_6061)
                    }
                }
                
                Label_6021:
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_5972)
                }
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2744)
                }
                
                if (cmpne:boolean(and:int(var_1_179F:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0819)
                }
                
                var_1_179F = and:int(var_1_179F:int, ldc:int(163412862))
                stack_17B3_0 = getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ube23\u120d\ubefe\ua562\u6b0d\u4e72)
                Label_6061:
                var_1_17B2 = and:int(var_1_179F:int, ldc:int(-239260243))
                var_4_17B3 = stack_17B3_0:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937
                var_1_1887 = and:int(var_1_17B2:int, ldc:int(-1317258822))
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), var_4_17B3:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u0b8e\u8753\u8c8a\ud158\u4e72\u4f4a), ldc:float(20.0f), add:float(ldc:float(0.9f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:float(0.15f))), and:int[expected:boolean](ldc:int(25089), ldc:int(193)))
                Label_6124:
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_5775)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1912100230))
                    goto(Label_5601)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(940236768))
                    goto(Label_5420)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-896417476))
                    goto(Label_5228)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_5025)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-911745053))
                    goto(Label_4835)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_2575)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_2410)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2223)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_2042)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1844)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0442)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0253)
                }
                
                if (cmpeq:boolean(and:int(var_1_1887:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_1887 = and:int(var_1_1887:int, ldc:int(-1923290756))
                    invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
                    looporswitchbreak()
                }
                
                var_1_1887 = and:int(var_1_1887:int, ldc:int(1709129003))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8df4\u7e3f\u51fa\u5245\u4975\u6b5f() {
        var_1_61 : int
        stack_A7_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(957669271), ldc:int(959765939))
            
            if (cmplt:boolean(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc87f\uc2e8\u7af6\u64ab\u718f\u6435, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(256.0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1766718970))
                stack_A7_0 = and:int(ldc:int(1870), ldc:int(-2015))
            }
            else {
                stack_A7_0 = and:int(ldc:int(263), ldc:int(7313))
            }
            
            return:boolean(stack_A7_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u7873\u8cae\u0b8e\u6cfe\u7043\u8d90(double p0, double p1, double p2, double p3, double p4, double p5, int[] p6, int[] p7, boolean p8, boolean p9) {
        var_19_7C : \ua068\u1187\u600f\u6435\u4d85\uae87
        
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
            var_19_7C = checkcast:\ua068\u1187\u600f\u6435\u4d85\uae87(\u3504\ufe34\u600f\u6b0d\u69d9.\ua068\u1187\u600f\u6435\u4d85\uae87.class, invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a[expected:\ua068\u1187\u600f\u6435\u4d85\uae87](\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\uc2bd\ud217\u6198\u6d69\ub171\u760c, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u64ab\u4bc8\ud12e\uae87\u5245\u76bc, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u8c8a\u8aa5\u34df\u36d3\u3504\u4492), p0:double, p1:double, p2:double, p3:double, p4:double, p5:double))
            invokevirtual:void(\ua068\u1187\u600f\u6435\u4d85\uae87::\u4975\u8c8a\u99f7\u76bc\u51fa\u8389, var_19_7C:\ua068\u1187\u600f\u6435\u4d85\uae87, p8:boolean)
            invokevirtual:void(\ua068\u1187\u600f\u6435\u4d85\uae87::\u6435\u8389\ub32d\u0b8e\ubcb0\u5f50, var_19_7C:\ua068\u1187\u600f\u6435\u4d85\uae87, p9:boolean)
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u392e\u8308\u97b7\u6bb9\u92ff\u873d, var_19_7C:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.99f))
            invokevirtual:void(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, var_19_7C:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe], loadelement:int(p6:int[], invokevirtual:int(Random::nextInt, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), arraylength:int(p6:int[]))))
            
            if (cmpgt:boolean(arraylength:int(p7:int[]), ldc:int(0))) {
                invokevirtual:void(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::\u51fa\uc238\u8d98\u8258\u3e75\ud7e8, var_19_7C:\ua068\u1187\u600f\u6435\u4d85\uae87[expected:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe], invokestatic:int(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u7330\u6b5f\u71f1\ub70c\u9937\ubb2b, p7:int[], getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubefe\u98a4\u8350\ube23\u7ce1\ucef1(double p0, int p1, int[] p2, int[] p3, boolean p4, boolean p5) {
        var_8_ED : int
        var_10_69 : double
        var_12_6F : double
        var_14_75 : double
        var_16_79 : int
        var_17_A8 : int
        var_18_DD : int
        var_19_131 : double
        var_21_14A : double
        var_23_163 : double
        var_25_188 : double
        
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
            var_8_ED = and:int(ldc:int(-1480487276), ldc:int(-1756123427))
            var_10_69 = getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)
            var_12_6F = getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)
            var_14_75 = getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)
            var_16_79 = neg:int(p1:int)
            
            loop {
                if (cmpne:boolean(and:int(var_8_ED:int, ldc:int(16777216)), ldc:int(0))) {
                    var_8_ED = and:int(var_8_ED:int, ldc:int(-746608898))
                    
                    if (cmple:boolean(var_16_79:int, p1:int)) {
                        var_17_A8 = neg:int(p1:int)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_8_ED:int, ldc:int(4)), ldc:int(0))) {
                                var_8_ED = and:int(var_8_ED:int, ldc:int(-1143748866))
                                
                                if (cmple:boolean(var_17_A8:int, p1:int)) {
                                    var_18_DD = neg:int(p1:int)
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_8_ED:int, ldc:int(32)), ldc:int(0))) {
                                            var_8_ED = and:int(var_8_ED:int, ldc:int(-9726305))
                                            
                                            if (cmple:boolean(var_18_DD:int, p1:int)) {
                                                var_19_131 = add:double(i2d:double(var_17_A8:int), mul:double(sub:double(invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df))), ldc:double(0.5)))
                                                var_21_14A = add:double(i2d:double(var_16_79:int), mul:double(sub:double(invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df))), ldc:double(0.5)))
                                                var_23_163 = add:double(i2d:double(var_18_DD:int), mul:double(sub:double(invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df))), ldc:double(0.5)))
                                                var_25_188 = add:double(div:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(add:double(mul:double(var_19_131:double, var_19_131:double), mul:double(var_21_14A:double, var_21_14A:double)), mul:double(var_23_163:double, var_23_163:double)))), p0:double), mul:double(invokevirtual:double(Random::nextGaussian, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.05)))
                                                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u8cae\u0b8e\u6cfe\u7043\u8d90, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, var_10_69:double, var_12_6F:double, var_14_75:double, div:double(var_19_131:double, var_25_188:double), div:double(var_21_14A:double, var_25_188:double), div:double(var_23_163:double, var_25_188:double), p2:int[], p3:int[], p4:boolean, p5:boolean)
                                                
                                                if (cmpne:boolean(var_16_79:int, neg:int(p1:int))) {
                                                    if (cmpne:boolean(var_16_79:int, p1:int)) {
                                                        if (cmpne:boolean(var_17_A8:int, neg:int(p1:int))) {
                                                            if (cmpne:boolean(var_17_A8:int, p1:int)) {
                                                                var_18_DD = add:int(var_18_DD:int, sub:int(mul:int(p1:int, xor:int(ldc:int(2080), ldc:int(2082))), xor:int(ldc:int(-32604), ldc:int(-32603))))
                                                            }
                                                        }
                                                    }
                                                }
                                                
                                                var_8_ED = and:int(var_8_ED:int, ldc:int(-604645444))
                                                inc:int(var_18_DD, ldc:int(1))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_8_ED:int, ldc:int(16777216)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_8_ED = and:int(var_8_ED:int, ldc:int(-794168952))
                                    }
                                    
                                    var_8_ED = and:int(var_8_ED:int, ldc:int(-268851212))
                                    inc:int(var_17_A8, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_8_ED:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_8_ED = and:int(var_8_ED:int, ldc:int(-1083590763))
                        inc:int(var_16_79, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_8_ED:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6cfe\u7006\u56bd\ub8be\u5f50\ub171(double p0, double[][] p1, int[] p2, int[] p3, boolean p4, boolean p5, boolean p6) {
        var_9_63 : int
        var_11_76 : double
        var_13_89 : double
        var_15_B7 : float
        stack_DB_0 : double [generated]
        var_9_216 : int
        var_16_DB : double
        var_18_E4 : int
        var_19_133 : double
        var_21_137 : double
        var_23_13B : double
        var_25_144 : int
        var_26_18E : double
        var_28_19C : double
        var_30_1A1 : double
        var_32_1E8 : double
        var_34_1F5 : double
        var_36_1FF : double
        var_32_209 : double
        var_38_20E : double
        
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
            var_9_63 = and:int(ldc:int(1620911015), ldc:int(-1148362065))
            var_11_76 = loadelement:double(loadelement:double[](p1:double[][], and:int(ldc:int(1817), ldc:int(-1882))), and:int(ldc:int(-20591), ldc:int(20526)))
            var_13_89 = loadelement:double(loadelement:double[](p1:double[][], and:int(ldc:int(5397), ldc:int(-7606))), and:int(ldc:int(16523), ldc:int(5185)))
            invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u8cae\u0b8e\u6cfe\u7043\u8d90, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), mul:double(var_11_76:double, p0:double), mul:double(var_13_89:double, p0:double), ldc:double(0.0), p2:int[], p3:int[], p4:boolean, p5:boolean)
            var_15_B7 = mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:float(3.1415927f))
            
            if (logicalnot:boolean(p6:boolean)) {
                var_9_63 = and:int(var_9_63:int, ldc:int(-358776858))
                stack_DB_0 = ldc:double(0.34)
            }
            else {
                stack_DB_0 = ldc:double(0.034)
            }
            
            var_9_216 = and:int(var_9_63:int, ldc:int(-2083920721))
            var_16_DB = stack_DB_0:double
            var_18_E4 = and:int(ldc:int(-3521), ldc:int(3520))
            
            loop {
                if (cmpeq:boolean(and:int(var_9_216:int, ldc:int(131072)), ldc:int(0))) {
                    var_9_216 = and:int(var_9_216:int, ldc:int(2076960147))
                    
                    if (cmplt:boolean(var_18_E4:int, xor:int(ldc:int(-15295), ldc:int(-15294)))) {
                        var_19_133 = add:double(f2d:double(var_15_B7:float), mul:double(f2d:double(mul:float(i2f:float(var_18_E4:int), ldc:float(3.1415927f))), var_16_DB:double))
                        var_21_137 = var_11_76:double
                        var_23_13B = var_13_89:double
                        var_25_144 = xor:int(ldc:int(1037), ldc:int(1036))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_9_216:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_9_216 = and:int(var_9_216:int, ldc:int(1166456935))
                            }
                            else {
                                var_9_216 = and:int(var_9_216:int, ldc:int(-408994084))
                                
                                if (cmplt:boolean(var_25_144:int, arraylength:int(p1:double[][]))) {
                                    var_26_18E = loadelement:double(loadelement:double[](p1:double[][], var_25_144:int), and:int(ldc:int(-2267), ldc:int(2266)))
                                    var_28_19C = loadelement:double(loadelement:double[](p1:double[][], var_25_144:int), xor:int(ldc:int(576), ldc:int(577)))
                                    var_30_1A1 = ldc:double(0.25)
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_9_216:int, ldc:int(65536)), ldc:int(0))) {
                                            var_9_216 = and:int(var_9_216:int, ldc:int(1503391154))
                                            
                                            if (cmple:boolean(var_30_1A1:double, ldc:double(1.0))) {
                                                var_32_1E8 = mul:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, var_30_1A1:double, var_21_137:double, var_26_18E:double), p0:double)
                                                var_34_1F5 = mul:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, var_30_1A1:double, var_23_13B:double, var_28_19C:double), p0:double)
                                                var_36_1FF = mul:double(var_32_1E8:double, invokestatic:double(Math::sin, var_19_133:double))
                                                var_32_209 = mul:double(var_32_1E8:double, invokestatic:double(Math::cos, var_19_133:double))
                                                var_38_20E = ldc:double(-1.0)
                                                
                                                loop {
                                                    var_9_216 = and:int(var_9_216:int, ldc:int(1996187083))
                                                    
                                                    if (cmpgt:boolean(var_38_20E:double, ldc:double(1.0))) {
                                                        looporswitchbreak()
                                                    }
                                                    
                                                    invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u8cae\u0b8e\u6cfe\u7043\u8d90, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), mul:double(var_32_209:double, var_38_20E:double), var_34_1F5:double, mul:double(var_36_1FF:double, var_38_20E:double), p2:int[], p3:int[], p4:boolean, p5:boolean)
                                                    var_38_20E = add:double(var_38_20E:double, ldc:double(2.0))
                                                }
                                                
                                                var_9_216 = and:int(var_9_216:int, ldc:int(-1280492059))
                                                var_30_1A1 = add:double(var_30_1A1:double, ldc:double(0.25))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_9_216:int, ldc:int(524288)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    var_9_216 = and:int(var_9_216:int, ldc:int(11526611))
                                    var_21_137 = var_26_18E:double
                                    var_23_13B = var_28_19C:double
                                    inc:int(var_25_144, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_9_216:int, ldc:int(2147483647)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_9_216 = and:int(var_9_216:int, ldc:int(-879120508))
                        inc:int(var_18_E4, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_9_216:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_9_216 = and:int(var_9_216:int, ldc:int(-272881765))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u1187\u62da\ub102\ucfaf\u67e9\u8bb0(int[] p0, int[] p1, boolean p2, boolean p3) {
        var_5_63 : int
        var_7_70 : double
        var_9_7D : double
        var_11_86 : int
        
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
            var_5_63 = and:int(ldc:int(-1229112980), ldc:int(-321144033))
            var_7_70 = mul:double(invokevirtual:double(Random::nextGaussian, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.05))
            var_9_7D = mul:double(invokevirtual:double(Random::nextGaussian, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.05))
            var_11_86 = and:int(ldc:int(-31732), ldc:int(10608))
            
            loop {
                var_5_63 = and:int(var_5_63:int, ldc:int(-1801488517))
                
                if (cmpge:boolean(var_11_86:int, ldc:int(70))) {
                    looporswitchbreak()
                }
                
                invokespecial:void(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7873\u8cae\u0b8e\u6cfe\u7043\u8d90, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df, getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), add:double(add:double(mul:double(getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:double(0.5)), mul:double(invokevirtual:double(Random::nextGaussian, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.15))), var_7_70:double), add:double(mul:double(getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:double(0.5)), mul:double(invokevirtual:double(Random::nextDouble, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.5))), add:double(add:double(mul:double(getfield:double(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df), ldc:double(0.5)), mul:double(invokevirtual:double(Random::nextGaussian, getfield:Random(\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df)), ldc:double(0.15))), var_9_7D:double), p0:int[], p1:int[], p2:boolean, p3:boolean)
                inc:int(var_11_86, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_7F : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_236_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2CF_0 : byte[] [generated]
        stack_355_0 : byte[] [generated]
        var_4_218 : int
        var_3_21D : byte[]
        var_5_21E : int
        var_0_2E8 : int
        expr_2CF : byte [generated]
        stack_320_2 : byte [generated]
        stack_2F4_0 : byte [generated]
        var_2_AD : byte[]
        expr_B1 : int [generated]
        var_3_25F : byte[]
        var_5_260 : int
        expr_DF : int [generated]
        expr_10E : int [generated]
        var_3_343 : byte[]
        var_5_344 : int
        expr_355 : byte [generated]
        var_3_157 : String
        stack_211_0 : String[] [generated]
        expr_169 : String[] [generated]
        
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
        var_0_7F = and:int(ldc:int(-1718087958), ldc:int(534503421))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_DD_0 = stack_DF_0 = stack_10C_0 = stack_10E_0 = stack_14B_0 = stack_236_0 = stack_271_0 = stack_2CF_0 = stack_355_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("n8Soea6YiruYg5+QnHKWkY2emJqfxKl9lo+FuZmgh6yWiKF4p6mTvpeSoA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_218 = expr_6E:int
        var_3_21D = newarray:byte[](byte.class, expr_6E:int)
        var_5_21E = expr_6E:int
        Label_0544:
        
        while (cmpne:boolean(and:int(var_0_7F:int, ldc:int(32)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(502562812))
            var_5_21E = add:int(var_5_21E:int, ldc:int(-1))
            storeelement:byte(var_3_21D:byte[], var_5_21E:int, add:byte(loadelement:byte(stack_236_0:byte[], var_5_21E:int), ldc:byte(112)))
            
            if (cmpne:boolean(var_5_21E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DD_0 = stack_DF_0 = stack_10C_0 = stack_10E_0 = stack_14B_0 = stack_236_0 = stack_271_0 = stack_2CF_0 = stack_355_0 = var_3_21D:byte[]
            goto(Label_0115)
        }
        
        Label_0696:
        
        while (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(16)), ldc:int(0))) {
            var_0_2E8 = and:int(var_0_7F:int, ldc:int(465100520))
            var_5_21E = add:int(var_5_21E:int, ldc:int(-1))
            expr_2CF = stack_320_2 = loadelement(stack_2CF_0, var_5_21E)
            
            if (cmplt:boolean(add:int(add:int(var_5_21E:int, ldc:int(4)), neg:int(var_4_218:int)), ldc:int(0))) {
                stack_320_2 = stack_2F4_0 = add:byte(expr_2CF:byte, loadelement:byte(var_3_21D:byte[], add:int(var_5_21E:int, ldc:int(4))))
                goto(Label_0772)
            }
            
            Label_0732:
            
            if (cmpeq:boolean(and:int(var_0_2E8:int, ldc:int(32)), ldc:int(0))) {
                var_0_2E8 = and:int(var_0_2E8:int, ldc:int(-1897029230))
            }
            else {
                var_0_2E8 = and:int(var_0_2E8:int, ldc:int(-422560021))
                stack_320_2 = stack_2F4_0 = add:byte(expr_2CF:byte, ldc:byte(4))
            }
            
            Label_0772:
            
            if (cmpne:boolean(and:int(var_0_2E8:int, ldc:int(131072)), ldc:int(0))) {
                var_0_2E8 = and:int(var_0_2E8:int, ldc:int(1882769949))
                goto(Label_0732)
            }
            
            var_0_7F = and:int(var_0_2E8:int, ldc:int(2059058937))
            storeelement:byte(var_3_21D:byte[], var_5_21E:int, stack_320_2:byte)
            
            if (cmpne:boolean(var_5_21E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DD_0 = stack_DF_0 = stack_10C_0 = stack_10E_0 = stack_14B_0 = stack_236_0 = stack_271_0 = stack_2CF_0 = stack_355_0 = var_3_21D:byte[]
            goto(Label_0228)
        }
        
        goto(Label_0544)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-2017784590))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(16)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(1512939081))
            goto(Label_0228)
        }
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(64)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-238340061))
        }
        else {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-2049667329))
            var_2_AD = stack_AD_0:byte[]
            expr_B1 = add:int(arraylength:int(stack_AF_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B1:int, ldc:int(0))) {
                var_3_25F = newarray:byte[](byte.class, expr_B1:int)
                var_5_260 = expr_B1:int
                
                loop {
                    var_0_7F = and:int(var_0_7F:int, ldc:int(1258086398))
                    var_5_260 = add:int(var_5_260:int, ldc:int(-1))
                    storeelement:byte(var_3_25F:byte[], var_5_260:int, add:int(shl:int(loadelement:byte(stack_271_0:byte[], var_5_260:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_AD:byte[], add:int(var_5_260:int, and:int(ldc:int(29403), ldc:int(1061)))), ldc:int(4)), and:int(ldc:int(20783), ldc:int(2143)))))
                    
                    if (cmpne:boolean(var_5_260:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DD_0 = stack_DF_0 = stack_10C_0 = stack_10E_0 = stack_14B_0 = stack_236_0 = stack_271_0 = stack_2CF_0 = stack_355_0 = var_3_25F:byte[]
            }
        }
        
        Label_0182:
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(305177118))
        }
        else {
            if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_7F = and:int(var_0_7F:int, ldc:int(966201327))
            expr_DF = arraylength:int(stack_DF_0:byte[])
            
            if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                var_4_218 = expr_DF:int
                var_3_21D = newarray:byte[](byte.class, expr_DF:int)
                var_5_21E = expr_DF:int
                goto(Label_0696)
            }
        }
        
        Label_0228:
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(64)), ldc:int(0))) {
                var_0_7F = and:int(var_0_7F:int, ldc:int(1922965814))
                goto(Label_0182)
            }
            
            if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_7F = and:int(var_0_7F:int, ldc:int(970485502))
            expr_10E = arraylength:int(stack_10E_0:byte[])
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_343 = newarray:byte[](byte.class, expr_10E:int)
                var_5_344 = expr_10E:int
                
                loop {
                    var_0_7F = and:int(var_0_7F:int, ldc:int(513765113))
                    var_5_344 = add:int(var_5_344:int, ldc:int(-1))
                    expr_355 = loadelement:byte(stack_355_0:byte[], var_5_344:int)
                    storeelement:byte(var_3_343:byte[], var_5_344:int, xor:int(or:int(and:int(shl:int(expr_355:byte, xor:int(ldc:int(6183), ldc:int(6179))), ldc:int(-16)), and:int(shr:int(expr_355:byte[expected:int], xor:int(ldc:int(10243), ldc:int(10247))), ldc:int(15))), ldc:int(55)))
                    
                    if (cmpne:boolean(var_5_344:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DD_0 = stack_DF_0 = stack_10C_0 = stack_10E_0 = stack_14B_0 = stack_236_0 = stack_271_0 = stack_2CF_0 = stack_355_0 = var_3_343:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(131072)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(2097589461))
            goto(Label_0228)
        }
        
        if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(639914020))
            goto(Label_0182)
        }
        
        if (cmpne:boolean(and:int(var_0_7F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_7F = and:int(var_0_7F:int, ldc:int(-1109910236))
            goto(Label_0115)
        }
        
        var_3_157 = initobject:String(String::<init>, stack_14B_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_211_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31725), ldc:int(-31723)))
        expr_169 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21022), ldc:int(8486)))
        storeelement:String(expr_169:String[], and:int(ldc:int(1060), ldc:int(2116)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(27010), ldc:int(-31115)), xor:int(ldc:int(-24051), ldc:int(-24053))))
        storeelement:String(expr_169:String[], and:int(ldc:int(-9761), ldc:int(9760)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(-32379), ldc:int(-32381)), and:int(ldc:int(16656), ldc:int(12305))))
        storeelement:String(expr_169:String[], and:int(ldc:int(517), ldc:int(463)), invokevirtual:String[expected:String](String::substring, var_3_157:String, xor:int(ldc:int(-32735), ldc:int(-32719)), and:int(ldc:int(12827), ldc:int(94))))
        storeelement:String(expr_169:String[], and:int(ldc:int(15395), ldc:int(17)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(27), ldc:int(17946)), and:int(ldc:int(6817), ldc:int(16679))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(-24552), ldc:int(-24549)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(18721), ldc:int(12331)), xor:int(ldc:int(-16380), ldc:int(-16350))))
        storeelement:String(expr_169:String[], xor:int(ldc:int(2436), ldc:int(2438)), invokevirtual:String[expected:String](String::substring, var_3_157:String, and:int(ldc:int(17958), ldc:int(8558)), xor:int(ldc:int(-32701), ldc:int(-32663))))
        putstatic:String[](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::\uc229\u5d20\u965f\u873d\u71ae\ud4fe, expr_169:String[])
    }
    
    public void \u8c8a\u5140\ub8be\u760c\u7af6\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_638 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_643 : int
        
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
        var_3_638 = and:int(ldc:int(55193581), ldc:int(576929502))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\u4f52\u527a\uc4d2\u4d85\u34df[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(2136386540))
            var_5_81 = and:int(ldc:int(9884), ldc:int(-26269))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3613), ldc:int(3612)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_638:int, ldc:int(-1353449894))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, xor:int(ldc:int(12864), ldc:int(12865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(2628), ldc:int(2629)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_638 = and:int(var_3_D9:int, ldc:int(-1772142833))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-14328), ldc:int(-14327)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1384269038))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(61390686))
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1879855315))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0540)
                            }
                            
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1361298766))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-769345595))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1060965739))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-539312199))
                            var_11_EA = and:int(ldc:int(4566), ldc:int(-4567))
                            goto(Label_1483)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0540:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1527004665))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1560674263))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1207232298))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1248800923))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1300846055))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1788344076))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1864493037))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1270543021))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-659420748))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1644048108))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-958662362))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1219347512))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0808:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1646893112))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(119980300))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1758365016))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(458003735))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1363413892))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1771869604))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = and:int(ldc:int(25), ldc:int(519))
                                goto(Label_1093)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-609667825))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1340263911))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1944254051))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(351431453))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-674874850))
                        var_11_EA = and:int(ldc:int(29057), ldc:int(-31150))
                    }
                    
                    Label_1093:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-547382811))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1925368163))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(136104918))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1858749197))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-519739013))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(709045769))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1219:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(834944994))
                            goto(Label_1093)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-562648489))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-388935776))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-326934271))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(847386532))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(851671693))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                            goto(Label_1483)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2100337006))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(345867822))
                        goto(Label_0388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-805858265))
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-278975958))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1483:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_643 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(210117481))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1835075537))
                        goto(Label_0540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(512)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-671416693))
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1697928231))
                        var_17_643 = add:int(var_16_118:int, and:int(ldc:int(10247), ldc:int(1297)))
                        looporswitchbreak()
                    }
                }
                
                var_3_638 = and:int(var_3_638:int, ldc:int(-1008043428))
                
                if (cmple:boolean(var_5_81 = var_17_643:int, sub:int(var_6_88:int, xor:int(ldc:int(-32176), ldc:int(-32175))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(828005813))
            goto(Label_0108)
        }
    }
}
