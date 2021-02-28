public class \u56bd\u8413\u647c\u5bc4\ud158.\u6fb0\ubded\u624e\ufcaf\ubb2b {
    public void \u6fb0\ubded\u624e\ufcaf\ubb2b(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<? extends \u56bd\u8413\u647c\u5bc4\ud158.\u6fb0\ubded\u624e\ufcaf\ubb2b> p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1) {
        var_5_8D : int
        
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
            invokespecial:\u62da\u64f2\u6c56\u0a06\u7af6(\u62da\u64f2\u6c56\u0a06\u7af6::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, p0:\u9255\u0c95\u4cd9\ube23\u760c<? extends \u6fb0\ubded\u624e\ufcaf\ubb2b>, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)
            putfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\uf9c5\u8350\uc3e3\ub18d\uae87\u983f, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, xor:int(ldc:int(554), ldc:int(559)))
            putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, multianewarray:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][].class, and:int(ldc:int(194), ldc:int(10498)), and:int(ldc:int(15767), ldc:int(68))))
            var_5_8D = and:int(ldc:int(9769), ldc:int(-9770))
            
            while (cmplt:boolean(var_5_8D:int, and:int(ldc:int(18966), ldc:int(1220)))) {
                storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(-29572), ldc:int(25475))), var_5_8D:int, getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd))
                storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(2056), ldc:int(2057))), var_5_8D:int, getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd))
                inc:int(var_5_8D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u4daf\u5f50\u47c2\ubded\uae87() {
        stack_14A_0 : \u93a2\ucfaf\u965f\u965f\uae5d [generated]
        stack_14A_1 : int [generated]
        expr_12C : Class[] [generated]
        
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
            invokespecial:void(\ucef1\u4daf\u71f1\ub32d\u0a06::\u5fe1\u4daf\u5f50\u47c2\ubded\uae87, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\ucef1\u4daf\u71f1\ub32d\u0a06])
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(9268), ldc:int(-28472)), initobject:\u4975\u6d69\u5d20\u69d9\u7e3f[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u4975\u6d69\u5d20\u69d9\u7e3f::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(528), ldc:int(529)), initobject:\uc4d2\u3776\u4f4a\ucb79\u156b[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\uc4d2\u3776\u4f4a\ucb79\u156b::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u62da\u64f2\u6c56\u0a06\u7af6]))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(-28633), ldc:int(-28637)), initobject:\u8d90\u927d\u9255\u6c56\uc910[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u8d90\u927d\u9255\u6c56\uc910::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, aconstnull:\ud523\u7ce1\u7c6b\uc87f\u40a9()))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(8237), ldc:int(855)), initobject:\u3e75\uc3e3\uc29a\u7049\u51fa[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u3e75\uc3e3\uc29a\u7049\u51fa::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, aconstnull:\ud523\u7ce1\u7c6b\uc87f\u40a9()))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(6), initobject:\u76bc\u4e72\u759a\u7006\u5bc4<Object>[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u76bc\u4e72\u759a\u7006\u5bc4<?>::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:?], ldc:double(0.5), ldc:int(20), ldc:float(15.0f)))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(8), initobject:\u3bd6\uc238\u5f50\uc9f6\ud171[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u3bd6\uc238\u5f50\uc9f6\ud171::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4c2b\ub8be\u839e\u71ae\uf9c5], ldc:double(0.6)))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(9), initobject:\u4179\u8258\ufe34\u3d64\u4f4a[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u4179\u8258\ufe34\u3d64\u4f4a::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], ldc:Class<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class), ldc:float(3.0f), ldc:float(1.0f)))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ubded\u3d64\uae5d\u40a9\u51b2\u8d98, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(10), initobject:\u4179\u8258\ufe34\u3d64\u4f4a[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u4179\u8258\ufe34\u3d64\u4f4a::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], ldc:Class<\u4f4a\uafe7\u76bc\u392e\ub8be>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class), ldc:float(8.0f)))
            stack_14A_0 = getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ub19c\u446c\ufcaf\u5245\u4c04\u8cae, this:\u6fb0\ubded\u624e\ufcaf\ubb2b)
            stack_14A_1 = xor:int(ldc:int(-15871), ldc:int(-15872))
            expr_12C = newarray:Class[](java.lang.Class.class, and:int(ldc:int(8193), ldc:int(4305)))
            storeelement:Class(expr_12C:Class[], and:int(ldc:int(-12114), ldc:int(12112)), ldc:Class<\u3d4b\ub18d\u624e\uc2e8\u0c95>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, stack_14A_0:\u93a2\ucfaf\u965f\u965f\uae5d, stack_14A_1:int, invokevirtual:\u64ab\u983f\u40a9\ub83f\uae87(\u64ab\u983f\u40a9\ub83f\uae87::\ub70c\ub1b9\ubefe\u61a4\ucef1\u836c, initobject:\u64ab\u983f\u40a9\ub83f\uae87(\u64ab\u983f\u40a9\ub83f\uae87::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4c2b\ub8be\u839e\u71ae\uf9c5], expr_12C:Class<?>[]), newarray:Class[](java.lang.Class.class, and:int(ldc:int(8344), ldc:int(-8345)))))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ub19c\u446c\ufcaf\u5245\u4c04\u8cae, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(18627), ldc:int(4394)), invokevirtual:\u16f6\u47c2\u12b2\u8709\u6d69[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u16f6\u47c2\u12b2\u8709\u6d69::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, initobject:\u8709\ud12e\u7330\uc246\ud171<Object>[expected:\u16f6\u47c2\u12b2\u8709\u6d69](\u8709\ud12e\u7330\uc246\ud171<?>::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], ldc:Class<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class), xor:int[expected:boolean](ldc:int(308), ldc:int(309))), xor:int(ldc:int(340), ldc:int(120))))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ub19c\u446c\ufcaf\u5245\u4c04\u8cae, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(5381), ldc:int(5382)), invokevirtual:\u16f6\u47c2\u12b2\u8709\u6d69[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u16f6\u47c2\u12b2\u8709\u6d69::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, initobject:\u8709\ud12e\u7330\uc246\ud171<Object>[expected:\u16f6\u47c2\u12b2\u8709\u6d69](\u8709\ud12e\u7330\uc246\ud171<?>::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], ldc:Class<\uc246\u7873\uc238\u4179\ubded>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uc246\u7873\uc238\u4179\ubded.class), and:int[expected:boolean](ldc:int(6186), ldc:int(-6699))), xor:int(ldc:int(4482), ldc:int(4270))))
            invokevirtual:void(\u93a2\ucfaf\u965f\u965f\uae5d::\u6ec6\ud523\ud4fe\u873d\ub7dc\u5140, getfield:\u93a2\ucfaf\u965f\u965f\uae5d(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ub19c\u446c\ufcaf\u5245\u4c04\u8cae, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(-24063), ldc:int(-24062)), invokevirtual:\u16f6\u47c2\u12b2\u8709\u6d69[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95](\u16f6\u47c2\u12b2\u8709\u6d69::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, initobject:\u8709\ud12e\u7330\uc246\ud171<Object>[expected:\u16f6\u47c2\u12b2\u8709\u6d69](\u8709\ud12e\u7330\uc246\ud171<?>::<init>, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], ldc:Class<\u7bad\u71ae\ua61f\u92ff\u3d4b>(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7bad\u71ae\ua61f\u92ff\u3d4b.class), and:int[expected:boolean](ldc:int(31840), ldc:int(-32099))), and:int(ldc:int(300), ldc:int(3068))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\u93a2\u8709\u6435\u93a2\u3dd3 \u4daf\u3dd3\u516c\u839e\u5654\u392e() {
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
            return:\u93a2\u8709\u6435\u93a2\u3dd3(invokevirtual:\u93a2\u8709\u6435\u93a2\u3dd3(\u93a2\u8709\u6435\u93a2\u3dd3::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, invokevirtual:\u93a2\u8709\u6435\u93a2\u3dd3(\u93a2\u8709\u6435\u93a2\u3dd3::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, invokevirtual:\u93a2\u8709\u6435\u93a2\u3dd3(\u93a2\u8709\u6435\u93a2\u3dd3::\ua61f\u9af2\u5f50\u71f1\uff55\ubcb0, invokestatic:\u93a2\u8709\u6435\u93a2\u3dd3(\u3711\u7ce1\u76bc\u7049\u16f6::\u9255\u7e3f\u99f7\u51b2\u6198\u946b), getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\u7043\u4f52\u3504\u5140\u836c\u965f), ldc:double(0.5)), getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\ubf56\uc238\u93a2\u62da\ua562\u873d), ldc:double(18.0)), getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\u7006\u92ff\u0b8e\u5f50\u4f4a\uc4d2), ldc:double(32.0)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u120d\u98a4\uceb8\u8cae\u47c2 \uc3e3\u183a\u8640\ud171\uafe7\u1833(\u5d20\u97b7\u8753\u873d\u16f6.\ua6bd\u8d98\u6ec6\uc246\uc238 p0, \u516c\u3d64\u718f\ub171\u6b5f.\u6d99\u6b0d\ubff1\uc246\u946b p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u5f50\u3e75\u51fa\u983f\u67e9 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u120d\u98a4\uceb8\u8cae\u47c2 p3, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p4) {
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
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\ufe34\u64f2\u392e\u7af6\u960f\u71f1, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf), initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud171\ua6bd\u5fe1\ud4fe\u5d20\u3711)))
            return:\u120d\u98a4\uceb8\u8cae\u47c2(invokespecial:\u120d\u98a4\uceb8\u8cae\u47c2(\u3d4b\ub18d\u624e\uc2e8\u0c95::\uc3e3\u183a\u8640\ud171\uafe7\u1833, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u3d4b\ub18d\u624e\uc2e8\u0c95], p0:\ua6bd\u8d98\u6ec6\uc246\uc238, p1:\u6d99\u6b0d\ubff1\uc246\u946b, p2:\u5f50\u3e75\u51fa\u983f\u67e9, p3:\u120d\u98a4\uceb8\u8cae\u47c2, p4:\uc31c\uc87f\uc246\u3776\ub7dc))
        }
        
        goto(Label_0006)
    }
    
    public void \uc7fe\u72f1\ub171\ua3b4\uc87f\u647c() {
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
            invokespecial:void(\u62da\u64f2\u6c56\u0a06\u7af6::\uc7fe\u72f1\ub171\ua3b4\uc87f\u647c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u62da\u64f2\u6c56\u0a06\u7af6])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 \u6cfe\u8c8a\ub1b9\ud158\ufe34\u76bc() {
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
            return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(3.0), ldc:double(0.0), ldc:double(3.0)))
        }
        
        goto(Label_0006)
    }
    
    public void \u873d\u3504\u8aa5\u8308\ua61f\u416d() {
        var_1_18B : int
        var_3_17D : int
        var_1_105 : int
        var_5_120 : int
        var_1_20C : int
        var_5_214 : int
        
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
        var_1_18B = and:int(ldc:int(1536720305), ldc:int(370868213))
        invokespecial:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u873d\u3504\u8aa5\u8308\ua61f\u416d, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u3d4b\ub18d\u624e\uc2e8\u0c95])
        
        if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u12cb\ubf56\u647c\u7330\u446c\u836c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b))) {
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u9937\u3bd6\ubcb0\u8389\u7c6b\u8308, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                putfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, sub:int(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(11795), ldc:int(4353))))
                
                if (cmpge:boolean(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(0))) {
                    goto(Label_0187)
                }
                
                putfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, and:int(ldc:int(16465), ldc:int(-16466)))
                goto(Label_0187)
            }
        }
        
        Label_0110:
        
        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(1024)), ldc:int(0))) {
            var_1_18B = and:int(var_1_18B:int, ldc:int(-1912566556))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        var_1_18B = and:int(var_1_18B:int, ldc:int(131724705))
        Label_0187:
        
        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(1024)), ldc:int(0))) {
                var_1_18B = and:int(var_1_18B:int, ldc:int(350332774))
                goto(Label_0110)
            }
            
            var_1_18B = and:int(var_1_18B:int, ldc:int(-1688436741))
            
            if (cmpne:boolean(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u40a9\u7043\ub102\u72f1\u839e\u8640, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(3), ldc:int(19285)))) {
                if (cmpne:boolean(rem:int(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(1275), ldc:int(19888))), ldc:int(0))) {
                    if (cmpne:boolean(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u40a9\u7043\ub102\u72f1\u839e\u8640, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), sub:int(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u873d\uc87f\u59ec\u71ae\u8d98\u61a4, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(2055), ldc:int(337))))) {
                        goto(Label_0110)
                    }
                    
                    putfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, xor:int(ldc:int(4354), ldc:int(4353)))
                    var_3_17D = and:int(ldc:int(-4527), ldc:int(4270))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_18B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_1_18B = and:int(var_1_18B:int, ldc:int(-373737516))
                        }
                        else {
                            var_1_18B = and:int(var_1_18B:int, ldc:int(995882425))
                            
                            if (cmplt:boolean(var_3_17D:int, xor:int(ldc:int(1219), ldc:int(1223)))) {
                                storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(-701), ldc:int(684))), var_3_17D:int, loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(8213), ldc:int(21283))), var_3_17D:int))
                                storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(2561), ldc:int(17745))), var_3_17D:int, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0)))
                                inc:int(var_3_17D, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(2097152)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_18B = and:int(var_1_18B:int, ldc:int(299419719))
                    }
                    
                    var_1_18B = and:int(var_1_18B:int, ldc:int(2004794808))
                    goto(Label_0110)
                }
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0187)
        }
        
        if (cmpeq:boolean(and:int(var_1_18B:int, ldc:int(16)), ldc:int(0))) {
            var_1_18B = and:int(var_1_18B:int, ldc:int(2020078868))
            goto(Label_0110)
        }
        
        var_1_105 = and:int(var_1_18B:int, ldc:int(1536868279))
        putfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b, xor:int(ldc:int(12552), ldc:int(12555)))
        var_5_120 = and:int(ldc:int(-21030), ldc:int(21029))
        
        while (cmplt:boolean(var_5_120:int, and:int(ldc:int(1605), ldc:int(2214)))) {
            storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(-17984), ldc:int(1595))), var_5_120:int, loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(2137), ldc:int(4259))), var_5_120:int))
            storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(24603), ldc:int(193))), var_5_120:int, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, mul:double(f2d:double(add:float(ldc:float(-6.0f), i2f:float(invokevirtual:int(Random::nextInt, getfield:Random(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ud158\u760c\u40a9\u7006\u946b\u6198, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(13))))), ldc:double(0.5)), i2d:double(invokestatic:int(Math::max, and:int(ldc:int(22721), ldc:int(-24266)), sub:int(invokevirtual:int(Random::nextInt, getfield:Random(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ud158\u760c\u40a9\u7006\u946b\u6198, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(6)), and:int(ldc:int(17060), ldc:int(8213))))), mul:double(f2d:double(add:float(ldc:float(-6.0f), i2f:float(invokevirtual:int(Random::nextInt, getfield:Random(\u6fb0\ubded\u624e\ufcaf\ubb2b::\ud158\u760c\u40a9\u7006\u946b\u6198, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(13))))), ldc:double(0.5))))
            inc:int(var_5_120, ldc:int(1))
        }
        
        var_1_20C = and:int(var_1_105:int, ldc:int(-1701019660))
        var_5_214 = and:int(ldc:int(969), ldc:int(-25578))
        
        while (cmplt:boolean(var_5_214:int, ldc:int(16))) {
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u12cb\ubf56\u647c\u7330\u446c\u836c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\ubff1\u8c8a\u8df4\u12cb\u7c6b\u7873), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\u97e6\u839e\uf94d\uc910\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:double(0.5)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\uafe7\u7af6\u47c2\u4975\u3776\uceb8, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u7330\u59ec\uc4d2\ub18d\u98a4\u4c2b, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:double(0.5)), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
            inc:int(var_5_214, ldc:int(1))
        }
        
        var_1_18B = and:int(var_1_20C:int, ldc:int(2054813182))
        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u12cb\ubf56\u647c\u7330\u446c\u836c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u93a2\u36d3\u071d\u93a2\ubff1\uf9c5), invokevirtual:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u3711\u7ce1\u76bc\u7049\u16f6::\u4daf\u6ec6\u92ee\u7006\u3711\u12cb, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u3711\u7ce1\u76bc\u7049\u16f6]), ldc:float(1.0f), ldc:float(1.0f), and:int[expected:boolean](ldc:int(12854), ldc:int(-29239)))
        goto(Label_0110)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u983f\u5140\u6fb0\uf94d\uc84e\u7043() {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7c6b\u97b7\u64f2\u4492\u624e\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[] \ua3b4\u61a4\u5db4\u36d3\u8df4\u516c(float p0) {
        var_4_84 : double
        var_6_90 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8[]
        var_7_99 : int
        
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
        
        if (cmpgt:boolean(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), ldc:int(0))) {
            var_4_84 = invokestatic:double(Math::pow, f2d:double(div:float(sub:float(i2f:float(getfield:int(\u6fb0\ubded\u624e\ufcaf\ubb2b::\u7ce1\ucfaf\u3d64\u4975\u8308\u3a62, this:\u6fb0\ubded\u624e\ufcaf\ubb2b)), p0:float), ldc:float(3.0f))), ldc:double(0.25))
            var_6_90 = newarray:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8.class, xor:int(ldc:int(116), ldc:int(112)))
            var_7_99 = and:int(ldc:int(-18944), ldc:int(2363))
            
            while (cmplt:boolean(var_7_99:int, and:int(ldc:int(13012), ldc:int(17669)))) {
                storeelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(var_6_90:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[], var_7_99:int, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), xor:int(ldc:int(12545), ldc:int(12544))), var_7_99:int), sub:double(ldc:double(1.0), var_4_84:double)), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(22616), ldc:int(-22617))), var_7_99:int), var_4_84:double)))
                inc:int(var_7_99, ldc:int(1))
            }
            
            return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](var_6_90:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[])
        }
        
        return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](loadelement:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[](getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[][](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u5fe1\u2dcc\u3d64\u6bb9\u9255\u5f50, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), and:int(ldc:int(181), ldc:int(1609))))
    }
    
    public boolean \u56bd\u69d9\u392e\u1187\u6fb0\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_102 : int
        stack_12C_0 : int [generated]
        
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
        var_2_102 = and:int(ldc:int(-1220256387), ldc:int(-140055143))
        
        if (logicalnot:boolean(invokespecial:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u56bd\u69d9\u392e\u1187\u6fb0\u74b1, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            loop {
                if (cmpne:boolean(and:int(var_2_102:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_2_102:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_102 = and:int(var_2_102:int, ldc:int(-931725872))
                }
                else {
                    var_2_102 = and:int(var_2_102:int, ldc:int(-1087275181))
                    
                    if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        if (cmpeq:boolean(invokevirtual:\u92ee\u47c2\u74b1\u74b1\uff55(\ube23\u67d0\u64f2\u839e\u76bc::\ua61f\u5d20\u4f52\u7006\uc229\u36d3, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ube23\u67d0\u64f2\u839e\u76bc])), getstatic:\u92ee\u47c2\u74b1\u74b1\uff55(\u92ee\u47c2\u74b1\u74b1\uff55::\uc246\u7043\u9af2\ud4fe\u4179\u51fa))) {
                            if (cmpne:boolean(invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                                goto(Label_0219)
                            }
                            
                            if (cmpne:boolean(invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, p0:\u7d52\u718f\u3776\u6fb0\ub83f), aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                                goto(Label_0219)
                            }
                            
                            stack_12C_0 = and:int(ldc:int(18569), ldc:int(4133))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0144:
                
                if (cmpne:boolean(and:int(var_2_102:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_102:int, ldc:int(1024)), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-3011), ldc:int(2754)))
                    }
                    
                    loopcontinue()
                }
                
                Label_0219:
                
                if (cmpeq:boolean(and:int(var_2_102:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_102 = and:int(var_2_102:int, ldc:int(381257627))
                    goto(Label_0144)
                }
                
                if (cmpne:boolean(and:int(var_2_102:int, ldc:int(256)), ldc:int(0))) {
                    var_2_102 = and:int(var_2_102:int, ldc:int(1464655666))
                    stack_12C_0 = and:int(ldc:int(18864), ldc:int(-18929))
                    looporswitchbreak()
                }
                
                var_2_102 = and:int(var_2_102:int, ldc:int(-887290220))
            }
            
            return:boolean(stack_12C_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(21), ldc:int(1673)))
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u4492\u385b\u59ec\u7e3f\u8d90\u120d() {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u7c6b\u97b7\u64f2\u4492\u624e\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u7e3f\u8aa5\u7c6b\u7e3f\u6435\uc29a() {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u9a18\u624e\u6c52\u4daf\u718f\ua6bd))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u71ae\ub102\u71f1\u4179\uc9f6\u4ab3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p0) {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6ec6\u965f\u92ff\u7006\ucb79\u836c))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u718f\ud51e\u8308\ubf56\u3bc9\u8d98() {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u6ec6\u2dcc\u7ce1\ua6bd\u8c8a\u8308))
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\ub19c\ucef1\ub83f\u760c\u7330(int p0, boolean p1) {
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
    
    public void \u7af6\u759a\u4f52\u59ec\u93a2\ua6bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, float p1) {
        var_6_7A : \u7006\u9033\u385b\u4f4a\u52d3
        var_7_85 : double
        var_9_94 : double
        var_11_9F : double
        
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
            var_6_7A = invokestatic:\u7006\u9033\u385b\u4f4a\u52d3(\u8640\u51b2\u7006\uff55\u3c25::\u4bc8\u8753\ucb79\u416d\u7c6b\uafe7, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\ube23\u67d0\u64f2\u839e\u76bc], invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\u7ce1\u76bc\u7049\u16f6::\ub113\u8d90\u5db4\u759a\u7bad\u647c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u3711\u7ce1\u76bc\u7049\u16f6], invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\ube23\u67d0\u64f2\u839e\u76bc], invokestatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u8640\u51b2\u7006\uff55\u3c25::\ub1b9\u9033\u56bd\ud523\u40a9\uc246, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud171\ua6bd\u5fe1\ud4fe\u5d20\u3711)))), p1:float)
            var_7_85 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            var_9_94 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ufcaf\u6b0d\u4179\u7bad\ub19c\u718f, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:double(0.3333333333333333)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_6_7A:\u7006\u9033\u385b\u4f4a\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            var_11_9F = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            invokevirtual:void(\u7006\u9033\u385b\u4f4a\u52d3::\u16f6\u8258\u624e\u34df\u76bc\u839e, var_6_7A:\u7006\u9033\u385b\u4f4a\u52d3, var_7_85:double, add:double(var_9_94:double, mul:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_7_85:double, var_7_85:double), mul:double(var_11_9F:double, var_11_9F:double)))), ldc:double(0.20000000298023224))), var_11_9F:double, ldc:float(1.6f), i2f:float(sub:int(ldc:int(14), mul:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u12cb\ubf56\u647c\u7330\u446c\u836c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b))), and:int(ldc:int(17412), ldc:int(2565))))))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uc246\u4c2b\u51b2\u4f4a\u9a18\u99f7, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u71ae\uc2e8\u51b2\ud51e\ubb2b\u0800), ldc:float(1.0f), div:float(ldc:float(1.0f), add:float(mul:float(invokevirtual:float(Random::nextFloat, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\ube23\u67d0\u64f2\u839e\u76bc])), ldc:float(0.4f)), ldc:float(0.8f))))
            invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\u6fb0\ubded\u624e\ufcaf\ubb2b::\u12cb\ubf56\u647c\u7330\u446c\u836c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b), var_6_7A:\u7006\u9033\u385b\u4f4a\u52d3[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7d52\u12b2\u8cae\u8389\u1187 \uf94d\u97e6\ub1b9\u4ab3\u7049\u97b7() {
        var_1_8B : int
        stack_AA_0 : \u7d52\u12b2\u8cae\u8389\u1187 [generated]
        
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
        var_1_8B = and:int(ldc:int(1682898807), ldc:int(-447435161))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u62da\u64f2\u6c56\u0a06\u7af6::\uc238\u7c6b\u3776\u97b7\u12b2\u8d90, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u62da\u64f2\u6c56\u0a06\u7af6]))) {
            do {
                if (cmpne:boolean(and:int(var_1_8B:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_8B = and:int(var_1_8B:int, ldc:int(1657499262))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u72f1\u760c\ubcb0\u385b\ud12e\u446c, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))) {
                        loopcontinue()
                    }
                    
                    stack_AA_0 = getstatic:\u7d52\u12b2\u8cae\u8389\u1187(\u7d52\u12b2\u8cae\u8389\u1187::\u4ab3\u8389\u3bd6\ud51e\u5140\u5654)
                    return:\u7d52\u12b2\u8cae\u8389\u1187(stack_AA_0:\u7d52\u12b2\u8cae\u8389\u1187)
                }
            } while (cmpeq:boolean(and:int(var_1_8B:int, ldc:int(2147483647)), ldc:int(0)))
            
            var_1_8B = and:int(var_1_8B:int, ldc:int(-364924977))
            stack_AA_0 = getstatic:\u7d52\u12b2\u8cae\u8389\u1187(\u7d52\u12b2\u8cae\u8389\u1187::\u1833\u446c\u6b5f\u392e\u071d\u6b5f)
            return:\u7d52\u12b2\u8cae\u8389\u1187(stack_AA_0:\u7d52\u12b2\u8cae\u8389\u1187)
        }
        
        return:\u7d52\u12b2\u8cae\u8389\u1187(getstatic:\u7d52\u12b2\u8cae\u8389\u1187(\u7d52\u12b2\u8cae\u8389\u1187::\u99f7\ub171\u5fe1\u946b\u9255\u8d90))
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
    
    public void \u759a\ud36e\u7bad\u12cb\uae87\uc2e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C8 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6D3 : int
        
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
        var_3_6C8 = and:int(ldc:int(-299172891), ldc:int(-1708197889))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6fb0\ubded\u624e\ufcaf\ubb2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(2105637575))
        }
        else {
            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1146093582))
            var_5_8A = and:int(ldc:int(4185), ldc:int(-12382))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22022), ldc:int(22020)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C8:int, ldc:int(-76677158))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(1608), ldc:int(1609)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(1074), ldc:int(1075)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C8 = and:int(var_3_E3:int, ldc:int(-1074200613))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1553), ldc:int(1552)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-49263109))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1402911629))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1712690537))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(316386507))
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-388769977))
                        goto(Label_0887)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-290554159))
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1863672410))
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1079051313))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0612)
                            }
                            
                            goto(Label_0887)
                        }
                    }
                    
                    Label_0446:
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-575741877))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1799839017))
                        goto(Label_0887)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1480204258))
                        goto(Label_0737)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-200029001))
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1430661136))
                        var_11_F4 = and:int(ldc:int(-20465), ldc:int(20432))
                        goto(Label_1595)
                    }
                    
                    Label_0612:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(163061388))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1066740581))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0887)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-114636979))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1234600973))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-876741641))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0887)
                        }
                    }
                    
                    Label_0737:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1084322568))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(856906098))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1894818315))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(198941063))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-29554344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-93177553))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1371938874))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0887:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1437770261))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(647417375))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1523232994))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1946419237))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(1040), ldc:int(1041))
                                goto(Label_1162)
                            }
                        }
                    }
                    
                    Label_1002:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(2136059234))
                        goto(Label_1606)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(2006278715))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-2123592513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0887)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1778504769))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-92670012))
                        var_11_F4 = and:int(ldc:int(17054), ldc:int(-18079))
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1181811968))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(968773096))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1751299451))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1002)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0887)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-364595048))
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(23212790))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(374620580))
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-294849577))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1468)
                            }
                        }
                    }
                    
                    Label_1305:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1924026051))
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-592997349))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-808258732))
                            goto(Label_1162)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1892845246))
                            goto(Label_1002)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0887)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1699489103))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1035077575))
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1130266920))
                            loopcontinue()
                        }
                        
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1360266294))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1595)
                    }
                    
                    Label_1468:
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(140129808))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0887)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(1302418131))
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-942879327))
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1691748358))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1595:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D3 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1606:
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(581876844))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1749990331))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(202295157))
                        goto(Label_1002)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1454883264))
                        goto(Label_0887)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-630233054))
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-341125443))
                        goto(Label_0446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-872811566))
                        var_17_6D3 = add:int(var_16_122:int, and:int(ldc:int(19457), ldc:int(12325)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C8 = and:int(var_3_6C8:int, ldc:int(-1082138677))
                
                if (cmple:boolean(var_5_8A = var_17_6D3:int, sub:int(var_6_91:int, and:int(ldc:int(10315), ldc:int(20737))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C8:int, ldc:int(524288)), ldc:int(0))) {
            var_3_6C8 = and:int(var_3_6C8:int, ldc:int(848044267))
            goto(Label_0108)
        }
    }
}
